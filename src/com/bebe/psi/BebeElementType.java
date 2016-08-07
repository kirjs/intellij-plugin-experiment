package com.bebe.psi;

import com.bebe.BebeLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BebeElementType extends IElementType {
    public BebeElementType(@NotNull @NonNls String debugName) {
        super(debugName, BebeLanguage.INSTANCE);
    }
}
