import java.util.Scanner;
import java.util.Random;

/**
 * 
 * @author kirubel mognehode
 * 
 */
public class PickABoo implements StupidTextGame {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void play(Scanner console) {	
		System.out.println("Pick a number between 1 and 10");
		Random rand = new Random();		
		int n = rand.nextInt(10)+1;
		int input = console.nextInt(); 
		if(n == input) {
			System.out.println("You are correct");
		}else {
			System.out.println("You are incorrect, try again!");
		
			
		}

	}

}
