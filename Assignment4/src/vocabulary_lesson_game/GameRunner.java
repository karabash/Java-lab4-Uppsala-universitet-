package vocabulary_lesson_game;
import   game_vocabulary.SwedishVocabulary;
import players.Gamer;
import players.Player1;
import java.util.*;

/**
 * This class runs the game
 * @author #Karabash
 * @version jdk1.8.0_181
 */
public class GameRunner {
	private static final  EnumMap<SwedishVocabulary, String > swedishVocabulary = new EnumMap<SwedishVocabulary, String>(SwedishVocabulary.class);
	private static final ArrayList<String> listOfValues = new ArrayList<String>();

	/**
	 * GameRunner a constructor without parameter
	 * and gives keys and values to instance of swedishVocabulary 
	 */
	GameRunner(){
		swedishVocabulary.put(SwedishVocabulary.BIL, "car"); 
		swedishVocabulary.put(SwedishVocabulary.HUS, "house"); 
		swedishVocabulary.put(SwedishVocabulary.SPRINGA, "run");
		swedishVocabulary.put(SwedishVocabulary.BLÅ, "blue"); 
		swedishVocabulary.put(SwedishVocabulary.BAKA, "bake"); 
		swedishVocabulary.put(SwedishVocabulary.HOPPA, "jump"); 
		swedishVocabulary.put(SwedishVocabulary.SIMMA, "swim"); 
		swedishVocabulary.put(SwedishVocabulary.MÅNE, "moon");
		swedishVocabulary.put(SwedishVocabulary.VÄG, "road"); 
		swedishVocabulary.put(SwedishVocabulary.SNÄLL, "kind"); 
	}

	public static void main(String args[]) {
		ControllerOfGame contorOfgame   = new GameRunner().new ControllerOfGame();
		contorOfgame.startGuessing();

	}

	/**
	 * This class an inner class.
	 * and logic of game
	 * @author #Karabash
	 *
	 */
	private class ControllerOfGame{
		private	Scanner input = new Scanner(System.in);

		/**
		 * The checkAGuessTotalyCorrect() method checks user guess is correct or not.
		 * @param userInput
		 * The checkAGuessTotalyCorrect() method takes a parameter to take userInput.
		 * @return
		 * This method returns true if a guess is correct otherwise false
		 * and return type boolean helps to increase count of a correct guess
		 * or wrong guess. 
		 */
		private final boolean checkAGuessTotalyCorrect(String userInput) {
			boolean isswedishDicContains = false;
			if(GameRunner.swedishVocabulary.containsValue(userInput)) {
				isswedishDicContains = true;
			}
			return isswedishDicContains;
		}



		/**
		 * This is a final method and can't be changed!
		 * The startGuessing() method calculates wrongs and corrects answers
		 * and gives total score end of the game. 
		 * The startGuessing() method do not take any parameters.
		 * This method do not return any thing.
		 */
		private final void startGuessing() {
			listOfValues.addAll(0, swedishVocabulary.values());
			int wrongAns=0, correctAns=0;
			String userInput = null;

			System.out.println("Enter your name");
			Gamer gamer = new Player1(userInput);
			String userName =  input.next().toLowerCase();
			gamer.setName(userName);
			System.out.println("Skriv det engelska ordet. Avsluta programmet genom att skriva Q");

			stop: for(SwedishVocabulary words : SwedishVocabulary.values()) {
				System.out.print(words+" :");
				userInput =  input.next().toLowerCase();

				if(	userInput.substring(0).equalsIgnoreCase("q") | correctAns+wrongAns==9) {
					// I've added +1 bc list of size 9 and total questions are 10
					System.out.print("Du svarade på total "+  (wrongAns+correctAns+1) + " glosor "+gamer.getName() +" och hade " + correctAns +" rätt välkomen åter" );
					break stop;
				}
				else if(this.checkAGuessTotalyCorrect(userInput)) {
					++correctAns;
					System.out.print("Korrekt! " + correctAns   + " rätt " +" av " + (correctAns+ wrongAns) +" ord\n" );

				}

				else if(this.checkAGuessTotalyCorrect(userInput)==false){
					System.out.println("Nästan rätt. Korrekt svar är "+ listOfValues.get(correctAns+wrongAns)+".");
					++wrongAns;		
				}		
			}

		}
	}
}






































