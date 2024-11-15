grammar Python3;

start: program;
program: statement+;

statement: assignment
    | if_statement
    | elif_statement
    | else_statement;

assignment: VARNAME Assignment_operators expression
    | VARNAME Comparison_operators expression;

if_statement: 'if' expression ':' statement*;
elif_statement: 'elif' expression ':' statement*;
else_statement: 'else' ':' statement*;

// This is the define of expression
expression: NOT expression
    | expression Arithmetic_or_Comparison_operators expression
    | expression Logical_operators expression
    | VARNAME
    | INT
    | FLOAT
    | STRING
    | BOOLEAN
    | list
    | '(' expression ')';

// This is our list data type defined
list: '[' (expression (',' expression)*)? ']';

//These are our basic data types
INT: '-'? [0-9]+;
FLOAT: '-'? [0-9]+ '.' [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\\\r\n])* '\'';
BOOLEAN: 'True' | 'False';

Arithmetic_or_Comparison_operators:
      Arithmetic_operator
    | Comparison_operators;

// Our arthemetic operators, assignment operators and comparison operators
Arithmetic_operator: '+' | '-' | '*' | '/' | '%';
Assignment_operators: '=' | '+=' | '-=' | '*=' | '/=';
Comparison_operators: '<' | '<=' | '>' | '>=' | '==' | '!=';

Logical_operators: AND | OR;

//logical operator words
AND: 'and';
OR: 'or';
NOT: 'not';

VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;
