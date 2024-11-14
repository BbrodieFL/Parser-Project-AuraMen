grammar Python3;

start: program;
program: statement+;

statement: assignment
    | if_statement
    | elif_statement
    | else_statement;

assignment: VARNAME Assignment_operators expression
    | VARNAME Comparison_operators expression;

if_statement: 'if' condition ':' statement*;
elif_statement: 'elif' condition ':' statement*;
else_statement: 'else' ':' statement*;

condition: expression;

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

list: '[' (expression (',' expression)*)? ']';

INT: '-'? [0-9]+;
FLOAT: '-'? [0-9]+ '.' [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\\\r\n])* '\'';
BOOLEAN: 'True' | 'False';

Arithmetic_or_Comparison_operators:
      Arithmetic_operator
    | Comparison_operators;

Arithmetic_operator: '+' | '-' | '*' | '/' | '%';
Assignment_operators: '=' | '+=' | '-=' | '*=' | '/=';
Comparison_operators: '<' | '<=' | '>' | '>=' | '==' | '!=';

Logical_operators: AND | OR;

AND: 'and';
OR: 'or';
NOT: 'not';

VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;
