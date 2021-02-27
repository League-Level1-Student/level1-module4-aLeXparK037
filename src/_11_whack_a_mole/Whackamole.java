package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();

	public void run() {
		 frame.setVisible(true);
		 frame.setPreferredSize(new Dimension(500,500));
		 frame.add(panel);
		 
		 for (int i=0; i < 18; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
		 }
			frame.pack();

		 
		 
		 
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
