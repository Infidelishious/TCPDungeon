import java.util.HashSet;

import javax.print.DocFlavor.STRING;

public class Player
{
    private HashSet<String> items;
    private String name;
    private Dungeon dungeon;
    private int health;

    public Player(Dungeon dungeon, String name)
    {
        this.dungeon = dungeon;
        this.name = name;
        this.health = 3;
        
        items = new HashSet<String>();
    }

    public boolean hasItem(String item)
    {
        return items.contains(item);
    }

    public void giveItem(String item)
    {
        dungeon.fancyOutput("You have recived a '" + item + "'");
        items.add(item);
    }

    public void removeItem(String item)
    {
        if(items.contains(item))
            items.remove(item);
    }

    public void outputItems()
    {
        if(items.size() > 0)
        {
            dungeon.fancyOutput("You have these items:");

            int i = 0;
            for (String item : items)
            {
                dungeon.fancyOutput(++i + ") " + item);
            }
        }
        else
        {
            dungeon.fancyOutput("You have no items...");
        }
    }

    public int getHealth()
    {
        return health;
    }

    public void failedRoom()
    {   
        health--;
        dungeon.fancyOutput(
            "You have lost some blood... possiblly a limb...\n" +
            "You now have " + health + " health remaining...");
    }

    public String getName()
    {
        return name;
    }
}