import java.util.Scanner;

//Noah Fackler

public class TheOtherTextGame implements StupidTextGame {

	public String getName() {
		return "The Other Text Game";
	}
	
	public void play(Scanner console) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("You must choose, left or right?:  ");
		String hand = scanner.nextLine();
		if (hand.contains("left")) {
			System.out.println("YOU FOUND THE JELLY BEAN!");
		}
		else {
			System.out.println("BZZT YOU LOSE");
		}
		System.out.println("Thank you for playing.");
	}
		
		
}


