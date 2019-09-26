// Maame Araba Amponsah Vander-pallen
import java.util.Random;
import java.util.Scanner;

public class UnluckyNumberGame implements StupidTextGame{

	public String getName() {
		return "Unlucky Number";
	}
	
	public void play (Scanner console) {
		Random randGen = new Random();		
		int num = randGen.nextInt(20) + 1;
		System.out.println("You picked " + num);
		if (num == 15) {
			System.out.println("Right number. You guessed right.");
		} else {
			System.out.println("Wrong number. You guessed wrong.");
			System.out.print("Try again later");
		}		
		
	}
}
