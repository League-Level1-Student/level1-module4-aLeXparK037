package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator implements ActionListener {
	JTextField fieldone = new JTextField(5);
	JTextField fieldtwo = new JTextField(5);
	
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JFrame frame = new JFrame();

	JLabel label = new JLabel();

	
	public void calculatorbuttons() {
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.add(fieldone);
		panel.add(fieldtwo);
		
		panel.add(label);
	
		

		
		one.addActionListener(this);
		panel.add(one);
		one.setText("Add");
		panel.add(two);
		two.setText("sub");
		two.addActionListener(this);
		panel.add(three);
		three.setText("div");
		three.addActionListener(this);
		panel.add(four);
		four.addActionListener(this);
		four.setText("mult");

		frame.pack();
	}
	
public void add(int a, int b) {
	int answer = a + b;
	 label.setText(answer + "");
	 frame.pack();
	}
public void sub(int a, int b) {
	int answer = a - b;
	 label.setText(answer + "");
	 frame.pack();
	}
public void div(int a, int b) {
	int answer = a / b;
	 label.setText(answer + "");
	 frame.pack();
}
public void mult(int a, int b) {
	int answer = a * b;
	 label.setText(answer + "");
	 frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()== one) {
		String response = fieldone.getText();
		int a = Integer.parseInt(response);
		String responses = fieldtwo.getText();
		int b = Integer.parseInt(responses);
	add(a,b);	
	
	}
	if (e.getSource()==two) {
		String response = fieldone.getText();
		int a = Integer.parseInt(response);
		String responses = fieldtwo.getText();
		int b = Integer.parseInt(responses);
	sub(a,b);	
	}
	if (e.getSource()==three) {
		String response = fieldone.getText();
		int a = Integer.parseInt(response);
		String responses = fieldtwo.getText();
		int b = Integer.parseInt(responses);
	div(a,b);
	}
	if(e.getSource()==four) {
		String response = fieldone.getText();
		int a = Integer.parseInt(response);
		String responses = fieldtwo.getText();
		int b = Integer.parseInt(responses);
	mult(a,b);
	}
}

}
