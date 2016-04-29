import org.antlr.v4.runtime.*; import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DMNS {
public static void main(String[] args) throws Exception {

System.out.println("In Tester Java");
// create a CharStream that reads from standard input

String filename="";
if (args.length >0)
{
	filename = args[0];
}
else
{
	System.out.println("Please enter the name of the file");
	return;
}
//String file_name = "high.hl";
File file = new File(filename);
FileInputStream fis = null;
fis = new FileInputStream(file);

// ANTLRInputStream input = new ANTLRInputStream(System.in);
ANTLRInputStream input = new ANTLRInputStream(fis);

HelloLexer tlex = new HelloLexer(input);

// create a buffer of tokens pulled from the lexer
CommonTokenStream tokens = new CommonTokenStream(tlex);

HelloParser tparse = new HelloParser(tokens);

ParseTree tree = tparse.program();
System.out.println(tree.toStringTree(tparse));

// Create a generic parse tree walker that can trigger callbacks
ParseTreeWalker walker = new ParseTreeWalker();
// Walk the tree created during the parse, trigger callbacks 
ProgramToIntermediate ptointermediate = new ProgramToIntermediate();
ptointermediate.op_filename = filename;
walker.walk(ptointermediate, tree); System.out.println(); // print a \n after translation
}
}
