import java.util.Scanner;
import javax.net.ssl.ExtendedSSLSession;
import java.lang.reflect.*;

public class GalacticGuess extends Room
{
 
    public String getAuthor()
    {
        return "Mackenzie Mattila";
    }

    public String getRoomName()
    {
        return "Galactic Guess";
    }
    
    public boolean playerEnters(Player player) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

        dungeon.fancyOutput("* * * * * * * * * * * * * * * * * * *");
        dungeon.fancyOutput("You don't know how, but you were teleported into outer space!");
        dungeon.fancyOutput("* * * * * * * * * * * * * * * * * * *");
        //delay
        System.out.println("");
        dungeon.fancyOutput("Oh, wait, it's just a space themed room.");
        System.out.println("");
        //delay

        dungeon.fancyOutput("A little kid half your height is sitting on the floor...");
        dungeon.fancyOutput("When he sees you, he stands up and stomps towards you...");
        dungeon.fancyOutput("He's in an alien costume. It's poorly made and has two orange stains on it...");
        //press enter to continue
        dungeon.waitForEnter();

        dungeon.fancyOutput("He began to speak.");   
        System.out.println("");     
        dungeon.fancyOutput("'What do you have on you?'");
        dungeon.fancyOutput("1. Tell the Truth");
        dungeon.fancyOutput("2. Lie");
        int choice1 = scanner.nextInt();

        if(choice1 == 1)
        {
            dungeon.fancyOutput("He sighs, showing no interest in whatever you may hold.");
            return howToPass();
        }
        else
        {
            dungeon.fancyOutput("He sees through your lie and his eyebrows narrow...");
            dungeon.fancyOutput("He kicks you in the shin. It doesn't hurt much but you feel a little dissapointed in yourself.");
            return howToPass();
           
        }
        //tell the truth or lie, if lie he kicks you in the shin. 

    }
    public boolean howToPass()
    {
        Scanner scannner = new Scanner(System.in);
        System.out.println("");
        dungeon.fancyOutput("'You can only pass me if you can guess what planet I'm from!'");
        dungeon.fancyOutput("'I bet you my lucky alien toe that you can't guess it!'");
        System.out.println("");
        dungeon.fancyOutput("'You get one hint! I'm not from Earth! You get four guesses!'");
        dungeon.fancyOutput("(Start with a capital letter! We aren't animals)");
        int guesses = 4;
        String planet = planet();
        while(guesses > 0)
        {
            String guess = scannner.nextLine();
            if(guess.equals(planet))
            {
                dungeon.fancyOutput("He lets out a sigh. You realize you got it right...");
                return secondQuestion();
                
            }
            else if(guess.equals("Pluto"))
            {
                dungeon.fancyOutput("Pluto? My teacher told me Pluto isn't a planet!" +
                                    "Guess again!");
                guesses--;
            }
            else
            {
            guesses--;
            dungeon.fancyOutput("'Incorrect! Guess again!'");
            }
        }
    
        dungeon.fancyOutput("'You Failed!' He yelled. He kicks you again and you fall to the ground and inconveniently hit your head...");
        return false;
    }

    public static String planet()
    {
        String[] planets = new String[7];
        planets[0] = "Mercury"; 
        planets[1] = "Venus";
        planets[2] = "Mars";
        planets[3] = "Jupiter";
        planets[4] = "Saturn";
        planets[5] = "Uranus";
        planets[6] = "Neptune";

        int randomPlanet = (int)(Math.random() * 6) + 1;
        return planets[randomPlanet];

    }
    public boolean secondQuestion()
    {
        dungeon.fancyOutput("'Fine, you got me. But before you leave...'" +
                                "He pulls out a lazer pointer taped to a nerf gun."
                                + "'What color is that planet?!'");

        Scanner scannnner = new Scanner(System.in);
        String answer = scannnner.nextLine();

        dungeon.fancyOutput("'That is....that is....''");
        dungeon.waitForEnter();
        //click enter

        dungeon.fancyOutput("'Uh...I don't know what color it is'");
        dungeon.fancyOutput("He looks upset, not only did you guess right but now he feels dumb.");
        dungeon.fancyOutput("Do you...");
        dungeon.fancyOutput("1. Try to cheer him up");
        dungeon.fancyOutput("2. Mock him and leave");
        int answer2 = scannnner.nextInt();
        if(answer2 == 1)
        {
            dungeon.fancyOutput("You bend down and pat him on the back...");
            dungeon.fancyOutput("He rips off a stained piece of fabric and gives you his lucky alien toe");
            dungeon.fancyOutput("He smiles, and you head to the exit.");
                return true;

        }
        else
        {
            dungeon.fancyOutput("You insult the little boy and make your way out of the room...");
            dungeon.fancyOutput("As you walk away, you hear him start to cry...");
            dungeon.fancyOutput("You turn around and...");
            dungeon.waitForEnter();
            dungeon.fancyOutput("BOOM!");
            dungeon.fancyOutput("You were shot in the eye with the nerf gun!");
            return false;

        }
            
    }

}