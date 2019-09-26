import java.util.Scanner; 
import java.util.Random;

public class RockRockRock implements StupidTextGame{

	
	public String getName() {
		return "RockRockRock";
	}
	
	public void play(Scanner console) {
		int enterInt;
		String userPlay;
		String computerPlay = "";
		int response;
		
		System.out.println("Enter R for Rock, P for Paper or S for Scissors");	
		Scanner scan = new Scanner(System.in); 
	    response = scan.next();
		 
		
	     Random generator = new Random(); 
		 enterInt = generator.nextInt(3)+1; 
		 System.out.println("Computer play is: " + computerPlay);

		 
		if (enterInt == 1) 
		       computerPlay = "R"; 
		    else if (enterInt == 2) 
		       computerPlay = "P"; 
		    else if (enterInt == 3) 
		       computerPlay = "S";
		

		if (userPlay.equals(computerPlay)) {
			   System.out.println("It's a tie!");
			}
			else if (userPlay.equals("R")) {
			   if (computerPlay.equals("S")) 
			      System.out.println("Rock crushes scissors. You win!!");
			   else if (computerPlay.equals("P")) 
			        System.out.println("Paper eats rock. You lose!!");
			}
			else if (userPlay.equals("P")) {
			   if (computerPlay.equals("S")) 
			       System.out.println("Scissor cuts paper. You lose!!"); 
			   else if (computerPlay.equals("R")) 
			        System.out.println("Paper eats rock. You win!!");
			} 
			else if (userPlay.equals("S")) {
			     if (computerPlay.equals("P")) 
			         System.out.println("Scissor cuts paper. You win!!"); 
			     else if (computerPlay.equals("R")) 
			        System.out.println("Rock breaks scissors. You lose!!");
			}
	}

	
	
}
	}

}
