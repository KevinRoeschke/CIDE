package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class altSpecial1 extends altSpecial {
  public altSpecial1(patr patr, expr expr, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<patr>("patr", patr),
      new PropertyOne<expr>("expr", expr)
    }, firstToken, lastToken);
  }
  public altSpecial1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new altSpecial1(cloneProperties(),firstToken,lastToken);
  }
  public patr getPatr() {
    return ((PropertyOne<patr>)getProperty("patr")).getValue();
  }
  public expr getExpr() {
    return ((PropertyOne<expr>)getProperty("expr")).getValue();
  }
}
