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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	JButton button = new JButton();
	String apple = "apple.jpeg";
	String cherry = "Watermelon.jpeg";
	String orange = "orange.jpeg";
	JLabel one;
	JLabel two;
	JLabel three;
	JFrame frame;
	JPanel panel;
	int i;
	int b;

	public void run() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		populateSlotMachine();
		button.setText("Click to spin!");
		button.addActionListener(this);
		frame.pack();
	}

	private void populateSlotMachine() {
		for (i = 0; i < 3; i++) {
			Random ran = new Random();
			int num = ran.nextInt(3);

			if (num == 0) {
				try {
					one = createLabelImage(apple);
					panel.add(one);
					frame.pack();
					
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}

			}
			if (num == 1) {
				try {
					two = createLabelImage(orange);
					panel.add(two);
					frame.pack();
					
				} catch (MalformedURLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			if (num == 2) {
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

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
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
		if (e.getSource() == button) {
			panel.removeAll();
			panel.add(button);
			populateSlotMachine();

		}
	}
}
