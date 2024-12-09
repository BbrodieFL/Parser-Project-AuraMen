grammar Python3;

start: program EOF;
program: (statement NEWLINE?)*;


//STATEMENTS    

statement
    : assignment
    | if_statement
    | for_statement
    | while_statement
    | comment_statement
    | NEWLINE
    ;
statement_inif
    : assignment
    | for_statement
    | comment_statement
    | NEWLINE
    ;

assignment
    : VARNAME Assignment_operators expression
    | VARNAME Comparison_operators expression NEWLINE
    ;

if_statement
    : 'if' expression ':' (NEWLINE INDENT)? block_inif
      (elif_statement)*
      (else_statement)? 
    ;

elif_statement
    : 'elif' expression ':' (NEWLINE INDENT)? block_inif
    ;

else_statement
    : 'else' ':' (NEWLINE INDENT)? block_inif
    ;

for_statement
    : 'for' VARNAME 'in' expression ':' (NEWLINE INDENT)? block
    ;

while_statement
    : 'while' expression ':' (NEWLINE INDENT)?  block_inif
    ;

comment_statement
    : COMMENT NEWLINE
    ;

block
    : (statement)* 
    ;
    
block_inif
    :(statement_inif)*
    ;



//EXPRESSIONS   

expression
    : NOT expression
    | expression Arithmetic_or_Comparison_operators expression
    | expression Logical_operators expression
    | function_call
    | VARNAME
    | INT
    | FLOAT
    | STRING
    | BOOLEAN
    | list
    | '(' expression ')'
    ;

function_call
    : VARNAME '(' (expression (',' expression)*)? ')'
    ;

list
    : '[' (expression (',' expression)*)? ']'
    ;

//LEXER RULES  

INT: '-'? [0-9]+;
FLOAT: '-'? [0-9]+ '.' [0-9]+;

// Single- and double-quoted strings only
STRING
    : '"' (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;

BOOLEAN: 'True' | 'False';

Arithmetic_or_Comparison_operators
    : Arithmetic_operator
    | Comparison_operators
    ;

Arithmetic_operator: '+' | '-' | '*' | '/' | '%';

Assignment_operators: '=' | '+=' | '-=' | '*=' | '/=';

Comparison_operators: '<' | '<=' | '>' | '>=' | '==' | '!=';

Logical_operators: AND | OR;

AND: 'and';
OR: 'or';
NOT: 'not';

VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

COMMENT
    : '#' ~[\r\n]* -> skip
    ;
    
INDENT: '<INDENT>';
DEDENT: '<DEDENT>';
NEWLINE: '\r'? '\n' INDENT*;

// Triple-quoted blocks treated as multi-line comments
MULTILINE_COMMENT
  :('\'\'\'' | '"""') .*? ('\'\'\'' | '"""') -> skip;

WS: [ \t]+ -> skip;
