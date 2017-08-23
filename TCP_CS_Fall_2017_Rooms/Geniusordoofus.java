import java.util.Scanner;
import java.lang.Exception; 

public class Geniusordoofus extends Room
{
    
    public String getAuthor()
    {
        return "Clayton Evans";
    }

    public String getRoomName()
    {
        return "PROGRAMMER: GENIUS or DOOFUS";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        Scanner input = new Scanner(System.in);

        int totScore = 10;

        dungeon.fancyOutput("Welcome to the next room of the TCP Dungeon. Prepare your tiny brain for a game of...\n\n*****PROGRAMMER: GENIUS OR DOOFUS*****\n");

        dungeon.fancyOutput("In this game you will have to answer coding questions about java (probably).You will be asked a total of ten questions.\nIf you answer wrong, you will lose a point. If you score less than a 7/10, may God be with you.\nSelect your option:\n1) Continue to game\n2) Skip this room );");

            int i = input.nextInt();

            if(i == 1)
            {
                dungeon.fancyOutput("The game will start in:");

                delay();

                System.out.println("3...");

                delay();

                System.out.println("2...");

                delay();

                System.out.println("1...");

                delay();

                System.out.println("Go!\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("I can't believe you would just skip my game like that. Now you start with ONE LESS POINT!!!\n\n\n");
            }

        dungeon.fancyOutput("Question one: What is the correct way to implement a scanner into your code?\n1) import java.util.Scanner\n2) import java.util.scanner\n3) Scanner scan = new Scanner()\n4) Scanner scan = new Scanner(System.in)\n");

        i = input.nextInt();

            if(i == 1)
            {
                dungeon.fancyOutput("Correct, 9 questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n1) import java.util.Scanner\n\n\n");
            }

        
        dungeon.fancyOutput("Question two: Can you create a function within a function?\n1) Depends on whether it is inside a loop\n2) No\n3) Yes\n4) Only if Ian says it's ok");

        i = input.nextInt();

            if(i == 2)
            {
                dungeon.fancyOutput("Correct, 8 questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now your score is " + totScore + "/10. The correct answer was:\n2) No\n\n\n");
            }


        dungeon.fancyOutput("Question three: How do you call a function within another class?\n1) function.Class\n2) Class\n3) function\n4) Class.function");

        i = input.nextInt();

            if(i == 4)
            {
                dungeon.fancyOutput("Correct, 7 questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now your score is " + totScore + "/10. The corrct answer was:\n4) Class.function\n\n\n");               
            }


        dungeon.fancyOutput("Question four: What is one reason a try catch block is needed for a sleep thread?\n1) There is an error if you try to start a timer while another one is in progress\n2) Jesus-take-the-wheel kinds of situations\n3) sleep threads are sometimes unreliable and thus give errors\n4) A sleep thread can run too many times if it's not stopped (stack overflow)");

        i = input.nextInt();

            if(i == 1)
            {
                dungeon.fancyOutput("Correct, 6 questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now your score is " + totScore + "/10. The correct answer was:\n1) 1) There is an error if you try to start a timer while another one is in progress\n\n\n");
            }


        dungeon.fancyOutput("Question five: What does Math.random do?\n1) Gives you a random number from 1-100\n2) Gives you a random anser from -1 to 1\n3) Gives you an answer from 0-1\n4) Assigns a random number to a variable");

        i = input.nextInt();

            if(i == 3)
            {
                dungeon.fancyOutput("Correct, 5 questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n3) Gives you a random answer from 0-1\n\n\n");
            }

        dungeon.fancyOutput("Question 6: How much wood could a wood chuck chuck if a wood chuck could chuck wood?\n1) As much as it damn well pleases\n2) 42 square books of swim\n3) Rock\n4) Logs, hogs, and cogs");

        i = input.nextInt();

            if(i < 5)
            {
                dungeon.fancyOutput("Correct! This was a free-bee. All answers were valid.");
            }

            else
            {
                totScore = 1000000 + totScore;
                dungeon.fancyOutput("How the heckidy flippidy dippidy damn did you even think this was a suitable answer? You must be a genius or something!");
                dungeon.fancyOutput("Plus 1000000 score, granted infinite air for the rest of your life!");
                dungeon.fancyOutput("Good for you, your score has just shot up with roids and is now " + totScore + "/10. Basically, you win");
            }


        dungeon.fancyOutput("Question seven: What is the difference between System.out.print() and System.out.println()?\n1) Nothing, they perform the same task\n2) System.out.print() does not exist\n3) System.out.println() skips to the next line after printing while System.out.print() does not\n4) They both do the same thing, just with different syntax");

        i = input.nextInt();

            if(i == 3)
            {
                dungeon.fancyOutput("Correct, three questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n3) System.out.println() skips to the next line after printing while System.out.print() does not\n\n\n");
            }


        dungeon.fancyOutput("Question eight: What does UBI stand for?\n1) Universal British Inerneting\n2) Universal Banking Investment\n3) Universal Banking International\n4) Universal Base Income");

        i = input.nextInt();

            if(i == 4)
            {
                dungeon.fancyOutput("Correct, two questions left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n4) Universal Base Income\n\n\n");
            }


        dungeon.fancyOutput("Question nine: What is one instance that Merge Sort NOT the fastest?\n1) When there is more than 18 items\n2) When there is less than 15 items\n3) When there is an odd amount of items\n4) When Derek says so");

        i = input.nextInt();

            if(i == 2)
            {
                dungeon.fancyOutput("Correct, one question left.\n\n\n");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n2) When there is less than 15 items\n\n\n");
            }


        dungeon.fancyOutput("Question ten: What shape is used to create meshes in animations and video games?\n1) Tryangle\n2) Docecahedron\n3) Triangle\n4) It doesn't matter, they overlap anyways");

        i = input.nextInt();

            if(i == 3)
            {
                System.out.println("Correct, you have finished the room, proceed to someone else's more sucky game(hopefully)");
            }

            else
            {
                totScore--;
                dungeon.fancyOutput("Wrong! Now you have a score of " + totScore + "/10. The correct answer was:\n3) Triangle");
            }

            if(totScore < 7)
            {
            dungeon.fancyOutput("You have a score of less than 7/10. A 5 sided dice will be rolled to decide your final fate. Choose a number 1-5.");
            i = input.nextInt();
            double randDie = (Math.random() * 6);
            if(randDie == i)
            {
                dungeon.fancyOutput("Congrats, you got lucky!");
                totScore = 10;
                return true;
            }

            else
            {
                dungeon.fancyOutput("You have lost, you will now lose 1 life for the total Dungeon.");
                return false;
            }
        }

        else
        {
            dungeon.fancyOutput("Well done! You may pass through the room.");
            return true;
        }
    
      
    } 
     public static void delay()

        {

            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {}
        }   
}    