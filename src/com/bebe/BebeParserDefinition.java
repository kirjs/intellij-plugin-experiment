package com.bebe;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;
import com.bebe.parser.BebeParser;
import com.bebe.psi.*;
import org.jetbrains.annotations.NotNull;

public class BebeParserDefinition implements ParserDefinition {
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create();

    public static final IFileElementType FILE =
            new IFileElementType(Language.<BebeLanguage>findInstance(BebeLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new BebeLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new BebeParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new BebeFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return BebeTypes.Factory.createElement(node);
    }
}