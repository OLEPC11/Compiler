package com.company;

import Antlar.JsxLexer;
import Antlar.JsxParser;
import AstClasses.*;
import SemanticError.Error;
import SymbolTable.SymbolTable;
import VisitParserTree.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println();
            String source = "E:\\java projects\\Compiler Projects\\Compiler For Season 1\\Tests\\Test8.txt";
            CharStream cs = fromFileName(source);
            JsxLexer lexer = new JsxLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            JsxParser parser = new JsxParser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(new Error());
            if (Error.hasError){
                System.exit(0);
            }
            else{
            ParseTree tree = parser.program();
            Visitor visitor = new Visitor();
            Program startProgram = (Program) visitor.visit(tree);
            startProgram.PrintAst();
            System.out.println();
            SymbolTable symbolTable=new SymbolTable();
            System.out.println("\u001b[34m"+symbolTable.PrintSymbolTable());
            System.out.println();
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
