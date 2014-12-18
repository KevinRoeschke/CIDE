package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class Type1 extends Type {
  public Type1(ReferenceTypeP referenceTypeP, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ReferenceTypeP>("referenceTypeP", referenceTypeP)
    }, firstToken, lastToken);
  }
  public Type1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new Type1(cloneProperties(),firstToken,lastToken);
  }
  public ReferenceTypeP getReferenceTypeP() {
    return ((PropertyOne<ReferenceTypeP>)getProperty("referenceTypeP")).getValue();
  }
}
