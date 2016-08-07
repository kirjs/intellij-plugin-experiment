package com.bebe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.bebe.psi.BebeTypes;
import com.intellij.psi.TokenType;

import java.util.Stack;
%%

%{
private enum Context {
    OBJECT, ARRAY;
}
private Stack<Context> state = new Stack<>();
%}

%class BebeLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}


CRLF= \n|\r|\r\n
WHITE_SPACE=[\ \t\f]
NUMBER=\d+
STRING=\"[^\"]*\"
KEY=\"[^\"]+\"

%state KEY

%%

<KEY> {
{KEY}                        { yybegin(YYINITIAL); return BebeTypes.KEY; }
}

<YYINITIAL> {
\[                              { state.push(Context.ARRAY); return BebeTypes.START_ARRAY; }
\]                              { if(!state.empty()) { state.pop(); } return BebeTypes.END_ARRAY; }
\{                              { yybegin(KEY); state.push(Context.OBJECT); return BebeTypes.START_CURLY; }
\}                              { if(!state.empty()) { state.pop(); } return BebeTypes.END_CURLY; }
null                            { return BebeTypes.NULL; }
{STRING}                        { return BebeTypes.STRING_VALUE; }
{NUMBER}                        { return BebeTypes.NUMBER; }
:                               { return BebeTypes.SEPARATOR; }
,                               { yybegin((!state.empty() && state.peek().equals(Context.OBJECT)) ? KEY : YYINITIAL); return BebeTypes.COMMA; }

}

({CRLF}|{WHITE_SPACE})+         { return TokenType.WHITE_SPACE; }
.                               { return TokenType.BAD_CHARACTER; }
