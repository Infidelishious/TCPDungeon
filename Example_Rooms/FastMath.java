/**
 * Author: Ian Glow
 * Class: FastMath
 */

import java.util.ArrayList;
import javax.net.ssl.ExtendedSSLSession;
import java.lang.reflect.*;

public class FastMath extends Room
{
    private long time;
    private Player player;
    int wrong = 0;

    public String getAuthor()
    {
        return "Ian Glow";
    }

    public String getRoomName()
    {
        return "Fast Math";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {
        this.player = player;

        dungeon.fancyOutput(
            "As you enter the room a large goblin rushes at you and pushes you to the floor!\n" +
            "He begins to strangle you!\n");

        dungeon.waitForEnter();
        
        //+
        int a = (int)(Math.random() * 99) + 1;
        int b = (int)(Math.random() * 99) + 1;
        dungeon.fancyOutput("He screams: 'Whats " + a + " + " +  b + "!'");

        time = System.currentTimeMillis();
        int answer = dungeon.getIntSafe();

        if(!checkIfAlive(a+b == answer))
            return false;
        
        //*
        a = (int)(Math.random() * 20) + 1;
        b = (int)(Math.random() * 10) + 1;
        dungeon.fancyOutput("He screams: 'Whats " + a + " * " +  b + "!'");

        time = System.currentTimeMillis();
        answer = dungeon.getIntSafe();

        if(!checkIfAlive(a*b == answer))
            return false;

        //-
        a = (int)(Math.random() * 99) + 60;
        b = (int)(Math.random() * 50) + 1;
        dungeon.fancyOutput("He screams: 'Whats " + a + " - " +  b + "!'");

        time = System.currentTimeMillis();
        answer = dungeon.getIntSafe();

        if(!checkIfAlive(a-b == answer))
            return false;

        //-
        dungeon.fancyOutput("He screams: 'Whats color is Chartreuse?!'");

        time = System.currentTimeMillis();
        answer = dungeon.getOptionIntSafe("Redish Purple", "Greenish Yellow", "Blueish Orange", "Dark Burgandy");

        if(!checkIfAlive(answer == 2))
            return false;
       
        dungeon.fancyOutput(
            "He lets go of you abruptly and stands up\n" +
            "'I'm sorry " + player.getName() + ", I have a burining passion for knowledge.'\n"+
            "'I guess im a little over excitable...' he adds sheepishly.");

        dungeon.fancyOutput("You reply:");
        answer = dungeon.getOptionIntSafe("I... I dont understad...", "Please leave.", "I'm sueing");

        if(answer == 1)
            dungeon.fancyOutput("He says: 'If you knew as much as I do you would...'");
        else if(answer == 2)
            dungeon.fancyOutput("He says: 'I guess... So long " + player.getName() + "!'");
        else
            dungeon.fancyOutput("He says: 'I'll have my people call your people.'");

        dungeon.fancyOutput("The goblin then disappears in a puff of smoke...");
        return true;
    }

    public boolean checkIfAlive(boolean correct)
    {
        if(System.currentTimeMillis() - time > 5000) //5sec
        {
            dungeon.fancyOutput("It seems like you took too long to answer and he is now choking you harder!");
            wrong++;
        }
        else if(!correct)
        {
            dungeon.fancyOutput("It seems like you answered wrong and he is now choking you harder!");
            wrong++;
        }
        else
        {
            dungeon.fancyOutput("He mutters 'correct'...");
        }

        if(wrong == 2)
        {
            dungeon.fancyOutput("You black out...", 100);
            dungeon.waitForEnter();

            if(player.getHealth() > 1)
            {
                dungeon.fancyOutput("You wake up hurt many hours latter. The goblin left you a note:");
                dungeon.fancyOutput("'I'm sorry " + player.getName() + ", I have a burining passion for knowledge'");
                player.giveItem("Goblin's Note");
            }
            return false;
        }

        return true;
    } 

}