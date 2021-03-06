package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Whackamole implements ActionListener {
JFrame frame;
JPanel panel;

	public void drawButtons() {
		frame = new JFrame();
		panel = new JPanel();
		 frame.setVisible(true);
		 frame.setPreferredSize(new Dimension(500,150));
		 frame.add(panel);
		 
		 Random ran = new Random();
		 int num = ran.nextInt(19);
		 
		 for (int i=0; i < 18; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			
			if (num == i) {
				button.setText("Mole");
			}
			
		 }
			frame.pack();

		 
		 
		 
	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//if (e.getSource()==)
		
		JButton buttonpressed = (JButton) e.getSource();
		if (buttonpressed.getText().equals("Mole")) {
		speak("Correct");
		} else {
			speak("Wrong");
		}
		frame.dispose();
		
		drawButtons();

	}
	 static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
}

