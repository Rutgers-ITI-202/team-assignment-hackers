/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
*/

package adventure;

public class Adventurer {
  	//Some items that may appear in game
	private boolean flashlight = false;
	private boolean lock = false;
	private boolean note = false;
  	private boolean flowerVase = false;
  	private boolean emptyBottle = false; 
	private boolean key = false;
	private boolean book = false;
	private boolean box = false;
	
	
	
	
	public boolean getnote() {
		return true;
	}
	
	public boolean getlock() {
		return true;
	}
	
	public boolean getflashlight() {
		return true;
	}
  
  
  
}
