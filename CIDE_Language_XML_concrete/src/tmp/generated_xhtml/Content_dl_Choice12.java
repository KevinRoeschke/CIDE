package tmp.generated_xhtml;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class Content_dl_Choice12 extends Content_dl_Choice1 {
  public Content_dl_Choice12(Element_dd element_dd, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<Element_dd>("element_dd", element_dd)
    }, firstToken, lastToken);
  }
  public Content_dl_Choice12(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public ASTNode deepCopy() {
    return new Content_dl_Choice12(cloneProperties(),firstToken,lastToken);
  }
  public Element_dd getElement_dd() {
    return ((PropertyOne<Element_dd>)getProperty("element_dd")).getValue();
  }
}
