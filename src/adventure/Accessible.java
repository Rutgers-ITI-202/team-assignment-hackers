/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Puts the adventurer into the Starting room and initiates the game</h1>
 * This interface implemented by class Door, Room which helps to make sure that the methods make the doors and 
 * rooms work cooperate are there. 
 */




public interface Accessible {

	//calls enter program from Room.java and sets locations to "this" which is defined in Aron.java
	void enter(Adventurer p);
	

}
