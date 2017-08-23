/**
 * Author: Maximus-slayinpus
 * Class: MaxRoom
 */

import java.util.ArrayList;
import javax.net.ssl.ExtendedSSLSession;
import java.lang.reflect.*;

public class Torches extends Room
{
    private String torchOrder;
    public String getAuthor()
    {
        return "Max Wilkinson";
    }

    public String getRoomName()
    {
        return "Torches";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {
        dungeon.fancyOutput("You, pushing onwards, stumble into a pitch black room");
        dungeon.pause(1000);
        dungeon.fancyOutput("Before your eyes ajust to the low lighting, the room explodes in a flash of orange glow");
        dungeon.pause(1000);
        dungeon.fancyOutput("As you open your eyes, you relize that there are 5 torches alit in the room");
        dungeon.pause(2000);
        dungeon.fancyOutput("Intrigued by the enticing glow of the torches, you walk towards them and notice a wooden sign that reads:\n");
        dungeon.pause(2000);
        dungeon.fancyOutput("'Welcome to the tomb of King Knuth III.  Passage will only be granted to those that are able to solve the problem laid before you'");
        dungeon.pause(3000);
        dungeon.fancyOutput("'If you're ready, place your palm against the indent in the stone slab in front of the room'\n");
        dungeon.fancyOutput("0) Place hand");
        dungeon.fancyOutput("1) do nothing");
        int userInput = dungeon.getIntSafe();
        if(userInput == 1)
        {
            dungeon.fancyOutput("The ground starts to shake and large chunks of stone start falling from the roof...");
            int test = (int)(Math.random() * 4);
            if(test == 1)
            {
                dungeon.fancyOutput("You look up towards the ceiling just as a rock lands on top of you");
                dungeon.fancyOutput("You crawl through the rubble and manage to find the exit door but remain severly injured");
                return false;
            }
            dungeon.fancyOutput("Being the agile and lucky individual you are, you manage to sprint to the stone and place your palm against it");
            dungeon.fancyOutput("The room immediately ceases to shake");
            dungeon.pause(2000);
        }
        else if(userInput != 0)
        {
            dungeon.fancyOutput("You feel a sharp pain in the back of your head... to stop the pain, you rush to the stone to place your palm upon it");
            dungeon.fancyOutput("(Perhaps the pain was caused by your lack of a proper input...)");
            dungeon.pause(2000);
        }

        dungeon.fancyOutput("Words instantly start appearing in the wall... almost like they were being ingraved in front of your eyes");
        dungeon.pause(1500);
        dungeon.fancyOutput("'Before you lies 5 torches..''", 35);
        dungeon.pause(700);
        dungeon.fancyOutput("'You must extinguish the torches in the correct order to pass this room'", 35);
        dungeon.pause(700);
        dungeon.fancyOutput("'To find the correct order, you must derive the answer from the hints provided'\n", 35);
        dungeon.pause(700);
        dungeon.waitForEnter();
        dungeon.fancyOutput("Correctly answering this question will award you with the right answer:");
        dungeon.pause(2000);


        dungeon.fancyOutput("What is the answer to: (10 * 12 + 3) % 2"); //FIRST QUESTION
        if(askAnswers("0", "5", "10", "1", 3))
            dungeon.fancyOutput("After inputing your answer, the wall reads: 'The FIRST torch to pull is the 4th torch'");
        else if(getHurt())
            return false;
        else
            dungeon.fancyOutput("The room stops shaking and the wall reads: 'The FIRST torch to pull is the 4th torch'");
        torchOrder = "" + 4;
            dungeon.fancyOutput("Known order so far: " + torchOrder + "\n");


        dungeon.fancyOutput("'Here is the second question:'"); // SECOND QUESTION
        dungeon.fancyOutput("How about a riddle this time?: Which of the following is faster than an FRS going downhill? ");
        if(askAnswers("A tesla" ,  "An imported Civic" , "Derek's car", "Trick question... (Does not compile)", 0))
            dungeon.fancyOutput("After inputing your answer, the wall reads: 'The SECOND torch to pull is the 1st torch'");
        else if(getHurt())
            return false;
        else
            dungeon.fancyOutput("The room stops shaking and the wall reads: 'The SECOND torch to pull is the 1st torch'");

        torchOrder += 1;
        dungeon.fancyOutput("Known order so far: " + torchOrder + "\n");



        dungeon.fancyOutput("'Here is the third question:'"); // THIRD QUESTION
        dungeon.fancyOutput("What happend to the grape when it was stepped on?");
        dungeon.fancyOutput("(Hint: pick the one that makes the most sense for a joke)");
        if(askAnswers("It was forced into the stone-cold pavement" , "It let out a little wine ;)" , "The following quote was made: 'Life is too short not to eat jam out of the jar'" , "Brennan's mom located said grape and blamed Max for it unfortunately being smashed into the carpet :/" , 1))
            dungeon.fancyOutput("After inputing your answer, the wall reads: 'The THIRD torch to pull is the 2nd torch'");
        else if(getHurt())
            return false;
        else
            dungeon.fancyOutput("The room stops shaking and the wall reads: 'The THIRD torch to pull is the 2nd torch'");

        torchOrder += 2;
        dungeon.fancyOutput("Known order so far: " + torchOrder + "\n");


        dungeon.fancyOutput("'Here is the forth question:'"); // FORTH QUESTION
        dungeon.fancyOutput("Picture the following sceanario: Derek and Brennan role up to a stoplight. Derek starts reving his engine, (thus initiating a race)... What does derek request if he wins the race?");
        if(askAnswers("A cup of coffee" , "A full tank of gass" , "The answers to a few leetcode questions" , "Nothing, he had his poker face on. This wasnt his first rodeo" , 2))
            dungeon.fancyOutput("After inputing your answer, the wall reads: 'The FORTH torch to pull is the 5th torch'");
        else if(getHurt())
            return false;
        else
            dungeon.fancyOutput("The room stops shaking and the wall reads: 'The FORTH torch to pull is the 5th torch'");

        torchOrder += 5;
        dungeon.fancyOutput("Known order so far: " + torchOrder + "\n");


        dungeon.fancyOutput("'Here is the final question:''"); // FIFTH QUESTION
        dungeon.fancyOutput("Just as a dog is a man's best friend, johnny's best 'friend' is: ");
        if(askAnswers("His favorite pencil", "TacoBell serving plates (so he can drift his front-wheel drive car", "Max? probably not...", "A cold root-beer with his old man", 1))
            dungeon.fancyOutput("After inputing your answer, the wall reads: 'The LAST torch to pull is the 3rd torch'");
        else if(getHurt())
            return false;
        else
            dungeon.fancyOutput("The room stops shaking and the wall reads: 'The LAST torch to pull is the 3rd torch'");

        torchOrder += 3;
        dungeon.fancyOutput("Known order so far: " + torchOrder + "\n");

        
        dungeon.fancyOutput("You proceed to extingush the torches in the order that you discovered");
        dungeon.fancyOutput("The wall reads: 'Congratulations on passing this room!  I, King Brandank, apluad you and grant you passage onwards.");
        dungeon.fancyOutput("Please, before your departure, accept my gift of gratitude\n\n");
        player.giveItem("Rusty Shiv");
        //dungeon.fancyOutput("(Sorry for the extensive amount of text... I hope you got a good laugh out of this :D)");
        return true;



    }

    public boolean getHurt()
    {
        int test = (int)(Math.random() * 4);
        if(test == 1)
        {
            dungeon.fancyOutput("You were splattered by a rock and crumple to the ground ");
            return true;
        }
        else
        {
            dungeon.fancyOutput("You, by sheer luck, managed to evade the falling debris.");
            return false;
        }
    }
    public boolean askAnswers(String a, String b, String c, String d, int answer)
    {
        dungeon.fancyOutput("\n");
        dungeon.fancyOutput("0) " + a);
        dungeon.fancyOutput("1) " + b);
        dungeon.fancyOutput("2) " + c);
        dungeon.fancyOutput("3) " + d);
        int test = dungeon.getIntSafe();
        if(test == answer)
        {
            dungeon.fancyOutput("Correct! Great job");
            return true;
        }
        else
        {
            dungeon.fancyOutput("The room starts to shake and large chunks of stone fall from the ceiling");
            return false;
        }
    }
}