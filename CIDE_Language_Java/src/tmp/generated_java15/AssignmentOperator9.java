package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AssignmentOperator9 extends AssignmentOperator {
  public AssignmentOperator9(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public AssignmentOperator9(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AssignmentOperator9(cloneProperties(),firstToken,lastToken);
  }
}
