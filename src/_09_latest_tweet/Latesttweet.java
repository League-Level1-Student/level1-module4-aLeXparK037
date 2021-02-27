package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Latesttweet implements ActionListener {
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}
	JTextField field = new JTextField(5);
	JLabel label = new JLabel();

	JButton one = new JButton();
	JFrame frame = new JFrame();


	public void tweet() {
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(field);
		one.setText("Get latest tweet");
		panel.add(one);
		panel.add(label);
		frame.pack();
		one.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==one) {
		String res = field.getText();
		String tweet = getLatestTweet(res);
		label.setText(tweet);
		frame.pack();
		
		}

	}
}
