package tmp.generated_c;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class AssignmentOperator6 extends AssignmentOperator {
  public AssignmentOperator6(ASTStringNode assminus, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ASTStringNode>("assminus", assminus)
    }, firstToken, lastToken);
  }
  public AssignmentOperator6(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new AssignmentOperator6(cloneProperties(),firstToken,lastToken);
  }
  public ASTStringNode getAssminus() {
    return ((PropertyOne<ASTStringNode>)getProperty("assminus")).getValue();
  }
}
