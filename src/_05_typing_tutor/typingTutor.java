package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	  char currentLetter;
	    JLabel label = new JLabel();


public static void main(String[] args) {
typingTutor tutor = new typingTutor();
tutor.setup();
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}
void setup(){
    JFrame frame = new JFrame();
    frame.setVisible(true);
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);
    currentLetter = generateRandomLetter();
    label.setText(currentLetter+"");

    label.setFont(label.getFont().deriveFont(28.0f));
    label.setHorizontalAlignment(JLabel.CENTER);
    frame.addKeyListener(this);
    frame.pack();

    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("you typed: "+ currentLetter);
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
    currentLetter = generateRandomLetter();
    label.setText(currentLetter+"");

	
}

}
