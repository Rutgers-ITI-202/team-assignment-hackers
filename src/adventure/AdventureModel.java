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
}
