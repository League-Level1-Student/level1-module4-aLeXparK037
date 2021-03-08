package Cpstester;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cps {

	
	public void run() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		JButton button = new JButton();
		
		frame.add(panel);
		panel.add(button);
		button.setText("Click to begin");
		
		frame.pack();
	}
}
