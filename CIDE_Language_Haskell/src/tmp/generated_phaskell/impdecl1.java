package tmp.generated_phaskell;

import cide.gast.ASTTextNode;
import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyOne;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class impdecl1 extends impdecl {
  public impdecl1(ASTTextNode text365, modid modid, modid modid1, impspec impspec, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrOne<ASTTextNode>("text365", text365),
      new PropertyOne<modid>("modid", modid),
      new PropertyZeroOrOne<modid>("modid1", modid1),
      new PropertyZeroOrOne<impspec>("impspec", impspec)
    }, firstToken, lastToken);
  }
  public impdecl1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new impdecl1(cloneProperties(),firstToken,lastToken);
  }
  public ASTTextNode getText365() {
    return ((PropertyZeroOrOne<ASTTextNode>)getProperty("text365")).getValue();
  }
  public modid getModid() {
    return ((PropertyOne<modid>)getProperty("modid")).getValue();
  }
  public modid getModid1() {
    return ((PropertyZeroOrOne<modid>)getProperty("modid1")).getValue();
  }
  public impspec getImpspec() {
    return ((PropertyZeroOrOne<impspec>)getProperty("impspec")).getValue();
  }
}
