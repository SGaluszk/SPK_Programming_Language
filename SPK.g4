grammar SPK;


// program : (instruction (NL|EOF))* ;
program : instruction (NL instruction)*;
block : instruction (NL instruction)*;

instruction : (integer | integer_list | float_ | string);

integer : 'CALKOWITA '  VARIABLE_NAME  ASSIGN  INTEGER_NUMBER;
integer_list : 'LISTA '  VARIABLE_NAME  ASSIGN  '['  (INTEGER_NUMBER )*  ']';
float_ : 'ULAMKOWA' VARIABLE_NAME  ASSIGN  FLOAT_NUMBER;
string : 'NAPIS ' VARIABLE_NAME ASSIGN STRING;

//if_ : 'JEZELI ' IF_ELEMENT_COMPARABLE COMPARATOR IF_ELEMENT_COMPARABLE ' TO ' block;

//IF_ELEMENT_COMPARABLE: (VARIABLE_NAME | INTEGER_NUMBER | FLOAT_NUMBER | STRING);
//COMPARATOR : (EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN | LESS_THAN_OR_EQUAL | GREATER_THAN_OR_EQUAL);
COMMENT : '??' ~[\r\n\f]* NL -> skip;

// variable_name : VARIABLE_NAME; //Bo inaczej implicit

VARIABLE_NAME : VALID_ID_START VALID_ID_CONTINUE*  ;


INTEGER_NUMBER : NON_ZERO_DIGIT DIGIT*;
FLOAT_NUMBER : NON_ZERO_DIGIT DIGIT* '.' DIGIT+ | '0.' DIGIT+;
STRING : '"' STRING_CHAR* '"';

STRING_CHAR : [A-Z] | [a-z]; // dodać wszystkie inne znaki
NON_ZERO_DIGIT : [1-9];
DIGIT : [0-9];

// WS    : [ \t\r\n]+ -> skip ;
WS    : [ \t]+ -> skip;
NL : [\r\n]+;


fragment VALID_ID_START
 : '_'
 | [A-Z]
 | [a-z];

fragment VALID_ID_CONTINUE
 : VALID_ID_START
 | [0-9];
 
ASSIGN : '=';
EQUALS : '==';
NOT_EQUALS : '/=';

POWER : '^';
ADD : '+';
SUBTRACT : '-';
DIV : '/';
MULTIPLY : '*';
LESS_THAN : '<';
GREATER_THAN : '>';
LESS_THAN_OR_EQUAL : '<=';
GREATER_THAN_OR_EQUAL : '>=';
LEFT_BRACKET : '(';
RIGHT_BRACKET : ')';
INCREMENT : '++';
DECREMENT : '--';


OUTPUT : 'WYPISZ';