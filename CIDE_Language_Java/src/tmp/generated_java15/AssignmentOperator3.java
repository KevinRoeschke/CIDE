package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AssignmentOperator3 extends AssignmentOperator {
  public AssignmentOperator3(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public AssignmentOperator3(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AssignmentOperator3(cloneProperties(),firstToken,lastToken);
  }
}
