package com.bebe;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class BebeFileType extends LanguageFileType{
        public static final BebeFileType INSTANCE = new BebeFileType();

        private BebeFileType() {
            super(BebeLanguage.INSTANCE);
        }

        @NotNull
        @Override
        public String getName() {
            return "Bebe file";
        }

        @NotNull
        @Override
        public String getDescription() {
            return "Bebe language file";
        }

        @NotNull
        @Override
        public String getDefaultExtension() {
            return "bebe";
        }

        @Nullable
        @Override
        public Icon getIcon() {
            return BebeIcons.FILE;
        }
    
}
