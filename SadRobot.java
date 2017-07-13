import javax.net.ssl.ExtendedSSLSession;

/**
 * Author: Ian Glow
 * Class: Sad Robot
 */

public class SadRobot extends Room
{
    public String getAuthor()
    {
        return "Ian Glow";
    }

    public String getRoomName()
    {
        return "Sad Robot";
    }

    //Return whether the player was succesful in the room
    public boolean playerEnters(Player player) throws Exception
    {

        dungeon.fancyOutput(
            "In the center of the room is sitting a small washing machine.\n" +
            "Suddenly the washing machine stands up and you relize that it is a robot\n" +
            "It looks at you with its large washing machine door eye, and says:\n" +
            "'I'm sad...' then it sighs and looks at the ground");

        dungeon.fancyOutput("\nYou then:");
        int answer;

        if(player.hasItem("TICKET TO SEE OPRAH IN 3042 C.E."))
        {
            answer = dungeon.getOptionIntSafe(
                "Say: 'What's wrong?'",
                "Try and scoot around the robot",
                "Say: 'Do you want a ticket to see Oprah?'");
        }
        else
        {
            answer = dungeon.getOptionIntSafe(
                "Say: 'What's wrong?'", 
                "Try and scoot around the robot");
        }

        if(answer == 1) //"Say: 'What's wrong?'"
        {
            dungeon.fancyOutput(
                "The Robot replys: 'I want to be a pterodactyl but im just a washing machine'\n" +
                "The Robot looks really sad...");
        }
        else if(answer == 2) //"Try and scoot around the robot"
        {
            dungeon.fancyOutput(
                "The Robot shuffles infront of you.\n" +
                "The Robot says: 'I want to be a pterodactyl but im just a washing machine'\n" +
                "The Robot looks really sad...");
        }
        else
        {
            dungeon.fancyOutput(
                "The Robot looks at you with a glimmer in its eye.\n" +
                "He says 'Are you serious!?'\n");

            dungeon.waitForEnter();

            dungeon.fancyOutput(
                "You hand over the ticket...\n" +
                "The Robot says 'Ohh its for 3042... thats ok I can sleep tell then!'\n" + 
                "The Robot ubruptly pulls his legs in and goes silent. You cannot wake him.");

            player.removeItem("TICKET TO SEE OPRAH IN 3042 C.E.");

            return true;
        }

        dungeon.fancyOutput("\nYou then:");
        answer = dungeon.getOptionIntSafe(
                "Say: 'How can I help you?'", 
                "Say: 'Im sorry...'",
                "RUN");

        if(answer == 2 || answer == 3)
        {
            dungeon.fancyOutput("The Robot screems: 'Your pitty wont grow me wings!!!'");
            dungeon.fancyOutput("The Robot begins to shake back and forth", 50);
            dungeon.fancyOutput("The Robot EXPLODES", 100);
            return false;
        }
        
        //"Say: 'How can I help you?'", 
        dungeon.fancyOutput("The Robot sobs: 'Can you get me wings?'");
        dungeon.getOptionIntSafe("Say: 'Sure...'");

        dungeon.fancyOutput("You look around the room and see a stapler and some paper");
        dungeon.fancyOutput("You then:");
        dungeon.getOptionIntSafe(
            "Staple to paper to the Robot's sides",
            "Put the Stapler on the Robot's head",
            "RUN");

        if(answer == 2 || answer == 3)
        {
            dungeon.fancyOutput("The Robot screems: 'Your pitty wont grow me wings!!!'");
            dungeon.fancyOutput("The Robot begins to shake back and forth", 50);
            dungeon.fancyOutput("The Robot EXPLODES'", 100);
            return false;
        }

        dungeon.fancyOutput(
            "The Robot says: 'Thank you... you have given me the stength to carry on.'" +
            "You then run to the rooms exit quickly");

        dungeon.waitForEnter();

        return true;
    }

}