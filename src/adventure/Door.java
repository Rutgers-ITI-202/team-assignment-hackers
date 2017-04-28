package adventure;

/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Implementing Puzzles in the Game</h1>
 *  This class contains the methods to prevent the player from entering certain rooms without obtaining the 
 *  required objects. Doors automatically lock after a player passes through.
 */

	class Door implements Accessible {

	  private Key myKey;

	  //The door's location.
	  private Accessible outSite;
	  private Accessible inSite;

	  //construct a door at the site.
	  Door(Accessible out, Accessible in, Key k){
	    outSite = out;
	    inSite = in;
	    myKey = k;
	  }

	  
	  /**
	   * @param Adventurer p
	   * @return void
	   * @description  player will need the correct key to enter.
	   */
	 public void enter(Adventurer p){
		 //if the key validates and the user got it from previous room then
		 //they are allowed passage through the room. 
	 if (p.haveItem(myKey)) {
	    System.out.println("Your key works! The door creaks open,");
	    System.out.println("and slams behind you after you pass through.\n"
	    		+ "--------------------------------------------------------");
	    if (p.getLoc() == outSite) inSite.enter(p);
	    else if (p.getLoc() == inSite) outSite.enter(p); 
	 }
	 //otherwise the player is not permitted to enter the room
	 else {System.out.println("You don't have the key for this door!");
	       System.out.println("Sorry.");
	      }
	 }

	}

	


