package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class UnaryOp1 extends UnaryOp {
  public UnaryOp1(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public UnaryOp1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new UnaryOp1(cloneProperties(),firstToken,lastToken);
  }
}
