import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class BlackJack extends Room
{

    public String getAuthor()
    {
        return "Branden Knuth";
    }

    public String getRoomName()
    {
        return "BlackJack";
    }

    public static int numberoftrys = 3;
    public static int numberofcards = 0;
    public static  int cardnumber = 0;
    public static String[] deckofcards = new String[52];
    
    public boolean playerEnters(Player player) throws Exception
    {
        deckofcards[0] = "Two of Spades";
        deckofcards[1] = "Three of Spades";
        deckofcards[2] = "Four of Spades";
        deckofcards[3] = "Five of Spades";
        deckofcards[4] = "Six of Spades";
        deckofcards[5] = "Seven of Spades";
        deckofcards[6] = "Eight of Spades";
        deckofcards[7] = "Nine of Spades";
        deckofcards[8] = "Ten of Spades";
        deckofcards[9] = "Jack of Spades";
        deckofcards[10] = "Queen of Spades";
        deckofcards[11] = "King of Spades";
        deckofcards[12] = "Ace of Spades";
        deckofcards[13] = "Two of Hearts";
        deckofcards[14] = "Three of Hearts";
        deckofcards[15] = "Four of Hearts";
        deckofcards[16] = "Five of Hearts";
        deckofcards[17] = "Six of Hearts";
        deckofcards[18] = "Seven of Hearts";
        deckofcards[19] = "Eight of Hearts";
        deckofcards[20] = "Nine of Hearts";
        deckofcards[21] = "Ten of Hearts";
        deckofcards[22] = "Jack of Hearts";
        deckofcards[23] = "Queen of Hearts";
        deckofcards[24] = "King of Hearts";
        deckofcards[25] = "Ace of Hearts";
        deckofcards[26] = "Two of Clubs";
        deckofcards[27] = "Three of Clubs";
        deckofcards[28] = "Four of Clubs";
        deckofcards[29] = "Five of Clubs";
        deckofcards[30] = "Six of Clubs";
        deckofcards[31] = "Seven of Clubs";
        deckofcards[32] = "Eight of Clubs";
        deckofcards[33] = "Nine of Clubs";
        deckofcards[34] = "Ten of Clubs";
        deckofcards[35] = "Jack of Clubs";
        deckofcards[36] = "Queen of Clubs";
        deckofcards[37] = "King of Clubs";
        deckofcards[38] = "Ace of Clubs";
        deckofcards[39] = "Two of Diamonds";
        deckofcards[40] = "Three of Diamonds";
        deckofcards[41] = "Four of Diamonds";
        deckofcards[42] = "Five of Diamonds";
        deckofcards[43] = "Six of Diamonds";
        deckofcards[44] = "Seven of Diamonds";
        deckofcards[45] = "Eight of Diamonds";
        deckofcards[46] = "Nine of Diamonds";
        deckofcards[47] = "Ten of Diamonds";
        deckofcards[48] = "Jack of Diamonds";
        deckofcards[49] = "Queen of Diamonds";
        deckofcards[50] = "King of Diamonds";
        deckofcards[51] = "Ace of Diamonds";

        Collections.shuffle(Arrays.asList(deckofcards));

        //TO DO: Randomize Array

        dungeon.fancyOutput("As you enter the room, you see an old man sat at a table with a deck of cards. He looks at you with solemn eyes and says 'Play a round with me, won't you?' Hesitantly, you approach."); 

        dungeon.fancyOutput("You are dealt the " + deckofcards[cardnumber] + " and the " + deckofcards[cardnumber + 1 ]);
        if(roundOfPlay(numberofcards, numberoftrys, cardnumber) == true)
        {
            dungeon.fancyOutput("The old man rises. \'You have beaten me. You may be on your way.\'");
            return true;
        }
        numberoftrys--;
        numberofcards = 0;
        dungeon.fancyOutput("You are dealt the " + deckofcards[cardnumber] + "and the " + deckofcards[cardnumber + 1 ]);
        if(roundOfPlay(numberofcards, numberoftrys, cardnumber) == true)
        {
            dungeon.fancyOutput("The old man rises. \'You have beaten me. You may be on your way.\'");
            return true;
        }
        numberoftrys--;
        numberofcards = 0;
        dungeon.fancyOutput("You are dealt the " + deckofcards[cardnumber] + "and the " + deckofcards[cardnumber + 1 ]);
        if(roundOfPlay(numberofcards, numberoftrys, cardnumber) == true)
        {
            dungeon.fancyOutput("The old man rises. \'You have beaten me. You may be on your way.\'");
            return true;
        }
        dungeon.fancyOutput("The old man rises, visibly angry. \'Three tries and you couldn't even win once. He grabs his walking cane and lunges at you.\'");
        return false;


    }

    public boolean roundOfPlay(int numberofcardsf, int numberoftrysf, int cardnumberf) //cardnumber-1 is the index of the current card in deckofcards[]
    {
        cardnumber = cardnumber + 2;
        cardnumberf = cardnumberf + 2;
        numberofcardsf = numberofcardsf +2;
        numberofcards = numberofcards + 2;
        int blackjack = sumof(deckofcards, numberofcardsf, cardnumberf);
        
        if(blackjack == 21)
            return true;

        else if(blackjack < 21)         
            {
                if(choice(numberofcardsf, cardnumberf) == true)
                    return true;
                else
                    return false;
            }
        else
        {
            dungeon.fancyOutput("You bust.");
            return false;
        }
    }
    
    public boolean choice(int numberofcardsf, int cardnumberf)
    {
        int answer;
        answer = dungeon.getOptionIntSafe(
        "Hit",
        "Stay");
                
        if(answer == 1) 
        {
            hit(numberofcards, cardnumber);
            int blackjack = sumof(deckofcards, numberofcards, cardnumber);
            if(blackjack == 21)
                return true;
            else if(blackjack > 21)
            {
                int specialblackjack;
                specialblackjack = sumofacespecialcase(deckofcards, numberofcards, cardnumber);
                if(specialblackjack == 21)
                    return true;
                else if(specialblackjack > 21)
                {
                    dungeon.fancyOutput("You bust.");
                    return false;
                }
                else
                    if(choice(numberofcardsf, cardnumberf) == true)
                        return true;
                    else    
                    {
                        return false;
                    }
            }
            else
            {
                if(choice(numberofcardsf, cardnumberf) == true)
                    return true;
                else
                {
                    return false;
                }
            }

        }
        else
        {
            int blackjack = sumof(deckofcards, numberofcards, cardnumber);
            if(firstcomphit(cardnumber, blackjack) == true)
            {
                dungeon.fancyOutput("He loses.");
                return true;   
            }
            else
            {
                dungeon.fancyOutput("The old man wins.");
                return false;
            }

        }
    }

    public void hit(int numberofcardsf, int cardnumberf2) //Will take the number of cards in hand and the index of the array of cards and returns 
    {
        numberofcards = numberofcardsf;
        numberofcards= numberofcards +1;
        cardnumber = cardnumberf2;
        cardnumber= cardnumber + 1;
        cardnumberf2 = cardnumberf2 +1;
        dungeon.fancyOutput("You are dealt the " + deckofcards[cardnumberf2-1]);
    }

    public boolean firstcomphit(int cardnumberf, int sum)
    {
        cardnumber = cardnumberf;
        cardnumberf = cardnumberf +2;
        cardnumber = cardnumber + 2;
        int numberofcardsf = 2;
        dungeon.fancyOutput("The old man is dealt the " + deckofcards[cardnumberf -2] + " and the " + deckofcards[cardnumberf-1]);
        int sum2 = sumof(deckofcards, numberofcardsf, cardnumberf);
        if( sum2 >= 17)
            {
                if(sum <= sum2)
                {
                    return false;
                }
                else  
                {  
                    return true;
                }
                
            }
        else
        {
            if(comphit(cardnumberf, sum, numberofcardsf) == true)
                return true;
            else    
                return false;
        }
    }


    public boolean comphit(int cardnumberf, int sum, int numberofcardsf)
    {
        cardnumber = cardnumberf;
        cardnumberf = cardnumberf + 1;
        cardnumber++;
        numberofcards = numberofcardsf;
        numberofcards++;
        numberofcardsf++;
        dungeon.fancyOutput("He hits.");
        dungeon.fancyOutput("The old man is dealt the " + deckofcards[cardnumberf]);
        int sum2 = sumof(deckofcards, numberofcardsf, cardnumberf);
        if(sum2 > 21)
        {
            int sum2special = sumofacespecialcase(deckofcards, numberofcardsf, cardnumberf);
            if(sum2special > 21)
                return true;
            else if (sum2 >= 17 && sum2 < 21)
            {
                if(sum <= sum2)
                {
                    dungeon.fancyOutput("The old man wins.");
                    return false;
                }
                else
                {
                    dungeon.fancyOutput("You win.");
                    return true;
                }

            }
            else
            {
                if(comphit(cardnumberf, sum, numberofcardsf) == true)
                    return true;
                else
                    return false;
            }
        }
        else if( sum2 >= 17 )
        {
            if(sum <= sum2)
                return false;
            else
                return true;
        
        }
        else
        {
            if(comphit(cardnumberf, sum, numberofcardsf) == true)
                return true;
            else    
                return false;
        }
    }

    public int valueof(String str)  
    {
        if(str.contains("Two"))
            return 2;
        if(str.contains("Three"))
            return 3;
        if(str.contains("Four"))
            return 4;
        if(str.contains("Five"))
            return 5;
        if(str.contains("Six"))
            return 6;
        if(str.contains("Seven"))
            return 7;
        if(str.contains("Eight"))
            return 8;
        if(str.contains("Nine"))
            return 9;
        if(str.contains("Ten"))
            return 10;
        if(str.contains("Jack"))
            return 10;
        if(str.contains("Queen"))
            return 10;
        if(str.contains("King"))
            return 10;
        if(str.contains("Ace"))
            return 11;

        else   
            return 0;

    }

    public int sumof(String[] cards, int number, int cardnumberf) // Sum function takes the array of cards, the current number of cards in the hand and the current card number    {
    {
        int sum = 0;
        for(int j = cardnumberf - number; j < cardnumberf; j++)
        {
            sum = sum + valueof(cards[j]);
        }
        return sum;
    }
    public int valueofacespecialcase(String str)  
    {
        if(str.contains("Two"))
            return 2;
        if(str.contains("Three"))
            return 3;
        if(str.contains("Four"))
            return 4;
        if(str.contains("Five"))
            return 5;
        if(str.contains("Six"))
            return 6;
        if(str.contains("Seven"))
            return 7;
        if(str.contains("Eight"))
            return 8;
        if(str.contains("Nine"))
            return 9;
        if(str.contains("Ten"))
            return 10;
        if(str.contains("Jack"))
            return 10;
        if(str.contains("Queen"))
            return 10;
        if(str.contains("King"))
            return 10;
        if(str.contains("Ace"))
            return 1;

        else   
            return 0;

    }
    public int sumofacespecialcase(String[] cards, int number, int cardnumberf) // Sum function takes the array of cards, the current number of cards in the hand and the current card number    {
    {
        int sum = 0;
        for(int j = cardnumberf - number; j < cardnumberf; j++)
        {
            sum+=valueofacespecialcase(cards[j]);
        }
        return sum;
    }
}