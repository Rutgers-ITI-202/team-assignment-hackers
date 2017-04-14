/*
This class:
•	Creates the Rooms, the Things, and the Adventurer.
•	Connects the Rooms with "paths" to other Rooms.
•	Places Things in the Rooms.
•	Places the Adventurer in some Room.
•	Accepts commands from the player, and executes them.
	o	As commands are entered, they should be copied to the main text area.
	o	The method that executes commands should return a String to be displayed in the main text area.
*/

package adventure;

public class AdventureModel {

	//A set of Action commands, protected gives access to the package adventure, & final can't be overridden?
	protected static final String[] LOOK = new String[] {"look", "examine", "read"};
	protected static final String[] TAKE = new String[] {"take", "get", "keep"};
	protected static final String[] USE = new String[] {"use"};
	protected static final String[] OPEN = new String[] {"open"};
	protected static final String[] CLOSE = new String[] {"close"};
	
	//A bunch of things that the player can use... descriptions will be added in later
	private static Things bed = new Things("Aron is handcuffed to a bed rail.");
	private static Things table = new Things("On the wooden table, there are slips of notes.");
	private static Things drawer = new Things("This drawer is reigh beside the bed, and does not have any locks");

	private static Things note = new Things("This note contains a message: ");
	private static Things torch = new Things("");
	private static Things jewel = new Things("");
	private static Things dragontooth = new Things("");

	private static Things sphinx = new Things("");
	private static Things mummyTombs = new Things("");
	private static Things goldCoins = new Things("");

	private static Things shield = new Things("");
	private static Things usbDrive = new Things("");
	private static Things universalKey = new Things("");
	private static Things computers = new Things("");

	private static Things medallion = new Things("");
	private static Things shuriken = new Things("");

	private static Things treasureBox = new Things("");
	private static Things eyePatch = new Things("");
	private static Things codeInBox = new Things("");
	private static Things parrot = new Things("");

	private static Things prisonersClothes = new Things("");
	private static Things paperClip = new Things("");
	
	private static Things suitcase = new Things("");
	
	// creating methods for rooms
	public static void garden(){ 
	
	}
	public static void livingRoom(){
	
	}
	public static void kitchen(){
		
	}
}
