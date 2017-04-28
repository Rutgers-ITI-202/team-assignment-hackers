
package adventure;
/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Creating Interactive Items </h1>
 *  This class contains the command method and item interaction methods for the text adventure project
 */



// class Treasure

class Items extends Things {
	
	
	
}




/**
 * <h1> Setting Restricted Areas</h1>
 *  This class defines the rules for the boundaries for the rooms and where the player can not go. 
 */
// class Wall

class Wall implements Accessible {

	//Player can not access wrong directions. 
	 public void enter(Adventurer p)
		     {
	   System.out.println("You can't go there!! There's no entry in " 
	   		+ "that direction, please pick another direction!\n"
			   +"---------------------------------------------\n");
	 }

	}
