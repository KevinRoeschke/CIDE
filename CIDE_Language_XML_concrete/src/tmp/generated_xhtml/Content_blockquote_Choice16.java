package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_blockquote_Choice16 extends Content_blockquote_Choice1 {
  public Content_blockquote_Choice16(Element_h5 element_h5, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_h5>("element_h5", element_h5)
    }, firstToken, lastToken);
  }
  public Content_blockquote_Choice16(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_blockquote_Choice16(cloneProperties(),firstToken,lastToken);
  }
  public Element_h5 getElement_h5() {
    return ((PropertyOne<Element_h5>)getProperty("element_h5")).getValue();
  }
}
