package com.company;

import Antlar.JsxLexer;
import Antlar.JsxParser;
import AstClasses.*;
import Generator.Gen;
import SymbolTable.SymbolTable;
import VisitParserTree.Visitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.ArrayList;

import SymbolTable.Scope;
import SymbolTable.Symbol;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static SymbolTable symbolTable = new SymbolTable();
public static String useCase=" ";
public static String currentPrice=" ";
public static String export=" ";
public static int index=0;
    public static void main(String[] args) {
        ArrayList<String >s=new ArrayList<>();
       s.add("E:\\java projects\\Compiler For Season 1\\Tests\\Test1.txt");
        s.add("E:\\java projects\\Compiler For Season 1\\Tests\\Test2.txt");
        for (int j=0;j<s.size();j++) {
            try {
                System.out.println();
                CharStream cs = fromFileName(s.get(j));
                JsxLexer lexer = new JsxLexer(cs);
                CommonTokenStream token = new CommonTokenStream(lexer);
                JsxParser parser = new JsxParser(token);
                ParseTree tree = parser.program();
                Visitor visitor = new Visitor();
                Program startProgram = (Program) visitor.visit(tree);
                startProgram.PrintAst();
                System.out.println();
                System.out.println();
                System.out.println("Number of Scopes in the program : " + Scope.getContID());
                for (int i = 0; i < symbolTable.getScopes().size(); i++) {
                    for (Symbol symbol : symbolTable.getScopes().get(i).getSymbolList()) {
                        symbol.print();
                        System.out.println();
                    }
                }
                Gen gen = new Gen();
                // startProgram.PrintAst();
                System.out.println("-----------------------------------------------------------------------------");
                Gen.code.code.append(startProgram.CodeGen());
                System.out.println(gen.PrintCode());

                index++;
                //SymbolTable symbolTable=new SymbolTable();
                //  System.out.println("\u001b[34m"+symbolTable.PrintSymbolTable());
                System.out.println("-----------------------------------------------------------------------------");
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }
}
