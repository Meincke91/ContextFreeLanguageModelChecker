grammar ModelLanguage;

options {
  language = Java;
}

@header {
package ContextFreeLanguageModelChecker.parsing;

import ContextFreeLanguageModelChecker.ast.*;

}

@lexer::header {
package ContextFreeLanguageModelChecker.parsing;

}

program returns [Statement value]
    : s=statement EOF { $value = s; }
    ;

statement returns [String value]
    : '{' S
      ('[' P  { $value = new PExpr($P.getText()); } ']' ) 
      '}'      								    { $value = new NumExpr(Integer.parseInt($S.getText())); }
    ;

base_statement returns [Statement value]
    : P ':=' e=arith_expr                      { $value = new AssignStatement($P.getText(), e); }
    ;

arith_expr returns [ArithExpr value]
    : e=mult_arith_expr       { $value = e; }
    ;

mult_arith_expr returns [ArithExpr value]
    : e=base_arith_expr       { $value = e; }
    ;

base_state_expr returns [ArithExpr value]
	: S { $value = new NumExpr(Integer.parseInt($S.getText())); }
	;

base_arith_expr returns [ArithExpr value]
    : S { $value = new NumExpr(Integer.parseInt($S.getText())); }
    | P  { $value = new PExpr($P.getText()); }
    ;

S : '0'..'9'+ ;
P  : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

WS  :   (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; } ; 