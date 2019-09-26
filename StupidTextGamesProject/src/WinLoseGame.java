//name: Mitchell Kragenbrink


import java.util.Random;
import java.util.Scanner;

public class WinLoseGame implements StupidTextGame {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "WinLoseGame";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random randGen = new Random();	
		int winLose = randGen.nextInt(2);
		if (winLose == 1) {
			System.out.println("You Win!!");
		} else {
			System.out.println("You Lose!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
