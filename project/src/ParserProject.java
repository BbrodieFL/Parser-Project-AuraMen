import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ParserProject{
    public static void main (String[] args){
        try {
            String code = new String(Files.readAllBytes(Paths.get("test/project_deliverable_1.py")));

            Python3Lexer lexer = new Python3Lexer(CharStreams.fromString(code));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);

            // Parse the input code
            ParseTree tree = parser.start(); // Start from the 'start' rule


        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}