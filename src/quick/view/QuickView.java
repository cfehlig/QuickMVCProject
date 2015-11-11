package quick.view;

import javax.swing.JOptionPane;

import quick.controller.QuickController;

public class QuickView
{
	private QuickController baseControllerObject;
	
	public QuickView(QuickController baseControllerObject)
	{
		this.baseControllerObject = baseControllerObject;
	}
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null,  "OurPopup");
	}

}
