
// Name: Vu Ngoc Phuong Dinh
import java.util.Random;
import java.util.Scanner;

public class RockRockRock implements StupidTextGame {
	public String getName() {
		return "RockRockRock";
	}

	public void play(Scanner console) {
		Random randGen = new Random();
		System.out.print("Type 1 for scissors, 2 for rock, 3 for paper:");
		int input = console.nextInt();
		int roll = randGen.nextInt(3) + 1;
		System.out.println("You:" + input);
		System.out.println("Machine:" + roll);
		if (input == roll) {
			System.out.println("You tie.");
		} else if ((input == 3 && roll == 2) || (input == 1 && roll == 3) || (input == 2 && roll == 1)) {
			System.out.println("You win.");
		} else {
			System.out.println("You lose.");
		}

	}

}
