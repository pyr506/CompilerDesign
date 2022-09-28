// The grammar for Rose language
grammar Rose;


// Parser rules
program : PROCEDURE ID IS DECLARE { System.out.println("\t" + ".data"); } variables BEGIN { System.out.println("\t" + ".text"); System.out.println("main:"); } statements[0,1] END SEMICOLON;

variables : variable variables
	| 
	;
variable 
	: ID COLON INTEGER SEMICOLON {System.out.println($ID.text +":\t.word\t 0");} 
	;

statements[int reg, int label] returns[int nreg, int nlabel]
	: statements_[$reg,$label] {
		$nreg=$statements_.nreg;
		$nlabel=$statements_.nlabel;
	}
	;

statements_[int reg,int label] returns[int nreg, int nlabel]
	: statement[$reg,$label] {
		$reg=$statement.nreg;
		$label=$statement.nlabel;
	} statements_[$reg,$label] {
		$nreg=$statements_.nreg;
		$nlabel=$statements_.nlabel;
	}
	| {
		$nreg=$reg;
		$nlabel=$label;
	}
	;

//右邊看傳入的參數，action做相對應的動作
//if for會多傳入label，exit不傳入參數，其餘傳入reg
statement[int reg, int label] returns[int nreg, int nlabel]
	: assignment_statement[$reg] {
		$nreg=$assignment_statement.nreg;
		$nlabel=$label;
	} //assign不會用到label!!!
	| if_statement[$reg,$label] {
		$nreg=$if_statement.nreg;
		$nlabel=$if_statement.nlabel;
	}
 	| for_statement[$reg,$label]{
		$nreg=$for_statement.nreg;
		$nlabel=$for_statement.nlabel;
	}
 	| exit_statement{
		$nreg=$reg;
		$nlabel=$label;
	}
 	| read_statement[$reg] {
		$nreg=$read_statement.nreg;
		$nlabel=$label;
	}
 	| write_statement[$reg]{
		$nreg=$write_statement.nreg;
		$nlabel=$label;
	}
	;

//reg值記得先更新
//僅做"賦予"的動作
//la + sw
//sw 可以釋放掉暫存器，所以$nreg=$arith_expression.nreg-1;
assignment_statement[int reg] returns[int nreg] 
	: ID OP3 arith_expression[$reg] SEMICOLON {
		$reg = $arith_expression.nreg;
		System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
		System.out.println("\tsw\t\$t" + ($reg - 1) + ",\t0(\$t" + ($reg) + ")");
		$nreg=$arith_expression.nreg-1;
	}
	;

//一開始就先設定好true false end這三個label
if_statement[int reg, int label] returns[int nreg, int nlabel]
	: IF {
		int t=$label++;
		int f=$label++;
		int end=$label++;
	}
	bool_expression[$reg, $label, t, f]
	THEN {
		System.out.println("L" + t + ":");
		$label=$bool_expression.nlabel;
	} statements[$reg,$label] {
		$reg=$statements.nreg;
		$label=$statements.nlabel;
	} if_statement_[$reg,$label,f,end]{
		$nreg=$if_statement_.nreg;
		$nlabel=$if_statement_.nlabel;
	}	
	;

//多傳入label false和label end
if_statement_[int reg,int label,int f, int end] returns[int nreg, int nlabel] 
	:{
		System.out.println("L" + f + ":");
		$nlabel=$label;
		$nreg=$reg;
	}END IF SEMICOLON
 	| ELSE {
		System.out.println("\tb\tL" + end);
		System.out.println("L" + f + ":");
	}statements[$reg,$label] {
		System.out.println("L" + end + ":");
		$nlabel = $statements.nlabel;
		$nreg = $statements.nreg;
	} END IF SEMICOLON
 	;

