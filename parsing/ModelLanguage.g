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

statement returns [Statement value]
    : s=base_statement       { $value = s; }
      ( ';' s=base_statement { $value = new SeqStatement($value,s); } )* 
    ;

base_statement returns [Statement value]
    : ID ':=' e=arith_expr                      { $value = new AssignStatement($ID.getText(), e); }
    ;

arith_expr returns [ArithExpr value]
    : e=mult_arith_expr       { $value = e; }
    ;

mult_arith_expr returns [ArithExpr value]
    : e=base_arith_expr       { $value = e; }
    ;


base_arith_expr returns [ArithExpr value]
    : NUM { $value = new NumExpr(Integer.parseInt($NUM.getText())); }
    | ID  { $value = new IdExpr($ID.getText()); }
    ;

NUM : '0'..'9'+ ;
ID  : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;