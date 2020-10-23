package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	public void showButton() {
		
		JFrame frame0 = new JFrame();
		frame0.setVisible(true);
		
		JButton button0 = new JButton();
		frame0.add(button0);
		frame0.pack();
		
		button0.addActionListener(this);
		
		int rand = new Random().nextInt(5);
		
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will find a new show to watch on Netflix this week.");
		}
		
		else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will discover a new favorite resturaunt this week.");
		}
		
		else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will lose your Fantasy Football game this week by 1 point.");
		}
		
		else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "You will find $20 in your shoe.");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "You will oversleep tomorrow.");
		}
		
		System.out.println("Button Clicked");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
	}
	
}