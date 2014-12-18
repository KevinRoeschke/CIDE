package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class ShiftOp3 extends ShiftOp {
  public ShiftOp3(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public ShiftOp3(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new ShiftOp3(cloneProperties(),firstToken,lastToken);
  }
}
