// Authors: Grant Reuter
import java.util.Random;
import java.util.Scanner;

public class EvenOrOdd implements StupidTextGame {
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Even or Odd";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random number = new Random();
		int numberone = number.nextInt(10);
		System.out.println(numberone);
		if(numberone == 0) {
			System.out.println("you got Zero!");
		}
		else if(numberone%2 == 0) {
			System.out.println("Your number is Even!");
		}else {
			System.out.println("Your Number is Odd!");
		}
		
	}

}
