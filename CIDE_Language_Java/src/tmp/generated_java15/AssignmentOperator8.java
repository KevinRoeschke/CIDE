package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AssignmentOperator8 extends AssignmentOperator {
  public AssignmentOperator8(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public AssignmentOperator8(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AssignmentOperator8(cloneProperties(),firstToken,lastToken);
  }
}
