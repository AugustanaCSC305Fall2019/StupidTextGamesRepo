import java.util.Random;
import java.util.Scanner;

/*
 * Jonathan Reaban
 */

public class StupidCoinFlipGame implements StupidTextGame {

	@Override
	public String getName() {
		return "Coin Flip Game";
	}

	@Override
	public void play(Scanner console) {
		Random randGen = new Random();		
		int flip = randGen.nextInt(2) + 1;
		String toss = "";
		if(flip == 1) {
			toss = "heads";
		}
		else {
			toss = "tails";
		}
		System.out.println("You tossed " + toss);
		if (toss.equals("heads")) {
			System.out.println("Heads, you lose!");
		} else {
			System.out.println("Tails, you lose!");
		}		
		System.out.print("Try again later");
		
	}

}
