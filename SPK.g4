grammar SPK;

program : function_* bigStmt* EOF;


bigStmt : (if_stat | while_stat | for_loop | declaration | assignment | print_ | function_exec);

// if_ : IF_ condition_block THEN_ block;
if_stat : IF_ condition_block (ELSE IF_ condition_block)* (ELSE block)?;
while_stat : WHILE expr THEN_ block;

for_loop : FOR VARIABLE_NAME IN iterable block;

print_ : PRINT_ expr SEP;

range_:  OSQBRACE FROM expr TO expr CSQBRACE;


condition_block : condition THEN_ block;
condition: expr;

block : OBRACE block CBRACE | OBRACE bigStmt+ CBRACE;
fblock : block;
function_ : FUN_ VARIABLE_NAME OPAR arguments CPAR  fblock ;
// function_body: OBRACE bigStmt+ CBRACE;

function_exec : VARIABLE_NAME OPAR arguments_exec CPAR SEP;

arguments : ((TYPE_NAME VARIABLE_NAME ',')* TYPE_NAME VARIABLE_NAME)?;
arguments_exec : (expr ',')* expr;

declaration : TYPE_NAME VARIABLE_NAME ASSIGN expr SEP;
assignment : VARIABLE_NAME list_index? ASSIGN expr SEP;


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
LENGTH: 'D\u0141UGO\u015A\u0106';
FROM: 'OD';
TO: 'DO';

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
 | LENGTH '(' iterable ')'                    
 | INTEGER_NUMBER 
 | FLOAT_NUMBER
 | VARIABLE_NAME            
 | STRING  
 | BOOL_VALUE
 | range_
 | list_values  
 | list_element  
 ;

iterable
 : range_
 | list_values    
 | STRING
 | VARIABLE_NAME
 ;
BOOL_VALUE : 'Prawda' | 'Fa\u0142sz';
VARIABLE_NAME
 : [a-zA-Z_\u00D3\u0104\u0105\u0106\u0107\u0118\u0119\u0141\u0142\u0143\u0144\u015A\u015B\u0179\u017A\u017B\u017C\u00F3] 
 [a-zA-Z_0-9\u00D3\u0104\u0105\u0106\u0107\u0118\u0119\u0141\u0142\u0143\u0144\u015A\u015B\u0179\u017A\u017B\u017C\u00F3]*
 ;


INTEGER_NUMBER : NON_ZERO_DIGIT DIGIT* | '0';
FLOAT_NUMBER : NON_ZERO_DIGIT DIGIT* '.' DIGIT+ | '0.' DIGIT+;
STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
list_element: VARIABLE_NAME list_index;
list_values : '['((expr',')* expr)? ']';
list_index: OSQBRACE expr CSQBRACE;
NON_ZERO_DIGIT : [1-9];
DIGIT : [0-9];


OR : 'LUB';
AND : 'I';
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
