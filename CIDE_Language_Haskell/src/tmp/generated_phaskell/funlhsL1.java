package tmp.generated_phaskell;

import cide.gast.ASTStringNode;
import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class funlhsL1 extends funlhsL {
  public funlhsL1(ASTStringNode variable_id, varop varop, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ASTStringNode>("variable_id", variable_id),
      new PropertyOne<varop>("varop", varop)
    }, firstToken, lastToken);
  }
  public funlhsL1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new funlhsL1(cloneProperties(),firstToken,lastToken);
  }
  public ASTStringNode getVariable_id() {
    return ((PropertyOne<ASTStringNode>)getProperty("variable_id")).getValue();
  }
  public varop getVarop() {
    return ((PropertyOne<varop>)getProperty("varop")).getValue();
  }
}
