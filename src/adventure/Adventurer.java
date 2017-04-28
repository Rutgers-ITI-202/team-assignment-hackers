package adventure;

/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> This the main logic class of the adventure text Project</h1>
 *  This class adds, counts, drops, inspects items all for items that are in the bag that the 
 *  player is carrying. It also sets the location of the player. 
 */

class Adventurer {

  private Room myLoc;

  //object array of myThings with 2 things 
  private Things[] myThings = new Things[20];

  //int counts items
  private int itemCount = 0;

  public void setRoom(Room r){
   myLoc = r;
   }

  /**
   * look
   * @param none
   * @return String
   * @description Lets the player get the description for a certain location
   */
  public String look() {
   return myLoc.getDesc();
   }

  
  /**
   * go
   * @param int direction
   * @return void
   * @description Lets the player move around and go in a certain direction
   */
  public void go(int direction){
     myLoc.exit(direction,this);
  }

  
  /**
   * pickUp
   * @param Item i
   * @return void
   * @description Adds item to mythings and deletes it from myLoc. 
   */
  public void pickUp(Things i){
   if (itemCount < 20) {
      myThings[itemCount] = i;
      itemCount++;
      myLoc.removeItem(i);
      }
  }

  
  /**
   * haveItem
   * @param Item itemToFind
   * @return boolean
   * @description method returns true in the item is already in bag otherwise returns false. 
   */
  
  public boolean haveItem(Things itemToFind){
     for (int n = 0; n < itemCount ; n++)
       if (myThings[n] == itemToFind) return true;
     return false;
  }

  
  /**
   * drop
   * @param int itemNum
   * @return void
   * @description allows the user to drop the item from the bag
   */
  public void drop(int itemNum){
//if itemNumber is not negative or greater than the items on the list 
   if (itemNum > 0 & itemNum <= itemCount){
      switch(itemNum){
      //deletes item from bag
      case 1: { myLoc.addItem(myThings[0]);
	        myThings[0]=myThings[1];
	        itemCount--; 
	        break;
	      }
      //add item to the room contents list. 
      case 2: { myLoc.addItem(myThings[1]);
      itemCount--;
      break;
      }

      }
   }
   }
  /**
   * setLoc
   * @param Room r
   * @return void
   * @description sets the location of the player to r
   */
  public void setLoc(Room r){
	  myLoc = r;
	  }

  /**
   * getLoc
   * @param none
   * @return Room location
   * @description gets the location of the room and returns it 
   */
  public Room getLoc(){
	  return myLoc;
	  }

  
  /**
   * showMyThings
   * @param none
   * @return String outrString
   * @description Shows the things the player has in his bag. 
   */
  public String showMyThings(){
   String outString = "";
   for (int n = 0; n < itemCount ; n++)
     outString = outString + Integer.toString(n+1) + ": " 
       + myThings[n].getDesc() + "\n";
   return outString;
  }
  
  /**
   * bagFull
   * @param none
   * @return boolean itemCount
   * @description Returns true or false if bag is full (20 items max)
   */
  public boolean bagFull(){
	  return itemCount==20;
	  }

  
  /**
   * bagEmpty
   * @param none
   * @return boolean itemCount
   * @description Returns true or false if no items are in bag
   */
  public boolean bagEmpty(){
	  return itemCount==0;
	  }

  /**
   * numItemsCarried
   * @param none
   * @return int itemCount
   * @description Returns the number of items in the bag
   */
  public int numItemsCarried(){
	  return itemCount;
	  }

}

