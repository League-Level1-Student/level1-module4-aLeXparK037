package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	JButton button = new JButton();
	String apple = "apple.jpeg";
	String cherry = "Watermelon.jpeg";
	String orange = "orange.jpeg";
	JLabel one;
	JLabel two;
	JLabel three;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();


	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		button.setText("Click to spin!");
		button.addActionListener(this);
		frame.pack();
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			
			for (int i = 1; i < 4; i++) {
				Random ran = new Random();
				int num = ran.nextInt(4);
				
				if (num == 1) {
					try {
						one = createLabelImage(apple);
						panel.add(one);
						frame.pack();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						
					}
					
				} 
				if (num == 2) {
					try {
						two = createLabelImage(orange);
						panel.add(two);
						frame.pack();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} 
				if (num == 3) {
					try {
						three = createLabelImage(cherry);
						panel.add(three);
						frame.pack();
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();

					}
				}
			}
		}
	}
}
