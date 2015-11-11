package quick.view;

import javax.swing.*;
import quick.controller.QuickController;

public class QuickPanel extends JPanel
{
	private QuickController baseController;
	private JButton firstButton;
	private JTextField firstField;
	
	public QuickPanel(QuickController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Don't click me!");
		firstField = new JTextField("Hi I'm Cassandra!");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
