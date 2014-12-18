package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Block extends GenASTNode {
  public Block(ArrayList<BlockStatement> blockStatement, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyZeroOrMore<BlockStatement>("blockStatement", blockStatement)
    }, firstToken, lastToken);
  }
  public Block(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Block(cloneProperties(),firstToken,lastToken);
  }
  public ArrayList<BlockStatement> getBlockStatement() {
    return ((PropertyZeroOrMore<BlockStatement>)getProperty("blockStatement")).getValue();
  }
}
