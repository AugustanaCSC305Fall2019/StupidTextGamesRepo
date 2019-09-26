import java.util.Scanner;
import java.util.Random;
/**
 * 
 */

/**
 * @author jacobconnors16
 *
 */
public class PickTheDoor implements StupidTextGame {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "PickTheDoor";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random randGen = new Random();
		int door = randGen.nextInt(3);
		System.out.println("There are three doors, door 0, door 1, and door 2. Which door do you enter, 0 , 1, or 2? ");
		int answer = console.nextInt();
		if (answer == door) {
			System.out.println("Congratulations, you picked the right door!");
			
		}
		else {
			System.out.println("You got eaten by ostriches! You lose!");
		}
		

	}

}
