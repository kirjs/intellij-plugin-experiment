package com.bebe.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.bebe.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class BebeFile extends PsiFileBase {
    public BebeFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, BebeLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return BebeFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Bebe File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}