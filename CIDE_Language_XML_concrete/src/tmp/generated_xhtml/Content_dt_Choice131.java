package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_dt_Choice131 extends Content_dt_Choice1 {
  public Content_dt_Choice131(Element_button element_button, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_button>("element_button", element_button)
    }, firstToken, lastToken);
  }
  public Content_dt_Choice131(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_dt_Choice131(cloneProperties(),firstToken,lastToken);
  }
  public Element_button getElement_button() {
    return ((PropertyOne<Element_button>)getProperty("element_button")).getValue();
  }
}
