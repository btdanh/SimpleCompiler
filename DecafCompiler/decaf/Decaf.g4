grammar Decaf;

/* Parser grammar */
program: CLASS PROGRAM BRACKET_OPEN field_decl_s method_decl_s BRACKET_CLOSE;

field_decl_s: (field_decl)*;
field_decl: TYPE field_decl_name (COMMA field_decl_name)*;
field_decl_name: (id | id SQUARE_BRACKET_OPEN int_literal SQUARE_BRACKET_CLOSE);

method_decl_s: (method_decl)*;
method_decl: (TYPE | VOID) id PARENTHESIS_OPEN param_decl_s PARENTHESIS_CLOSE block;
param_decl_s: (param_decl)*; 
param_decl: (TYPE id) (COMMA TYPE id)*;

block: BRACKET_OPEN var_decl_s statement_s BRACKET_CLOSE;
var_decl_s: (var_decl)*;
var_decl: TYPE id  (COMMA id)*;
statement_s: (statement)*;
statement: location ASSIGN_OP expr 
			| method_call
			| IF PARENTHESIS_OPEN expr PARENTHESIS_CLOSE  block (ELSE block)*
			| FOR id '=' expr COMMA expr block
			| RETURN (expr)*
			| BREAK
			| CONTINUE
			| block;
			
			
method_call: method_name PARENTHESIS_OPEN (expr (COMMA expr)*)* PARENTHESIS_CLOSE
			| CALLOUT PARENTHESIS_OPEN string_literal (COMMA callout_arg (COMMA callout_arg)*)* PARENTHESIS_CLOSE;
method_name: id;

location: id 
		| id SQUARE_BRACKET_OPEN expr SQUARE_BRACKET_CLOSE;
		
expr: location
	| method_call
	| literal
	| expr bin_op expr
	| '-' expr
	| '!' expr
	| PARENTHESIS_OPEN expr PARENTHESIS_CLOSE; 

callout_arg: expr | string_literal;
bin_op: ARITH_OP | RELOP | EQ_OP | COND_OP;
literal: int_literal | char_literal | BOOL_LITERAL;

id: ALPHA (alpha_num)*;
alpha_num: ALPHA | DIGIT;
hex_digit: DIGIT | ('a' .. 'f') | ('A' .. 'F');

int_literal: decimal_literal | hex_literal;
decimal_literal: (DIGIT)+;
hex_literal: 'Ox' (hex_digit)+;
char_literal: '\'' CHAR '\'';
string_literal: '"' (CHAR)* '"';

/*Lexer grammar */
CLASS: 'class';
PROGRAM: 'Program';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

TYPE: 'int' | 'boolean';
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

ALPHA: ('a' .. 'z') | ('A' .. 'Z') | '_';
DIGIT: ('0' .. '9');
BOOL_LITERAL: 'true' | 'false';
CHAR: (' ' .. '~') | '\"' | '\\' | '\'' | '\n' | '\t';

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;