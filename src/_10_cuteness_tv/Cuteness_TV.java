package _10_cuteness_tv;

import javax.swing.JOptionPane;

public class Cuteness_TV {
	
	public static void main(String[] args) {
		
		int cuteoption = JOptionPane.showOptionDialog(null, "What is this?", "Choose one below:", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "1", "2", "3" }, null);
		
		if (cuteoption == 0) {
			showDucks();
		}
		
		else if (cuteoption == 1) {
			showFrog();
		}
		
		else {
			showFluffyUnicorns();
		}
		
	}

	
	static void showDucks() {
	      playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	 }

	static void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	static void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	static void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}
	
	
}
