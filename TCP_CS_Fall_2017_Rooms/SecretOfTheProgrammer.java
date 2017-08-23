/*

 * Author: Tristan Hogan
 * Class: secretOfTheProgrammer

 *Don't you go stealing my stuff pls thanks.

*/
   
import java.util.*;

public class SecretOfTheProgrammer extends Room
{
    public String getAuthor()
    {
        return "Tristan Hogan";
    }

    public String getRoomName()
    {
        return "Secret of the Programmer";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        //Int and String defines for everything in this room.
        int answer;
        int powerSurge = (int)(Math.random() * 100);
        int switchOn = 0;
        int switchBreakable = 0;
        int switchBroke = 0;
        int passwordGuesses = 5;
        int accessKey = 0;
        int alreadyExploredRoom = 0;

        //These are in here a lot; it delays the chat to set the mood.
        dungeon.pause(2000);
        //To clear the screen (makes it look nicer).
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        dungeon.pause(2000);
        //Enterance sequence.
        dungeon.fancyOutput("You enter a dark room. The doors behind you slam shut.", 75);
        dungeon.pause(3000);
        dungeon.fancyOutput("\nA light turns on; shining from the ceiling, and a single object is shown; a desk. Upon it sits a computer with a monitor.", 75);
        dungeon.pause(2000);
        dungeon.waitForEnter();
        dungeon.fancyOutput("\nYou walk up to the desk and to see that the computer is turned off. You press the power button, but it does nothing.", 50);
        dungeon.pause(2000);
        dungeon.fancyOutput("\nLooking around the desk, you spot that the computer is unplugged.", 50);

        //First puzzle sequence. Must choose the 2nd option or the player will lose a life.
        fPuzzle: while(true)
        {
            dungeon.fancyOutput("\nDo you: \n", 50);
            answer = dungeon.getOptionIntSafe(
                "Plug in the computer into the nearby outlet?",
                "Look for a way out instead? \n");

            if(answer == 1)
            {
                dungeon.fancyOutput("You decide to plug in the power cord.", 75);
                dungeon.pause(2000);
                
                //15% chance to create a power surge; which removes a life from the player.
                if(powerSurge >= 85)
                {
                    System.out.println("\n*zap* \n");
                    dungeon.pause(2000);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    dungeon.pause(4000);
                    return false;
                }

                //Must toggle the Surge Switch or else the player will get electrocuted.
                if(switchOn == 0)
                {
                    System.out.println("\n*zap* \n");
                    dungeon.pause(2000);
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    dungeon.pause(4000);
                    return false;
                }

                else
                {
                    //Computer turns on, Second puzzle sequence. Must figure out the password or else player will lose a life.
                    dungeon.fancyOutput("\nYou see a slight spark.", 75);
                    dungeon.pause(1500);
                    dungeon.fancyOutput("\nYou head back to the computer and press the power button. The computer sputters for a second, then initiates its startup sequence.", 50);
                    dungeon.pause(2000);
                    dungeon.fancyOutput("\nQuickly moving past the startup sequence; you see an input field; asking for a password.", 50);
                    dungeon.fancyOutput("\nThe text on the bottom of the screen reads: 'You have 5 guesses to find the correct password. Failing to guess the password results in termination.'", 75);
                    dungeon.pause(3000);
                    System.out.println("\nEnter password: \n");
                    
                    //Displays certain hints after each password fail.
                    while(passwordGuesses > -1)
                    {
                        if(passwordGuesses == 4)
                        {
                            System.out.println("\n4 guesses left. Password hint: People who can create computer software. \n");
                        }
                        
                        if(passwordGuesses == 3)
                        {
                            System.out.println("\n3 guesses left. Password hint: D = N, V = F. \n");
                        }

                        if(passwordGuesses == 2)
                        {
                            System.out.println("\n2 guesses left. Password hint: No spaces or special characters. \n");
                        }

                        if(passwordGuesses == 1)
                        {
                            System.out.println("\n1 guess left. Password hint: Convert to ASCII and use every 4th number. \n");
                        }

                        //If a player doesn't guess it in the amount of guesses, they lose a life.
                        if(passwordGuesses == 0)
                        {
                            System.out.println("\n0 guesses left. Prepare to be terminated.");
                            dungeon.pause(3000);
                            dungeon.fancyOutput("\nYou start to feel", 75);
                            dungeon.pause(500);
                            dungeon.fancyOutput("\nthe room", 125);
                            dungeon.pause(2000);
                            dungeon.fancyOutput("\ngrow colder...", 300);
                            dungeon.pause(2000);
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            dungeon.pause(4000);

                        return false;
                        }
                        int passwordthing = dungeon.getIntSafe();

                        //If they guess the password right.
                        if(passwordthing == 99997)
                        {
                            dungeon.fancyOutput("\nYou hear a robotic voice: 'Welcome Tristan. I am currently loading the desktop for you.'", 50);
                            dungeon.pause(4000);
                            dungeon.fancyOutput("\nThe computer loads the desktop. The background is a picture with reminders; one of them being to seal the room.", 50);
                            dungeon.pause(3000);
                            dungeon.fancyOutput("\nOn the desktop, you can see 3 folders; DB, rS32, and NYANDX.", 50);
                            dungeon.pause(2000);
                            sPuzzle: while(true)
                            {
                                dungeon.fancyOutput("\nWhich folder do you open? \n", 50);
                                //Third puzzle sequence. 
                                answer = dungeon.getOptionIntSafe(
                                    "DB",
                                    "rS32",
                                    "NYANDX \n");

                                if(answer == 1)
                                {
                                    dungeon.fancyOutput("\nYou try to open the DB folder.", 75);
                                    dungeon.pause(2000);
                                    
                                    if(switchBroke == 1)
                                    {
                                        dungeon.fancyOutput("\nA pop-up box appears: 'Access denied. Reason[s]: Termination of a rS32 function: 'Surge Switch Handle'", 75);
                                        dungeon.pause(4000);
                                        dungeon.fancyOutput("\nThe computer shuts off. You go to turn it back on, but as soon as you touch th-", 100);
                                        dungeon.pause(2000);
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        dungeon.pause(4000);

                                        return false;
                                    }
                                    if(accessKey == 1)
                                    {
                                        secret: while(true)
                                        {
                                            dungeon.fancyOutput("\n2 files pop up. One reads 'Run doorOpen.' The other reads 'Plans.'", 50);
                                            dungeon.fancyOutput("\nWhich folder do you open?", 50);
                                            answer = dungeon.getOptionIntSafe(
                                                "Run doorOpen",
                                                "Plans");

                                            if(answer == 1)
                                            {
                                                dungeon.fancyOutput("\nA door opens.");
                                                dungeon.pause(3000);
                                                return true;
                                            }

                                            if(answer == 2)
                                            {
                                                dungeon.fancyOutput("\nYou open it. The file reads: \n\nWell, as being one of the developers at the Apeture Science Enrichment Center, we are almost ready to release it. Finally, after numerous hours developing this software, it's almost complete. With the help of everyone here, we have managed to get this far. Let's not quit now; even if it requires a whole rewrite. Let's push through this; and remember, every one of you had a part in it. I thank you all for your service here.");
                                                continue secret;
                                            }
                                        }
                                    }
                                    else
                                    {
                                    dungeon.fancyOutput("\nA pop-up box appears: Access denied. Reason: Must have access key to open.", 75);

                                    continue sPuzzle;
                                    }
                                }
                                
                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("\nYou try to open the rS32 folder.", 75);
                                    dungeon.pause(2000);

                                    if(switchBroke == 1)
                                    {
                                        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-\nRoom Door: Active \nRoom Light: Active \nRoomPower: Active \nRoom GLaDOS: Sleeping \nRoom Traps: Disabled \nSurge Switch: Active \nSurge Switch Handle: Disconnected \n-=-=-=-=-=-=-=-=-=-=-=-=-");
                                        dungeon.pause(5000);
                                        dungeon.fancyOutput("\nIt displays a GUI with all of the room's systems.", 50);
                                        dungeon.pause(10000);

                                        continue sPuzzle;
                                    }
                                    else
                                    {
                                        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-\nRoom Door: Active \nRoom Light: Active \nRoomPower: Active \nRoom GLaDOS: Sleeping \nRoom Traps: Disabled \nSurge Switch: Active \nSurge Switch Handle: Active \n-=-=-=-=-=-=-=-=-=-=-=-=-");
                                        dungeon.pause(5000);
                                        dungeon.fancyOutput("\nIt displays a GUI with all of the room's systems.", 50);
                                        dungeon.pause(10000);

                                        continue sPuzzle;
                                    }
                                }

                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("\nYou try open the NYANDX folder.", 75);
                                    dungeon.pause(2000);
                                    dungeon.fancyOutput("\nYou see a single file named 'AccK.txt'", 75);
                                    dungeon.pause(2000);
                                    dungeon.fancyOutput("\nDo you open it?", 75);
                                    answer = dungeon.getOptionIntSafe(
                                        "Yes",
                                        "No \n");

                                        if(answer == 1)
                                        {
                                            dungeon.fancyOutput("\nYou try open the AccK file.", 75);
                                            dungeon.pause(2000);
                                            dungeon.fancyOutput("\nYou open it. The file reads: \n\nCongratulations on getting this far. \n\nNow, to escape this room, you have to solve this simple riddle. Believe me; it's pretty simple. \n\n'4 travelers, a man, a son, a grandfather, and his wife have just commited a heist of the century! They have successfully stolen a jeweled crown from a temple without anybody noticing! However, you reach a bridge. The guards from the temple finally spot you! You estimate it will take about 15 minutes to reach you.' \n\n'You brought a torch back from the temple, and it's still emitting light. You need it to cross the bridge. However, there are a few things that you need to know before you progress.' \n\n1. Only 2 people can cross the bridge at a time. Any more at a time will break the bridge, sending the people down into the abyss. \n2. You must bring the torch on the bridge to see. If you leave someone behind, then they might fall of the bridge. \n\n3. Everyone must survive. \n\n4. Person A takes 1 minute to cross, Person B takes 2, person C takes 5, and person D takes 8. \n\nHow will you all of you cross the bridge within 15 minutes and save your newfound treasure? \n\nAnswer with A being the fastest person, and D being the slowest person. \n\nHere's a hint: Answer in this format: '[People or person]>' to move someone or some people to the right side of the bridge, and use '[people or person]<' to move someone or some people to the left side. No spaces in your answer. Answer example: '[AC]>[A]<[BD]>[B]<[AB]>'. \n\nYou have 1 guess; good luck. \n\nAn input field pops up.");
                                            dungeon.getString();
                                            
                                            String bridgeAnswer = dungeon.getString();

                                            if(bridgeAnswer.equals("[AB]>[A]<[CD]>[B]<[AB]>"))
                                            {
                                                accessKey = 1;
                                                
                                                dungeon.fancyOutput("\nYou see a text box pop up that says: 'Congratulations! You successfuly solved the riddle. Wasn't too hard was it? The answer format may have been challenging though. \n\nThe access key is loaded onto the DB folder already.'", 50);
                                                dungeon.pause(2000);
                                                continue sPuzzle;
                                            }

                                            if (! bridgeAnswer.equals("[AB]>[A]<[CD]>[B]<[AB]>"))
                                            {
                                                dungeon.fancyOutput("\nYou see a text box pop up that says: 'Congratulations! You failed to solve the riddle. Too hard was it? The answer format was challenging though. \n\nGood luck with the rest of your short life. You have 10 seconds to pray.'", 100);
                                                dungeon.pause(10000);
                                                dungeon.fancyOutput("\nYou feel a vibration under your feet. You look down and see a slit forming. You try to move out of the way, but as you do, a saw slices through the chair next to you; along with your leg. You quickly pass out as you see the void that was once your leg."); 
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                dungeon.pause(4000);
                                                return false;
                                            }
                                        }

                                        if(answer == 2)
                                        {
                                            continue sPuzzle;
                                        }
                                    }
                                }
                            }
                        passwordGuesses--;
                    }
                }
            }

