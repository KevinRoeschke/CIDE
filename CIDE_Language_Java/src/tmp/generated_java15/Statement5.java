package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Statement5 extends Statement {
  public Statement5(StatementExpression statementExpression, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<StatementExpression>("statementExpression", statementExpression)
    }, firstToken, lastToken);
  }
  public Statement5(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Statement5(cloneProperties(),firstToken,lastToken);
  }
  public StatementExpression getStatementExpression() {
    return ((PropertyOne<StatementExpression>)getProperty("statementExpression")).getValue();
  }
}
