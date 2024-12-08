import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class ParserProject {
    public static void main(String[] args) {
        try {
            String code = new String(Files.readAllBytes(Paths.get("test/project_deliverable_1.py")));

            Python3Lexer lexer = new Python3Lexer(CharStreams.fromString(code));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Python3Parser parser = new Python3Parser(tokens);

            // Parse the input code
            ParseTree tree = parser.start();

            // Print raw tree format
            System.out.println("Parse Tree (LISP-style format):");
            System.out.println(tree.toStringTree(parser));
            
            // Print pretty tree format
            System.out.println("\nParse Tree (Pretty format):");
            printTree(tree, 0, parser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printTree(ParseTree tree, int level, Python3Parser parser) {
        // Print indentation
        System.out.print(String.join("", Collections.nCopies(level, "  ")));
        
        // Print node
        System.out.println(Trees.getNodeText(tree, parser));
        
        // Print all children
        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), level + 1, parser);
        }
    }
}
