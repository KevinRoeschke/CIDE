package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class ForUpdate extends GenASTNode {
  public ForUpdate(StatementExpressionList statementExpressionList, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<StatementExpressionList>("statementExpressionList", statementExpressionList)
    }, firstToken, lastToken);
  }
  public ForUpdate(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new ForUpdate(cloneProperties(),firstToken,lastToken);
  }
  public StatementExpressionList getStatementExpressionList() {
    return ((PropertyOne<StatementExpressionList>)getProperty("statementExpressionList")).getValue();
  }
}
