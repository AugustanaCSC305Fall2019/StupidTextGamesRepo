// Made by Jack Brandt

import java.util.Scanner;

public class LearnSwedish implements StupidTextGame {
	
	@Override
	public String getName() {
		
		return "Learn Swedish";
	}
	
	@Override
	public void play(Scanner console) {
		
		String[] words = {
				
				"Hej hej!",
				"Hur m�r du?",
				"Gillar du solrosor?",
				"Vad heter du?"
		};
		
		for (int abc = 0; abc<4; abc++) {
			
			System.out.println();
			System.out.println("Maskin: "+words[abc]);
			System.out.println("M�nniska: ");
			
			console.next();
		}
		
		System.out.println();
		System.out.println("Hej d�!");
		
		
		
		
		
		
		
		
		
	}
}