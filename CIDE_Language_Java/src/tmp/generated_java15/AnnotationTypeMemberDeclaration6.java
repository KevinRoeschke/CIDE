package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import java.util.*;

public class AnnotationTypeMemberDeclaration6 extends AnnotationTypeMemberDeclaration {
  public AnnotationTypeMemberDeclaration6(Token firstToken, Token lastToken) {
    super(new Property[] {
    }, firstToken, lastToken);
  }
  public AnnotationTypeMemberDeclaration6(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  @Override
public IASTNode deepCopy() {
    return new AnnotationTypeMemberDeclaration6(cloneProperties(),firstToken,lastToken);
  }
}
