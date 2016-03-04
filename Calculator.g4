/**
 * Define a grammar called Hello
 */
grammar Calculator;

@header {
	package ANTLRGeneratedClasses;
}



INT	: [0-9]+;
DOUBLE	: [0-9]+'.'[0-9]+;
NL		: '\n';
WS		: [ \t\r]+	-> skip;

PLUS	: '+';
MINUS	: '-';
MULT	: '*';
DIV		: '/';
MOD		: '%';
LPAR	: '(';
RPAR	: ')';
EQUAL	: '=';

start
	: plusOrMinus NL? # Calculate
	;
	
plusOrMinus
	: plusOrMinus PLUS multOrDiv	#Plus 
	| plusOrMinus MINUS multOrDiv	#Minus
	| multOrDiv						#ToMultOrDiv
	;

multOrDiv
	: multOrDiv MULT unarySign			#Multiplication
	| multOrDiv DIV unarySign			#Division
	| multOrDiv MOD unarySign			#Modulo
	| unarySign							#ToUnaryMinus
	;
	
unarySign
	: MINUS atom			#ChangeMinusSign 
	| PLUS atom				#ChangePlusSign
	| atom					#ToAtom
	;

atom
	: INT							#Int
	| LPAR plusOrMinus RPAR			#Braces
	;



