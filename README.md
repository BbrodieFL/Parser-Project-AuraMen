Our Team's name is Aura Men after the Oaklhoma City Thunder

We will be implementing Java with our parser

Group Members
1. Ben Chin (atvbean)
2. Will Curry (CWill22)
3. Olo Masiza (BbrodieFL)
4. Aman Daggumati(adaggumati)
5. Jacob York

Setup for our project:
1) Navigate to the root directory .../Parser-Project-AuraMen/project
2) To produce the auto generated files that will be responsible for the core logic of our java project run this command `antlr4 -o generated grammar/Python3.g4`
3) In the root directory run the command to compile the project `javac -cp "lib/antlr-4.13.2-complete.jar:generated/grammar" -d bin src/ParserProject.java generated/grammar/*.java`
4) Once compiling is finished run the command `java -cp "lib/antlr-4.9.2-complete.jar:bin" ParserProject` in the root directory once again
5) Following this in the terminal the parse tree will be produced in two formats

Video Demo:
https://youtu.be/7fRX7h-zDXE

Github repo link:
https://github.com/BbrodieFL/Parser-Project-AuraMen

Versions Required: Latest updated Java and ANTLR

Explanation: This Parser Project involves creating a custom parser using Java using the Context Free grammar and the tool ANTLR. The parser should generate a parse tree and handle the Java. The project has three deliverables, Deliverable 1 being the arithmetic and assignment operators, deliverable 2 being the conditional and logical conditions and statements and deliverable 3 will have the loops, nested structures, and comments. 
