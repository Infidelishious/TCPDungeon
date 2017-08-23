import java.util.Random;
import java.lang.Exception;

public class EscapeRoomFromFrieza extends Room
{
    public String getAuthor()
    {
        return "Noah Toth";
    }
    
    public String getRoomName()
    {
        return "Epic Escape From Frieza";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        dungeon.fancyOutput(
            "You have entered a room with the evil villian Frieza.\n"+
            "The only way out of the room is if you defeat Frieza, and escape...\n\n");

        dungeon.fancyOutput(
            "Frieza notices you are in the room.\n"+
            "Frieza says 'I've been waiting for an oppenent for some time now...\n\n"+
            "Frieza looks at your hair, and notices it's that of a Saiyan.\n"+
            "'HAHAHAHAHA! I remember fighting those of your kind,\n lets hope you give up more of a fight than the others.'\n\n"
        );

        dungeon.fancyOutput(
            "You say 'I wouldnt underestimate my power if i were you Frieza...'\n"+
            "'Oh Yeah?' Frieza says, 'I guess we'll just have to see how serious of an oppenent you are.'"
        );

        dungeon.fancyOutput("You have to think of something fast before Frieza attacks. What do you do?");
        dungeon.fancyOutput("0) You dash towards the exit hoping to escape.");
        dungeon.fancyOutput("1) You take a strike at Frieza in hopes it dammages him.");
        int choice = dungeon.getIntSafe();

        if(choice == 0)
        {
            dungeon.fancyOutput("You dashed towards the exit, and got Death Beamed in the back by Frieza.");
            dungeon.fancyOutput("Player has been killed...");
            return false;
        }
        else
        {
            dungeon.fancyOutput("You took a strike at Frieza, and he evenly counters your attack with one of his.");
            dungeon.fancyOutput("You think of two more options you can try");
            dungeon.fancyOutput("0) You can charge up to acheive a new form");
            dungeon.fancyOutput("1) Continue to go head to head with Frieza in your base form.");
            choice = dungeon.getIntSafe();

            if(choice == 0)
            {
                dungeon.fancyOutput("You have now gone Super Saiyan 2.");
                dungeon.fancyOutput("What do you do now?");
                dungeon.fancyOutput("0) Charge up, and show Frieza what its like once you've passed your limits.");
                dungeon.fancyOutput("1) Concentrate all your energy into once explosive attack.");
                choice =  dungeon.getIntSafe();

                if(choice == 0)
                {
                    dungeon.fancyOutput("Energy Charging.........\n\n");
                    dungeon.fancyOutput("You have now turned Super Saiyan Blue, a power that can even rival the gods.");
                    dungeon.fancyOutput("0) You charge up Kamehameha that should render Frieza unconsionce.");
                    dungeon.fancyOutput("1) You go head to head vs. Frieza, in a spar til the end... ");
                    choice =  dungeon.getIntSafe();

                    if(choice == 0)
                    {
                        dungeon.fancyOutput("You have launched an explosive Kamehameha in Friezas direction, and there is smoke surrounding him...");
                        dungeon.fancyOutput("Frieza turned golden as the attack was launched allowing him to handle a blow of that size...");
                        dungeon.fancyOutput("You head towards the door to escape, and get Death Beamed in the back because you let your gaurd down. ");
                        return false;
                    }
                    else
                    {
                        dungeon.fancyOutput("\"HAHAHAHAHA you expect to go against me head to head Saiyan?\" Frieza says\n");
                        dungeon.fancyOutput("\"without a doubt\" You say.\n");
                        dungeon.fancyOutput("Frieza and you go back and fourth with blows draining one anothers stamina......\n\n");
                        dungeon.fancyOutput("Frieza turns into his golden form showing you his true potential too...");
                        dungeon.fancyOutput("After a while of fighting, you two realize you are too evenly matched for each other, and there is only one real way to escape the room......\n");
                        dungeon.fancyOutput("You and Frieza agree that if you win in a game of Rock, Paper, Scissors he will allow you to escape the room...");

                        return rock();

                    }
                }
                else
                {
                    dungeon.fancyOutput("Frieza turned into his golden form, and your attack had no effect.");
                    dungeon.fancyOutput("Frieza killed you with his Death Ball.");
                    return false;
                }
            }
            else
            {
                dungeon.fancyOutput("You have run out of stamina, and finished off by Frieza....");
                return false;
            }
        }   
    }

    private boolean rock()
    {
        int wins = 0;
        int losses = 0;
        int rnd = 0;
        int you = 0;

        dungeon.fancyOutput("Now we will be playing rock, paper, scissors to see if you can escape.\n" +
        "We will partake in a best 2 out of 3 match. If Frieza wins, then you will be destroyed, but if you win, then Friezia will be destroyed and you can escape.\n" +
        "For Rock type r, for Paper type p, and for Scissors type s.\n");

        while(rnd < 3)
        {
            Random game = new Random();
            int frieza = 1 + game.nextInt(3);

            int rock, paper, scissors;
            rock = 1;
            paper = 2;
            scissors = 3;

            String you_Input = dungeon.getString();
            
            if(you_Input.equals("r"))
            {
                you = 1;
            }
            if(you_Input.equals("p"))
            {
                you = 2;
            }
            if(you_Input.equals("s"))
            {
                you = 3;
            }

            while (you > 3 || you < 1)
            {
                System.err.println("Incorrect value entered.");
                System.exit(0);
                break;
            }
            if(you == frieza)
            {
                if(you == scissors)
                {
                    dungeon.fancyOutput("Scissors vs. Scissors, Tie!\n");
                }
                if(you == rock)
                {
                    dungeon.fancyOutput("Rock vs.Rock, Tie!\n");
                }
                if(you == paper)
                {
                    dungeon.fancyOutput("Paper vs. Paper, Tie!\n");
                }
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors.");
            }
            if(you == scissors && frieza == paper)
                
            {
                dungeon.fancyOutput("Scissors vs. Paper, You win!\n");
                wins++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                dungeon.fancyOutput("Enter r for Rock, p for Paper, and s for Scissors.");
            }
            else if(frieza == rock)
            {
                dungeon.fancyOutput("Scissors vs. Rock, Frieza wins!\n");
                losses++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors");
            }
            if(you == rock && frieza == scissors)
            
            {
                dungeon.fancyOutput("Rock vs. Scissors, You win!\n");
                wins++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors");
            }
            else if(frieza == paper)
            {
                dungeon.fancyOutput("Rock vs. Paper, Frieza wins.\n");
                losses++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors");
            }
            if(you == paper && frieza == rock)
            
            {
                dungeon.fancyOutput("Paper vs. Rock, You win!\n");
                wins++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors");
            }
            else if(frieza == scissors)
            {
                dungeon.fancyOutput("Paper vs. Scissors, Frieza wins.\n");
                losses++;
                rnd++;
                dungeon.fancyOutput("You have won " + wins + " times and Frieza has won " + losses + " times.\n");
                System.out.print("Enter r for Rock, p for Paper, and s for Scissors");
            }
        }

        if(wins >= losses)
        {
            dungeon.fancyOutput("\nYou have defeated Frieza in Rock, Paper, Scissors, and are now free so leave the room....");
            return true;
        }
        else
        {
            dungeon.fancyOutput("\nFrieza has defeated you in Rock, Paper, Scissors... You have been eliminated with his Death Beam.");
            return false;
        } 
    }
}