package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AssignmentOperator2 extends AssignmentOperator {
  public AssignmentOperator2(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public AssignmentOperator2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AssignmentOperator2(cloneProperties(),firstToken,lastToken);
  }
}
