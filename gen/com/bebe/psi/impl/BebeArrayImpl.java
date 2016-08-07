// This is a generated file. Not intended for manual editing.
package com.bebe.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.bebe.psi.BebeTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.bebe.psi.*;

public class BebeArrayImpl extends ASTWrapperPsiElement implements BebeArray {

  public BebeArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull BebeVisitor visitor) {
    visitor.visitArray(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof BebeVisitor) accept((BebeVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public BebeValues getValues() {
    return findNotNullChildByClass(BebeValues.class);
  }

}
