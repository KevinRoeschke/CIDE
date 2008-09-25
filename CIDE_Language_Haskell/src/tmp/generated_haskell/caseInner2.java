package tmp.generated_haskell;

import java.util.ArrayList;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gast.PropertyZeroOrMore;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class caseInner2 extends caseInner {
  public caseInner2(patr patr1, ArrayList<caseInnerAlt> caseInnerAlt, whereDecls whereDecls1, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<patr>("patr1", patr1),
      new PropertyZeroOrMore<caseInnerAlt>("caseInnerAlt", caseInnerAlt),
      new PropertyZeroOrOne<whereDecls>("whereDecls1", whereDecls1)
    }, firstToken, lastToken);
  }
  public caseInner2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new caseInner2(cloneProperties(),firstToken,lastToken);
  }
  public patr getPatr1() {
    return ((PropertyOne<patr>)getProperty("patr1")).getValue();
  }
  public ArrayList<caseInnerAlt> getCaseInnerAlt() {
    return ((PropertyZeroOrMore<caseInnerAlt>)getProperty("caseInnerAlt")).getValue();
  }
  public whereDecls getWhereDecls1() {
    return ((PropertyZeroOrOne<whereDecls>)getProperty("whereDecls1")).getValue();
  }
}
