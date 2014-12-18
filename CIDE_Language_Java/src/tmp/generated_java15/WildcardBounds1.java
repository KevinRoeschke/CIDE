package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class WildcardBounds1 extends WildcardBounds {
  public WildcardBounds1(ReferenceTypeP referenceTypeP, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<ReferenceTypeP>("referenceTypeP", referenceTypeP)
    }, firstToken, lastToken);
  }
  public WildcardBounds1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new WildcardBounds1(cloneProperties(),firstToken,lastToken);
  }
  public ReferenceTypeP getReferenceTypeP() {
    return ((PropertyOne<ReferenceTypeP>)getProperty("referenceTypeP")).getValue();
  }
}
