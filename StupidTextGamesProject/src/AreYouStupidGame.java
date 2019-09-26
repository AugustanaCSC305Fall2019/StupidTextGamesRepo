/*
 * Name: Rebecca Casad
 * Class: CSC371
 * Date: 9/26/2019
 * 
 */
import java.util.Scanner;

public class AreYouStupidGame implements StupidTextGame {
	
	public String getName() {
		return "Are You Stupid?";
	}
	
	public void play(Scanner console) {
		System.out.println("You are playing this game.");
		System.out.println("All signs point to yes.");		
	}
}
