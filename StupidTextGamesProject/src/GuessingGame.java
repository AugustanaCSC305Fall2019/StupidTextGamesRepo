import java.util.Scanner;

//Michael Setlock 
//StupidTextGame Lab
public class GuessingGame implements StupidTextGame {
	
	public String getName() {
		return "GuessingGame";
	}
	
	public void play(Scanner console) {
		Scanner cons = new Scanner(System.in);
		int target = 7;
		System.out.println("I'm thinking of a number between 1 and 10!");
		int guess = console.nextInt();
		if (guess != target) {
			System.out.println("Nope! sorry");
		}else if (guess==target) {
		System.out.print("That's it!");
		}	
	}


}