for_statement[int reg,int label] returns[int nreg, int nlabel]
	:{
		int cmp=$label++;
		int t=$label++;
		int f=$label++;
	} FOR ID IN arith_expression[$reg]{
		$reg=$arith_expression.nreg;
		System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
		System.out.println("\tsw\t\$t" + ($reg - 1) + ",\t0(\$t" + ($reg) + ")");
		System.out.println("L" + cmp + ":");
		System.out.println("\tla\t\$t" + ($reg-1) + ",\t" + $ID.text);
		System.out.println("\tlw\t\$t" + ($reg-1) + ",\t0(\$t" + ($reg-1) + ")");
	} OP1
	arith_expression[$reg]{
		System.out.println("\tble\t\$t0,\t\$t1,\tL" + t);
		System.out.println("\tb\tL" + f);
		System.out.println("L" + t +":");
		$reg=$reg-1;
	} LOOP statements[$reg,$label]{
		System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
		System.out.println("\tlw\t\$t" + ($reg) + ",\t0(\$t" + ($reg) + ")");
		System.out.println("\tli\t\$t" +($reg+1)+ "\t1");
		System.out.println("\tadd\t\$t" + ($reg) + ",\t\$t" + ($reg) + ",\t\$t" + ($reg+1));
		System.out.println("\tla\t\$t" + ($reg+1) + ",\t" + $ID.text);
		System.out.println("\tsw\t\$t" + ($reg) + ",\t0(\$t" + ($reg+1) + ")");
		System.out.println("\tb\tL" + cmp);
		System.out.println("L" + f +":");
	} END LOOP SEMICOLON;

exit_statement : EXIT SEMICOLON {
	System.out.println("\tli\t\$v0,\t10");
	System.out.println("\tsyscall");
	}
	;

//例: read N
//li + syscall + la + sw(把$v0的東西存去別的地方)
read_statement[int reg] returns[int nreg]
	: READ ID SEMICOLON {
		System.out.println("\tli\t\$v0,\t5");
		System.out.println("\tsyscall");
		System.out.println("\tla\t\$t" + $reg + ",\t" + $ID.text);
		System.out.println("\tsw\t\$v0,\t0(\$t" + $reg + ")");
		$nreg = $reg;
	}
	;

//move + li +syscall
//move $a0, $t$arith_expression.place !!!
//$nreg=$arith_expression.nreg-1; 後面那一個t暫存器可以釋放掉 !!! 
write_statement[int reg] returns[int nreg]
	: WRITE arith_expression[$reg] SEMICOLON{
		System.out.println("\tmove\t\$a0,\t\$t" + $arith_expression.place);
		System.out.println("\tli\t\$v0,\t1");
		System.out.println("\tsyscall");
		$nreg=$arith_expression.nreg-1; 
	} 
	; 


// ex :	---	t0,	t1,	L1
//      b	L2
//bool_系列皆傳入reg,label,t,f ，回傳值沒有規則?
//除了bool_expression其他接回傳nreg,nt,nf 看有無用到label再決定是否回傳nlabel
//AND OR 前先印東西，AND部分reg-=2
//有xxx $t(reg-2), $t(reg-1), label 的話reg-=2
//AND: 
//	   b false 
//	   L(label):
//OR:
//	   b label 
//	   L(label):
bool_expression[int reg, int label, int t, int f] returns[int nreg, int nlabel]
	: bool_term[$reg , $label , $t , $f] {
		$reg=$bool_term.nreg;
		$label=$bool_term.nlabel;
		$t=$bool_term.nt;
		$f=$bool_term.nf;
		System.out.println("\t\$t" + ($reg - 2) + ",\t\$t" + ($reg-1) + ",\tL" + $t);
		$reg = $reg - 2;
	} bool_expression_[$reg , $label , $t , $f]{
		$t=$bool_expression_.nt;
		$f=$bool_expression_.nf;
		System.out.println("\tb\tL" + $f);
		$nreg=$bool_expression_.nreg;
		$nlabel=$bool_expression_.nlabel;
	};

//opcode若成立跳到true
//b label
//L(label):
//bool_expression_的System.out.println("\t\$t" + ($reg - 2) + ",\t\$t" + ($reg-1) + ",\tL" + $t);在自己後面，非一開始 !!!
bool_expression_[int reg, int label, int t, int f] returns[int nreg, int nlabel, int nt, int nf]
	: {
		System.out.println("\tb\tL" + $label);
		System.out.println("L" + $label + ":");
		$label = $label + 1;
	}OR bool_term[$reg , $label , $t , $f]{
		$reg=$bool_term.nreg;
		$label=$bool_term.nlabel;
		$t=$bool_term.nt;
		$f=$bool_term.nf;
	} bool_expression_[$reg , $label , $t , $f]{
		$t=$bool_expression_.nt;
		$f=$bool_expression_.nf;
		System.out.println("\t\$t" + ($reg - 2) + ",\t\$t" + ($reg-1) + ",\tL" + $t);	
		$nreg=$bool_expression_.nreg;
		$nlabel=$bool_expression_.nlabel;
		$nt = $t;
		$nf = $f;
	}//System.out.println("\t\$t0,\t\$t1,\tL" + $t);
	| {
		$nreg = $reg;
		$nlabel = $label;
		$nt = $t;
		$nf = $f;
	}
	;