            if(answer == 2)
            {
                if(switchBroke == 1)
                {
                    dungeon.fancyOutput("It would be a waste of time to try to find another way out.");
                    continue fPuzzle;
                }

                dungeon.fancyOutput("You decide to look for another way out.", 50);
                dungeon.pause(2000);

                if(alreadyExploredRoom == 1)
                {
                    dungeon.fancyOutput("\nYou try to find another way out, but you can't; only another closed door. You go back to the switch.", 50);
                }

                else
                {
                    alreadyExploredRoom = 1;

                    dungeon.fancyOutput("\nAs you look around into darkness; walking through the room, you spot a switch; not labeled.", 100);
                    dungeon.pause(2000);
                }

                dungeon.fancyOutput("\nDo you: \n", 100);
                answer = dungeon.getOptionIntSafe(
                    "Not flip the switch?",
                    "Flip the switch? \n");

                if(answer == 2)
                {
                    if(switchBreakable == 1)
                    {
                        switchBroke = 1;
                        
                        dungeon.fancyOutput("You decide to flip the switch down.", 50);
                        dungeon.pause(2000);
                        dungeon.fancyOutput("\nIt won't budge. You try harder, but to no avail.", 75);
                        dungeon.pause(2000);
                        dungeon.fancyOutput("\nYou try 1 more time.", 100);
                        dungeon.pause(2000);
                        dungeon.fancyOutput("\nIt broke. \n");
                        player.giveItem("Broken Switch Handle");
                        dungeon.pause(3000);

                        dungeon.fancyOutput("\nYou walk back to the computer desk.");

                        continue fPuzzle;
                    }

                    else
                    {
                        switchOn = 1;
                        switchBreakable = 1;

                        dungeon.fancyOutput("You decide to flip the switch up.", 100);
                        dungeon.pause(3000);

                        dungeon.fancyOutput("\nNothing happens.");
                        dungeon.pause(2000);

                        dungeon.fancyOutput("\nYou walk back to the computer desk.", 50);
                        continue fPuzzle;
                    }
                }

                if(answer == 1)
                {
                    dungeon.fancyOutput("You decide to not flip the switch.");
                    dungeon.pause(2000);

                    if(alreadyExploredRoom == 1)
                    {
                        dungeon.fancyOutput("\nYou try to find another way out, but you can't; only another closed door. You go back to the switch.", 50);
                    }
                    dungeon.fancyOutput("\nYou walk back to the computer desk.", 50);
                    dungeon.pause(2000);

                    continue fPuzzle;
                }
            }
        }
    }
}
