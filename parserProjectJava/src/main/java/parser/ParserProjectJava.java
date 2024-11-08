package parser;

<<<<<<< HEAD
import org.antlr.v4.runtime.ANTLRInputStream;
import org.sonar.python.lexer.PythonLexer;
import java.nio.file.*;

=======
import java.io.FileInputStream;
import java.io.InputStream;
>>>>>>> 2fb25d6 (work on java file)

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.generated.Python3Lexer;
import parser.generated.Python3Parser;
import parser.generated.Python3BaseListener;
import parser.generated.Python3BaseVisitor;

<<<<<<< HEAD
        public static void main(String[] args) throws Exception {
                //
=======




public class ParserProjectJava 
{
        private static final String TEST_FILE_ADDRESS = "src/main/java/resources/project_deliverable_1.py";    

        public static void main(String[] args) throws Exception 
        {
               // Read from the file
        InputStream testFile = new FileInputStream(getTestFileAddress());

        // Create a CharStream that reads from the file
        CharStream input = CharStreams.fromStream(testFile);

        // Step 1: Create the lexer
        Python3Lexer lexer = new Python3Lexer(input);

        // Step 2: Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Step 3: Create the parser using the token stream
        Python3Parser parser = new Python3Parser(tokens);

        // Step 4: Parse the input starting from the root rule (replace `file_input` with the correct root rule for your grammar)
        ParseTree tree = parser.file_input();

        // Step 5 (Optional): Walk the tree using a listener
        ParseTreeWalker walker = new ParseTreeWalker();
        Python3BaseListener listener = new Python3BaseListener();
        walker.walk(listener, tree);

        // Step 6 (Optional): If using a visitor instead of a listener
        Python3BaseVisitor<Object> visitor = new Python3BaseVisitor<>();
        visitor.visit(tree);

        // Close the input file
        testFile.close();

                
    
>>>>>>> 2fb25d6 (work on java file)
        }
    public static String getTestFileAddress() {
        return TEST_FILE_ADDRESS;
    }

}

