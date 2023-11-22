import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class WagesControlPanel extends JPanel implements ActionListener
{
	private JTextField inputHours, inputRate, display;
	private DecimalFormat money = new DecimalFormat("$0.00");

	public WagesControlPanel()  // Sets up the controls on the panel
	{
		setLayout(new BorderLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));

		panel.add(new JLabel("   Hours worked:"));
		inputHours = new JTextField(5);
		inputHours.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(inputHours);

		panel.add(new JLabel("   Hourly rate:"));
		inputRate = new JTextField(5);
		inputRate.setHorizontalAlignment(JTextField.RIGHT);
		panel.add(inputRate);

		panel.add(new JLabel("   Total wages:"));
		display = new JTextField(20);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		display.setBackground(Color.yellow);
		panel.add(display);

		JButton calc = new JButton("Calculate wages");
		calc.addActionListener(this);

		add(panel, BorderLayout.CENTER);
		add(calc, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e)  // called when a button is pressed
	{
		String s = inputHours.getText();
		double hours = Double.parseDouble(s);
		s = inputRate.getText();
		double rate = Double.parseDouble(s);
		
		
		WagesConverter converter = new WagesConverter();
		
		double wages = 0.0;  // Call your method here
		wages = converter.calculateWages(rate, hours);
		
		display.setText(money.format(wages));
		
	}


}

