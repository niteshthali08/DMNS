import org.antlr.v4.runtime.*; import org.antlr.v4.runtime.tree.*;

public class Test {
public static void main(String[] args) throws Exception {

System.out.println("In Tester Java");
// create a CharStream that reads from standard input
ANTLRInputStream input = new ANTLRInputStream(System.in);

HelloLexer tlex = new HelloLexer(input);

// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(tlex);

HelloParser tparse = new HelloParser(tokens);

ParseTree tree = tparse.program();
System.out.println(tree.toStringTree(tparse));

// Create a generic parse tree walker that can trigger callbacks
ParseTreeWalker walker = new ParseTreeWalker();
// Walk the tree created during the parse, trigger callbacks 
walker.walk(new ProgramToIntermediate(), tree); System.out.println(); // print a \n after translation

}
}

