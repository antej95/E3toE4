package e3viewtest.menu.command_handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class E3MenuTest extends AbstractHandler{

  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
	System.out.println("E3MenuTest Pressed");
    return null;
  }
	
}
