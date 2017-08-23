import javax.net.ssl.ExtendedSSLSession;

/**
 * Author: Johnny Dyer
 * Class: Sea Bear
 */

public class SeaBear extends Room
{
    public String getAuthor()
    {
        return "Johnny Dyer";
    }

    public String getRoomName()
    {
        return "Sea Bear";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {

        dungeon.fancyOutput(
            "Alas, you have made it to the room know as 'Sea Bear'.\n" +
            "You procede to open the door and immediately find yourself passing through a Molecular Rearranger");
            
        dungeon.fancyOutput("Your vision fades to white for a breif time", 150);    
            
        
        dungeon.fancyOutput(
            "Your vision reappears and you feel no diffrent\n" +
            "When you look to your hands were, you discover that you now have tentacles\n" +
            "A nearby mirror reveals that you are now Squidward\n" +
            "You accept that this is necessary to escape the dungeon\n" +
            "At the far edge of the room you hear a menacing snarling and growling\n" +
            "You shudder as you see a Sea Bear emerge from the darkness\n" +
            "Three items lay before you that will help you dispacth the Sea Bear"); 

        
            

        dungeon.fancyOutput("\nYou pick up:");
        
        int answer;
        answer = dungeon.getOptionIntSafe(
                "Clarinet",
                "Sword",
                "50 Euros");
        

        if(answer == 1) //use clarinet... need to implment Math.random()
        {
           dungeon.fancyOutput("You decide to play the Clarinet for the Sea Bear, There is a fair chance the Sea Bear likes your music"); 
           dungeon.fancyOutput("I Like Your Skill, says the Sea Bear. We shall have a music battle.");
           dungeon.waitForEnter();
           dungeon.fancyOutput("Play your best...");
           answer = dungeon.getOptionIntSafe(
            "Song 1 - 'Bohemian Rapsody by Queen'",
            "Song 2 - 'All Star by Smashmouth'",
            "Song 3 - 'Symphony #40 by Wolfgang Amadeus Motzart'",
            "Song 4 - 'Colt 45 by Afroman' ");

            if(answer == 1)
            {
                dungeon.fancyOutput("The Sea Bear does not appreciate progressive music of the mid 70's\n" +
                "You have been mauled and lose 1 health");
                return false;
            }
            else if(answer == 2)
            {
                dungeon.fancyOutput("The Sea Bear is hip to modern pop culture, he likes your music\n" +
                "He procedes to play music you have never heard with an abstract wind instrument you have never seen before\n" +
                "He plays this song in reciprecation to your excellent choice of music\n" +
                "Before Sea Bear Leaves, you play one more song to demostrate your skill\n" +
                "Which song do you play?");
               
                answer = dungeon.getOptionIntSafe(
                    "Something by Vivaldi",
                    "All Star by Smash Mouth (again)",
                    "Immigrant Song by Led Zepplin");

                    if(answer == 1)
                    {
                        dungeon.fancyOutput("Vivaldi is Excellent! exclaims the Sea Bear\n" +
                        "You pass through the room sucessfully");
                        player.giveItem("Pair of seats to Planet Music");
                        return true;
                    }
                    else if(answer == 2)
                    {
                        dungeon.fancyOutput("You are automatically mauled for lack of imagination\n" +
                        "You lose one health");
                        return false;
                    }
                    else if(answer == 3)
                    {
                        dungeon.fancyOutput("Who could hate on Led Zepplin? You get to pass says the Sea Bear");
                        player.giveItem("Pair of seats to Planet Music");
                        player.giveItem("Sword");
                        player.giveItem(" Clarinet");
                        player.giveItem("Stack of 50 euros");
                        player.giveItem("A Suzuki motorcycle fuel tank");
                                           
                        return true;
                    }


                
            }
            else if(answer == 3)
            {
                int chance;
                chance = (int)Math.random() * 2;
                if(chance == 0)
                {
                    dungeon.fancyOutput("Classical Music? Interesting.... fine, I will let you pass. A music battle is not worth the effort says the Sea Bear"); 
                    return true;
             
                }
                else
                {
                    dungeon.fancyOutput("Classical Music? Wow, big mistake. says the Sea Bear - You have been mauled and use 1 health");
                    return false;
                }  

            }
            else if(answer == 4)
            {
                dungeon.fancyOutput("Afroman? Your a fan as well?! I wil let you pass for sure, no music battle necessary. Good Luck in the next rooms. says the Sea Bear");
                player.giveItem("Pair of seats to Planet Music");
                return true;
            }
        
           
        }

        else if(answer == 2) //use sword
        {
            dungeon.fancyOutput("The Sea Bear is immune to all Weapons You are mauled to death and lose\n" +
            "One Health");
            return false;
        }
       
        else if(answer == 3) //give sea bear money
        {
            dungeon.fancyOutput("The Sea Bea does not accept handouts. The Sea Bear is aggresive.\n" +
            "You have lost one health");
            return false;
       
        
        }
   
     return true;
    }
}