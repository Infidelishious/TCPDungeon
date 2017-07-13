/**
 * Author: Ian Glow
 * Class: GuessingGame
 */

import java.util.ArrayList;
import javax.net.ssl.ExtendedSSLSession;
import java.lang.reflect.*;

public class GuessingGame extends Room
{
    public String getAuthor()
    {
        return "Ian Glow";
    }

    public String getRoomName()
    {
        return "Guessing Game";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {
        dungeon.fancyOutput(
            "As you enter the room the doors slam shut behind you and a voice booms:\n" +
            "'SHOW ME WHAT YOU GOT! GUESS THE NUMBER IM THINKING OF IN 7 GUESSES OR BE INSINERATED!'\n");

        dungeon.fancyOutput("You, " + player.getName() + ", begin to sweat...\n", 100);
        dungeon.pause(300);

        dungeon.fancyOutput("The voice continues:\n" +
            "'BECUASE YOU ARE A BEING OF LIMITED INTELLIGNCE YOU GET A HINT!'\n" + 
            "'THE NUMBER IS BETWEEN 0 AND 100!'\n'NOW SHOW ME WHAT YOU GOT!!!'\n");

        int number = (int)(Math.random() * 99) + 1;
        int guesses = 7;

        while(guesses > 0)
        {
            if(guesses > 1)
                dungeon.fancyOutput("" + guesses + " GUESSES LEFT! WHAT IS YOUR GUESS?");
            else
                dungeon.fancyOutput("ONE GUESS LEFT! DO NOT FAIL ME! WHAT IS YOUR GUESS?");

            int guess = dungeon.getIntSafe();

            if(guess == number)
            {
                dungeon.fancyOutput("'YOU HAVE GOT IT! HERE IS YOUR PRIZE!'");
                player.giveItem("TICKET TO SEE OPRAH IN 3042 C.E.");
                return true;
            }
            else if(guess > number)
            {
                dungeon.fancyOutput("NO! YOUR GUESS IS TO HIGH!");
            }
            else
            {
                dungeon.fancyOutput("NO! YOUR GUESS IS TO LOW!");
            }

            guesses--;
        }

        dungeon.fancyOutput("'YOU DO NOT HAVE WHAT WE WANT! PREPARE TO BE INSINERATED!'\n");
        dungeon.fancyOutput("The room begins to glow red hot...", 150);
        dungeon.pause(300);

        return false;
    }

}