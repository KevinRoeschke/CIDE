package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class MultiplicativeOp1 extends MultiplicativeOp {
  public MultiplicativeOp1(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public MultiplicativeOp1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new MultiplicativeOp1(cloneProperties(),firstToken,lastToken);
  }
}
