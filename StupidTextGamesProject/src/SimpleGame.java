
// Cameran Frank

import java.util.*;

public class SimpleGame implements StupidTextGame {

	public String getName() {
		return "Simple Game";
	}

	public void play(Scanner console) {
		System.out.println("Choose head or tail");

		Random rand = new Random();
		int flip = rand.nextInt(2) + 1;

		String choice = console.next();

		String result;
		if (flip == 1) {
			result = "head";
		} else {
			result = "tail";
		}
		if ((flip == 1 && choice.contentEquals("head")) || (flip == 2 && choice.contentEquals("tail"))) {
			System.out.println("You win!");
		} else {

			System.out.println("The result was " + result + ". You choose the wrong one!");
		}

	}

}