//bool_term就簡單傳遞
//bool_factor沒用到label
bool_term[int reg, int label, int t, int f] returns[int nreg, int nlabel, int nt, int nf]
	: bool_factor[$reg , $label , $t , $f]{
		$reg=$bool_factor.nreg;
		$t=$bool_factor.nt;
		$f=$bool_factor.nf;
	} bool_term_[$reg , $label , $t , $f]{
		$nreg=$bool_term_.nreg;
		$nlabel=$bool_term_.nlabel;
		$nt=$bool_term_.nt;
		$nf=$bool_term_.nf;
	};

//因為bool_term_在bool_primary後執行
//xxx $t(reg-2), $t(reg-1), label reg的值要減2
//opcode若成立跳到label !!!
//b false
//L(label):
bool_term_[int reg, int label, int t, int f] returns[int nreg, int nlabel, int nt, int nf]
	: {
		System.out.println("\t\$t" + ($reg - 2) + ",\t\$t" + ($reg-1) + ",\tL" + $label);
		System.out.println("\tb\tL" + $f);
		System.out.println("L" + $label + ":");
		$label = $label + 1;
		$reg = $reg - 2;
	}AND bool_factor[$reg , $label , $t , $f] {
		$reg=$bool_factor.nreg;
		$t=$bool_factor.nt;
		$f=$bool_factor.nf;
	} bool_term_[$reg , $label , $t , $f]{
		$nreg=$bool_term_.nreg;
		$nlabel=$bool_term_.nlabel;
		$nt=$bool_term_.nt;
		$nf=$bool_term_.nf;
	}
	| {
		$nreg = $reg;
		$nlabel = $label;
		$nt = $t;
		$nf = $f;
	}
	;

bool_factor[int reg, int label, int t,int f] returns[int nreg, int nt, int nf]
	: EXCLAMATION bool_primary[$reg, $label, $t, $f]{
		$nt=$bool_primary.nf;
		$nf=$bool_primary.nt;
		$nreg=$bool_primary.nreg;
	}
	| bool_primary[$reg, $label, $t, $f]{
		$nt = $t;
		$nf = $f;
		$nreg=$bool_primary.nreg;
	}
	;

//bool_primary結束後才印opcode
//nt nf用意???
bool_primary[int reg, int label, int t, int f] returns[int nreg, int nt, int nf]
	: arith_expression[$reg] relation_op {
		$reg=$arith_expression.nreg;
	} arith_expression[$reg]{
		$nreg=$arith_expression.nreg;
		$nt=$t;
		$nf=$f;
		System.out.print("\t"+$relation_op.opcode);
	}
	;

//把opcode傳回去
relation_op returns[String opcode]
	: EQUAL 	{$opcode="beq";}
    | OP2		{$opcode="bne";}
    | GREATER	{$opcode="bgt";}
    | GREEQU	{$opcode="bge";}
    | LESS		{$opcode="blt";}
    | LESEQU	{$opcode="ble";}
    ;

//arith_系列皆傳入reg，皆回傳nreg,place
//其中的E系列多傳lplace，"取place，輸出，reg--"
arith_expression[int reg] returns[int nreg, int place]
	: arith_term[$reg] {
		$reg=$arith_term.nreg;
		$place=$arith_term.place;
	} arith_expression_[$reg,$place]{
		$nreg=$arith_expression_.nreg;
		$place=$arith_expression_.place;
	}
	;

//先取出place，再輸出，最後更新reg(-1)
arith_expression_[int reg, int lplace] returns[int nreg, int place]
	:ADD arith_term[$reg] {
		$place=$arith_term.place;
		System.out.println("\tadd\t\$t" + ($lplace) + ",\t\$t" + ($lplace) + ",\t\$t" + ($place));
		$reg = $arith_term.nreg-1;
	}
	arith_expression_[$reg,$lplace]{
		$nreg=$arith_expression_.nreg;
		$place=$arith_expression_.place;
	}
	| SUB arith_term[$reg]{
		$reg = $arith_term.nreg;
		$place=$arith_term.place;
		System.out.println("\tsub\t\$t" + ($lplace) + ",\t\$t" + ($lplace) + ",\t\$t" + ($place));
	} 
	arith_expression_[$reg,$lplace]{
		$nreg=$arith_expression_.nreg-1;
		$place=$arith_expression_.place;
	}
	| {
		$nreg=$reg;
		$place=$lplace;
	}
	;

