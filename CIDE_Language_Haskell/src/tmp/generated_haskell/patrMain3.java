package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class patrMain3 extends patrMain {
  public patrMain3(patroon patroon1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<patroon>("patroon1", patroon1)
    }, firstToken, lastToken);
  }
  public patrMain3(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new patrMain3(cloneProperties(),firstToken,lastToken);
  }
  public patroon getPatroon1() {
    return ((PropertyOne<patroon>)getProperty("patroon1")).getValue();
  }
}
