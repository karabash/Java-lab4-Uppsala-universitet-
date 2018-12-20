package vocabulary_lesson_game;

import java.util.Scanner;


public class Runner {
	public static void main(String args[]) {
		GuessingSwidishWord  guessingSwidishWords  = new Runner().new GuessingSwidishWord();
		guessingSwidishWords.play();
	}

	private class GuessingSwidishWord{
		int wrongA=0;
		int correctA = 0;
		int counter= 0;

		private void play() {
			String userInput;
			System.out.print("** GLOSÖVNING - ENGELSKA**\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Skriv det engelska ordet. Avsluta programmet genom att skriva Q");
			first: for(SwedishVocabulary sVoc : SwedishVocabulary.values()) {
				System.out.print(sVoc+ ": ");	
				userInput =  sc.next().toLowerCase();

				if(userInput.equalsIgnoreCase("q")) {
					break first;
				}
				sVoc.getValue();
				if(sVoc.getValue().equalsIgnoreCase(userInput)) {
					correctA++;
					System.out.print("Korrekt! " + correctA   + " rätt " +" av " + (wrongA+ correctA) +" ord\n" );
					continue first;
				}
				else {
					wrongA++;
					System.out.println("Nästan rätt. Korrekt svar är "+ sVoc.getValue());

				}
			}
			System.out.print("Du svarade på total glosor "+  (wrongA+ correctA) + " och hade " +correctA + " rätt välkomen åter");

		}
	}
}

