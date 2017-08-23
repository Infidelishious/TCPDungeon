import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class RiddleRoom extends Room
{
    private long time;
    private Player player;
    private ArrayList<String> riddles;
    int wrong = 0; 
    
    public String getAuthor()
    {
        return "Wyatt McDowell";
    }
    public String getRoomName()
    {
        return "Room of Riddles";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        int min = 0;
        int max = 9;

        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        
        this.player = player;

        dungeon.fancyOutput(
            "You open the door, and step through to the next challenge.\n" +
            "As soon as you step through you feel yourself fall, the door was a trap!\n");
        
        dungeon.waitForEnter();
        
        dungeon.fancyOutput(
            "You continue to fall until you hit the ground, you are knocked unconscious from the impact.\n" +
            "When you wake up you find yourself in the middle of an underground cave.\n" + 
            "Amidst the shadows you hear a faint whisper, 'Would you like to play a game of riddles?'");

        dungeon.fancyOutput(
            "You then:");
        
        int answer;

        answer = dungeon.getOptionIntSafe(
            "Say: 'Sure, I'll play your game...'",
            "Say: 'What's the catch for this game?'",
            "Ignore the voice, you can find your own way out of this place...");
        if(answer == 3)
        {
            dungeon.fancyOutput(
                "You leave the mysterious voice to it's own and wander through the cave system aimlessly.\n" +
                "You continue to wander through the caves until you collapse of exhaustion...\n");
            return false;
        }
        
        dungeon.fancyOutput(
            "'How wonderful! I haven't had anyone to play with in such a long time...'\n" + 
            "'But before we start, lets establish the terms of our game.'\n" +
            "'So if you win I'll show you the way out of this cave to the next room, but if I win you stay here with me forever.'\n" +
            "'Are those terms acceptable?'\n");

        answer = dungeon.getOptionIntSafe(
            "Sure...",
            "Of course not!");
        
        if(answer == 2)
        {
            dungeon.fancyOutput(
                "The voice says: 'Well if we can't come to an agreement I guess I'll just leave you be...'\n" +
                "'Hopefully you can find your own way out of here...'\n"+            
                "You wander the caves until your eventual collapse.");
            return false;
        }
        
        
        
        dungeon.fancyOutput(
            "'You get one chance for this riddle.'\n" +
            "'If you get it right, you win but if you get it wrong, you lose.'");
        

        if(randomNum == 0)
        {
        dungeon.fancyOutput(
            "'What asks but never answers?'");
            String r1 = scan.nextLine();
            r1 = r1.toUpperCase();
            if(r1.contains("OWL"))
            {
                dungeon.fancyOutput("'Correct...'" +
                "'You win.'\n");
                dungeon.fancyOutput("A small light appears next to you." +
                "'The light will show you the way out.'");
                return true;
            }   
            else
            {
                dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                return false;
            }

        }
        
        if(randomNum == 1)
        {
            dungeon.fancyOutput(
                "'Who makes it, has no need for it.'\n" +
                "'Who buys it, has no use for it.'\n" +
                "'Who uses it can neither see nor feel it.'\n" +
                "'What is it?'");
            String r2 = scan.nextLine();
            r2 = r2.toUpperCase();
            if(r2.contains("COFFIN"))
            {
                dungeon.fancyOutput("'Correct...'\n"+
                    "'You win.'\n");
                dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");    
                return true;
            }
            else
            {
                dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                return false;
            }
            

        
            

            
        }
        if(randomNum == 2)
        {
            dungeon.fancyOutput(
                "'What kind of room has no doors or windows?'");
            String r3 = scan.nextLine();
            r3 = r3.toUpperCase();
            if(r3.contains("MUSHROOM"))
            {
                dungeon.fancyOutput("'Correct...'\n"+
                "'You win.'\n");
                dungeon.fancyOutput("A small light appears next to you." +
                "'The light will show you the way out.'");
                return true;
            }
            else
            {
                dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                return false;
            }

        }
        if(randomNum == 3)
        {
            dungeon.fancyOutput(
                "'Feed me and I live, yet give me a drink and I die.'\n" +
                "'What am I?'\n");
            String r4 = scan.nextLine();
            r4 = r4.toUpperCase();
            if(r4.contains("FIRE"))
            {
                dungeon.fancyOutput("'Correct...'\n"+
                "'You win.'\n");
                dungeon.fancyOutput("A small light appears next to you." +
                "'The light will show you the way out.'");
                return true;
            }
            else
            {
                dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                return false;
            }
           
    
            
        }
        if(randomNum == 4)
        {
            dungeon.fancyOutput(
                "Voiceless it cries,\n"+
                "Wingless flutters,\n" +
                "Toothless bites,\n" +
                "Mouthless mutters.'\n");
            dungeon.fancyOutput("'What is it?'");
            String r5 = scan.nextLine();
            r5 = r5.toUpperCase();
            if(r5.contains("WIND"))
            {
                dungeon.fancyOutput("'Correct...'\n"+
                "'You win.'\n");
                dungeon.fancyOutput("A small light appears next to you." +
                "'The light will show you the way out.'");
                return true;
            }
            else
            {
                dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                return false;
            }
            
        }
        if(randomNum == 5)
        {
            dungeon.fancyOutput(
                "'A box without hinges, key or lid,\n" +
                "Yet golden treasure inside is hid.\n" +
                "What is it?'");
                String r6 = scan.nextLine();
                r6 = r6.toUpperCase();
                if(r6.contains("EGG"))
                {
                    dungeon.fancyOutput("'Correct...'\n" +
                    "'You win.'\n");
                    dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                    return false;
                }
                
        }
        if(randomNum == 6)
        {
            dungeon.fancyOutput(
                "'What has roots nobody see,\n" +
                "Is taller than trees.\n" +
                "Up, up, up it goes,\n" +
                "And yet never grows?");
                String r7 = scan.nextLine();
                r7 = r7.toUpperCase();
                if(r7.contains("MOUNTAIN"))
                {
                    dungeon.fancyOutput("'Correct...'\n" +
                    "'You win.'\n");
                    dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                    return false;
                }
                
        }
        if(randomNum == 7)
        {
            dungeon.fancyOutput(
                "'What can you hear but not touch or see?'");
                String r8 = scan.nextLine();
                r8 = r8.toUpperCase();
                if(r8.contains("VOICE"))
                {
                    dungeon.fancyOutput("'Correct...'\n" +
                    "'You win.'\n");
                    dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                    return false;
                }
                
        }
        if(randomNum == 8)
        {
            dungeon.fancyOutput(
                "'I have keys but no locks.\n" +
                "I have space but no room.\n" +
                "You can enter but not go outside.\n" +
                "What am I?'");
                String r9 = scan.nextLine();
                
                r9 = r9.toUpperCase();
                if(r9.contains("KEYBOARD"))
                {
                    dungeon.fancyOutput("'Correct...'\n" +
                    "'You win.'\n");
                    dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                    return false;
                }
                
        }
        if(randomNum == 9)
        {
            dungeon.fancyOutput(
                "'How many seconds are there in a year?'\n");
                String r10 = scan.nextLine();
                if(r10.contains("12"))
                {
                    dungeon.fancyOutput("'Correct...'\n" +
                    "'You win.'\n");
                    dungeon.fancyOutput("A small light appears next to you." +
                    "'The light will show you the way out.'");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput(
                    "'Wrong answer! You lose'\n" +
                    "'Now you get to stay here, forever...'\n");
                    return false;
                }
                
        }

        dungeon.fancyOutput(
            "'Wrong answer! You lose'\n" +
            "'Now you get to stay here, forever...'\n");
        return false;
    }
    }

