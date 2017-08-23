import java.util.ArrayList;
import javax.net.ssl.ExtendedSSLSession;
import java.lang.reflect.*;
import java.util.Scanner;
public class AdventureDungeon extends Room
{
    private Player player;
    public String getAuthor()
    {
        return "Isabel Ehrlich";
    }
    public String getRoomName()
    {
        return "Adventure in the Labyrinth";
    }
    
    public boolean playerEnters(Player player) throws Exception
    {
        dungeon.fancyOutput("Hello " + player.getName() + "! \n Welcome to the Labyrinth");
        dungeon.fancyOutput("Which door do you go through: \n 0) Blue Door \n 1) Red Door");
        Scanner lucy = new Scanner(System.in);
        int choice = lucy.nextInt();
        if(choice == 0)
        {
            dungeon.fancyOutput("You went through the blue door.");
            dungeon.fancyOutput("You are eaten by a Leviathan.");
            return false;
        }
        else
        {
            dungeon.fancyOutput("You go through the red door.");
            dungeon.fancyOutput("Now you: \n 2) Go through the Iron Gates\n 3) Go down a set of marble stairs");
            choice = lucy.nextInt();
        }
        if(choice==2)
        {
            dungeon.fancyOutput("You went through the Iron Gates");
            dungeon.fancyOutput("You have wandered in to Hades");
            dungeon.fancyOutput("As you entered you saved Persephone from the furies");
            dungeon.fancyOutput("You are granted escape from The Labyrinth.");
            choice=lucy.nextInt();
            return true;
        }
        else if (choice== 3)
        {
            dungeon.fancyOutput("You went down the marble stairs");
            dungeon.fancyOutput("At the top of the stairs you found 2 vials. \n You pick them up.");
            dungeon.fancyOutput("Now you: \n4) Go left through a grove of Fruit Trees");
            dungeon.fancyOutput("5) Go right through a dark tunnel ");
             choice = lucy.nextInt();
        }
        if(choice==4)
        {
            dungeon.fancyOutput("You went through the Grove of Fruit Trees");
            dungeon.fancyOutput("You have escaped The Labyrinth you live but lose your memory.");
            choice = lucy.nextInt();
            return true;
            
        }
        else if(choice==5)
        {
            dungeon.fancyOutput("You went through the dark tunnel");
            dungeon.fancyOutput("You have been attacked by a chimera luckily,");
             dungeon.fancyOutput("you found 2 vials of gorgons blood there is one catch ");
            dungeon.fancyOutput("the blood from the left side of a gorgon is horribly toxic and will kill you \n painfully");
            dungeon.fancyOutput("but the blood from the right will heal any injury.");
            dungeon.fancyOutput("The bottles look and feel identical except they are marked with a 1 or a 2");
            dungeon.fancyOutput("if you choose bottle one type 6 if you choose bottle two type 7");
            choice = lucy.nextInt();
        }
        if(choice==6)
        {
            dungeon.fancyOutput("You chose bottle one.");
            dungeon.fancyOutput("It is from the right side of the gorgon\n You are healed you will continue on your journey");
            dungeon.fancyOutput("You look around you see 2 caves cave 1 has still almost stagnant air while");
            dungeon.fancyOutput("cave 2 outputs a cool refreshing breeze");
            dungeon.fancyOutput("If you pick cave one type 8 \n If you pick cave two type 9");
            choice = lucy.nextInt();
        }
        else if(choice==7)
        {
            dungeon.fancyOutput("You chose bottle two.");
            dungeon.fancyOutput("It is from the left side of the gorgon \n You die a painful death."); 
            choice = lucy.nextInt();
            return false;
        }
         if(choice == 8)
        {
            dungeon.fancyOutput("You chose cave 1.");
            dungeon.fancyOutput("It is a dragon's hoard full of gold and jewels.");
            dungeon.fancyOutput("If you touch anything the dragon will know and will likely kill you but");
            dungeon.fancyOutput("if you sit and wait without touching anything she may help you for a price.");
            dungeon.fancyOutput("In the dragon's hoard you notice magical artifacts from all over the world");
            dungeon.fancyOutput("they could help with your quest to escape");
            dungeon.fancyOutput("You have 2 choices 1) Either take the objects and try to escape before the dragon returns");
            dungeon.fancyOutput("or 2) wait patiently and hope to bargain with the dragon for help escaping ");
            dungeon.fancyOutput("If you choose to steal the artifacts type 10");
            dungeon.fancyOutput("If you choose to wait and hope type 11");
           choice = lucy.nextInt();           

        }
        else if(choice == 9)
        {
            dungeon.fancyOutput("You chose cave 2.");
            dungeon.fancyOutput("It leads into a garden full of sweet-smelling red flowers.");
            dungeon.fancyOutput("As you look around you start to feel drowzy...");
            dungeon.fancyOutput("You have wandered into a field of sleep poppies and will remain there for eternity.");
            choice = lucy.nextInt();
            return false;
        }
        if(choice== 10)
        {
            dungeon.fancyOutput("You chose to steal the objects... obviously you died.");
            dungeon.fancyOutput("Don't you know anything about dragons they are very possive of their hoards");
            dungeon.fancyOutput("stealing from them is nearly always a death sentence.");
            choice= lucy.nextInt();
            return false;
            
        }
        else if(choice == 11)
        {
            dungeon.fancyOutput("You chose to wait and hope... luckily you caught her on a good day you live. :)");
            dungeon.fancyOutput("The dragon introduces herself as Azidil she asks how you ended up in purgatory.");
            dungeon.fancyOutput("You say \"I have no idea I just woke up here\" ");
            dungeon.fancyOutput("Azidil responds \"Well then I suppose you want my help in getting out don't you?\"");
            dungeon.fancyOutput("\"If you want my help you are going to have to aid me first.\"");
            dungeon.fancyOutput("Do you agree to do an unspecified task for Azidil or do you leave and find your own way?");
            dungeon.fancyOutput("If you accept Azidil's terms type 12 if you don't type 13");
            choice= lucy.nextInt();
        }
        if(choice== 12)
        {
            dungeon.fancyOutput("You have chosen to do a task in exchange for Azidils help.");
            dungeon.waitForEnter();
            int a = (int)(Math.random() * 100) + 1;
            int b = (int)(Math.random() * 100) + 1;
            dungeon.fancyOutput("She asks 'Whats " + a + " + " +  b + "!'");
            int answer = dungeon.getIntSafe();
            if(answer == a + b)
            {
                dungeon.fancyOutput("Since you have answered correctly \n" + 
                "she has decided to gift you 2 things from that hoard an enchanted map and a huge saphire. \n"+
                "The map shows you the route out of purgatory");
                dungeon.fancyOutput("With these gifts you escape and keep your memories.");
                dungeon.fancyOutput("THE END?");
                player.giveItem("Dragons Jewel");
                return true;
            } 
            else if(player.hasItem("Goblin's Note"))
            {
                dungeon.fancyOutput("You answered incorrectly but since you have met The Goblin you get one more chance...");
                dungeon.fancyOutput("She asks: 'Whats color is Sea Foam?'");
                answer = dungeon.getOptionIntSafe("Blue Green", "Flourescent Green Blue", "Redish Blue", "Flourescent Yellow");
                if(answer == 2)
                {
                    dungeon.fancyOutput("You are shown out of the maze and live");
                    return true;
                }
                else
                {
                    dungeon.fancyOutput("You fall from her back and break half your bones");
                    return false;
                }
            }              
            else
            {
                dungeon.fancyOutput("You answered incorrectly which annoys Azidil to the point of violence.\n"+
                "She whacked you with her tail.. you hit a stalagmite where you loose blood and break half your bones");
                return false;
            }
        }
            else if(choice== 13)
            {
            dungeon.fancyOutput("You chose to leave you are lost and fall down a ravine loosing blood \n"+
            "and breaking half your bones");
            return false;
            }
            return true;
        }
    }

