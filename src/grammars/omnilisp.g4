grammar omnilisp;

file: form * EOF;

form: literal
    | list
    /* | reader_macro */
    ;

forms: form* ;

list: '(' forms ')' ;


literal
    : string
    | number
    | nil
    | bool
    | symbol
    ;


string: STRING;
nil:NIL;
hex: HEX;
bin: BIN;
bign: BIGN;
bool:BOOLEAN;
symbol:SYMBOL;
number
    : FLOAT
    | hex
    | bin
    | bign
    | LONG
    ;


NIL: 'nil';

BOOLEAN : 'true' | 'false' ;

FLOAT
    : '-'? [0-9]+ FLOAT_TAIL
    | '-'? 'Infinity'
    | '-'? 'NaN'
    ;


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
