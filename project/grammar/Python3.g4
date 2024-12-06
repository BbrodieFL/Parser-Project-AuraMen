grammar Python3;

start: program;
program: (statement+ | NEWLINE)+;

statement:
    expression (NEWLINE | EOF)
  | assignment (NEWLINE | EOF)
  | if_statement
  | for_statement
  | while_statement
  | NEWLINE ;

if_statement:
    'if' expression ':' NEWLINE block (elif_statement)* (else_statement)?
;

elif_statement:
    INDENT* 'elif' expression ':' NEWLINE block
;

else_statement:
    INDENT* 'else' ':' NEWLINE block
;

for_statement:
    'for' expression 'in' expression ':' NEWLINE block
;

while_statement:
    'while' expression ':' NEWLINE block
;

blockStatement:
    INDENT+ statement;


block:
    blockStatement+;


assignment:
    VARNAME assignment_operator expression;


assignment_operator:
    '=' | '+=' | '-=' | '*=' | '/=';


arithmetic_operators:
    '*' | '/' | '+' | '-' | '%';

expression:
    expression arithmetic_operators expression  # ArithExpr
  | expression Comparison_operators expression  # CompareExpr
  | 'not' expression                          # NotExpr
  | expression 'and' expression               # AndExpr
  | expression 'or' expression                # OrExpr
  | '-' (INT|FLOAT)                          # NegExpr
  | VARNAME '(' paramExpr ')'                 # FuncCallExpr
  | INT                                       # IntExpr
  | FLOAT                                     # FloatExpr
  | STRING                                    # StringExpr
  | BOOLEAN                                   # BoolExpr
  | list                                      # ListExpr
  | VARNAME                                   # VarExpr
  | '(' expression ')'                        # ParenExpr
;


paramExpr:
    expression (',' expression)*;

list:
    '[' (expression (',' expression)*)? ']';


Comparison_operators:
    '==' | '!=' | '<=' | '>=' | '<' | '>';


VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STRING: '"' (~["\r\n])* '"' | '\'' (~['\\\r\n])* '\'';
BOOLEAN: 'True' | 'False';

NEWLINE: '\r'? '\n';

INDENT: '\t';

WS: [ ]+ -> skip;

SINGLE_LINE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT: ('\'\'\'' | '"""') .*? ('\'\'\'' | '"""') -> skip;
