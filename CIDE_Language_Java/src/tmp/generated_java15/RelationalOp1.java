package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class RelationalOp1 extends RelationalOp {
  public RelationalOp1(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public RelationalOp1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new RelationalOp1(cloneProperties(),firstToken,lastToken);
  }
}
