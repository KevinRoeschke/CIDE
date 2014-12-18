package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class ShiftExpressionRight extends GenASTNode {
  public ShiftExpressionRight(ShiftOp shiftOp, AdditiveExpression additiveExpression, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ShiftOp>("shiftOp", shiftOp),
      new PropertyOne<AdditiveExpression>("additiveExpression", additiveExpression)
    }, firstToken, lastToken);
  }
  public ShiftExpressionRight(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new ShiftExpressionRight(cloneProperties(),firstToken,lastToken);
  }
  public ShiftOp getShiftOp() {
    return ((PropertyOne<ShiftOp>)getProperty("shiftOp")).getValue();
  }
  public AdditiveExpression getAdditiveExpression() {
    return ((PropertyOne<AdditiveExpression>)getProperty("additiveExpression")).getValue();
  }
}
