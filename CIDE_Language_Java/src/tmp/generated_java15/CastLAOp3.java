package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class CastLAOp3 extends CastLAOp {
  public CastLAOp3(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public CastLAOp3(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new CastLAOp3(cloneProperties(),firstToken,lastToken);
  }
}
