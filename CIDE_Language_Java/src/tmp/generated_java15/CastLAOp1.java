package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class CastLAOp1 extends CastLAOp {
  public CastLAOp1(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public CastLAOp1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new CastLAOp1(cloneProperties(),firstToken,lastToken);
  }
}
