grammar Hello;

program 
	: line+;

line
	: if_condition
	| assignment
	| while_condition
	| func
	| fcall
	| stack
	| comments;

assignment 
	: ID '=' (expr|BOOLEXPR|ID|NUMBER);
 
expr : term ARITHOPERATOR  term;

term: ID | NUMBER;


//if condition -- else is optional
if_condition 
	: 'if' condition statement else_statement?;

else_statement	
	: 'else' statement;

//------------------------while loop
while_condition 
	: 'while' condition statement;

//if/while conditions will be in braces, and will have a relational operator 
condition 
	: '(' condition_expression ')';

//statement can be any expression that needs to be computed
statement 
	: '{' line '}';

//relational operator will compare any two NUMBERs and then do the needful
condition_expression 
	: (ID|NUMBER) RELOPERATORS (ID|NUMBER|BOOLEXPR);

//function declaration
func : 
	func_declaration func_body;

func_declaration 
	: 'func' fname;
	
fname 
	:func_name '(' (paramlist)? ')' ;

func_body
	: '{' line* return_statement '}';
	
return_statement
	: 'return' (ID|NUMBER);

func_name 
	:ID;

fcall 
	:ID '=' fname;
	
paramlist 
	: ID ((',' ID)+)?;

//-----stack declaration, push and pop 
stack
	: stack_declaration 
	| stack_push 
	| stack_pop ;

stack_declaration
	: 'stack' ID;

stack_push
	: ID 'push(' NUMBER ')';
//push will be → s push(12)

stack_pop
	: ID '=' ID 'pop()';
//pop will be → a = s pop()

comments
	: '//' (alphanumeric)?;

alphanumeric 
	: (ID|NUMBER)+ ;

NUMBER: [0-9]+;

ID: [A-Za-z]+;


BOOLEXPR 
	: 'TRUE'
	|'FALSE';
	
//possible relational operators
RELOPERATORS 
	: '<' 
	| '>' 
	| '==' 
	| '<=' 
	| '>=' 
	| '!=';

ARITHOPERATOR: '+' | '-' | '*' | '/';
	
WS 
	: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
