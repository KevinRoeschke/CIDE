package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Modifier4 extends Modifier {
  public Modifier4(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public Modifier4(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Modifier4(cloneProperties(),firstToken,lastToken);
  }
}
