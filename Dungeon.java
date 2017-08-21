import java.util.*;

import java.lang.reflect.*;

import java.net.URL;
import java.net.URLClassLoader;
import java.io.*;
import java.lang.Exception;

public class Dungeon
{
    private ArrayList<String> roomClasses;
    private ArrayList<Room> rooms;
    private ArrayList<Room> vistedRooms;

    private Scanner scanner;
    private InputStream inSteam;
    private Player player;

    private long startTime;

    private Dungeon()
    {
        roomClasses = new ArrayList<String>();
        rooms = new ArrayList<Room>();
        vistedRooms = new ArrayList<Room>();

        inSteam = System.in;
        scanner = new Scanner(inSteam);
    }

    public int getIntSafe()
    {
        int ret = 0;
        while(true)
        {
            try {
                ret = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please enter an whole number.");
                scanner.nextLine();
            }
        }
        return ret;
    }

    public int getOptionIntSafe(String... options)
    {
        for (int i = 0; i < options.length; ++i) {
            fancyOutput((i + 1) + ") " + options[i]);
        }

        int ret = 0;
        while(true)
        {
            try {
                ret = scanner.nextInt();
                if(ret >= 1 && ret <= options.length)
                    break;
            } catch (Exception e) {
                scanner.nextLine();
            }
            System.out.println("Please choose one of the options available...");
        }

        System.out.println();
        return ret;
    }

    public void waitForEnter()
    {
        System.out.print("\nPress 'Enter' to continue...");

        try {
            if(isInput())
                scanner.nextLine();
            scanner.nextLine();
         } catch (Exception e) {}
    }
    public void pause(int miliseconds)
    {
        try {
            Thread.sleep(miliseconds);
         } catch (Exception e) {}
    }

    public void outputRepeatingCharLine(char c, int length)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++)
        {
            sb.append(c);
        }

        fancyOutput(sb.toString(), 10);
    }
    public void fancyOutput(String input)
    {
        fancyOutput(input, 30);
    }

    public void fancyOutput(String input, int letterDelay)
    {
        for(int i = 0; i < input.length(); i++)
        {
            if(isInput())
            {
                scanner.nextLine();
                letterDelay = 0;
            }

            System.out.print(input.charAt(i));
            pause(letterDelay);
        }
        pause(letterDelay);
        System.out.println();
    }

    private void beginGame()
    {
        System.out.println("\n\nLoading Rooms...");
        createRooms();

        System.out.println();
        outputRepeatingCharLine('-', 26);
        fancyOutput("Welcome to the TCP Dungeon!\n");

        createPlayer();

        fancyOutput("Let us begin...", 50);
        fancyOutput("Behind the gym you find an abandond bunker...\n" +
                    "You enter the bunker...\n" +
                    "The door slams shut behind you and locks...\n" + 
                    "The only way out is forward...");

        waitForEnter();

        startTime = System.currentTimeMillis();

        while(rooms.size() > 0)
        {
            enterRoom(getFreshRoom());
            if(player.getHealth() == 0)
            {
                fancyOutput("\nYOU HAVE DIED...\n", 150);
                outputStats();
                return;
            }
        }

        fancyOutput("\nYou pull open the final door and enter into strong daylight...");
        fancyOutput("You, " + player.getName() + ", have survived...\n", 100);
        outputStats();

        waitForEnter();
    }

    private void outputStats()
    {
        long timeMillis = System.currentTimeMillis() - startTime;
        outputRepeatingCharLine('-', 26);
        fancyOutput(
            "You where in the dungeon for " + timeMillis/1000.0 + " seconds\n" +
            "You visited " + vistedRooms.size() + " rooms.\n" +
            "You finished the game with " + player.getHealth() + " health");
        
        player.outputItems();
        outputRepeatingCharLine('-', 26);
        fancyOutput("Thanks for playing TCP dungeon!");
        outputRepeatingCharLine('-', 26);
    }

    private void enterRoom(Room room)
    {
        System.out.println();
        outputRepeatingCharLine('-', 26);
        fancyOutput("You are now entering \"" + room.getRoomName() + "\"\nby: " + room.getAuthor() + "\n");

        try {
            boolean success = room.playerEnters(player);
            if(success)
            {
                fancyOutput("\nYou have escaped the room...");
            }
            else
            {
                player.failedRoom();
            }
            waitForEnter();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\"" + room.getRoomName() + "\" has crashed. Continuing your adventure...");
        }
    }

    private void createPlayer()
    {
        fancyOutput("Please enter your characters name:");

        String name = scanner.nextLine();
        fancyOutput("\nHello " + name + "!");
        pause(1000);

        player = new Player(this, name);
    }

    private void createRooms()
    {
        final String path = ".";
        final File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());

        boolean inJar = jarFile.isFile();
        /*
            To create executable jar:
            1) Run: javac *.java
            2) Run: jar -cvfe TCP.jar Dungeon *.class
            3) Fill in array below
            4) echo java -jar TCP.jar > RUN_TCP_DUNGEON.bat
        */

        if(inJar)
        {
            roomClasses.addAll(Arrays.asList(
                "GuessingGame",
                "SadRobot",
                "FastMath"));
        }
        else
        {
            try 
            {
                File root = new File(".");
                for( File f : root.listFiles()){
                    if(f.getName().contains(".class"))
                    {
                        roomClasses.add(f.getCanonicalPath());
                    }
                }
            } catch (Exception e) { 
                e.printStackTrace();
                return;
            }

        }

        for(String pathToClassFile : roomClasses) 
        {
            try 
            {
                String classname = inJar ? pathToClassFile : null;
                if(!inJar)
                {
                    ProcessBuilder pb = new ProcessBuilder("javap",pathToClassFile);
                    Process p = pb.start();
                    try(BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                        String line;
                        while(null != (line = br.readLine())) {
                            if(line.startsWith("public class") && line.contains("extends Room")) {
                                classname = line.split(" ")[2];
                                break;
                            }
                        }
                    }
                }

                if(classname != null)
                {
                    //String pathToPackageBase = pathToClassFile.substring(0, pathToClassFile.length() - (classname + ".class").length());
                    URLClassLoader loader = new URLClassLoader(
                            new URL[]{new File(".").toURI().toURL()});
                    
                    Class clss = loader.loadClass(classname);
                    
                    Room newRoom = (Room)clss.newInstance();
                    newRoom.init(this, scanner);
                    rooms.add(newRoom);

                    loader.close();

                    System.out.println("Found \"" + newRoom.getRoomName() + "\" Room");
                }
            } catch (Exception e) { e.printStackTrace(); }
        }
    }

    private Room getFreshRoom()
    {
        if(rooms.size() == 0)
            return null;

        int index = (int)(Math.random() * rooms.size());

        Room room = rooms.get(index);

        rooms.remove(index);
        vistedRooms.add(room);

        return room;
    }

    private boolean isInput()
    {
        try {
            return inSteam.available() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception
    {
        new Dungeon().beginGame();
    }
}