arith_term[int reg] returns[int nreg, int place]
	: arith_factor[$reg] {
		$reg=$arith_factor.nreg;
		$place=$arith_factor.place;
	} 
	arith_term_[$reg,$place]{
		$nreg=$arith_term_.nreg;
		$place=$arith_term_.place;
	}
	;

//做 *(mul) , /(div) , %(rem)
//mul $t0, $t0, $t1
//place取出剛算好的值，lplace為再上一個值
//$reg = $arith_factor.nreg-1; 以上面的指令為例$reg=2-1=1
//先取出place，再輸出，最後更新reg(-1)
arith_term_[int reg, int lplace] returns[int nreg,int place]
	: MUL arith_factor[$reg] {
		$place = $arith_factor.place;
		System.out.println("\tmul\t\$t" + ($lplace) + ",\t\$t" + ($lplace) + ",\t\$t" + ($place));
		$reg = $arith_factor.nreg-1;
	}//-1
	arith_term_[$reg,$lplace]{
		$nreg=$arith_term_.nreg;
		$place=$arith_term_.place;
	}
	| DIV arith_factor[$reg]{
		$reg = $arith_factor.nreg;
		$place = $arith_factor.place;
		System.out.println("\tdiv\t\$t" + ($lplace) + ",\t\$t" + ($lplace) + ",\t\$t" + ($place));
	}
	arith_term_[$reg,$lplace]{
		$nreg=$arith_term_.nreg-1;
		$place=$arith_term_.place;
	}
	| PERCENT arith_factor[$reg]{
		$reg = $arith_factor.nreg;
		$place = $arith_factor.place;
		System.out.println("\trem\t\$t" + ($lplace) + ",\t\$t" + ($lplace) + ",\t\$t" + ($place));
	} 
	arith_term_[$reg,$lplace]{
		$nreg=$arith_term_.nreg-1;
		$place=$arith_term_.place;
	}
	| {
		$nreg=$reg;
		$place=$lplace;
	}
	;

//neg $t0, $t0 不會用到多的暫存器
//place為存值的地方，記得回傳
arith_factor[int reg] returns[int nreg,int place]
	: SUB arith_primary[$reg] {
		$nreg = $arith_primary.nreg;
		$place=$arith_primary.place;
		System.out.println("\tneg\t\$t" + ($place) + ",\t\$t" + ($place));
	}//負多少用到e.place
	| arith_primary[$reg] {
		$nreg = $arith_primary.nreg;
		$place=$arith_primary.place;
	}
	;

//取值
//$nreg=$reg+1;
//$place=$reg; 取出的值存放在place這個編號的暫存器裡
arith_primary[int reg] returns[int nreg, int place]
	: CONST {
		System.out.println("\tli\t\$t" + ($reg) + ",\t" + $CONST.text);
		$nreg=$reg+1;
		$place=$reg;
	} //+1;
	| ID {
		System.out.println("\tla\t\$t" + ($reg) + ",\t" + $ID.text);
		System.out.println("\tlw\t\$t" + ($reg) + ",\t0(\$t" + ($reg) + ")");
		$nreg = $reg + 1;
		$place=$reg;
	}//取出id裡的值? +1
	| LP arith_expression[$reg] RP {
		$nreg=$arith_expression.nreg;
		$place=$arith_expression.place;
	}
	;

// Lexer rules
BEGIN : 'begin';
DECLARE : 'declare';
ELSE : 'else';
END : 'end';
EXIT : 'exit';
FOR : 'for';
IF : 'if';
IN : 'in';
INTEGER : 'integer';
IS : 'is';
LOOP : 'loop';
PROCEDURE : 'procedure';
READ : 'read';
THEN : 'then';
WRITE : 'write';
ID: LETTER(LETTER | DIGIT)* ;
fragment LETTER : [A-Z_] ;
fragment DIGIT : [0-9] ;
CONST : [1-9]([0-9])* | '0' ; 
COLON : ':' ;
OP1 : '..' ;
SEMICOLON : ';' ;
ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
PERCENT : '%' ;
EQUAL : '=' ;
OP2 : '<>' ;
GREATER : '>' ;
GREEQU : '>=' ;
LESS : '<' ;
LESEQU : '<=' ;
AND : '&&' ;
OR : '||' ;
EXCLAMATION : '!' ;
OP3 : ':=' ;
LP : '(' ;
RP : ')' ;

WHITESPACE : (' '|'\t'|'\n'|'\r'|'\r\n')+ -> skip ; 
COMMENT : '//'(.)*?'\n' -> skip ; 