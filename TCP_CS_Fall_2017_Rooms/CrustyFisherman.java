public class CrustyFisherman extends Room
{
    public String getAuthor()
    {
        return "Brennan Glow";
    }

    public String getRoomName()
    {
        return "Crusty Fisherman";
    }

    public boolean playerEnters(Player player) throws Exception
    {
        int lbcaught = 0;
        long starttime = System.currentTimeMillis();
        dungeon.fancyOutput("Howdy there buddy!\n" +
            "Welcome to Granpy Ricky's boat, come crack a cold one and lets get a line in the water!\n"+
            "I have been livin' down here since your grandmother left me " + player.getName()
            );
        dungeon.fancyOutput("\nReady to cast your line?");

        dungeon.waitForEnter();
        //dungeon.fancyOutput("" + Sytem.currentTimeMillis() - starttime)

        while(lbcaught < 100)
        {
            dungeon.fancyOutput("\nYour line flies into the sewage! Double tap enter when your bobber shakes to hook a fish!");
            dungeon.fancyOutput("Plop!");
            
            dungeon.pause((int)(Math.random()*5000 + 2000));
            dungeon.fancyOutput("Your bobbber begins to shake violently!");
            
            long taptime = System.currentTimeMillis();
            dungeon.waitForEnter();

            String fishtype;
            int weight;

            Double random =(Math.random());
        
            if(random < .1 )
            {
                fishtype = "shark";
                weight = ((int)(Math.random()*55+ 12));
                dungeon.fancyOutput("Wow thats a big lake shark!");
            }
            else
            {
                fishtype = "fish";
                weight  = ((int)(Math.random()*25+ 3));
            }


            if(System.currentTimeMillis() - taptime < 700)
            {
                dungeon.fancyOutput("You caught a " + weight + " lb " + fishtype + "!");
                lbcaught = lbcaught + weight;
                dungeon.fancyOutput("You have caught " + lbcaught + " lbs of tasty meat!");
                

            }
            else
            {
                dungeon.fancyOutput("The fish got away!\n");
                dungeon.fancyOutput("You better be faster next time!");
            }
            
            if(lbcaught >= 100)
            {
              dungeon.fancyOutput("Seems like you have caught us enough fish boy!");
              dungeon.fancyOutput("Take this buddy! See ya in aguila!");
              player.giveItem("Coke Zero");
                return true;  
            }
        }


        return false;
    }
    
}



    