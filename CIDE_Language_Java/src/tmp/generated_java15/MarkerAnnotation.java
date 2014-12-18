package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class MarkerAnnotation extends GenASTNode {
  public MarkerAnnotation(Name name, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Name>("name", name)
    }, firstToken, lastToken);
  }
  public MarkerAnnotation(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new MarkerAnnotation(cloneProperties(),firstToken,lastToken);
  }
  public Name getName() {
    return ((PropertyOne<Name>)getProperty("name")).getValue();
  }
}
