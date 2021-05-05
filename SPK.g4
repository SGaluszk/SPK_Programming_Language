grammar SPK;

program : function_* bigStmt* EOF;


bigStmt : (if_stat | while_stat | for_loop | declaration | assignment | print_ | function_exec);

// if_ : IF_ condition_block THEN_ block;
if_stat : IF_ condition_block (ELSE IF_ condition_block)* (ELSE block)?;
while_stat : WHILE expr THEN_ block;

for_loop : FOR VARIABLE_NAME IN iterable block;

print_ : PRINT_ printable SEP;

printable : STRING | VARIABLE_NAME | INTEGER_NUMBER | FLOAT_NUMBER | BOOL_;

condition_block : expr THEN_ block;


block : OBRACE block CBRACE | OBRACE bigStmt+ CBRACE | bigStmt;

function_ : FUN_ VARIABLE_NAME OPAR arguments CPAR OBRACE bigStmt+ CBRACE SEP;

function_exec : VARIABLE_NAME OPAR arguments_exec CPAR SEP;

arguments : (TYPE_NAME VARIABLE_NAME ',')* TYPE_NAME VARIABLE_NAME;
arguments_exec : (expr ',')* expr;

declaration : TYPE_NAME VARIABLE_NAME ASSIGN expr SEP;
assignment : VARIABLE_NAME ASSIGN expr SEP;

TYPE_NAME : (INT | LIST | FLOATING | STRING_ | BOOL_ );
BOOL_ : 'LOGICZNA';
FUN_ : 'FUNKCJA';
INT : 'CA\u0141KOWITA' ;
LIST : 'LISTA';
FLOATING : 'U\u0141AMKOWA';
STRING_ : 'NAPIS';
IF_ : 'JE\u017BELI';
THEN_ : 'TO';
ELSE : 'INACZEJ';
WHILE: 'DOP\u00D3KI';
FOR: 'DLA';
IN: 'W';
PRINT_: 'WYPISZ';

expr
 : expr POW expr                        
 | MINUS expr                           
 | NOT expr                             
 | expr op=(MULT | DIV | MOD) expr      
 | expr op=(PLUS | MINUS) expr          
 | expr op=(LTEQ | GTEQ | LT | GT) expr 
 | expr op=(EQ | NEQ) expr              
 | expr AND expr                        
 | expr OR expr                         
 | atom                          
 ;

atom
 : OPAR expr CPAR 
 | INTEGER_NUMBER 
 | FLOAT_NUMBER
 | VARIABLE_NAME            
 | STRING  
 | BOOL_
 | OSQBRACE (INTEGER_NUMBER | FLOAT_NUMBER)* CSQBRACE     
 ;

iterable
 : OSQBRACE (INTEGER_NUMBER | FLOAT_NUMBER)* CSQBRACE    
 | STRING
 | VARIABLE_NAME
 ;

VARIABLE_NAME
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;
 

INTEGER_NUMBER : '-'? NON_ZERO_DIGIT DIGIT* | '0';
FLOAT_NUMBER : '-'? NON_ZERO_DIGIT DIGIT* '.' DIGIT+ | '0.' DIGIT+;
STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

NON_ZERO_DIGIT : [1-9];
DIGIT : [0-9];

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';


ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
OSQBRACE : '[';
CSQBRACE : ']';


COMMENT
 : '??' ~[\r\n]* -> skip
 ;
SEP : ';';
WS : [ \t\r\n] -> skip;

OTHER
 : . 
 ;
