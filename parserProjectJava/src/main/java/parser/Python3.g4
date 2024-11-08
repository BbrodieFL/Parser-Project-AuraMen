grammar Python3;
start: program;
program: statement+;
statement: Arithmetic_operator | Assignment_operators;
Arithmetic_operator: '+' | '-' | '*' | '/' | '%';
Assignment_operators: '=' | '+=' | '-=' | '*=' | '/=';