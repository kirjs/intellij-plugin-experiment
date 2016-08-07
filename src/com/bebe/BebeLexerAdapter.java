package com.bebe;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class BebeLexerAdapter extends FlexAdapter {
    public BebeLexerAdapter() {
        super(new BebeLexer((Reader) null));
    }
}
