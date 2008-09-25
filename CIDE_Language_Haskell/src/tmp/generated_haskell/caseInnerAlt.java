package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class caseInnerAlt extends GenASTNode {
  public caseInnerAlt(expr expr, expr expr1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<expr>("expr", expr),
      new PropertyOne<expr>("expr1", expr1)
    }, firstToken, lastToken);
  }
  public caseInnerAlt(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new caseInnerAlt(cloneProperties(),firstToken,lastToken);
  }
  public expr getExpr() {
    return ((PropertyOne<expr>)getProperty("expr")).getValue();
  }
  public expr getExpr1() {
    return ((PropertyOne<expr>)getProperty("expr1")).getValue();
  }
}
