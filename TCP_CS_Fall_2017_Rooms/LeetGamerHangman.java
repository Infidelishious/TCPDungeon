import java.util.*;

public class LeetGamerHangman extends Room
{

    public String getAuthor()
    {
        return "Sophia Frohna";
    }

    public String getRoomName()
    {
        return "Leet Gamer Hangman";
    }

    public boolean playerEnters(Player player) throws Exception 
    {
        String[] words = {"scrublord", "aimbot", "noob", "arcade", "checkpoint", "miniboss", "speedrun", "noscope", "autosave", "aggro", "console", "griefer", "loot", "quest", "multiplayer", "multiplier", "permadeath", "nerf"};
        
        int randomWordNumber = (int) (Math.random() * words.length);
        
        char[] enteredLetters = new char[words[randomWordNumber].length()];
        int triesCount = 0;
        boolean wordIsGuessed = false;

        do {
        switch (enterLetter(words[randomWordNumber], enteredLetters)) 
            {
                case 0:
                    triesCount++;
                    break;
                case 1:
                    triesCount++;
                    break;
                case 2:
                    break;
                case 3:
                    wordIsGuessed = true;
                    break;
            }
        } while (! wordIsGuessed);
        dungeon.fancyOutput("\nthe word was " + words[randomWordNumber] +
            ". you missed " + (triesCount -findEmptyPosition(enteredLetters)) +
            " times.");

        if ((triesCount -findEmptyPosition(enteredLetters)) > 9) 
        {       
            dungeon.fancyOutput("that's way too many guesses. sorry bud.\n");
            dungeon.fancyOutput("you're not a leet enough gamer.\nblocked. banned. reported. buh-bye.\noh, and minus one health.\n");
            dungeon.pause(300);
            return false;
        }
        else
        {
            dungeon.fancyOutput("good job! you are truly the sheriff of leet gaming.");
            player.giveItem("plastic sheriff badge");
            return true;
        }
    }

    public int enterLetter(String word, char[] enteredLetters)    {
        System.out.print("enter a letter you think may be in the leet gamer word ");
        
        if (! printWord(word, enteredLetters))
            return 3;
        System.out.print(" > ");
        Scanner input = new Scanner(System.in);
        int emptyPosition = findEmptyPosition(enteredLetters);
        char userInput = input.nextLine().charAt(0);
        if (inEnteredLetters(userInput, enteredLetters)) {
            dungeon.fancyOutput(userInput + " is already in the word");
            return 2;
        }
        else if (word.contains(String.valueOf(userInput))) {
            enteredLetters[emptyPosition] = userInput;
            return 1;
        }
        else {
            dungeon.fancyOutput(userInput + " is not in the word");
            return 0;
            }
    }

    public boolean printWord(String word, char[] enteredLetters) 
    {
        boolean asteriskPrinted = false;
        for (int i = 0; i < word.length(); i++) 
        {
            char letter = word.charAt(i);
            
            if (inEnteredLetters(letter, enteredLetters))
                System.out.print(letter); 
            else 
            {
                System.out.print('*');
                asteriskPrinted = true;
            }
        }
        return asteriskPrinted;
    }

    public static boolean inEnteredLetters(char letter, char[] enteredLetters) 
    {
        return new String(enteredLetters).contains(String.valueOf(letter));
    }

    public static int findEmptyPosition(char[] enteredLetters) 
    {
        int i = 0;
        while (enteredLetters[i] != '\u0000') i++;
        return i;
    }
}