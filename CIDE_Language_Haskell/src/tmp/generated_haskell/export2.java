package tmp.generated_haskell;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class export2 extends export {
  public export2(naam naam, exportNaamParam exportNaamParam, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<naam>("naam", naam),
      new PropertyZeroOrOne<exportNaamParam>("exportNaamParam", exportNaamParam)
    }, firstToken, lastToken);
  }
  public export2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new export2(cloneProperties(),firstToken,lastToken);
  }
  public naam getNaam() {
    return ((PropertyOne<naam>)getProperty("naam")).getValue();
  }
  public exportNaamParam getExportNaamParam() {
    return ((PropertyZeroOrOne<exportNaamParam>)getProperty("exportNaamParam")).getValue();
  }
}
