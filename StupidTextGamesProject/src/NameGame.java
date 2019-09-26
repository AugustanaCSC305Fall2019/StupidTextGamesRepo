//Author: Emily Stine


import java.util.Scanner;

public class NameGame implements StupidTextGame{

	public String getName() {
		return "The Name Game";
	}
	
	public void play(Scanner console) {
		System.out.print("Enter your Name: ");
		String playerName = console.next();
		if (playerName.length() > 7) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose...");
		}
	}
}
