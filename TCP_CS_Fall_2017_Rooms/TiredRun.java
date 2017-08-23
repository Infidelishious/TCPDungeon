import java.util.Scanner;

public class TiredRun extends Room
{  
    public String getAuthor()
    {
        return "Patricia Azevedo";
    }

    public String getRoomName()
    {
        return "Tired Run";
    }
    public boolean playerEnters(Player player) throws Exception
    {
        int energy = 0;
        dungeon.fancyOutput("You must keep going.");
        dungeon.fancyOutput("You cannot rest.");
        dungeon.fancyOutput("Watch your step.");
        dungeon.fancyOutput("You find yourself in a corridor. On the table in front of you there are three objects. A cup of brown sludge-like liquid sits all the way to the left. In the center there is a syringe of some sort of neon liquid, and on the right edge of the table there is a small box, the size of maybe a ring box.");
        dungeon.fancyOutput("1)Drink the sludge\n2)Use the syringe \n3)Open the box");
        Scanner lil = new Scanner(System.in);
        int choice = lil.nextInt();
        if(choice == 1)
        {
            energy = 15;
            int time = 10;
            dungeon.fancyOutput("The sludge turns out to be coffee. You feel hyped.");
            dungeon.fancyOutput("You start off down the hallway");
            dungeon.fancyOutput("You check your pathways for obstacles, and choose your path.");
            while(energy > 0)
            {   
                dungeon.fancyOutput("There appear to be 3 pathways. Though one seems more difficult than the others.");
                dungeon.fancyOutput("Enter path:");
                int path = lil.nextInt();
                if(path == 1)
                {
                    energy = energy - 3;
                    dungeon.fancyOutput("That was easy.");
                    time = time - 1;
                }
                else if(path == 2)
                {
                    energy = energy;
                    dungeon.fancyOutput("What doesn't kill you today will kill you eventually. That path didn't kill you today.");
                    time = time - 1;
                }
                else
                {
                   energy = energy - 1;
                   dungeon.fancyOutput("You aren't sure how to feel about that one.");
                   time = time - 1;
                }
                
            }
            if(time <= 0)
            {
                dungeon.fancyOutput("You didn't run fast enough. You collapse before the entrance and black out.");
                return false;
            }
            else
            {
                dungeon.fancyOutput("You burst through the end door, blood rushing.");
                return true;
            }
        }
        else if(choice == 2)
        {
            dungeon.fancyOutput("You use the syringe. You feel dizzy. You collapse to the ground. Your last thoughts turn to your failure, due to a harmless sedative.");
            return false;
        }
        else
        {
            energy = 20;
            int time = 10;
            dungeon.fancyOutput("You open the box to find some small bottles, and you proceed to drink one at random. You don't feel much different.");
            dungeon.fancyOutput("You start off down the hallway");
            dungeon.fancyOutput("You check your pathways for obstacles, and choose your path.");
            for(int ene = energy; ene > 0; ene--)
            {   
                dungeon.fancyOutput("There appear to be 3 pathways. Though one seems more difficult than the others.");
                dungeon.fancyOutput("Enter path:");
                int path = lil.nextInt();
                if(path == 1)
                {
                    energy = energy - 3;
                    dungeon.fancyOutput("That was easy.");
                    time = time - 1;
                }
                else if(path == 2)
                {
                    energy = energy;
                    dungeon.fancyOutput("What doesn't kill you today will kill you eventually. That path didn't kill you today.");
                    time = time - 1;
                }
                else
                {
                   energy = energy - 1;
                   dungeon.fancyOutput("You aren't sure how to feel about that one.");
                   time = time - 1;
                }
                
            }
            if(time <= 0)
            {
                dungeon.fancyOutput("You didn't run fast enough. You collapse before the entrance and black out.");
                return false;
            }
            else
            {
                dungeon.fancyOutput("You burst through the end door, blood rushing.");
                return true;
            }
        }
    }
}