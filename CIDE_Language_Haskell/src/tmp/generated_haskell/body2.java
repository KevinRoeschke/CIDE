package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class body2 extends body {
  public body2(definitions definitions1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrOne<definitions>("definitions1", definitions1)
    }, firstToken, lastToken);
  }
  public body2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new body2(cloneProperties(),firstToken,lastToken);
  }
  public definitions getDefinitions1() {
    return ((PropertyZeroOrOne<definitions>)getProperty("definitions1")).getValue();
  }
}
