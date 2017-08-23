public class Genie extends Room
{
    public String getAuthor()
    {
        return "Saigayatri Darira";
    }

    public String getRoomName()
    {
        return "Genie";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        dungeon.fancyOutput(
            "When you enter the room, you look around.\n" + "You see a variety of junk laying all around the dark room including multiple boxes, a yellow shelf filled with books, a bed, old lamp, and much more.\n" + 
            "You choose to turn on the light in the lamp-hoping to see a exit to the room, but instead a genie appears\n" + "The Genie says: 'Hello, yes I am a Genie'\n" + "No I cannot grant wishes like other Genies but I am still stuck in the lamp \n" +"I am worried'.");

        dungeon.fancyOutput("\nYou then:");
        int answer;
    
        
        answer = dungeon.getOptionIntSafe(
        " Say: 'Why are you worried?'",
        " Choose to ignore the Genie and walk past him",
        " Say: 'I'm sure whatever you are worried about will be fine'");
        
      
                    
        if(answer == 1) //Say: Why are you worried?
        {
            dungeon.fancyOutput(
                "The Genie says: 'I am worried about the my future because if anyone break this lamp, I will die.'\n" + "'Plus this lamp keeps on moving to isolated places so the next time I could see another person could be a few hundred years.''");
        }
        else if(answer == 2) //Walks past Genie
        {
            dungeon.fancyOutput(
            "The Genie says: 'You will regret ignoring me. I curse you and your descendants.'\n" +"'For a thousand years, no one of your blood with be able to travel the world'\n" + " 'Or gain any physical riches of the world.''"); return false;
                        
        }
        else if (answer == 3) //Say: 'I'm sure whatever you are worried about will be fine
        {
            dungeon.fancyOutput("The Genie says: 'Thank you for your kind words. Here is a diamond for you. I guess in your eyes it has more value for you then me.'");

        }

        dungeon.fancyOutput("\nYou then:");
        answer = dungeon.getOptionIntSafe(
            "Say: 'How can I help you'",
            "Say:'I'm sorry'");
        
        if (answer == 1 || answer == 2)
        {
            dungeon.fancyOutput("The Genie says: 'I wish I had a airplane. It would represent my hope to get to be on top of the world even though I am physically grounded in my lamp.'");
            dungeon.fancyOutput("You look around the room and see a piece of paper");
            dungeon.fancyOutput("You then:");
            dungeon.getOptionIntSafe(
                " Get the piece of paper and make a paper airplane from it and give it to the Genie",
                " Hand the Genie the piece of paper");
              
            if(answer == 1) //Get the piece of paper and make a paper airplane from it and give it to the Genie
            {
                dungeon.fancyOutput("The Genie starts crying and says:\n" + "'Thank you so much'" + "!" + "'You have made this the highlight of the century for me'.\n" + "'The way out of this room is through the secret door on the left'\n " + "'You can open the door by pulling on the blue book on the yellow shelf'"+ "You: " + "Pull on the blue book on the yellow shelf and exit the room");
                return true;
            }
            else if (answer == 2) //Hand the Genie the piece of paper"
            {
                dungeon.fancyOutput("The Genie says: 'What am I suppose to do with this piece of paper. Do I look like I have any crucial pieces of knowlegde to write down?''");
                dungeon.fancyOutput("You said: 'You can make a paper airplane from the paper'");
                dungeon.fancyOutput(
                "The Genie says:'Thank you!'"  + "'You have made this the highlight of the century for me'.\n" + "'The way out of this room is through the secret door on the left'\n " + "'You can open the door by pulling on the blue book on the yellow shelf'\n "+ "You: " + "Pull on the blue book on the yellow shelf and exit the room");
                return true;
            }
           
        }return false;
    }
}