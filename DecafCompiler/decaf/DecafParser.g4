parser grammar DecafParser;

options{tokenVocab=DecafLexer;}

/* Parser grammar */
program: CLASS PROGRAM BRACKET_OPEN (field_decl)* (method_decl)* BRACKET_CLOSE;

field_decl: type field_decl_name (COMMA field_decl_name)* SEMICOLON;
field_decl_name: IDENTIIER  #singleFieldDecl
				| IDENTIIER SQUARE_BRACKET_OPEN INT_LITERAL SQUARE_BRACKET_CLOSE #arrayFieldDecl
				;


method_decl: (type | VOID) IDENTIIER PARENTHESIS_OPEN param_decl_s PARENTHESIS_CLOSE block;
param_decl_s: (param_decl)*; 
param_decl: (type IDENTIIER) (COMMA type IDENTIIER)*;

block: BRACKET_OPEN var_decl_s* statement_s* BRACKET_CLOSE;
var_decl_s: (var_decl) (var_decl)* SEMICOLON;
var_decl: type IDENTIIER  (COMMA IDENTIIER)*;
statement_s: statement (statement)*;
statement: location ASSIGN_OP expr SEMICOLON
			| method_call SEMICOLON
			| IF PARENTHESIS_OPEN expr PARENTHESIS_CLOSE  block (ELSE block)*
			| FOR IDENTIIER ASSIGNMENT expr COMMA expr block
			| RETURN (expr)* SEMICOLON
			| BREAK SEMICOLON
			| CONTINUE SEMICOLON
			| block ;
			
			
method_call: method_name PARENTHESIS_OPEN (expr (COMMA expr)*)* PARENTHESIS_CLOSE
			| CALLOUT PARENTHESIS_OPEN STRING_LITERAL (COMMA callout_arg (COMMA callout_arg)*)* PARENTHESIS_CLOSE;
method_name: IDENTIIER;

location: IDENTIIER 	#firstLocation
		| IDENTIIER SQUARE_BRACKET_OPEN expr SQUARE_BRACKET_CLOSE  #secondLocation;  
		
expr: location		#locationExpr
	| method_call	#methodCallExpr
	| literal		#literalExpr
	| expr bin_op expr	#binLiteralExpr
	| MINUS expr	#negativeExpr
	| NEGATIVE expr	#negativeExpr
	| PARENTHESIS_OPEN expr PARENTHESIS_CLOSE	#parenExpr
	;	 

callout_arg: expr | STRING_LITERAL;
bin_op: ARITH_OP | RELOP | EQ_OP | COND_OP;
literal: op = (INT_LITERAL | CHAR_LITERAL | BOOL_LITERAL);
type: op = (INT | BOOLEAN);

 

