package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class UnaryOp2 extends UnaryOp {
  public UnaryOp2(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public UnaryOp2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new UnaryOp2(cloneProperties(),firstToken,lastToken);
  }
}
