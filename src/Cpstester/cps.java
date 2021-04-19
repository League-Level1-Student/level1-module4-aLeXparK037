package Cpstester;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class cps implements ActionListener {

	JButton button = new JButton();
	int cpstrack = 0;
	Timer time = new Timer( 1000, this);
	//Date one;

	public void run() {
		
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
			if (cpstrack == 0) {
				time.start();
				cpstrack +=1;
			} else {
				cpstrack +=1;
			}
			
			
		}
	
		
	}
	/*private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your click rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 60.00 / molesWhacked)
	                  + " clicks per second.");
	*/}

