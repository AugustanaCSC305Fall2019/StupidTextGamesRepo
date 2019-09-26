// Name: Vu Ngoc Phuong Dinh
import java.util.Random;
import java.util.Scanner;

public class LuckyGuess implements StupidTextGame{
	public String getName() {
		return "LuckyGuess";
	}

	public void play(Scanner console) {
		Random randGen = new Random();
		System.out.print("Type your guess from 0-9:");
		int input=console.nextInt();
		int roll = randGen.nextInt(9);
		System.out.println("You:" + input);
		System.out.println("Machine:" + roll);
		if (roll == input) {
			System.out.println("You win.");
		} else {
			System.out.println("You lose.");
		}

	}
}
