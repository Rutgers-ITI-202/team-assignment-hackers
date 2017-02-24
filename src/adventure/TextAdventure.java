/*
This class:
 * Contains the main method used to start the game.
 * @author Kajal, Kathy, Winnie
 * @since 2.24.17
 * Talks to the AdventureModel and to the Adventurer classes, as needed.
*/

package adventure;
import java.util.Scanner;

public class TextAdventure {

	Scanner sc;
	private static String answer = "";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextAdventure escape;
		escape = new TextAdventure();
		escape.Setup(); //makes a connection to setup
		
		//Aron Aron= new Aron() --fixed?
	}
		 
	public void Setup(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~ Welcome to Aron the Excapist. ~~~\n The plot will unravel as you play but first a tip.\n" 
				  + " Pick up any object you run into, you never know if you might need it.\n"
				  + " Also, try to only visit the rooms once, and only pick things up once."
				  + " GOOD LUCK!  \n");
		
		System.out.println("Would you like to play?");
		answer = sc.next();

		if (answer.equalsIgnoreCase("no")){
			System.out.println("Ok... Goodbye");
			return;
		} else if(answer.equalsIgnoreCase("yes")){
				System.out.println("");
				System.out.println("Aron is on his way home from a long day at work. He was looking forward\n"
						+ "to spending time with his family. When he walks in his house he notices all the lights\n"
						+ "lights are off. Papers all over the place, tables turned over, and no sign of Aron's family.\n"
						+ " Aron calls out to his family but there is only dead silence.\n"
						+ " Suddenly he feels a sharp pain in the back of his head and everything\n"
						+ "goes black. Aron wakes up he in an unfamilar room with unconnected objects.\n"
						+ "In front of Aron, he sees a table, a note on the wall, and a closed box on the floor.\n");}

 		
	System.out.println( "What will Aron do, player?\n");
	System.out.println("Your choices are:\n"
			+ "1. Go towards the table\n"
			+ "2. Examine the note \n"
			+ "3. Examine the box\n"
			+ "4. Question why you are here\n");
	//initial options
			
	int choice;
	choice= sc.nextInt(); //reads player's choice
		if (choice==1){
			System.out.println("The table seems to be made out of wood, and there is something taped in one of the table legs.");
		}
		else if (choice==2){
			System.out.println("The note in front of him reads 'Escape the room by connecting the clues or to meet your fate.");
		}
		else if (choice==3){
			System.out.println("The box is in a charcoal color with a combination lock attached to it.");
		}
		else if (choice==4){
			System.out.println("Aron yells out: [Where in the world am I?].");
		}
	}
	
}
