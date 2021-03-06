package tmp.generated_java15;

import cide.gast.*;
import cide.gparser.*;
import cide.greferences.*;
import java.util.*;

public class BlockStatement1 extends BlockStatement {
  public BlockStatement1(LocalVariableDeclaration localVariableDeclaration, Token firstToken, Token lastToken) {
    super(new Property[] {
      new PropertyOne<LocalVariableDeclaration>("localVariableDeclaration", localVariableDeclaration)
    }, firstToken, lastToken);
  }
  public BlockStatement1(Property[] properties, IToken firstToken, IToken lastToken) {
    super(properties,firstToken,lastToken);
  }
  public IASTNode deepCopy() {
    return new BlockStatement1(cloneProperties(),firstToken,lastToken);
  }
  public LocalVariableDeclaration getLocalVariableDeclaration() {
    return ((PropertyOne<LocalVariableDeclaration>)getProperty("localVariableDeclaration")).getValue();
  }
}
