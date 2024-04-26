parser grammar JsxParser;
options { tokenVocab=JsxLexer; }

program
               : sourceElements? EOF
               ;
sourceElement
               : statement
               ;
statement
               :block
               |emptyStatement_
               |functionDeclaration
               |returnStatement
               |expressionStatement
               |exportStatement
               |ifStatement
               |variableStatement
               |importStatement
               |reactHook
               ;
block
               : '{' statementList? '}'
               ;
statementList
               : statement+
               ;
importStatement
               : Import importFromBlock
               ;
importFromBlock
              : importDefault? (importNamespace | moduleItems) importFrom eos
              |  StringLiteral eos
              ;
moduleItems
           : '{' (aliasName ',')* (aliasName ','?)? '}'
           |UseState                ;
importDefault
              : aliasName ','
              ;
importNamespace
             : ('*' | identifierName) (As identifierName)?
             ;
importFrom
            : From StringLiteral
            ;
aliasName
           : identifierName (As identifierName)?
           ;
exportStatement
          : Export ( declaration) eos # ExportDeclaration
          | Export Default singleExpression eos        # ExportDefaultDeclaration
          ;
declaration
          : variableStatement
          | functionDeclaration
          ;
variableStatement
          : variableDeclarationList //eos
          ;
variableDeclarationList
           : varModifier variableDeclaration (',' variableDeclaration)*
           ;
variableDeclaration
           : assignable ('=' singleExpression)?
           ;
emptyStatement_
          : SemiColon
          ;
expressionStatement
         :  expressionSequence eos
         ;
ifStatement
         : If '(' expressionSequence ')' statement (Else statement)?
         ;
varModifier // let, const - ECMAScript 6
         : Var
         | let_
         | Const
         ;
returnStatement
        : Return (expressionSequence)?
        | Return OpenParen htmlElements CloseParen
        ;
functionDeclaration
         : Async? Function_ '*'? identifier '(' formalParameterList? ')' '{' functionBody '}'
         ;
formalParameterList
          : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
          | lastFormalParameterArg
          ;
formalParameterArg
          : assignable ('=' singleExpression)? // ECMAScript 6: Initialization
          ;
lastFormalParameterArg // ECMAScript 6: Rest Paramete
         : Ellipsis singleExpression
         ;

functionBody
         : sourceElements?
         ;
sourceElements
         : sourceElement+
         ;
arrayLiteral
         : ('[' elementList ']')
         ;
elementList
        : ','* arrayElement? (','+ arrayElement)* ','* // Yes, everything is optional
        ;
arrayElement
       : Ellipsis? singleExpression
       ;
propertyAssignment
      : propertyName Colon singleExpression                                          # PropertyExpressionAssignment
      | OpenBracket singleExpression CloseBracket Colon singleExpression            # ComputedPropertyExpressionAssignment
      | Async? '*'? propertyName '(' formalParameterList? ')' '{' functionBody '}' # FunctionProperty
      | Ellipsis? singleExpression                                                 # PropertyShorthand
      ;
propertyName
       : identifierName
       | StringLiteral
       | numericLiteral
       | OpenBracket singleExpression CloseBracket
       ;
arguments
      : '(' (argument (',' argument)* ','?)? ')'
      ;
argument
      : Ellipsis? (singleExpression | identifier)
      ;
expressionSequence
     : Ellipsis? singleExpression (Comma Ellipsis? singleExpression)*  //2020/10/28 add SpreadExpr for htmltag
     ;
    reactHook
      : useEffectHook
      | useRefHook
      | useStateHook
      ;
// React Hooks
useEffectHook
  : UseEffect '(' (expressionSequence (',' expressionSequence)?)? ')' eos
  ;


useRefHook
  : UseRef '(' (singleExpression)? ')'  eos
  ;

 useStateHook
  : UseState '(' (singleExpression)? ')'  eos
  ;
