package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class PrimitiveType5 extends PrimitiveType {
  public PrimitiveType5(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public PrimitiveType5(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new PrimitiveType5(cloneProperties(),firstToken,lastToken);
  }
}
