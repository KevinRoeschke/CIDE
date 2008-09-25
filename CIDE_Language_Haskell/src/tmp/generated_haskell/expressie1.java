package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class expressie1 extends expressie {
  public expressie1(literal literal, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<literal>("literal", literal)
    }, firstToken, lastToken);
  }
  public expressie1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new expressie1(cloneProperties(),firstToken,lastToken);
  }
  public literal getLiteral() {
    return ((PropertyOne<literal>)getProperty("literal")).getValue();
  }
}
