package Cpstester;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cps implements ActionListener {

	JButton button = new JButton();
	int cpstrack;
	Date one;

	public void run() {
		one = new Date();
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		frame.add(panel);
		panel.add(button);
		button.setText("Click to begin");
		button.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			
			cpstrack +=1;
			if (cpstrack==10) {
				endGame(one,cpstrack);
				cpstrack = 0;
			}
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your click rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 60.00 / molesWhacked)
	                  + " clicks per second.");
	}
}
