package tmp.generated_haskell;

import java.util.ArrayList;

import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyList;
import cide.gast.PropertyOne;
import cide.gparser.Token;

public class function1 extends function {
  public function1(ArrayList<patroon> patroon, var var, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyList<patroon>("patroon", patroon),
      new PropertyOne<var>("var", var)
    }, firstToken, lastToken);
  }
  public function1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new function1(cloneProperties(),firstToken,lastToken);
  }
  public ArrayList<patroon> getPatroon() {
    return ((PropertyList<patroon>)getProperty("patroon")).getValue();
  }
  public var getVar() {
    return ((PropertyOne<var>)getProperty("var")).getValue();
  }
}
