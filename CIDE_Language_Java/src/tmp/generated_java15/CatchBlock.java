package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class CatchBlock extends GenASTNode {
  public CatchBlock(FormalParameter formalParameter, Block block, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<FormalParameter>("formalParameter", formalParameter),
      new PropertyOne<Block>("block", block)
    }, firstToken, lastToken);
  }
  public CatchBlock(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new CatchBlock(cloneProperties(),firstToken,lastToken);
  }
  public FormalParameter getFormalParameter() {
    return ((PropertyOne<FormalParameter>)getProperty("formalParameter")).getValue();
  }
  public Block getBlock() {
    return ((PropertyOne<Block>)getProperty("block")).getValue();
  }
}
