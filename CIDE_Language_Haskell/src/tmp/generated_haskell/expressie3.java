package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class expressie3 extends expressie {
  public expressie3(naam naam, contrExprParam contrExprParam1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<naam>("naam", naam),
      new PropertyZeroOrOne<contrExprParam>("contrExprParam1", contrExprParam1)
    }, firstToken, lastToken);
  }
  public expressie3(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new expressie3(cloneProperties(),firstToken,lastToken);
  }
  public naam getNaam() {
    return ((PropertyOne<naam>)getProperty("naam")).getValue();
  }
  public contrExprParam getContrExprParam1() {
    return ((PropertyZeroOrOne<contrExprParam>)getProperty("contrExprParam1")).getValue();
  }
}
