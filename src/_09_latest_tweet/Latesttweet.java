package _09_latest_tweet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Latesttweet {
	

	public void tweet() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JTextField field = new JTextField();
		frame.add(field);
		JButton one = new JButton();
		one.setText("Get latest tweet");
		frame.add(one);
		frame.pack();
		
		
	}
}
