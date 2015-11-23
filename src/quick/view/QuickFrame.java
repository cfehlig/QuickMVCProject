package quick.view;

import javax.swing.JFrame;
import quick.controller.QuickController;

public class QuickFrame extends JFrame
{
	private QuickController baseController;
	private QuickPanel basePanel;
	
	public QuickFrame (QuickController baseController)
	{
		this.baseController = baseController;
		basePanel = new QuickPanel(baseController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setVisible(true);
	}
	public QuickController getBaseController()
	{
		return baseController;
	}
	

}
