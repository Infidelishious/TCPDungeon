import java.lang.*;


public class PuzzleRoom extends Room
{

    public String getAuthor()
    
    {
        return "Curtis Gorlick";
    }

    public String getRoomName()
    {
        return "PuzzleRoom";
    }
    
    public boolean playerEnters(Player player) throws Exception
    {     
        String name = player.getName();

        dungeon.fancyOutput("Hello" + name + "!\n");
        

        dungeon.fancyOutput("_ _ _ _ _ _ _ _ _ _ _ _ _ _ \n");

        dungeon.fancyOutput(
            "You walk up to a door and the door is locked.\n" +
            "you knock on the door three times and nothing happens.\n" +
            "as you walk away the door slowly opens and when you walk in\n " +
            "There is no one to be found. You go to turn on the lights but they are dead.");

        dungeon.fancyOutput("you then");

       dungeon.fancyOutput("1) get out of that creepy ass room");
       dungeon.fancyOutput("2) with skeptisism, you continue walking ");
        int choice = dungeon.getIntSafe(); 
        
        if(choice == 1)
        {
            dungeon.fancyOutput("As you retrace your steps back to the door, it slams shut");
            dungeon.fancyOutput("You slowly walk backwards and trip on something");  

            dungeon.fancyOutput("1)You go over and pick it up");
            dungeon.fancyOutput("2)You ignore it and proceed to the exit of the room");
            choice = dungeon.getIntSafe(); 
        
        }
        else
        {
          dungeon.fancyOutput(
                "You  continue to inch forward until you run into a wall.\n" +
                "On that wall you find a light switch and this time it actually works.\n" +
                "You turn it on and notice something on the ground on the other side of the room");
        
           dungeon.fancyOutput("1)You go over and pick it up");
           dungeon.fancyOutput("2)You ignore it and proceed to the exit of the room");
            choice = dungeon.getIntSafe(); 
        }


        if(choice == 1)
        {
                dungeon.fancyOutput("You pick it up and the door shuts");
                dungeon.fancyOutput("It says if you want to leave then you need to decode it");

                 dungeon.fancyOutput(
                    "the box says, you only get one try.\n" +
                    "there are two buttons on the box, one button in the shape of a triagle\n" +
                    "one button in the shape of a square");
                    

                 dungeon.fancyOutput("0) you click on the triangle");
                 dungeon.fancyOutput("1) you click on the square");
                 choice = dungeon.getIntSafe(); 
        }
        else if(choice == 2)
        {
            dungeon.fancyOutput(
                "The exit is still blocked so you decide to rest yor eyes\n" +
                " You wake up about 30 minutes later and decide to pick up the box" +
                "the box says, you only get three tries.\n" +
                "there are two buttons on the box, one button in the shape of a triagle\n" +
                "one button in the shape of a square");
                
                dungeon.fancyOutput("0) you click on the triangle");
                dungeon.fancyOutput("2) you click on the square");
                choice = dungeon.getIntSafe(); 
           
                dungeon.fancyOutput("decode 00011101 01010101 11110001");

                 dungeon.fancyOutput("1) answer = 29 53 246");
                 dungeon.fancyOutput("2) answer = 64 82 174");
                 dungeon.fancyOutput("3) answer = 30 68 123");
                 choice = dungeon.getIntSafe(); 
        }
        else if(choice == 2 || choice == 3)
        {
        dungeon.fancyOutput("- 1 health");

        }
        else
        {
            dungeon.fancyOutput(
                "The exit is still blocked so you decide to rest yor eyes\n" +
                " You wake up about 30 minutes later and decide to pick up the box" +
                "the box says, you only get one try.\n" +
                "there are two buttons on the box, one button in the shape of a triagle\n" +
                "one button in the shape of a square");

            if(choice == 0)
             {
                 dungeon.fancyOutput("decode 01100010 00100011 10101100");
                 dungeon.fancyOutput("1) answer = 29 53 246");
                 dungeon.fancyOutput("2) answer = 98 35 172");
                 dungeon.fancyOutput("3) answer = 30 68 123");

             }
             else if(choice == 1 || choice == 3)
             {
             
             dungeon.fancyOutput("GAME OVER");
             choice = dungeon.getIntSafe(); 

            }
             else
             {
                dungeon.fancyOutput("decode 00011101 01010101 11110001");

                 dungeon.fancyOutput("1) answer = 29 53 246");
                 dungeon.fancyOutput("2) answer = 64 82 174");
                 dungeon.fancyOutput("3) answer = 30 68 123");

             }
             


        
            dungeon.fancyOutput(
                "Now that that is done, the door opens\n" +
                "You walk to the door and when you enter\n" +
                "there is a hallway with two different doors at the end of it");
         

           dungeon.fancyOutput("0) you go through the door on the left");
           dungeon.fancyOutput("1) you go through the door on the right");
            choice = dungeon.getIntSafe(); 
        
        }
        
        if(choice == 0)
        {
            dungeon.fancyOutput(
               "once you go through the door it closes behind\n" +
                "there is a riddle on the wall that states,If seven people\n" +
                " meet each other and each shakes hands only once with each of the others,\n" +
                "how many handshakes will there have been?");

           dungeon.fancyOutput("0) 21");
           dungeon.fancyOutput("1) 49");
           choice = dungeon.getIntSafe(); 
        }
         else if(choice == 0)
        {
           dungeon.fancyOutput("Congratulations you win!");
            choice = dungeon.getIntSafe(); 
        }
        else if(choice == 1)
        {
             dungeon.fancyOutput(
               "once you go through the door it closes behind\n" +
                "there is a riddle on the wall that states,If seven people\n" +
                " meet each other and each shakes hands only once with each of the others,\n" +
                "how many handshakes will there have been?");

           dungeon.fancyOutput("0) 21");
           dungeon.fancyOutput("1) 49");
           choice = dungeon.getIntSafe(); 
    
        }
        else 
        {
           
                
        }

         if(choice == 0)
        {
           dungeon.fancyOutput("Congratulations you win!");
            return true;
        }
        else if(choice == 1)
          {

             dungeon.fancyOutput("GAME OVER");

             return false;
          }
             return false;
    } 
          

} 

    

