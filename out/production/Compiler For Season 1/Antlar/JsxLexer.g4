lexer grammar JsxLexer;
OpenParen                  : '(';
CloseParen                 : ')';
OpenBracket                : '[';
CloseBracket               : ']';
OpenBrace                  : '{' ;
//TemplateCloseBrace         :     {this.IsInTemplateString()}? '}' -> popMode;
CloseBrace                 : '}' ;
Colon                      : ':';
LessThan                   : '<';

MoreThan                   : '>';
Divide                     : '/';
Minus                      : '-';
Assign                     : '=';
SemiColon                  : ';';
ARROW                      : '=>';
Plus                       : '+';
Dot                        : '.';
From                       : 'from';
If         : 'if';
Else       : 'else';
Hashtag                    : '#';
QuestionMark               : '?';
Default    : 'default';
Export  :    'export';
Import  : 'import';
Multiply                   : '*';
As         : 'as';
Return     : 'return';
Var        : 'var';
Const   : 'const';
StrictLet    : 'let'        ;
//NonStrictLet : 'let'        {!this.IsStrictMode()}?;
Comma                      : ',';
Async : 'async';
BackTick: '`'  -> pushMode(TEMPLATE);
Function_                  :'function';
UseEffect                  :'useEffect';
UseRef                     : 'useRef';
UseState                   : 'useState';
Ellipsis                   : '...';
Identifier: IdentifierStart IdentifierPart*;
WS: [ \t\r\n]+ -> skip;
/// String Literals
StringLiteral:
    ('"' DoubleStringCharacter* '"' | '\'' SingleStringCharacter* '\'')
;


////

NullLiteral: 'null';

/// Boolean Literals

BooleanLiteral: 'true' | 'false';

/// Numeric Literals

DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?
;

/// Numeric Literals

HexIntegerLiteral    : '0' [xX] [0-9a-fA-F] HexDigit*;
OctalIntegerLiteral  : '0' [0-7]+ ;
OctalIntegerLiteral2 : '0' [oO] [0-7] [_0-7]*;
BinaryIntegerLiteral : '0' [bB] [01] [_01]*;
BigHexIntegerLiteral     : '0' [xX] [0-9a-fA-F] HexDigit* 'n';
BigOctalIntegerLiteral   : '0' [oO] [0-7] [_0-7]* 'n';
BigBinaryIntegerLiteral  : '0' [bB] [01] [_01]* 'n';
BigDecimalIntegerLiteral : DecimalIntegerLiteral 'n';
mode TEMPLATE;

BackTickInside                : '`'   -> type(BackTick), popMode;
TemplateStringStartExpression : '${' -> pushMode(DEFAULT_MODE);
TemplateStringAtom            : ~[`];
mode TAG;
TagOpen  : LessThan -> pushMode(TAG);
TagClose : MoreThan -> popMode;

TagSlashClose: '/>' -> popMode;

TagSlash: Divide;

TagName: TagNameStartChar TagNameChar*;

// an attribute value may have spaces b/t the '=' and the value
AttributeValue: [ ]* Attribute -> popMode;

Attribute: DoubleQuoteString | SingleQuoteString | AttributeChar | HexChars | DecChars;
mode ATTVALUE;

TagEquals: Assign -> pushMode(ATTVALUE);
// Fragment rules
fragment AttributeChar:
    '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
;

fragment AttributeChars: AttributeChar+ ' '?;

fragment HexChars: '#' [0-9a-fA-F]+;

fragment DecChars: [0-9]+ '%'?;

fragment DoubleQuoteString : '"' ~[<"]* '"';
fragment SingleQuoteString : '\'' ~[<']* '\'';

fragment TagNameStartChar:
    [:a-zA-Z]
    | '\u2070' ..'\u218F'
    | '\u2C00' ..'\u2FEF'
    | '\u3001' ..'\uD7FF'
    | '\uF900' ..'\uFDCF'
    | '\uFDF0' ..'\uFFFD'
;

fragment TagNameChar:
    TagNameStartChar
    | '-'
    | '_'
    | '.'
    | Digit
    | '\u00B7'
    | '\u0300' ..'\u036F'
    | '\u203F' ..'\u2040'
;

fragment Digit: [0-9];

fragment DoubleStringCharacter: ~["\\] | '\\' EscapeSequence | LineContinuation;

fragment SingleStringCharacter: ~['\\] | '\\' EscapeSequence | LineContinuation;

fragment EscapeSequence:
    CharacterEscapeSequence
    | '0' // no digit ahead! TODO
    | HexEscapeSequence
    | UnicodeEscapeSequence
    | ExtendedUnicodeEscapeSequence
;

fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;

fragment HexEscapeSequence: 'x' HexDigit HexDigit;

fragment UnicodeEscapeSequence:
    'u' HexDigit HexDigit HexDigit HexDigit
    | 'u' '{' HexDigit HexDigit+ '}'
;

fragment ExtendedUnicodeEscapeSequence: 'u' '{' HexDigit+ '}';

fragment SingleEscapeCharacter: ['"\\bfnrtv];

fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];

fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];

fragment LineContinuation: '\\' [\r\n\u2028\u2029];

fragment HexDigit: [_0-9a-fA-F];

fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;

fragment ExponentPart: [eE] [+-]? [0-9_]+;

fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}] | '\u200C' | '\u200D';

fragment IdentifierStart: [\p{L}] | [$_] | '\\' UnicodeEscapeSequence;

fragment RegularExpressionFirstChar:
    ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionChar:
    ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;

fragment RegularExpressionClassChar: ~[\r\n\u2028\u2029\]\\] | RegularExpressionBackslashSequence;

fragment RegularExpressionBackslashSequence: '\\' ~[\r\n\u2028\u2029];
