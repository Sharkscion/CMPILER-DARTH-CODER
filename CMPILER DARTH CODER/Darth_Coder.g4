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
	: [ \t\r]+	-> skip
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
	
LPAR		
	: '('
	;
	
RPAR		
	: ')'
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

fragment
SINGLE_CHARACTER
	:	~['\\]
	;

STRING_LITERAL
	:	'"' STRING_CHARACTERS? '"'
	;
	
fragment
STRING_CHARACTERS
	:	STRING_CHARACTER+
	;
	
fragment
STRING_CHARACTER
	:	~["\\]
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
	: '<'
	;

ARRAY_CLOSE
	: '>'
	;

OPEN_BRACKET
	: '{'
	;

CLOSE_BRACKET
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
	: INITIATE OPEN_BRACKET code_block CLOSE_BRACKET
	//| constant_declaration | var_dec | func_dec | if_conditional | func_call | iterative_con
	;

code_block
	: var_dec code_block
	| reg_assignment TERMINAL code_block
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
	| epsilon
	;

epsilon
	:
	;

	
//SCANNING AND PRINTING!

scan_imperial_credit
	: SCAN_FLOAT OPEN_SQUARE_BRACKET expr CLOSE_SQUARE_BRACKET TERMINAL
	;

scan_galactic_credit
	: SCAN_INTEGER OPEN_SQUARE_BRACKET expr CLOSE_SQUARE_BRACKET TERMINAL
	;
	
scan_unit
	: SCAN_CHAR OPEN_SQUARE_BRACKET CHARACTER_LITERAL CLOSE_SQUARE_BRACKET TERMINAL
	;
	
scan_legion
	: SCAN_STRING OPEN_SQUARE_BRACKET STRING_LITERAL CLOSE_SQUARE_BRACKET TERMINAL
	;
	
print
	: PRINT OPEN_SQUARE_BRACKET expr? CHARACTER_LITERAL? STRING_LITERAL? CLOSE_SQUARE_BRACKET TERMINAL
	;
	
//ITERATIVE CONSTRUCTS!

iterative_con
	: WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET
	| WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET
	| WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACKET CLOSE_BRACKET
	| DO OPEN_BRACKET code_block CLOSE_BRACKET WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET TERMINAL
	| DO OPEN_BRACKET code_block CLOSE_BRACKET WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET TERMINAL
	| DO OPEN_BRACKET CLOSE_BRACKET WHILE OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET TERMINAL
	| DO OPEN_BRACKET CLOSE_BRACKET WHILE OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET TERMINAL
	| FOR OPEN_SQUARE_BRACKET reg_assignment TERMINAL condition TERMINAL incr CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET
	| FOR OPEN_SQUARE_BRACKET reg_assignment TERMINAL condition TERMINAL incr CLOSE_SQUARE_BRACKET OPEN_BRACKET CLOSE_BRACKET
	;	
	
//FUNCTION CALL!

func_call
	: func_iden OPEN_SQUARE_BRACKET value CLOSE_SQUARE_BRACKET
	| func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
	;	
	
//CONDITIONAL STATEMENTS!

if_conditional
	: IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET
	| IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET elseIf_conditional
	;

elseIf_conditional
	: ELSE_IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET elseIf_conditional
	| ELSE_IF OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block CLOSE_BRACKET
	| else_conditional
	;

else_conditional
	: ELSE OPEN_BRACKET code_block CLOSE_BRACKET
	;	
	
//CONDITIONALS!
// allows 3 conditions :(
condition
	: condition logi_op2 condition2
	| condition2
	;
	
condition2
	: condition2 logi_op condition3
	| condition3
	;
	
condition3
	: condition3 equal_op condition4
	| condition4
	;

condition4
	: condition4 rel_op gen_comparison
	| gen_comparison
	;

gen_comparison
	: expr
	| not OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET
	| OPEN_SQUARE_BRACKET condition CLOSE_SQUARE_BRACKET
	| var_iden
	;

rel_op
	: less_than
	| greater_than
	| greater_than_or_equal_to
	| less_than_or_equal_to
	;

equal_op
	: not_equal
	| equal_equal
	;

logi_op
	: and
	;

logi_op2
	: or
	;
	
or
	: OR
	;

and
	: AND
	;

not_equal
	: NOT_EQUAL
	;

equal_equal
	: EQUAL_EQUAL
	;

//hmm
less_than
	: ARRAY_OPEN
	;

greater_than
	: ARRAY_CLOSE
	;

greater_than_or_equal_to
	: GREATER_THAN_EQUAL_TO
	;

less_than_or_equal_to
	: LESS_THAN_EQUAL_TO
	;

not
	: NOT
	;

//FUNCTIONS!
	
func_dec
	: data_type func_iden OPEN_SQUARE_BRACKET parameter CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block return_statement? CLOSE_BRACKET
	| data_type func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACKET code_block return_statement? CLOSE_BRACKET
	| data_type func_iden OPEN_SQUARE_BRACKET parameter CLOSE_SQUARE_BRACKET OPEN_BRACKET return_statement? CLOSE_BRACKET
	| data_type func_iden OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET OPEN_BRACKET return_statement? CLOSE_BRACKET
	;
	
return_statement
	: RETURN literal TERMINAL
	| RETURN var_iden TERMINAL
	| RETURN expr TERMINAL
	;

func_iden
	: FUNC_IDEN
	;
	
parameter
	: data_type VAR_IDEN | data_type VAR_IDEN COMMA parameter
	;
	
//CONSTANTS!	

constant_declaration
	: CONST_DEC data_type statement TERMINAL
	;
	
//VARIABLE DECLARATIONS!
	
var_dec
	: data_type statement TERMINAL
	| SIDE boolean_statement TERMINAL
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
	: var_iden
	| reg_assignment
	| array_assignment
	;
	
array_assignment
	: var_iden array
	;

reg_assignment
	: var_iden EQUAL expr
	;
	
var_iden
	: VAR_IDEN
	;

//INCREMENT ARITHMETIC!

incr
	: var_iden INCREMENT_OPERATOR TERMINAL
	| var_iden DECREMENT_OPERATOR TERMINAL
	;

//EXPRESSIONS!

expr
	: expr add_sub expr2
	| expr2
	;

expr2
	: expr2 mul_div gen_var 
	| gen_var
	;

gen_var
	: uni_op var
	| var
	;

var
	: literal
	| func_call
	| OPEN_SQUARE_BRACKET expr CLOSE_SQUARE_BRACKET 
	;

add_sub
	: PLUS
	| MINUS
	;

mul_div
	: MULT 
	| DIV
	| MOD
	;

uni_op
	: NOT
	| PLUS
	| MINUS
	;

//ARRAYS!

array
	: array_open index array_close	#Array1
	| array_open index array_close equal OPEN_BRACKET value? CLOSE_BRACKET #Array2
	;
	
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
	;

value
	: literal				#SingleLiteral
	| literal COMMA WS? value	#MoreLiterals
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
	: string_literal		#StrngLiteral
	| character_literal		#CharLiteral
	| int_literal			#IntLiteral
	| float_literal			#FloatLiteral
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
