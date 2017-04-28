package adventure; 


import java.util.Vector;
import java.util.Enumeration;
import java.io.*;

/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Main class where the methods are implemented</h1>
 * This class has the command methods and item interaction methods for the game.
 * We used vector in the program because we were not sure how long our arraylist would be
 * therefore it would be simpler to use vector which does not require a length declaration. 
 */


public class TextAdventure {
  private AdventureModel theCurrentRoom ;
  private Adventurer thePlayer;

  /** 
   * convertDirection
  * @param String input
  * @return int theDirection
  * @description Takes in char input and converts it into an integer
  * This is simpler than creating a direction class which is why we used it.
  */
  private int convertDirection(String input){
   char d = input.charAt(0);
   int theDirection = 9999;
   switch(d){
   //Converts char of user input into integers
       case 'n': case 'N': theDirection = 0;break;
       case 's': case 'S': theDirection = 1;break;
       case 'e': case 'E': theDirection = 2;break;
       case 'w': case 'W': theDirection = 3;break;
       case 'i': case 'I': theDirection = 4;break;
       case 'o': case 'O': theDirection = 5;break;
    }
    return theDirection;
  }
  /** 
   * choosePickUp
  * @param Adventurer p, BufferedReader keyB
  * @return int theChoice 
  * @description choosePickUp determines the specific item that a player wants to take
  * 
  */
  private Things choosePickupItem(Adventurer p,  BufferedReader keyB)
				 throws IOException{
   Things[] contentsArray = (p.getLoc()).getRoomContents();
   String inputString = "prepare";
   int theChoice = -1;
   //prints out the items in the room the player is in
   do {   
       System.out.println("The room has:");
       for (int i = 0; i < contentsArray.length ; i++)
       System.out.println((i+1) + ": "
			     + contentsArray[i].getDesc()); 
       //get user input on which number of item to take
       System.out.print("Enter the number of the item to grab: ");
       inputString = keyB.readLine();
       System.out.println('\n');
       if (inputString.equals("")) inputString = " ";
       try  {
	    theChoice = Integer.parseInt(inputString);
	    } catch (NumberFormatException e) {
	       System.out.println("Invalid input.");
	       theChoice = -1;
	    }
       //if item is a negative number or greater than the length of the array print out error statement
       if (theChoice < 0 || theChoice > contentsArray.length)
	  System.out.print("That item is not in the room.");
       } while (theChoice < 0 || theChoice > contentsArray.length); 

   return contentsArray[theChoice-1];

  }
  
  /** 
   * chooseDropItem
  * @param Adventurer p, BufferedReader keyB
  * @return int theChoice 
  * @description chooseDropItem  determines the specific item that a player wants to drop
  * 
  */
 
  private int chooseDropItem(Adventurer p,  BufferedReader keyB)
     throws IOException{
     String inputString = "prepare";
     int theChoice = -1;

     do {
    	 //prints out the items that in the bag
         System.out.println("You are carrying: " +
				p.showMyThings() + '\n');
         //takes user input of which item to drop
         System.out.print("Enter the number of the item to drop: " );
         inputString = keyB.readLine();
         try  {theChoice = Integer.parseInt(inputString);}
	 catch (NumberFormatException e) {
	       System.out.println("Invalid input.");
	       theChoice = -1;
	       }
         //invalid choice if the number is not in scope
         if (theChoice < 0 || theChoice > p.numItemsCarried())
	    System.out.print("Invalid choice.");
        } while (theChoice < 0 || theChoice > p.numItemsCarried());

    return theChoice;
  }

  
  /** 
   * startQuest
  * @param none
  * @return void
  * @description Creates key board control for the game allowing the player to use, take, quit, and move around.
  * 
  */
  
  public void startQuest() throws IOException{
   Adventurer thePlayer = new Adventurer();
   AdventureModel theCave = new AdventureModel();
   Room startRm = theCave.createCave();
   thePlayer.setRoom(startRm);

   //Creates a keyboard control for the game
    BufferedReader keyboard
	  = new BufferedReader(new InputStreamReader(System.in));
    String inputString = "prepare";

    //The main query user, get command, interpret, execute cycle
    while (inputString.charAt(0)!='q') {
       System.out.println(thePlayer.look());
       System.out.println("Your bag contains: \n" +
			   thePlayer.showMyThings() + '\n');
        // get next move
	int direction = 9;

          System.out.println("Which way (n,s,e,w,i,o)," +
			     " or grab (g) or use (t) an item," +
			     " or quit (q)?" + '\n');
          inputString = keyboard.readLine(); 
	  System.out.println('\n');
	  if (inputString.equals("")) inputString = " ";
	  char key = inputString.charAt(0);
	  switch (key){
	   // Establishes the direction the player wants to go in by using a switch statement
	  //for  the different options
	     case 'n': case 'N': case 's': case 'S':
	     case 'e': case 'E': case 'w': case 'W':
	     case 'i': case 'I': case 'o': case 'O': 
               direction = convertDirection(inputString);
	       thePlayer.go(direction); 
               break;
           // This method allows player to take and item
	     case 'g': case 'G':
	    	 //in the integer bagFull is at its limit then the player will not be able to take
	    	 //anything else, unless something is dropped. 
	       if (thePlayer.bagFull())
		  System.out.println("Your bag is full.");
	       //or else lets player know if the room is empty
               else if ((thePlayer.getLoc()).roomEmpty())
                       System.out.println("The room is empty."); 
		    else {
	                 Things itemToGrab =
	         	     choosePickupItem(thePlayer,keyboard);  
	                 thePlayer.pickUp(itemToGrab);
	                 (thePlayer.getLoc()).removeItem(itemToGrab);
			 }
	       break;
	   // Method to use an item
	      case 't': case 'T':
	      if (thePlayer.bagEmpty())
		 System.out.println("You have nothing to use.");
              else {
		    int itemToToss = 
			 chooseDropItem(thePlayer,keyboard);
	            thePlayer.drop(itemToToss);
		   }
           }
	} 

  }
  
  /** 
   * main
  * @param String args[]
  * @return void
  * @description The main method that initiates the game
  * 
  */
public static void main(String args[])
 throws IOException{
 System.out.println("Greetings, player! This game is about Aron, a young man who was cursed by a witch from trying to steal a book of spells.\n"
         + "As his punishment, he was cast into a world in which features many dimensions that connect one another. Your goal is to\n"
         + "help Aron escape and gain his freedom!\n"
         + "---------------------------------------------------------------------------");
 TextAdventure theGame = new TextAdventure();
 theGame.startQuest();
 }

}
