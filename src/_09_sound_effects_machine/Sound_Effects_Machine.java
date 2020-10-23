package _09_sound_effects_machine;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Sound_Effects_Machine {

	public static void main(String[] args) {
		
		playSound("sawing-wood-daniel_simon.wav");
		
	}
	
	
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}


}
