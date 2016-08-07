package com.bebe;

import com.bebe.psi.BebeTypes;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class BebeSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("BEBE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    private static final TextAttributesKey KEY =
            createTextAttributesKey("BEBE_KEY", DefaultLanguageHighlighterColors.KEYWORD);

    private static final TextAttributesKey VALUE =
            createTextAttributesKey("BEBE_VALUE", DefaultLanguageHighlighterColors.STRING);
    private static final TextAttributesKey NUMBER =
            createTextAttributesKey("BEBE_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    private static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("BEBE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
    private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new BebeLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(BebeTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(BebeTypes.STRING_VALUE)) {
            return VALUE_KEYS;
        }else if (tokenType.equals(BebeTypes.KEY)) {
            return KEY_KEYS;
        } else if (tokenType.equals(BebeTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else if (tokenType.equals(BebeTypes.VALUE)) {
            return VALUE_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
