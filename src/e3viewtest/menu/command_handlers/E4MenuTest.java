package e3viewtest.menu.command_handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class E4MenuTest {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell s) {
		
		MessageDialog.openInformation(s, "E4 Information Dialog", "Hello world from a pure Eclipse 4 plug-in");

	}
}
