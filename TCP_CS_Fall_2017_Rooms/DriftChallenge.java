import javax.net.ssl.ExtendedSSLSession;

/**
 * Author: Hunter Garman
 * Class: Sad Robot
 */

public class DriftChallenge extends Room
{
    public String getAuthor()
    {
        return "Hunter Garman";
    }

    public String getRoomName()
    {
        return "Drift Challenge";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {
        int answer;
        dungeon.fancyOutput("Welcome to the underground drift challenge\n" +
        "In this challenge you will have to show your abillity to avoid ricers and hit mad skids");
        dungeon.fancyOutput("Choose your character");
        answer = dungeon.getOptionIntSafe("Cb7 e-brake boi", "AWD control arm master", "automatic FRS headers","Stick axel crowd control");
            
            if (answer == 1)
            {
            dungeon.fancyOutput("Great choice, be swift and dont miss your shifts...");
            }
            else if(answer == 2)
            {
            dungeon.fancyOutput("be careful for snap oversteer, but remeber dirt is your friend");
            }
            
            if (answer == 3)
            {
            dungeon.fancyOutput("Great choice, you have a car with great handling, but remember to learn your pedal dance to disable traction control");
            }

            else if (answer == 4)
            
            dungeon.fancyOutput("Your choice is very brave, it takes a great amount of skill to drift a domestic muscle, be carefull stay away from crowds");
           
            dungeon.fancyOutput("You are walking under the school and you're are greeted by a man holding a large wrench. He looks like he dosent mess around and you should listen to him");
           
           dungeon.fancyOutput("Stranger: hey! i know you ! you are the lost one ive heard alot about you kid... now lets see what you've got, prove yourself or we will feed you to the shop dogs");
            
            dungeon.fancyOutput("you have recieved your first challenge, you have a choice...");
            
             answer = dungeon.getOptionIntSafe("Accept the challenge and try to use your skills" ,"call his bluff and take the risk of being fed to the shop dogs" );
             
             if (answer == 1)
             {
                 dungeon.fancyOutput("you have accepted the challenge and line up on the starting line... the sound of the spectators is overwhelming");
             }
            else if (answer == 2)
            {
                dungeon.fancyOutput("The man with the wrench strikes you over the head and parts you out for the shop dogs");
                return false;
            }

            dungeon.fancyOutput("The beautiful young asian flag girl drops the checkered flag and you take off from the starting line, you are jittering with fear, and your heart is racing, you look to your left and see the challenger spin his tires and take off, you reach your first corner, the once grey asphault has been scarred with the tire marks from former challengers, as you start to take the corner the inevitable factor of your rear tires slipping starts to take place ");
             answer = dungeon.getOptionIntSafe("You panic and let your natural instincs take over","You wait for the right steering corrections, and feather your e-brake");
             if (answer == 1)
             {
                 dungeon.fancyOutput("you start to go into an oversteer slide and slide out, you happen to get lucky and not send yourself into a gaurdrail, just remember that you wont be as lucky next time, ");
             }
             else if (answer == 2)
             {
                 dungeon.fancyOutput("you get the feel for the car and the corners and impress your challenger");
             }
             dungeon.fancyOutput("you are near the end of the race, you see the last corner up ahead, but you hear a funny noise next to you, you look over and see your challenger blow a tire and spin out you stop your car knowing you have won the race, but you have loose ends to tie up....kill the challenger or the spectators will kill you before you can get away");
             answer = dungeon.getOptionIntSafe(" you grab your tire iron and walk up to the crippled challanger, you deliver a swift blow killing him","you sit in the street and wait for the spectators to devour you ");
             if (answer == 1)
             {
             dungeon.fancyOutput("you jump in your car and burn down the track, you have found the exit to the room");
            
             }
             else if (answer == 2)
             {

             dungeon.fancyOutput("the spectators investigate the stop of the race and find you sitting there doing nothing, they maul you and injure you but you manage to escape and find the exit to the room");
             return false;

             }




    int rando = (int)(Math.random() * 2);
    if(rando == 0)
        player.giveItem("Challanger's Golden Tooth");
    else if(rando == 1)
        player.giveItem("Crusty Tire Iron");
    else
        return true;

             
        return true;
    }
      
} 
