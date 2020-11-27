 
package e3viewtest.views;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import javax.annotation.PreDestroy;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;

public class E4SampleView {	
	private Label myLabelInView;
	
	/*
	@Inject
	public E4SampleView() {
		
	}*/
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		System.out.println("Enter in SampleE4View postConstruct");

		myLabelInView = new Label(parent, SWT.BORDER);
		myLabelInView.setText("This is a sample E4 view");
	}
	
	/*
	@PreDestroy
	public void preDestroy() {
		
	}*/
	
	
	@Focus
	public void onFocus() {
		myLabelInView.setFocus();
	}
	
	
	@Persist
	public void save() {
		
	}
	
}