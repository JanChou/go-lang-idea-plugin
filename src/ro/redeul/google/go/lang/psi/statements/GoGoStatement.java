package ro.redeul.google.go.lang.psi.statements;

import ro.redeul.google.go.lang.psi.GoDocumentedPsiElement;
import ro.redeul.google.go.lang.psi.expressions.GoExpr;

public interface GoGoStatement extends GoStatement, GoDocumentedPsiElement {
    GoExpr getExpression();
}