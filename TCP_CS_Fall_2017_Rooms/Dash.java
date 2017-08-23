/**
*Author: Sarah Bachelor
Class: Dash
 */

 import javax.net.ssl.ExtendedSSLSession;
 import java.lang.reflect.*;
 import java.util.Arrays;
 import java.util.*;
 

public class Dash extends Room
{
    private Player player;
    private long time;
    int timeToDash;
    int roomHealth = 3;


    public String getAuthor()
    {
        return "Sarah Bachelor";
    }

    public String getRoomName()
    {
        return "Gotta Go Fast";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        this.player = player;
    
        dungeon.fancyOutput("When you enter, you are greeted with a row of axes swinging down from the ceiling, blocking your path to the exit.");

        dungeon.waitForEnter();

        dungeon.fancyOutput("[1, 2, 3, 4, 5]", 200);

        dungeon.fancyOutput("It seems like there is a gap every five seconds.\n" +
        ">Enter 1 to dash\n" +
        ">Enter 0 to reset dash");
        dungeon.waitForEnter();

        dungeon.fancyOutput("1");


        timeToDash = 5000;
        time = System.currentTimeMillis();
        int ret = dungeon.getIntSafe();

        if(ret == 0 )
        {
            playerEnters(null);
        }

        else if(!quickEnough())
            return false;

        getRandomTime();
        if(!quickEnough())
            return false;

        getRandomTime();
        if(!quickEnough())
            return false;

        getRandomTime();
        if(!quickEnough())
            return false;

            getRandomTime();
        if(!quickEnough())
            return false;

        dungeon.fancyOutput("By the time you reach the door, you are sweating profusely. At least all your limbs are still attached. Mostly.");

    return true;
    }


    public boolean quickEnough()
    {
        if(System.currentTimeMillis() - time > timeToDash + 2000)
        {
            dungeon.fancyOutput("You fail to dash at the correct time and an axe cuts you as you pass.");
            roomHealth--;
        }
        else if(System.currentTimeMillis() - time < timeToDash - 2000)
        {
            dungeon.fancyOutput("You fail to dash at the correct time and an axe cuts you as you pass.");
            roomHealth--;
        }
        else
        {
            dungeon.fancyOutput("You pass the axe unscathed.");
        }

        if(roomHealth == 0)
        {
            return false;
        }

        return true;
    }

    public void getRandomTime()
    {

        int range = (int)(Math.random() * 10);
        if(range <= 0)
            range++;


        int[] timeToDasharr = new int [range];


        for(int i = 0; i <= timeToDasharr.length - 1; i++)
            timeToDasharr[i] = i + 1;

    
        int a;
        String str = new String();
        str = Arrays.toString(timeToDasharr);
        a = timeToDasharr.length - 1;

        dungeon.fancyOutput(str, 90);

        dungeon.fancyOutput(">Enter 1 to dash\n" +
        ">Enter 0 to reset dash");

        dungeon.waitForEnter();
        dungeon.waitForEnter();

        
        dungeon.fancyOutput("1");


        timeToDash =timeToDasharr.length * 1000;
        time = System.currentTimeMillis();

        int ret = dungeon.getIntSafe();

        if(ret== 0 )
        {
            getRandomTime();
        }

    }
}