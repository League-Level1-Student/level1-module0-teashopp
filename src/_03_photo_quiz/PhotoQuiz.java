package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// â€œCopy Image Addressâ€�)
		String jack = "https://hips.hearstapps.com/vidthumb/images/gettyimages-1055521446.jpg?crop=1.00xw%3A0.847xh%3B0%2C0.153xh&resize=480%3A270";

		// 2. create a variable of type "Component" that will hold your image
		Component jack2 = jack;

		// 3. use the "createImage()" method below to initialize your Component
		jack2.createImage(100, 100);

		// 4. add the image to the quiz window
		// quizWindow.add(jack2);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		int ans = JOptionPane.showOptionDialog(null, "What is this?", "Choose one below:", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Jack o Lantern", "Christmas Tree", "Easter Egg" }, null);

		// 7. print "CORRECT" if the user gave the right answer
		if (ans == 0) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}

		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)
		String chris = "https://images.homedepot-static.com/productImages/a69022d7-2ca3-44f5-87ac-cff3d762f304/svn/home-accents-holiday-pre-lit-christmas-trees-duh3-120lo-s-64_1000.jpg";
		Component chris2 = chris;

		// 11. add the second image to the quiz window
		quizWindow.add(chris2);

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		int ans2 = JOptionPane.showOptionDialog(null, "What is this?", "Choose one below:", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Jack o Lantern", "Christmas Tree", "Easter Egg" }, null);

		// 14+ check answer, say if correct or incorrect, etc.
		if (ans == 1) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}

		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
