/**
 * Author: Gabe Vallejo
 */
import java.util.Scanner;

public class CowTipper implements StupidTextGame {
	
	public String getName() {
		return "Cow Tipper";
	}
	
	public void play(Scanner console) {
		System.out.println("You tresspass into a field of sleeping cows. You try to push one over but are too weak.");
		System.out.println("You go home sad. You lose.");		
	}

}

