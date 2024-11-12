grammar Python3;
start: program;
program: statement+;
statement: assignment;
assignment: VARNAME Assignment_operators expression;

VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

// This is the define of expression
expression: expression Arithmetic_operator expression
    |VARNAME
    |INT
    |FLOAT
    |STRING
    |BOOLEAN
    |list
    |'(' expression ')';

// This is our list data type defined
list: '[' (expression (',' expression)*)? ']';

//These are our basic data types
INT: [0-9]+;
STRING: '"' ( ~["\r\n])* '"' | '\'' ( ~['\\\r\n])* '\'';
BOOLEAN: 'True' | 'False';
FLOAT: [0-9]+ '.' [0-9]+;

// Our arthemetic operators and assignment operators
Arithmetic_operator: '+' | '-' | '*' | '/' | '%';
Assignment_operators: '=' | '+=' | '-=' | '*=' | '/=';

WS: [ \t\r\n]+ -> skip;

INDENT: '\t';