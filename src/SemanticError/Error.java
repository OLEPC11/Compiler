package SemanticError;
import org.antlr.v4.runtime.*;
import java.util.Collections;
import java.util.List;

public class Error extends BaseErrorListener {
    public static boolean hasError=false;
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        hasError=true;
        List<String >stack=((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.println("Semantic Error");
        System.err.println("Token"+"\""+((Token)offendingSymbol).getText()+"\""+"(Line "+line+", column "+(charPositionInLine +1)+")"+": "+msg);
        System.err.println(stack);
    }
}
