package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class PrimitiveType4 extends PrimitiveType {
  public PrimitiveType4(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public PrimitiveType4(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new PrimitiveType4(cloneProperties(),firstToken,lastToken);
  }
}
