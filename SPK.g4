grammar SPK;

program : bigStmt* EOF;

bigStmt : (if_ | declaration);

if_ : IF_ condition_block THEN_ block;

condition_block : expr;

block : OBRACE block CBRACE | bigStmt+;

declaration : TYPE_NAME VARIABLE_NAME ASSIGN expr SEP;

TYPE_NAME : (INT | LIST | FLOATING | STRING_ );
INT : 'CALKOWITA' ;
LIST : 'LISTA';
FLOATING : 'ULAMKOWA';
STRING_ : 'NAPIS';
IF_ : 'JEZELI';
THEN_ : 'TO';

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
 | (INTEGER_NUMBER | FLOAT_NUMBER)  
 | VARIABLE_NAME            
 | STRING  
 | OSQBRACE (INTEGER_NUMBER | FLOAT_NUMBER)* CSQBRACE     
 ;


VARIABLE_NAME
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;
 

INTEGER_NUMBER : NON_ZERO_DIGIT DIGIT*;
FLOAT_NUMBER : NON_ZERO_DIGIT DIGIT* '.' DIGIT+ | '0.' DIGIT+;
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
