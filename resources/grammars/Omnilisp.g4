grammar Omnilisp;

file: form * EOF;


form: literal
| list
| special_form
;

special_form:SPECIAL_FORM  ;


forms: form* ;

list: '(' forms ')' ;

symbol:SYMBOL;
/* ~(MATCH SYMBOL+); */

literal
: string
| number
| nil
| BOOLEAN
| SYMBOL
;

BOOLEAN : 'TRUE' | 'FALSE' ;

FLOAT
: '-'? [0-9]+ FLOAT_TAIL
| '-'? 'INFINITY'
| '-'? 'NAN'
;


nil: 'NIL';

number
: FLOAT
| hex
| bin
| bign
| LONG
;


string: STRING;
bin: BIN;
bign: BIGN;

hex: HEX;

STRING : '"' ( ~'"' | '\\' '"' )* '"' ;

SYMBOL
: '.'
| '/'
| NAME
;


TRASH
: ( WS | COMMENT ) -> channel(HIDDEN)
;
fragment
WS : [ \n\r\t,] ;

fragment
NAME: SYMBOL_HEAD SYMBOL_REST* (':' SYMBOL_REST+)* ;

fragment
SYMBOL_HEAD
: ~('0' .. '9'
    | '^' | '`' | '\'' | '"' | '#' | '~' | '@' | ':' | '/' | '%' | '(' | ')' | '[' | ']' | '{' | '}' // FIXME: could be one group
    | [ \n\r\t,] // FIXME: could be WS
   )
;

fragment
SYMBOL_REST
: SYMBOL_HEAD
| '0'..'9'
| '.'
;

fragment
COMMENT: ';' ~[\r\n]* ;

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

fragment
MATCH: 'match' ;
DEFINE: 'define';


SPECIAL_FORM: MATCH
| DEFINE
;
