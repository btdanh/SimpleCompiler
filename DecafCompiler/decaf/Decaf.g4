grammar Decaf;

/* Parser grammar */
program: CLASS PROGRAM BRACKET_OPEN field_decl_s method_decl_s BRACKET_CLOSE;

field_decl_s: (field_decl)*;
field_decl: type field_decl_name (COMMA field_decl_name)*;
field_decl_name: (IDENTIIER | IDENTIIER SQUARE_BRACKET_OPEN INT_LITERAL SQUARE_BRACKET_CLOSE);

method_decl_s: (method_decl)*;
method_decl: (type | VOID) IDENTIIER PARENTHESIS_OPEN param_decl_s PARENTHESIS_CLOSE block;
param_decl_s: (param_decl)*; 
param_decl: (type IDENTIIER) (COMMA type IDENTIIER)*;

block: BRACKET_OPEN var_decl_s statement_s BRACKET_CLOSE;
var_decl_s: (var_decl)*;
var_decl: type IDENTIIER  (COMMA IDENTIIER)*;
statement_s: (statement)*;
statement: location ASSIGN_OP expr 
			| method_call
			| IF PARENTHESIS_OPEN expr PARENTHESIS_CLOSE  block (ELSE block)*
			| FOR IDENTIIER '=' expr COMMA expr block
			| RETURN (expr)*
			| BREAK
			| CONTINUE
			| block;
			
			
method_call: method_name PARENTHESIS_OPEN (expr (COMMA expr)*)* PARENTHESIS_CLOSE
			| CALLOUT PARENTHESIS_OPEN STRING_LITERAL (COMMA callout_arg (COMMA callout_arg)*)* PARENTHESIS_CLOSE;
method_name: IDENTIIER;

location: IDENTIIER 
		| IDENTIIER SQUARE_BRACKET_OPEN expr SQUARE_BRACKET_CLOSE;
		
expr: location
	| method_call
	| literal
	| expr bin_op expr
	| '-' expr
	| '!' expr
	| PARENTHESIS_OPEN expr PARENTHESIS_CLOSE; 

callout_arg: expr | STRING_LITERAL;
bin_op: ARITH_OP | RELOP | EQ_OP | COND_OP;
literal: INT_LITERAL | CHAR_LITERAL | BOOL_LITERAL;

fragment DECIMAL_LITERAL: (DIGIT)+ ;
fragment HEX_LITERAL: HEX_PRFEFIX (HEX_DIGIT)+;
HEX_PRFEFIX: '0x';
INT_LITERAL: DECIMAL_LITERAL | HEX_LITERAL;
CHAR_LITERAL: '\'' CHAR '\'';
STRING_LITERAL: '"' (CHAR)* '"';

IDENTIIER: ALPHA (ALPHA_NUM)*;
fragment ALPHA_NUM: ALPHA | DIGIT;
fragment HEX_DIGIT: DIGIT | ('a' .. 'f') | ('A' .. 'F');


/*Lexer grammar */

CLASS: 'class';
PROGRAM: 'Program';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

type: INT | BOOLEAN;
INT: 'int';
BOOLEAN: 'boolean';
VOID: 'void';

SQUARE_BRACKET_OPEN: '[';
SQUARE_BRACKET_CLOSE: ']';
COMMA: ',';

PARENTHESIS_OPEN: '(';
PARENTHESIS_CLOSE: ')';

ASSIGN_OP: '=' | '+=' | '-=';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';
BREAK: 'break';
CONTINUE: 'continue';
CALLOUT: 'callout';

ARITH_OP: '+' | '-' | '*' | '/' | '%';
RELOP: '<' | '>' | '<=' | '>=';
EQ_OP: '==' | '!=';
COND_OP: '&&' | '||';

fragment ALPHA: ('a' .. 'z') | ('A' .. 'Z') | '_';
fragment DIGIT: ('0' .. '9');
fragment CHAR: (' ' .. '~') | '\"' | '\\' | '\'' | '\n' | '\t';

BOOL_LITERAL: TRUE | FALSE;
fragment TRUE: 'true';
fragment FALSE: 'false';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ ->skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
EOL_COMMENT : '//' .*? '\n' -> skip;