package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


 
public class ChuckleClicker implements ActionListener{
	JButton oneB = new JButton();
	JButton twoB = new JButton();

public static void main(String[] args) {
ChuckleClicker one = new ChuckleClicker();
one.makeButtons();
}

void makeButtons(){
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	
	oneB.setText("Joke");
	twoB.setText("Punchline");
	panel.add(oneB);
	panel.add(twoB);
	oneB.addActionListener(this);
	twoB.addActionListener(this);
	frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (oneB == e.getSource() ) {
		JOptionPane.showMessageDialog(null, "Did you hear about the gummy that saved the world?");
	}
	if (twoB == e.getSource()) {
		JOptionPane.showMessageDialog(null, "It was a life saver!");

	}

	
}
}
