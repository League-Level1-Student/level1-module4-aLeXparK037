package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	  char currentLetter;
	    JLabel label = new JLabel();
	    JPanel panel = new JPanel();
	    int lettersPressed;



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
	if(e.getKeyChar() == currentLetter) {
		System.out.println("correct");
		panel.setBackground(Color.GREEN);
	} else {
		System.out.println("bad!");
		panel.setBackground(Color.RED);
	}
	System.out.println("you typed: "+ e.getKeyChar());
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
    currentLetter = generateRandomLetter();
    label.setText(currentLetter+"");
    lettersPressed+=1;
    if (lettersPressed==10) {
    	showTypingSpeed(lettersPressed);
    }

	
}
Date timeAtStart = new Date();

private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
    Date timeAtEnd = new Date();
    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
    long gameInSeconds = (gameDuration / 1000) % 60;
    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
    int charactersPerMinute = (int) (charactersPerSecond * 60);
    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
} 
}
