package tmp.generated_phaskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gparser.Token;

public class impdecl2 extends impdecl {
  public impdecl2(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public impdecl2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new impdecl2(cloneProperties(),firstToken,lastToken);
  }
}
