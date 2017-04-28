package adventure;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Room boundaries an contents</h1>
 *  This class set the room boundaries and makes a vector called content for all of the room content 
 *  for each room. 
 *  In this class we used the Enumeration because we used vector and enumeration methods are provided through
 *  the elements of a vector. Specifically, we used the enumeration for nextElement(), hasMoreElement(), and 
 *  element() methods. 
 */

class Room implements Accessible {

  private String description;

  private Accessible[] side = new Accessible[6];

  private Vector contents = new Vector();

  Room() {
    side[0] = new Wall();
    side[1] = new Wall();
    side[2] = new Wall();
    side[3] = new Wall();
    side[4] = new Wall();
    side[5] = new Wall();
    }

  /**
   * setDescription
   * @param String d
   * @return void
   * @description sets string d to description value
   */
  public void setDesc(String d){
    description = d;
    }

  
  /**
   * setSide
   * @param int direction, Accessible m
   * @return void
   * @description sets side at index direction to Accessible m
   */
  public void setSide(int direction, Accessible m){
   side[direction] = m;
   }

  
  /**
   * addItem
   * @param Things theItem
   * @return void
   * @description Add theItem element to the contents array
   */
  public void addItem(Things theItem){
   contents.addElement(theItem); 
   }

  /**
   * removeItem
   * @param Things theItem
   * @return void
   * @description remove theItem element from the content array
   */
  public void removeItem(Things theItem){
   contents.removeElement(theItem);
   }

  
  /**
   * roomEmpty
   * @param none 
   * @return boolean isEmpty
   * @description This method returns whether the array is empty or not
   */
  public boolean roomEmpty(){
	 return contents.isEmpty();
  }

  
  /**
   * getRoomMethod
   * @param none
   * @return contentsArray []
   * @description This method copies the contents array into the contentsArray and returns the values of the contentsArray
   */
  public Things[] getRoomContents(){
   Things[] contentsArray = new Things[contents.size()];
   contents.copyInto(contentsArray);
   return contentsArray;
  }


  
  /**
   * enter
   * @param Player p
   * @return void
   * @description Sets the location of the player
   */
  public void enter(Adventurer p) {
   p.setLoc(this); 
  }

  
  /**
   * exit
   * @param int direction, Player p
   * @return void
   * @description allows user to exit the room
   */
  public void exit(int direction, Adventurer p){
   side[direction].enter(p);
   }

  
  /**
   * getDesc
   * @param none
   * @return String 
   * @description This method lists the room contents of the array 
   */
  public String getDesc(){
   //enumeration is used here for the purpose of using methods nextElement() and hasMoreElement()
   //This eliminates using for loops to shuffle through the array
   //creates enumeration roomContents and set equal to elements in contents
   Enumeration roomContents = contents.elements(); 
   //while the roomContents has more elements it will continue to print out the objects of the room
   String contentString = "";
   while(roomContents.hasMoreElements())
     contentString = 
	contentString + ((Things) roomContents.nextElement()).getDesc() + " ";

     return description + '\n' + '\n' +
     "Room Items: " + contentString + '\n';
   }

}
