package tmp.generated_people;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_blockquote_Choice112 extends Content_blockquote_Choice1 {
  public Content_blockquote_Choice112(Element_pre element_pre, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_pre>("element_pre", element_pre)
    }, firstToken, lastToken);
  }
  public Content_blockquote_Choice112(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_blockquote_Choice112(cloneProperties(),firstToken,lastToken);
  }
  public Element_pre getElement_pre() {
    return ((PropertyOne<Element_pre>)getProperty("element_pre")).getValue();
  }
}
