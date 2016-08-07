package com.bebe;


import com.intellij.lang.Language;

public class BebeLanguage extends Language {
    public static final BebeLanguage INSTANCE = new BebeLanguage();

    private BebeLanguage() {
        super("Bebe");
    }
}
