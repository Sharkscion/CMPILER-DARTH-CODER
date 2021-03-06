/**
 * Define a grammar called Hello
 */
grammar Darth_Coder;
@header {
	package ANTLRGeneratedClasses;
}

INT_LITERAL	
	: [0-9]+
	;
	
FLOAT_LITERAL
	: [0-9]+'.'[0-9]+
	;
	
NL			
	: '\n'
	;
	
WS			
	: [ \t\r\n]+	-> skip
	;

PLUS		
	: '+'
	;
	
MINUS		
	: '-'
	;
	
MULT		
	: '*'
	;
	
DIV			
	: '/'
	;
	
MOD			
	: '%'
	;

EQUAL		
	: '='
	;
	
NOT
	: '!'
	;
	
SINGLE_QUOTE
	: '\''
	;
	
DOUBLE_QUOTE
	: '\"'
	;
	
INCREMENT_OPERATOR
	: '++'
	;
	
DECREMENT_OPERATOR
	: '--'
	;

VAR_IDEN	
	: '_'[0-9A-Za-z_]+
	;
	
FUNC_IDEN	
	: '#'[0-9A-Za-z_]+
	;
	
CHARACTER_LITERAL
	:	'\'' SINGLE_CHARACTER '\''
	;

COMMENT_LINE
	: '*' ~[\r\n]*? '*'
	;
	
