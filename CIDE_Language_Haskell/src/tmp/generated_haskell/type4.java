package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class type4 extends type {
  public type4(functiontypeList functiontypeList1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrOne<functiontypeList>("functiontypeList1", functiontypeList1)
    }, firstToken, lastToken);
  }
  public type4(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new type4(cloneProperties(),firstToken,lastToken);
  }
  public functiontypeList getFunctiontypeList1() {
    return ((PropertyZeroOrOne<functiontypeList>)getProperty("functiontypeList1")).getValue();
  }
}
