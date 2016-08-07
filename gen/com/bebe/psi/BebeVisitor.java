// This is a generated file. Not intended for manual editing.
package com.bebe.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class BebeVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull BebeArray o) {
    visitPsiElement(o);
  }

  public void visitObject(@NotNull BebeObject o) {
    visitPsiElement(o);
  }

  public void visitProperties(@NotNull BebeProperties o) {
    visitPsiElement(o);
  }

  public void visitProperty(@NotNull BebeProperty o) {
    visitPsiElement(o);
  }

  public void visitValue(@NotNull BebeValue o) {
    visitPsiElement(o);
  }

  public void visitValues(@NotNull BebeValues o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
