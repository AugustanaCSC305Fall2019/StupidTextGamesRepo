
// Name: Vu Ngoc Phuong Dinh
import java.util.Random;
import java.util.Scanner;

public class DoubleDice implements StupidTextGame {
	public String getName() {
		return "DoubleDice";
	}

	public void play(Scanner console) {
		Random randGen = new Random();
		int roll = randGen.nextInt(6) + 1;
		int roll1 = randGen.nextInt(6) + 1;
		int roll2 = randGen.nextInt(6) + 1;
		System.out.println("Dice 1:" + roll);
		System.out.println("Dice 2:" + roll1);
		System.out.println("Dice 3:" + roll2);
		if (roll == roll1 || roll2 == roll1 || roll == roll2) {
			System.out.println("You win.");
		} else {
			System.out.println("You lose.");
		}

	}
}
