lexer grammar TestLexer;

ID: '"' (.)+ '"';
HELLO: 'hello';

fragment CHAR: (' ' .. '~') | '\"' | '\\' | '\'' | '\n' | '\t';
LSINGLE_QUOTE: '\'' -> more, mode (CHAR_MODE);
LDOUBLE_QUOTE: '"' -> more, mode (STRING_MODE);

mode CHAR_MODE;
CHAR_LITERAL: '\'' ->mode (DEFAULT_MODE), channel(100);
CHAR_TEXT: CHAR ->more;

mode STRING_MODE;
STRING_LITERAL: '"' ->mode (DEFAULT_MODE), channel(100);
STRING_TEXT: CHAR -> more;