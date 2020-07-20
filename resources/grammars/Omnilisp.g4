grammar Omnilisp;


forms : form* ;

form : '(' form* ')'
    | '\'' form
    | number
    | BOOLEAN
    | STRING
    | SYMBOL
    ;



number
: FLOAT
| HEX
| INT
| BIN
| BIGN
| LONG
;


INT : [0-9]+ ;
BOOLEAN : ('#f'|'#t') ;
STRING : '"' ( ~'"' | '\\' '"')* '"' ;
SYMBOL : ~('#'|'"'|'\''|[()]|[ \t\r\n]) ~('"'|'\''|[()]|[ \t\r\n])* ;

COMMENT : ';' .*? '\n' -> skip ;
WS : [ \t\r\n] -> skip ;


FLOAT
: '-'? [0-9]+ FLOAT_TAIL
| '-'? 'INFINITY'
| '-'? 'NAN'
;



fragment
FLOAT_TAIL
: FLOAT_DECIMAL FLOAT_EXP
| FLOAT_DECIMAL
| FLOAT_EXP
;

fragment
FLOAT_DECIMAL
: '.' [0-9]+
;

fragment
FLOAT_EXP
: [eE] '-'? [0-9]+
;
fragment
HEXD: [0-9a-fA-F] ;
HEX: '0' [xX] HEXD+ ;
BIN: '0' [bB] [10]+ ;
LONG: '-'? [0-9]+[lL]?;
BIGN: '-'? [0-9]+[nN];