fragment
SINGLE_CHARACTER
	:	~['\\]
	;

STRING_LITERAL
	:	'"' (~["\r\n] | '""')* '"'
	;

TERMINAL
	: '.'
	;

GALACTIC_CREDIT
	: 'GalacticCredit'
	;

IMPERIAL_CREDIT
	: 'ImperialCredit'
	;
	
UNIT
	: 'Unit'
	;

LEGION
	: 'Legion'
	;

SIDE
	: 'Side'
	;

LIGHT_SIDE
	: 'LightSide'
	;

DARK_SIDE
	: 'DarkSide'
	;

CONST_DEC
	: 'Declare'
	;
	
VOID
	: 'Void'
	;
	
IF
	: 'ForceInstance'
	;
	
ELSE_IF
	: 'InstanceVariant'
	;
	
ELSE
	: 'NoVariant'
	;
	
FOR
	: 'ForceCommand'
	;

DO
	: 'ForceOrder'
	;
	
WHILE
	: 'ForceAnalyze'
	;

BREAK
	: 'Order_66'
	;

RETURN
	: 'Transmit'
	;
	
ARRAY_OPEN
	: '('
	;

ARRAY_CLOSE
	: ')'
	;

OPEN_BRACES
	: '{'
	;

CLOSE_BRACES
	: '}'
	;

OPEN_SQUARE_BRACKET
	: '['
	;

CLOSE_SQUARE_BRACKET
	: ']'
	;

COMMA
	: ','
	;

LESS_THAN
	: '<'
	;

GREATER_THAN
	: '>'
	;

LESS_THAN_EQUAL_TO
	: '<='
	;
	
GREATER_THAN_EQUAL_TO
	: '>='
	;

NOT_EQUAL
	: '!='
	;
	
EQUAL_EQUAL
	: '=='
	;

AND
	: '&&'
	;
	
OR	
	: '||'
	;
	
END_TRANSMISSION
	: 'End_Transmission'
	;

INITIATE
	: 'Initiate'
	;
	
SCAN_INTEGER
	: 'EncodeGalacticCredit'
	;

SCAN_FLOAT
	: 'EncodeImperialCredit'
	;

SCAN_CHAR
	: 'EncodeUnit'
	;
	
SCAN_STRING
	: 'EncodeLegion'
	;

PRINT
	: 'Decode'
	;

start
	: func_dec start
	| INITIATE OPEN_BRACES code_block CLOSE_BRACES
	;

code_block
	: var_dec code_block
	| constant_declaration code_block
	| reg_assignment TERMINAL code_block
	| boolean_assignment TERMINAL code_block
	| array_assignment TERMINAL code_block
	| if_conditional code_block
	| iterative_con code_block
	| func_call code_block
	| incr code_block
	| scan_imperial_credit code_block
	| scan_galactic_credit code_block
	| scan_unit code_block
	| scan_legion code_block
	| print code_block
	| comment code_block
	| epsilon
	;

epsilon
	:
	;

comment
	: COMMENT_LINE
	;

	
//SCANNING AND PRINTING!

scan_imperial_credit
	: SCAN_FLOAT OPEN_SQUARE_BRACKET var_iden CLOSE_SQUARE_BRACKET TERMINAL
	;

scan_galactic_credit
	: SCAN_INTEGER OPEN_SQUARE_BRACKET var_iden CLOSE_SQUARE_BRACKET TERMINAL
	;
	
scan_unit
	: SCAN_CHAR OPEN_SQUARE_BRACKET var_iden CLOSE_SQUARE_BRACKET TERMINAL
	;
	
scan_legion
	: SCAN_STRING OPEN_SQUARE_BRACKET var_iden CLOSE_SQUARE_BRACKET TERMINAL
	;
	
print
	: PRINT OPEN_SQUARE_BRACKET var_iden? array_iden? expr? CHARACTER_LITERAL? func_call? CLOSE_SQUARE_BRACKET TERMINAL
	;
	
//ITERATIVE CONSTRUCTS!

iterative_con
	: WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES	#WhileConditionCodeBlock
	| WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES			#WhileCodeBlock
	| WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACES CLOSE_BRACES						#While
	| DO OPEN_BRACES code_block CLOSE_BRACES WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET TERMINAL	#DoWhileCodeBlockCondition
	| DO OPEN_BRACES code_block CLOSE_BRACES WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET TERMINAL			#DoWhileCodeBlock
	| DO OPEN_BRACES CLOSE_BRACES WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET TERMINAL				#DoWhileCondition
	| DO OPEN_BRACES CLOSE_BRACES WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET TERMINAL						#DoWhile
	| FOR OPEN_SQUARE_BRACKET reg_assignment TERMINAL condition TERMINAL incr CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES	#ForConditionCodeBlock
	| FOR OPEN_SQUARE_BRACKET reg_assignment TERMINAL condition TERMINAL incr CLOSE_SQUARE_BRACKET OPEN_BRACES CLOSE_BRACES				#ForCondition
	;	
	
//FUNCTION CALL!

func_call
	: func_iden OPEN_SQUARE_BRACKET value CLOSE_SQUARE_BRACKET
	| func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
	;	
	
//CONDITIONAL STATEMENTS!

if_conditional
	: IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES
	| IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES elseIf_conditional
	;

elseIf_conditional
	: ELSE_IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES elseIf_conditional
	| ELSE_IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACES code_block CLOSE_BRACES
	| else_conditional
	;

else_conditional
	: ELSE OPEN_BRACES code_block CLOSE_BRACES
	;	
	
//CONDITIONALS!
// allows 3 conditions :(
condition
	: condition AND condition2							#AndExpr
	| condition2										#ToCondition2
	;
	
condition2
	: condition2 OR condition3							#OrExpr
	| condition3										#ToCondition3
	;
	
condition3
	: condition3 op=(NOT_EQUAL|EQUAL_EQUAL) condition4	#EqualityExpr
	| condition4										#ToCondition4
	;

condition4
	: condition4 op=(LESS_THAN|GREATER_THAN|GREATER_THAN_EQUAL_TO| LESS_THAN_EQUAL_TO) gen_comparison  #RelationalExpr
	| gen_comparison																				   #ToGenComparison									
	;

gen_comparison
	: expr  													
	| NOT OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET	
	| OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET		
	| var_iden		
	| array_iden											
	| side														
	;


//FUNCTIONS!
	
func_dec
	: data_type func_iden OPEN_SQUARE_BRACKET parameter CLOSE_SQUARE_BRACKET OPEN_BRACES code_block return_statement? CLOSE_BRACES
	| data_type func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACES code_block return_statement? CLOSE_BRACES
	| data_type func_iden OPEN_SQUARE_BRACKET parameter CLOSE_SQUARE_BRACKET OPEN_BRACES return_statement? CLOSE_BRACES
	| data_type func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACES return_statement? CLOSE_BRACES
	;
	
return_statement
	: RETURN literal TERMINAL
	| RETURN var_iden TERMINAL
	| RETURN expr TERMINAL
	;


	
parameter
	: data_type VAR_IDEN | data_type VAR_IDEN COMMA parameter
	;
	
//CONSTANTS!	

constant_declaration
	: CONST_DEC data_type reg_assignment TERMINAL		#ConstantVarDecFourTypes
	| CONST_DEC data_type var_iden ARRAY_OPEN ARRAY_CLOSE EQUAL OPEN_BRACES (value (COMMA value)*)? CLOSE_BRACES TERMINAL	#ConstantArrayDecWithValues
	| CONST_DEC SIDE boolean_statement TERMINAL	    #ConstantVarDecBoolean
	;
	
//VARIABLE DECLARATIONS!
	
var_dec
	: data_type reg_assignment TERMINAL		#VarDecFourTypes
	| data_type var_iden ARRAY_OPEN ARRAY_CLOSE EQUAL OPEN_BRACES (value (COMMA value)*)? CLOSE_BRACES TERMINAL	#ArrayDecWithValues 
	| data_type var_iden ARRAY_OPEN index ARRAY_CLOSE TERMINAL		#ArrayDecNoValues
	| data_type var_iden TERMINAL		    #VarDecVarIdenFourTypes
	| SIDE boolean_statement TERMINAL	    #VarDecBoolean
	;

boolean_statement
	: var_iden							
	| boolean_assignment
	;	
	
boolean_assignment
	: var_iden EQUAL LIGHT_SIDE		  	
	| var_iden EQUAL DARK_SIDE			
	;

statement
	: reg_assignment
	| array_assignment
	;
	

array_assignment
	: array_iden EQUAL var 				
	;

reg_assignment
	: var_iden EQUAL expr	
	;

array_iden
	: var_iden ARRAY_OPEN index ARRAY_CLOSE
	;
	
func_iden
	: FUNC_IDEN
	;
	
var_iden
	: VAR_IDEN
	;

//INCREMENT ARITHMETIC!

incr
	: var_iden INCREMENT_OPERATOR TERMINAL #Increment
	| var_iden DECREMENT_OPERATOR TERMINAL #Decrement
	;

//EXPRESSIONS!

expr
	: expr op=(PLUS|MINUS) expr2		#AdditiveExpr
	| expr2								#ToExpr2
	;

expr2
	: expr2 op=(MULT|DIV|MOD) gen_var 		#MultiplicativeExpr
	| gen_var								#ToGenVar
	;

gen_var
	: op=(NOT|PLUS|MINUS) var			#UnaryExpr
	| var							    #ToVar
	;
//kasama pa ba dito yung -(expr) ?
var
	: literal											
	| func_call											
	| OPEN_SQUARE_BRACKET expr CLOSE_SQUARE_BRACKET 	
	| var_iden											
	| array_iden										
	;

side
	: LIGHT_SIDE						#True
	| DARK_SIDE							#False
	;

//ARRAYS!

	
array_open
	: ARRAY_OPEN
	;

array_close
	: ARRAY_CLOSE
	;
	
equal
	: EQUAL
	;
	
index
	: INT_LITERAL
	| var_iden
	| expr
	;

value
	: var
	;	
	
//ATOMS!

data_type
	: galactic_credit
	| imperial_credit
	| unit
	| legion
	;

galactic_credit
	: GALACTIC_CREDIT
	;

imperial_credit
	: IMPERIAL_CREDIT
	;
	
unit
	: UNIT
	;	

legion
	: LEGION
	;
	
literal
	: string_literal		
	| character_literal		
	| int_literal			
	| float_literal			
	;
	
string_literal
	: STRING_LITERAL
	;

character_literal
	: CHARACTER_LITERAL
	;

int_literal
	: INT_LITERAL
	;

float_literal
	: FLOAT_LITERAL
	;
