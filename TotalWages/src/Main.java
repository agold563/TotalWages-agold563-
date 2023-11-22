import java.util.Scanner;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args)
	{
		JFrame window = new JFrame("Wages Calculator");
		window.setBounds(300, 300, 400, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WagesControlPanel panel = new WagesControlPanel();
		window.add(panel);
		window.setVisible(true);
	}

}
class Me {
	public static void main(String[] args) {
		System.out.println("This is in a private class");
	}
}