lexer grammar DecafLexer;

@lexer::header{
	import java.util.Map;
	import java.util.HashMap;
}


tokens{CLASS, PROGRAM, IF, ELSE, FOR, RETURN, BREAK, CONTINUE, CALLOUT, BOOLEAN, TRUE, FALSE, INT, VOID}

@lexer::members{
	
	
	Map<String, Integer> keywords = new HashMap<String, Integer>(){{
		put("class", DecafParser.CLASS);
		put("Program", DecafParser.PROGRAM);
		put("if", DecafParser.IF);
		put("else", DecafParser.ELSE);
		put("for", DecafParser.FOR);
		put("return", DecafParser.RETURN);
		put("break", DecafParser.BREAK);
		put("continue", DecafParser.CONTINUE);
		put("callout", DecafParser.CALLOUT);
		put("boolean", DecafParser.BOOLEAN);
		put("true", DecafParser.TRUE);
		put("false", DecafParser.FALSE);
		put("int", DecafParser.INT);
		put("void", DecafParser.VOID);		
	}};
	
}


fragment DECIMAL_LITERAL: (DIGIT)+ ;
HEX_LITERAL: '0x' (HEX_DIGIT)+;
INT_LITERAL:(DECIMAL_LITERAL | HEX_LITERAL);
BOOL_LITERAL: ('true' | 'false');

fragment ALPHA: [a-zA-Z_];
fragment DIGIT: [0-9];
fragment ALPHA_NUM: ALPHA | DIGIT;
fragment HEX_DIGIT: DIGIT | [a-fA-F];

fragment ID: ALPHA (ALPHA_NUM)*;
IDENTIIER: (ID {	
	if(keywords.containsKey(getText())){
		setType(keywords.get(getText()));
	}	
});

ASSIGN_OP:  '=' | '+=' | '-=';
ARITH_OP: '+' | '-' | '*' | '/' | '%';
RELOP: '<' | '>' | '<=' | '>=';
EQ_OP: '==' | '!=';
COND_OP: '&&' | '||';

NEGATIVE: '!';
ASSIGNMENT: '=';
MINUS: '-';


BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

SQUARE_BRACKET_OPEN: '[';
SQUARE_BRACKET_CLOSE: ']';
COMMA: ',';
SEMICOLON: ';';

PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';


WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
EOL_COMMENT : '//' .*? '\n' -> skip;


fragment CHAR: (' ' .. '!') | ('#'..'&')| ('('..'[') | (']'..'~');
fragment SPECIAL_CHAR: '\\"' | '\\\\' | '\\\'' | '\\n' | '\\t';
LSINGLE_QUOTE: '\'' -> more, mode(CHAR_MODE);
LDOUBLE_QUOTE: '"' -> more, mode (STRING_MODE);

mode CHAR_MODE;
CHAR_TEXT: (CHAR | SPECIAL_CHAR) -> more, mode(CHAR_RETURN_MODE);

mode CHAR_RETURN_MODE;
CHAR_LITERAL: '\'' ->mode(DEFAULT_MODE);

mode STRING_MODE;
STRING_LITERAL: '"' ->mode (DEFAULT_MODE);
STRING_TEXT: (CHAR | SPECIAL_CHAR) -> more;

