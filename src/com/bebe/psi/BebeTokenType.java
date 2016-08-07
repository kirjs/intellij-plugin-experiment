package com.bebe.psi;

import com.bebe.BebeLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BebeTokenType extends IElementType {
    public BebeTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BebeLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "BebeTokenType." + super.toString();
    }
}
