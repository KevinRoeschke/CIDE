package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AdditiveExpression extends GenASTNode {
  public AdditiveExpression(MultiplicativeExpression multiplicativeExpression, ArrayList<AdditiveExpressionIntern> additiveExpressionIntern, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<MultiplicativeExpression>("multiplicativeExpression", multiplicativeExpression),
      new PropertyZeroOrMore<AdditiveExpressionIntern>("additiveExpressionIntern", additiveExpressionIntern)
    }, firstToken, lastToken);
  }
  public AdditiveExpression(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AdditiveExpression(cloneProperties(),firstToken,lastToken);
  }
  public MultiplicativeExpression getMultiplicativeExpression() {
    return ((PropertyOne<MultiplicativeExpression>)getProperty("multiplicativeExpression")).getValue();
  }
  public ArrayList<AdditiveExpressionIntern> getAdditiveExpressionIntern() {
    return ((PropertyZeroOrMore<AdditiveExpressionIntern>)getProperty("additiveExpressionIntern")).getValue();
  }
}
