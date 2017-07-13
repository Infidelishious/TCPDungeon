/**
 * Author: Ian Glow
 * Class: Room
 * 
 * Do not edit this file
 */

import java.util.Scanner;
import java.lang.Exception;

public abstract class Room {

    protected Dungeon dungeon;
    protected Scanner scanner;

    public Room () { }

    public void init (Dungeon dungeon, Scanner scanner)
    {
        this.dungeon = dungeon;
        this.scanner = scanner;
    }

    //Return whether the player was succesful in the room
    public abstract boolean playerEnters(Player player) throws Exception;
    
    public abstract String getAuthor();

    public abstract String getRoomName();
}