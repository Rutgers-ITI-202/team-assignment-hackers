/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 */


 /** 
 * <h1> Implements Puzzles</h1>
 *  This class is a subclass of Item and helps us implement a lock and key puzzle which 
 *  we use throughout the game.
 */
class Key extends Things {
	
	
	
}



/**
* <h1> Information about the item</h1>
*  This class contains the information about the item and allows us to set a description to each object. 
*/
class Things {

 private String description;
//sets the description and stores it in string d. 
 public void setDesc(String d){
     description = d;
 }
//returns description. 
 public String getDesc(){
	     return description;
 }

}



	
	
	

