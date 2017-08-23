import javax.net.ssl.ExtendedSSLSession;

/**
 * Author: Morgan Evans
 * Class: Battle
 */

public class Battle extends Room
{
    String playerBird;
    String enemyBird;
    String yourBird;

    public String getAuthor()
    {
        return "Morgan Evans";
    }

    public String getRoomName()
    {
        return "Birdy Battles";
    }
   
    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {

        dungeon.fancyOutput(
            "Upon entering the room you see a large metal cage with a few noisy birds hopping around inside.\n" +  "You approach a shriveled old man with a cane standing beside the cage\n" + "Old Man: The names Seymore... Say, how'd you like to bet on one me birds?\n", 35
        );
        dungeon.pause(1000);
        int answer;
        answer = dungeon.getOptionIntSafe(
            "Can I leave if I win?",
            "As long as I get first pick"
        );
        if(answer == 1)
        {
            dungeon.fancyOutput(
                "Seymore: Aye. It's a deal\n" + 
                "Seymore: I know these birds better than I know myself so it wouldn't be fair for me to have first bet.\n" + 
                "Seymore: Pick yer bird!", 20
            );
          
        }
        else
        {
            dungeon.fancyOutput(
                "Seymore: Well of course yee get to pick first\n" + 
                "Seymore: Pick yer bird!"
            );

            
        }
        int birb;
        birb = dungeon.getOptionIntSafe(
            "Pick Eagle",
            "Pick Falcon",
            "Pick Vulture"
        );
            
            if(birb == 1)
            {
                yourBird = "EAGLE";
            }
            else if(birb == 2)
            {
                yourBird = "FALCON";
            }
            else
            {
                yourBird = "VULTURE";
            }
            dungeon.fancyOutput("The " + yourBird + " fights for your freedom!\n");
            dungeon.fancyOutput("Seymore: Oh... Umm... Fine, I didn't want that one anyway...", 75);            dungeon.fancyOutput("Seymore: I choose me hawk!", 15);
            dungeon.fancyOutput("Seymore: So what if that wasn't an option. This is my room, what are you gonna do about it\n", 30);

            Bird enemyBird = new Bird("Hawk", 20, 7, 3);
            Bird playerBird = new Bird(yourBird, 20, 5, 5);
            dungeon.fancyOutput("--------------------");

            dungeon.fancyOutput("TWO BIRDS ENTER. ONE BIRD LEAVES. IT'S " + yourBird + " VS HAWK!!!\n" + "The birds fly into the battle cage and get into positions\n" + playerBird.name() + ": Scercawww!\n" + "Hawk: SCREEEE!!!");

            int aHealth = playerBird.getHealth();
            int bHealth = enemyBird.getHealth();
            int choice;

            while(aHealth > 0 && bHealth > 0)
            {
                int aAttack = (int) (playerBird.getDamage() * Math.random() + 2);
                int bAttack = (int) (enemyBird.getDamage() * Math.random() + 2);
                int aDefend = (int) (playerBird.defend() * Math.random() + 3);
                int bDefend = (int) (enemyBird.defend() * Math.random() + 2);
                choice = dungeon.getOptionIntSafe(
                    "Attack",
                    "Heal");
                if(choice == 1)
                {
                    bHealth = bHealth - aAttack;
                    if(aAttack == 2)
                    {
                        dungeon.fancyOutput("Its not very effective.");
                    }
                    dungeon.fancyOutput(playerBird.name() + "S slash attack did " + aAttack + " damage!\n" + "Hawk has " + bHealth + " left!\n");
                }
                else
                {
                    aHealth = aHealth + aDefend;
                    dungeon.fancyOutput(playerBird.name() + "S health was boosted to " + aHealth + "!\n");
                }
                if(bHealth <= 0 || aHealth <= 0)
                {
                    break;
                }
                dungeon.pause(500);
                dungeon.fancyOutput("Waiting on enemy.\n");
                dungeon.pause(1500);

                int enemyMove = (int) (Math.random() * 4);
                if(enemyMove == 0)
                {
                    aHealth = aHealth - bAttack;
                    dungeon.fancyOutput("HAWKS slash attack did " + bAttack + " damage!\n" + playerBird.name() + " has " + aHealth + " left!\n");
                }
                else if(enemyMove == 1)
                {
                    bHealth = bHealth + bDefend;
                    dungeon.fancyOutput("HAWKS health was reinforced to " + bHealth + "!\n");
                }
                else
                {
                    aHealth = aHealth - bAttack;
                    dungeon.fancyOutput("HAWKS dive attack did " + bAttack + " damage!\n" + playerBird.name() + " has " + aHealth + " left!\n");
                }
            }
            if(bHealth <= 0)
            {
                dungeon.fancyOutput("The hawk faints and you are victorious!\n" + "Seymore: I can see you've got an eye fer birds. Well... a deals a deal- you're free to go!");
                return true;
            }
            else if(aHealth <= 0)
            {
                dungeon.fancyOutput("You watch your bird faint and turn to Seymore\n" + "As you turn Seymore smacks you hard with his cane");
                return false;
            }    

            return true;
    }

    
}
class Bird
{
   public String name;
   public int health;
   public int damage;
   public int defend;

   public Bird(String n, int h, int d, int df)
   {
       name = n;
       health = h;
       damage = d;
       defend = df;
   }

    public int getDamage()
    {
       return damage;
    }
    public int getHealth()
    {
        return health;
    }
    public int defend()
    {
        return defend;
    }
    public String name()
    {
        return name;
    }
    
   
}

 

