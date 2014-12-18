package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Statement4 extends Statement {
  public Statement4(EmptyStatement emptyStatement, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<EmptyStatement>("emptyStatement", emptyStatement)
    }, firstToken, lastToken);
  }
  public Statement4(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Statement4(cloneProperties(),firstToken,lastToken);
  }
  public EmptyStatement getEmptyStatement() {
    return ((PropertyOne<EmptyStatement>)getProperty("emptyStatement")).getValue();
  }
}
