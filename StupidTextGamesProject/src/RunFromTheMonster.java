//Alexander Fedor

import java.util.Scanner;

public class RunFromTheMonster implements StupidTextGame{
	
	public String getName() {
		return"Run Away From the Monster!";
	}
	@Override
	public void play (Scanner console){
		System.out.println("You attempt to run away from the monster... \n");
		double percentage = Math.random();
		if (percentage > 0.75) {
			System.out.println("And you manage to run away!");
		} else {
			System.out.println("And sadly, you don't make it.");
		}
	}
		
	
}
