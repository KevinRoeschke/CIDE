package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Modifier2 extends Modifier {
  public Modifier2(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public Modifier2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Modifier2(cloneProperties(),firstToken,lastToken);
  }
}
