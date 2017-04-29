package adventure;

/**
 * 
 * @author Kajal, Kathy, Winnie
 * @version 1.0
 * @since 1.0
 * <h1> Declaration of Rooms and Objects </h1>
 *  This class contains the room objects and the item objects. This class also takes care 
 *  of the room interactions and assigns the objects to the rooms. 
 *  
 */

class AdventureModel {
	
		  private Room entrance;
		  //Creates room Object
		  public Room createCave(){
		    // The start room  
		      Room  start = new Room();
		      start.setDesc(
		    		  "A plain, dreary room with glass walls encased on all four sides.\n "
		    		  + "There is a table with a bed and an old dresser.\n" 
		    		  + "Beyond the other side of the glass all look like empty operation rooms,\n "
		    		  + "but there seems to be no doors that lead to them.\n"
		    		  +	" There are entrances in the W,S,N,E(starting room.\n");
		      
		      
		   // Room 1: Dragon Room declaration and description setting
		      Room r1 = new Room();
		      r1.setDesc(
			 "A vast, warm cavern filled with mountains of gold and assorted treasures.\n "
			 + "It seems like a dragon would inhabit here\n "
			 + "but there seems to be no sign of one. Aron finds a few particularly "
			 + "unusual objects scattered around: a torch by a wall\n"
			 + ", a jewel on top\n of the highest mountain of gold and a dragontooth "
			 + "by the throne towards\n the back of the cavern." );
		      //Adding objects to the Dragon room
		      Items note = new Items();
		      note.setDesc("Note - with set of instructions.");
		      r1.addItem(note);
		      Items dragonTooth = new Items();
		      dragonTooth.setDesc("Dragon's Tooth");
		      r1.addItem(dragonTooth);


			// Room 2: Egyptian Room declaration and description
			  	Room r2 = new Room();
			    r2.setDesc(
			    		"An ancient looking chamber with hieroglyphs running along the walls.\n There is an immense golden statue resembling the\n"
                                + "egyptian winged creature of a sphinx in the center with a door.\n A coinpouch is nearby the door and a mummy headpiece rests\n"
                                + "in the corner of the chamber.");
			    //Adding objects to the Egyptian room
			    Items goldCoins = new Items();
			    goldCoins.setDesc("Pouch - containing a bunch of gold coins.");
			    r2.addItem(goldCoins);
			    Items mummyHeadPiece = new Items();
			    mummyHeadPiece.setDesc("Mummy Head Piece");
			    r2.addItem(mummyHeadPiece);
			    Items shield = new Items();
			    shield.setDesc("Silver Shield");
			    r2.addItem(shield);
			  //The mini tomb room inside the Egyptian Room
			    Room rA = new Room();
			    rA.setDesc(
			    " This is the inside of the mummy tomb!");

			// Room 3: Tech Room declaration and description
			   Room r3 = new Room();
			   r3.setDesc("Rows of computer monitors are on, each depicting different images and videos.\n A few robots can be seen roaming around"
                       + "doing simple tasks, \nbut it's probably best not to disturb them. A shield can be seen \nhanging up on a wall, a USB drive"
                       + "plugged into one of the system units\n and a colorful universal key on a table.");
			   //Adding objects to the tech room
			   Items universalKey = new Items();
			   universalKey.setDesc("Universal Key");
			   r3.addItem(universalKey);

			   // Room 4: Ninja Room decalration and description
			     Room r4 = new Room();
			     r4.setDesc("A quiet dojo with bamboo flooring and various weapons are up on the walls for display. \nBirds can be heard chirping and"
                         + "light filters in from behind the windows. \nA gold medallion is sitting on top of a pile of mats and a shuriken is stuck\n"
                         + "in a wooden throwing post.");
			     //Adding objects to the Ninja room
			     Items medallion = new Items();
				    medallion.setDesc("Medallion");
				    r4.addItem(medallion);
				    Items shuriken = new Items();
				    shuriken.setDesc("Shuriken - This star shaped weapon shines menacingly.");
				    r4.addItem(shuriken);

			  // Room 5: Pirate Room declaration and description
			     Room r5 = new Room();
			     r5.setDesc("The cave howls from the windy draft blowing in from the open space from the top of the grotto. Piles of coins and\n"
                         + "jewelry are scattered throughout the sand floor. An eyecatching treasurebox lies in the middle, an eyepatch is on top\n"
                         + "of one of the piles and a lonely parrot is perched by a patch of grass.");
			     //Adding objects to the Pirate room
			     Items treasureBox = new Items();
				    treasureBox.setDesc("Items Box - this golden decorated box is full of golden treasures.");
				    r5.addItem(treasureBox);
				 Items eyePatch = new Items();
				    eyePatch.setDesc("Eye Patch");
				    r5.addItem(eyePatch);
				 
			  // Room 6: Prison Room declaration and description
			     Room r6 = new Room();
			     r6.setDesc("Iron bars are enclosed around Aron into a locked prison cell. The room is dimly lit and there is a door at the end of\n"
                         + "the corridor that leads to the next room. A paperclip is strewn across the floor beside Aron and a folded up prisoner\n"
                         + "clothes lies beside the cell door.");
			     //Adding objects to the Prison room
			     Items prisonerClothes = new Items();
				 prisonerClothes.setDesc("Prisoner's clothes");
				 r6.addItem(prisonerClothes);
				 Items paperClip = new Items();
				 paperClip.setDesc("Paper Clip");
				 r6.addItem(paperClip);

			  // Room 7: Garden Room
			     Room r7 = new Room();
			     r7.setDesc("A slight breeze goes by which gently sways various plants and flowers along in the garden. The plants run along the\n"
                         + "sides of the pathway towards a giant Venus fly trap in the center area. It seems like a perfect place for animals to\n"
                         + "inhabit in."); 
			     
			  // Room 8: Indoor Pool Room
			     Room r8 = new Room();
			     r8.setDesc("The smell of chlorine immediately hits Aron's senses. A large aquatic indoor pool takes up the majority of the room with/n"
                         + " a few beach chairs by the sides of the walls. Aron looks into the pool. There appears to be a suitcase in the bottom/n"
                         + "beneath the waters!");

			  // Room 9: Ancient Library
			     Room r9 = new Room();
			     r9.setDesc("Bookcases are all lined up against the back on both sides of a large window that occupies in the center of the wall.\n"
                         + "Aron can feel that this long journey is ending, but there doesn't seem to be a visible doorway. Perhaps one of the books\n"
                         + "on the shelves can help.");

			  // Room 10: Freedom 
			     Room r10 = new Room();
			     r10.setDesc("A wave of relief and joy washes over him as Aron shakingly steps outside into a forest and sees a very familiar cabin. He's\n"
                         + "home! After a seemingly endless amount of time, he has finally escaped from the world that the witch has transported him into.\n"
                         + "Congratulations player...You have won the game!");

	
		   // Connect the start to Room 1:
		      start.setSide(3,r1);
		      r1.setSide(2,start);
		      entrance = start;

		  // Connect Rooms Start, 2, 3, and the mini tomb room:
		     start.setSide(1,r2);
		     start.setSide(0,r3);
		     r2.setSide(4,rA);
		     rA.setSide(5,r2);
		     r2.setSide(0,start);
		     r3.setSide(1,start);

		  // Connect rooms 4, 5, 6, & 7.
		     start.setSide(2,r4);
		     r4.setSide(3,start);
		     r4.setSide(2,r5);
		     r5.setSide(3,r4);
		     r5.setSide(2,r6);
		     r6.setSide(3,r5);
		     r6.setSide(0,r7);
		     r7.setSide(1,r6);

		 // Lets connect them:
		    r6.setSide(1,r8);
		    r8.setSide(0,r6);
		    r6.setSide(2,r9);
		    r9.setSide(3,r6);
		    r9.setSide(2,r10);

		 // Create a keys for the various rooms
		    //Key Pirate
		    Key theKey = new Key();
		    theKey.setDesc("Pirate Key");
		    r3.addItem(theKey);
		    //key Freedom
		    Key theFreedomKey = new Key();
		    theFreedomKey.setDesc("Freedom Key - This is the key you will need to get to freedom.");
		    r8.addItem(theFreedomKey); 
		    //Key torch
		    Key torch = new Key();
		    torch.setDesc("Torch");
		    start.addItem(torch);
		    //key tech
		    Key jewel = new Key();
		    jewel.setDesc("Jewel");
		    r1.addItem(jewel);
		    //key ninja room
		    Key usbDrive = new Key();
			usbDrive.setDesc("USB drive - contains unknown information.");
			r3.addItem(usbDrive);

		    // We add a door obstacle between r4 and r5: 
		    Door theDoor = new Door(r4,r5,theKey);
		    r4.setSide(2,theDoor);
		    // r5.setSide(2,theDoor);
		    Door theFreedomDoor = new Door(r9,r10,theFreedomKey);
		    // r.setSide(2,theFreedomDoor);
		    r9.setSide(2,theFreedomDoor);
		   //door between start and dragon room
		    Door theDragonDoor = new Door (start,r1,torch);
		    start.setSide(3,theDragonDoor);
		    //door between start and Egyptian room
		    Door theEgyptRoom = new Door (start,r2,torch);
		    start.setSide(1,theEgyptRoom);
		    //door between start and Tech room
		    Door theTechroom = new Door (start,r3,jewel);
		    start.setSide(0,theTechroom);
		  //door between start and ninja room
		    Door theninjaRM = new Door (start,r4,usbDrive);
		    start.setSide(2,theninjaRM);
		    
		    // Now return the entrance:
		    entrance = start;
		    return entrance;
		  }
		}


