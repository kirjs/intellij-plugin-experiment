// This is a generated file. Not intended for manual editing.
package com.bebe.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.bebe.psi.BebeTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class BebeParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARRAY) {
      r = array(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == PROPERTIES) {
      r = properties(b, 0);
    }
    else if (t == PROPERTY) {
      r = property(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
    }
    else if (t == VALUES) {
      r = values(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return bebeFile(b, l + 1);
  }

  /* ********************************************************** */
  // START_ARRAY values END_ARRAY
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, START_ARRAY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, START_ARRAY);
    r = r && values(b, l + 1);
    r = r && consumeToken(b, END_ARRAY);
    exit_section_(b, m, ARRAY, r);
    return r;
  }

  /* ********************************************************** */
  // value
  static boolean bebeFile(PsiBuilder b, int l) {
    return value(b, l + 1);
  }

  /* ********************************************************** */
  // START_CURLY properties END_CURLY
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, START_CURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, START_CURLY);
    r = r && properties(b, l + 1);
    r = r && consumeToken(b, END_CURLY);
    exit_section_(b, m, OBJECT, r);
    return r;
  }

  /* ********************************************************** */
  // property (COMMA property)* | property?
  public static boolean properties(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTIES, "<properties>");
    r = properties_0(b, l + 1);
    if (!r) r = properties_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // property (COMMA property)*
  private static boolean properties_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    r = r && properties_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA property)*
  private static boolean properties_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!properties_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "properties_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA property
  private static boolean properties_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && property(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // property?
  private static boolean properties_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "properties_1")) return false;
    property(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (KEY | STRING_VALUE) SEPARATOR value
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, "<property>", KEY, STRING_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY | STRING_VALUE
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, STRING_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NUMBER|NULL|STRING_VALUE|object|array
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUE, "<value>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, NULL);
    if (!r) r = consumeToken(b, STRING_VALUE);
    if (!r) r = object(b, l + 1);
    if (!r) r = array(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // value (COMMA value)* | value?
  public static boolean values(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VALUES, "<values>");
    r = values_0(b, l + 1);
    if (!r) r = values_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // value (COMMA value)*
  private static boolean values_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = value(b, l + 1);
    r = r && values_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA value)*
  private static boolean values_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!values_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "values_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA value
  private static boolean values_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // value?
  private static boolean values_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "values_1")) return false;
    value(b, l + 1);
    return true;
  }

}