singleExpression
     : htmlElements                                                         # htmlElementExpression
     |  '(' expressionSequence ')'                                           # ParenthesizedExpression
     | anoymousFunction                                                     # FunctionExpression
     | Import '(' singleExpression ')'                                       # ImportExpression
     | reactHook                                                               #Hook
     | singleExpression (Plus | '-') singleExpression                        # AdditiveExpression
     | singleExpression ('*' | '/') singleExpression                       # MultiplicativeExpression
     | arrayLiteral                                                         # ArrayLiteralExpression
     | objectLiteral                                                        # ObjectLiteralExpression
     | identifier                                                           # IdentifierExpression
     | literal                                                              # LiteralExpression
     | singleExpression '?' singleExpression ':' singleExpression           # TernaryExpression
     | singleExpression ('<' | '>' | '<''=' | '>''=') singleExpression      # RelationalExpression
     | <assoc = right> singleExpression '=' singleExpression                # AssignmentExpression
     | singleExpression templateStringLiteral                               # TemplateStringExpression
     | singleExpression QuestionMark? Dot Hashtag? identifierName          # MemberDotExpression
     | singleExpression arguments                                           # ArgumentsExpression
     | singleExpression '[' expressionSequence ']'                     # MemberIndexExpression

     ;
htmlElements
      : htmlElement+
      ;
htmlElement
       : '<' htmlTagStartName htmlAttribute* '>' htmlContent '<' '/' htmlTagClosingName '>'
       | '<' htmlTagName htmlAttribute* htmlContent '/' '>'
       | '<' htmlTagName htmlAttribute* '/' '>'
       | '<' htmlTagName htmlAttribute* '>'
       | '<' '>' htmlContent  '<' '/' '>'
       ;
htmlContent
       : htmlChardata? ((htmlElement | objectExpressionSequence) htmlChardata?)*
       ;
htmlTagStartName
       : htmlTagName
       ;
htmlTagClosingName
      : htmlTagName
      ;
htmlTagName
      : TagName
      | keyword
      | Identifier
      ;
htmlAttribute
      : htmlAttributeName '=' htmlAttributeValue
      | htmlAttributeName
      ;
htmlAttributeName
      : TagName
      | Identifier (Minus Identifier)* // 2020/10/28 bugfix: '-' is recognized as MINUS and TagName is splited by '-'.
      ;
htmlChardata
     : ~('<' | OpenBrace)+
     ;
htmlAttributeValue
      : AttributeValue
      | StringLiteral
      | objectExpressionSequence
      | '{' objectExpressionSequence? '}'
      ;
assignable
       : identifier
       | arrayLiteral
       | objectLiteral
       ;
objectLiteral
       : '{' (propertyAssignment (',' propertyAssignment)* ','?)? '}'
       ;
objectExpressionSequence
       : '{' expressionSequence '}'
       ;
anoymousFunction
        : functionDeclaration                                                     # FunctionDecl
        | Async? Function_ '*'? '(' formalParameterList? ')' '{' functionBody '}' # AnoymousFunctionDecl
        | Async? arrowFunctionParameters '=>' arrowFunctionBody                   # ArrowFunction
        ;
arrowFunctionParameters
        : identifier
        | '(' formalParameterList? ')'
        ;
arrowFunctionBody
        : singleExpression
        | '{' functionBody '}'
        ;
literal
        : NullLiteral
        | BooleanLiteral
        | StringLiteral
        | numericLiteral
        ;
templateStringLiteral
        : BackTick templateStringAtom* BackTick
        ;
templateStringAtom
        : TemplateStringAtom
        | TemplateStringStartExpression singleExpression
        ;
numericLiteral
       : DecimalLiteral
       ;
identifierName
      : identifier
      | reservedWord
      ;
identifier
     : Identifier
     | Async
     ;
reservedWord
     : keyword
     ;
keyword
    : Default
    | Export
    | From
    |Import
    |Function_
    |UseState
    |UseEffect
    |UseRef
    ;
let_
   : StrictLet
   ;
eos
   :SemiColon
   |EOF
   ;
