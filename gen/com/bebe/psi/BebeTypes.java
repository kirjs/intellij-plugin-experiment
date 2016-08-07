// This is a generated file. Not intended for manual editing.
package com.bebe.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.bebe.psi.impl.*;

public interface BebeTypes {

  IElementType ARRAY = new BebeElementType("ARRAY");
  IElementType OBJECT = new BebeElementType("OBJECT");
  IElementType PROPERTIES = new BebeElementType("PROPERTIES");
  IElementType PROPERTY = new BebeElementType("PROPERTY");
  IElementType VALUE = new BebeElementType("VALUE");
  IElementType VALUES = new BebeElementType("VALUES");

  IElementType COMMA = new BebeTokenType("COMMA");
  IElementType END_ARRAY = new BebeTokenType("END_ARRAY");
  IElementType END_CURLY = new BebeTokenType("END_CURLY");
  IElementType KEY = new BebeTokenType("KEY");
  IElementType NULL = new BebeTokenType("NULL");
  IElementType NUMBER = new BebeTokenType("NUMBER");
  IElementType SEPARATOR = new BebeTokenType("SEPARATOR");
  IElementType START_ARRAY = new BebeTokenType("START_ARRAY");
  IElementType START_CURLY = new BebeTokenType("START_CURLY");
  IElementType STRING_VALUE = new BebeTokenType("STRING_VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY) {
        return new BebeArrayImpl(node);
      }
      else if (type == OBJECT) {
        return new BebeObjectImpl(node);
      }
      else if (type == PROPERTIES) {
        return new BebePropertiesImpl(node);
      }
      else if (type == PROPERTY) {
        return new BebePropertyImpl(node);
      }
      else if (type == VALUE) {
        return new BebeValueImpl(node);
      }
      else if (type == VALUES) {
        return new BebeValuesImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
