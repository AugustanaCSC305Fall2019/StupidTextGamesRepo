import java.util.Scanner;

/*
 * Olivia Hogenkamp
 * This stupid game prompts the user to enter three numbers. If the sum is even, 
 * the player loses, if the sum is odd, the player wins!
 */
public class evenOrOdd implements StupidTextGame {

	public String getName() {
		return "Even or Odd";
	}

	public void play(Scanner console) {
		System.out.println("Choose three numbers");

		int numbers[] = new int[3];
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Number " + (i + 1) + ":");
			int choice = console.nextInt();
			numbers[i] = choice;
			sum = sum + choice;
		}

		if (sum % 2 == 0) {
			System.out.println("The sum is even, you lose :(");
		} else {
			System.out.println("The sum is odd, you win!");
		}

	}

}
