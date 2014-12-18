package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class StatementExpression2 extends StatementExpression {
  public StatementExpression2(PreDecrementExpression preDecrementExpression, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<PreDecrementExpression>("preDecrementExpression", preDecrementExpression)
    }, firstToken, lastToken);
  }
  public StatementExpression2(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new StatementExpression2(cloneProperties(),firstToken,lastToken);
  }
  public PreDecrementExpression getPreDecrementExpression() {
    return ((PropertyOne<PreDecrementExpression>)getProperty("preDecrementExpression")).getValue();
  }
}
