package quick.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import quick.controller.QuickController;

public class QuickPanel extends JPanel
{
	private QuickController baseController;
	private JButton firstButton;
	private JTextField firstField;
	private SpringLayout baseLayout;
	
	public QuickPanel(QuickController baseController)
	{
		this.baseController = baseController;
		firstButton = new JButton("Don't click me!");
		firstField = new JTextField("Hi I'm Cassandra!");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}

	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstField);
		
		
	}
	/**
	 * Dumping ground for generated code
	 * Helper method for arranging the panel.
	 */
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstField, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstField, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 135, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 151, SpringLayout.WEST, this);
		
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstField.setText("Wow, this is the most amazing click event ever! WOW!");
			}
		
		});
	}
}
