package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysuprise implements ActionListener {
	JButton buttonone = new JButton();
	JButton buttontwo = new JButton();
	
	public void run() {
	JFrame one = new JFrame();
	one.setVisible(true);
	
	JPanel panelone = new JPanel();
	one.add(panelone);
	
	buttonone.setText("Treat");
	panelone.add(buttonone);
	
	buttontwo.setText("scary");
	panelone.add(buttontwo);
	
	buttonone.addActionListener(this);
	buttontwo.addActionListener(this);
	one.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==(buttonone)) {
			showPictureFromTheInternet("https://cdn.singulart.com/artworks/v2/cropped/5877/main/fhd/713867_6ed990ab826a4975c232711091e55cdc.jpeg");
			System.out.println("GOOD!");
		}
		if(e.getSource()==(buttontwo)) {
			showPictureFromTheInternet("https://cnet2.cbsistatic.com/img/AQBmOzCFdlaufF1uKEftrg5L70o=/1200x630/2019/12/10/041050b8-39d6-4943-ba43-a299e6bcfe14/twitter-in-stream-wide-babyyoda1.jpg");
			System.out.println("BAD!");
		}
		}
		
	
	
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}

