package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class EmptyStatement extends GenASTNode {
  public EmptyStatement(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public EmptyStatement(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new EmptyStatement(cloneProperties(),firstToken,lastToken);
  }
}
