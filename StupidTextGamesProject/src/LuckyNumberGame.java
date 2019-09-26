// Son Nguyen - CSC305 Lab5

import java.util.Random;
import java.util.Scanner;

public class LuckyNumberGame implements StupidTextGame {
	public String getName() {
		return "Lucky Number";
	}
	
	public void play(Scanner console) {
		Random randGen = new Random();		
		int luckyNum = randGen.nextInt(10) + 1;
		System.out.println("Today your lucky number is " + luckyNum);
		if(luckyNum%2==0) {
			System.out.println("It's an even number. CONGRATS!!!");
		} else {
			System.out.println("Odd. Not your lucky day I guess?");
		}
	}
	
}
