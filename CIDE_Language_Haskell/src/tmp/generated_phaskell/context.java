package tmp.generated_phaskell;

import cide.gast.ASTStringNode;
import cide.gast.IASTNode;
import cide.gast.IToken;
import cide.gast.Property;
import cide.gast.PropertyZeroOrOne;
import cide.gparser.Token;

public class context extends GenASTNode {
  public context(ASTStringNode finduntilsemiorcontextarrow, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrOne<ASTStringNode>("finduntilsemiorcontextarrow", finduntilsemiorcontextarrow)
    }, firstToken, lastToken);
  }
  public context(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new context(cloneProperties(),firstToken,lastToken);
  }
  public ASTStringNode getFinduntilsemiorcontextarrow() {
    return ((PropertyZeroOrOne<ASTStringNode>)getProperty("finduntilsemiorcontextarrow")).getValue();
  }
}
