package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class ImplementsList extends GenASTNode {
  public ImplementsList(ArrayList<ClassOrInterfaceType> classOrInterfaceType, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyList<ClassOrInterfaceType>("classOrInterfaceType", classOrInterfaceType)
    }, firstToken, lastToken);
  }
  public ImplementsList(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new ImplementsList(cloneProperties(),firstToken,lastToken);
  }
  public ArrayList<ClassOrInterfaceType> getClassOrInterfaceType() {
    return ((PropertyList<ClassOrInterfaceType>)getProperty("classOrInterfaceType")).getValue();
  }
}
