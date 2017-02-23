/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;
import java.util.Scanner;

public class TextAdventure {

	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aron Aron= new Aron();	
		sc = new Scanner(System.in);
		System.out.println("Welcome to Aron the Excapist. The plot will unravel as you play but first a tip." 
				  + " Pick up any object you run into, you never know if you might need it. "
				  + " Also, try to only visit the rooms once, and only pick things up once. GOOD LUCK!  \n\n");
		String answer="";
		System.out.println("Would you like to play? \n");
		answer = sc.next();

		if (answer.equalsIgnoreCase("No")){
			System.out.println("Ok...");
			return;
		} else if(answer.equalsIgnoreCase("Yes")){

				System.out.println(" Aronis on his way home from a long day at work. He was looking forward "
						+ "to spending time with his family. When he walks in his house he notices all the lights "
						+ "lights are off. Evan is a code monkey and loves pushing buttons "
						+ "are closed and the house was all out of order. Papers all over the place, tables "
						+ "turned over, and no sign of Aron's family. Aron calls out to his family but there is "
						+ "only dead silence. Suddenly he feels a sharp pain in the back of his head and everything "
						+ "goes black. Aron wakes up he in an unfamilar room with unconnected objects. The note in "
						+ " front of him reads 'Escape the room by connecting the clues or meet your fate'");
	}

}
