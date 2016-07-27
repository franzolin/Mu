import java.lang.Exception;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Run {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            args = new String[]{"../test.mu"};
        }

        System.out.println("parsing: " + args[0]);

        MuLexer lexer = new MuLexer(new ANTLRFileStream(args[0]));
        MuParser parser = new MuParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.parse();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
