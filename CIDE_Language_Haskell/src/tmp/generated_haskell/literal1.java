package tmp.generated_haskell;

import cide.gast.ASTStringNode;
import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class literal1 extends literal {
  public literal1(ASTStringNode integer, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ASTStringNode>("integer", integer)
    }, firstToken, lastToken);
  }
  public literal1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new literal1(cloneProperties(),firstToken,lastToken);
  }
  public ASTStringNode getInteger() {
    return ((PropertyOne<ASTStringNode>)getProperty("integer")).getValue();
  }
}
