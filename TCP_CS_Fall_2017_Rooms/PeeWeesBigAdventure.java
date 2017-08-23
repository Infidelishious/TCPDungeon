//Author: Thomas Flannigan
//Class: PeeWee's Big Adventure
//This is a choose your own adventure game that I made
//It has a random number generator function. While there's a lot of code, if you can ctrl+f "Math.random," you will find it.
//Sorry for the absolutely horrendous and unnecessarily long code, this was just the easiest for me to understand.

public class PeeWeesBigAdventure extends Room
{ 
    private Player player;
    
    public String getAuthor()
    {
        return "Thomas Flannigan";
    }

    public String getRoomName()
    {
        return "Escape Your Cell";
    }
    
    public boolean playerEnters(Player player) throws Exception
    {
        this.player = player;
        
        int decision1;
        
        dungeon.fancyOutput("You awaken in a dark dungeon cell of some sort, unable to remember anything... ");
        
        dungeon.waitForEnter();
        
        dungeon.fancyOutput("What do you do?");
        
        decision1 = dungeon.getOptionIntSafe(
            " Look out the cell window",
            " Look out the cell door");
        
        if (decision1 == 1)
        {
            int decision2;

            dungeon.fancyOutput("Well, from what you can see it is dark outside.");
            
            dungeon.waitForEnter();
            
            dungeon.fancyOutput("What do you do from here?");

            decision2 = dungeon.getOptionIntSafe(
                " Look for something to cut the bars with",
                " Cry and sulk and try to come up with an idea to get out of here");

            

            if (decision2 == 1)
            {
                int decision3;

                dungeon.fancyOutput("When trying to look for something, you notice");
                dungeon.fancyOutput("a fairly rough looking rock and a rusty sword");

                dungeon.waitForEnter();

                dungeon.fancyOutput("What do you do?");
                
                decision3 = dungeon.getOptionIntSafe(
                    " Grab the rock and bash the bars with it", 
                    " Grab the sword and try to chop the bars with that");


                if (decision3 == 1)
                {
                    int decision4;

                    dungeon.fancyOutput("After grabbing the rock, you realize that you are much weaker than you");
                    dungeon.fancyOutput("have any memory of you being. Nevertheless, you charge at the window and");
                    dungeon.fancyOutput("start to smash it as hard as you can. However, after a while you notice");
                    dungeon.fancyOutput("that the rock is so rough that you could most likely be able to sand down");
                    dungeon.fancyOutput("the bars!");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you:");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " Continue to hit the bars as hard as humanly possible with the rock",
                        " Gently try to sand the bars down in hopes that they break off");
                    
                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("You continue to smash the bars to the window like nobody's business. But this");
                        dungeon.fancyOutput("still isn't enough to break down the bars. You even try to hit the window on the");
                        dungeon.fancyOutput("rusted parts. Eventually, you feel like you can probably try and wedge yourself");
                        dungeon.fancyOutput("through the bars, since you seem to be a little thinner than you remember yourself");
                        dungeon.fancyOutput("being.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("What do you do?");

                        decision5 = dungeon.getOptionIntSafe(
                            " Wedge yourself through the bars and try to escape",
                            " Give up and hope something good will happen tomorrow");

                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("After wedging yourself through the cell window, you feel the greatness that");
                            dungeon.fancyOutput("is freedom! You can finally go home, just so long as you remember where that");
                            dungeon.fancyOutput("home is.");
                            
                            dungeon.waitForEnter();
                            
                            dungeon.fancyOutput("YOU ESCAPED"); 

                            return true;                      

                        }

                        else if (decision5 == 2)
                        {
                            int decision6;

                            dungeon.fancyOutput("When you wake up the next morning, a guard is standing outside of the cell door!");
                            dungeon.fancyOutput("'Alright man' he says, in a very cool manner, 'The king said to let you go now,");
                            dungeon.fancyOutput("you served your time.' You feel absolutely thrilled! But today, you are a free man!");

                            decision6 = dungeon.getOptionIntSafe(
                                " Nice!",
                                " 'Why was I imprisoned in the first place?'");


                            if (decision6 == 1)
                            {
                                dungeon.fancyOutput("Cool! You served your time, and while it was difficult, you managed!");

                                dungeon.waitForEnter();

                                dungeon.fancyOutput("YOU ESCAPED");

                                return true;
                                 
                                
                            }

                            else if (decision6 == 2)
                            {
                                dungeon.fancyOutput("'Well, for asking questions of course! I thought I'd be nice but now you ruined it!");
                                dungeon.fancyOutput("Get back in your cell right now!'");
                                dungeon.fancyOutput("You kind of feel like an idiot and you have failed purely through your curiousity.");

                                dungeon.waitForEnter();

                                dungeon.fancyOutput("YOU FAILED");

                                return false;
                                 
                                
                            }
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("'Welp!' you proclaim 'What more is there to do?' You realize it's pointless");
                            dungeon.fancyOutput("to do any of this, crawl into the fetal position, and live the rest of your days");
                            dungeon.fancyOutput("in the cell.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: really? Please hit a button next time it's displayed!");

                            return false;
                             
                            
                        }
                                                
                    }

                    else if (decision4 == 2)
                    {
                        int decision5;

                        dungeon.fancyOutput("After sanding the bars a little bit, you realize that while it is making progress,");
                        dungeon.fancyOutput("it's not making the fast progress that you thought it would make. You realize that");
                        dungeon.fancyOutput("if you sand it as hard as you possibly can, you might be able to make it out this");
                        dungeon.fancyOutput("year.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Sand it much harder",
                            " Continue to sand it gently");


                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("You sand it as hard as possible, and then you quickly try and break the bars off");
                            dungeon.fancyOutput("the cell window! You crawl out as fast as possible, but your hand slips and your");
                            dungeon.fancyOutput("body falls completely onto one of the jagged spikes! You begin to bleed out, with");
                            dungeon.fancyOutput("every movement just making it worse and worse than before! You give up, and pass out");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                              
                            
                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("After sanding it as softly as possible, you eventually are able to break off one");
                            dungeon.fancyOutput("of the bars and you are able to escape! Although you slip and fall onto the exposed");
                            dungeon.fancyOutput("end of the bar, it does little damage as it is a dull end. You climb out, excited to");
                            dungeon.fancyOutput("finally be able to be free again and go home again! ");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU ESCAPED");

                            return true;
                             
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("'This is stupid! Nevermind!!' You exclaim! You've had it with trying to escape!");
                            dungeon.fancyOutput("'Even if it is a prison, it hasn't been that terrible so far, so what's the harm");
                            dungeon.fancyOutput(" in continuing to exist here!' You then fall asleep and just kind of live here");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: really? Hit the number that's displayed next time!");

                            return false;
                             
                             
                        }
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("With your processing power in your braing being completely overloaded, you suddenly");
                        dungeon.fancyOutput("fling the rock into the air! It rockets back down directly on your head, killing you.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: please hit the number presented next time!");

                        return false;

                         
                        
                    }

                }

                else if (decision3 == 2)
                {
                    int decision4;

                    dungeon.fancyOutput("After grabbing the sword, you notice it is a lot heavier than what you had");
                    dungeon.fancyOutput("originally anticipated it to be. It also seems to have a fair amount of rust to it.");
                    dungeon.fancyOutput("You grab the sword and realize you can either try to saw the bars down or swing the");
                    dungeon.fancyOutput("sword into the bars as hard as humanly possible.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you:");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " Saw the bars down",
                        " Swing the sword");

                     

                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("You saw the bars down as much as you can, and are able to break the bars completely!");
                        dungeon.fancyOutput("You gently climb out of the cell and are able to escape! You're not entirely sure where");
                        dungeon.fancyOutput("to go from here, but you're sure that whatever happens from now will be much better than");
                        dungeon.fancyOutput("living the rest of your days in that cell.");
                        
                        dungeon.waitForEnter();
                       
                        dungeon.fancyOutput("SUDDENLY! A GUARD STOPS YOU");
                                                
                        dungeon.fancyOutput("'HALT!' the guard says, 'IN ORDER TO LEAVE THIS AREA, YOU MUST ANSWER MY QUESTION'");
                        dungeon.fancyOutput("He looks completely decked out in some of the coolest looking armor you've ever seen.");
                        
                        dungeon.fancyOutput("'BUT BEFORE THAT, STATE YOUR NAME!'");
                        
                        decision5 = dungeon.getOptionIntSafe(
                            " Say your name",
                            " Make up a name");


                        if (decision5 == 1)
                        {

                            dungeon.fancyOutput(player.getName() + "!");
                            dungeon.fancyOutput("'Hmm... okay " + player.getName() + ",' he says, 'I'm going to ask you a bit of trivia, if you " );
                            dungeon.fancyOutput("manage to answer it correctly you are free to go.'");
                            dungeon.fancyOutput("Alright! Finally a chance to escape! Let's see what the question is!");
                            
                            dungeon.waitForEnter();

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;

                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;

                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }                            
                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("'Well, uh, my name's Eric of course!'");
                            dungeon.fancyOutput("The guard looks offended that you would even say such a thing. You realize telling");
                            dungeon.fancyOutput("the truth would have been a much better idea. 'How dare you! This was a test of trust,");
                            dungeon.fancyOutput("as I already knew your name as I saw you escaping your cell..." + player.getName() + "...'");
                            dungeon.fancyOutput("'Go back into your cell right now!' With a blade to your neck, you comply and go back.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            return false;
                             
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("'Your name son, let me hear your damn name!' He shouts. You have nothing to say,");
                            dungeon.fancyOutput("and this only makes the guard much more angry. He takes out his sword and decides it's");
                            dungeon.fancyOutput("best to stab you with it! 'Fool...' he says.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: hit the number labeled next time!");

                            return false;


                        }
                        
                    }

                    else if (decision4 == 2)
                    {
                        dungeon.fancyOutput("Without thinking twice, you swing the sword as hard as possible, only to have it shatter");
                        dungeon.fancyOutput("into a million pieces! With this, a shard of the sword suddenly strikes your gut and then");
                        dungeon.fancyOutput("your throat! You are completely stunned by this and tumble down to the floor! You now");
                        dungeon.fancyOutput("know you are as good as dead. In your last moments of life, you think about how you even");
                        dungeon.fancyOutput("ended up in this horrid cell in the first place. You kind of wished that you just stayed");
                        dungeon.fancyOutput("in the cell and waited to think of something smarter to do.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        return false;
                         
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("Not entirely sure of what you're doing, the sword slips from your hands, bounces off the ");
                        dungeon.fancyOutput("wall, and then somehow manages to jump right through you! Bleeding out, you kind of wish");
                        dungeon.fancyOutput("you would have just paid a little bit more attention to what you were doing!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: hit the keys that are presented next time!");

                        return false;
                         
                        
                    }

                    
                }

                else 
                {
                    dungeon.fancyOutput("Unsure of what to do, you think it could be a good idea to pace around a little");
                    dungeon.fancyOutput("and strategize. Foolishly, however, you somehow manage to trip over the rock you");
                    dungeon.fancyOutput("noticed earlier. Not only this, but you even managed to fall into the rusty sword!");
                    dungeon.fancyOutput("It stabs you, and with lack of proper treatment to the wound, kills you.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("YOU DIED");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Hint: When you're given numbers, hit them! Don't a number that isn't listed!");

                    return false;
                     
                    
                }
            }

            else if (decision2 == 2)
            {
                int decision3;

                dungeon.fancyOutput("After crying and sulking, you realize that it would probably");
                dungeon.fancyOutput("be more efficient to call for somebody, since it is possible");
                dungeon.fancyOutput("someone could be walking by on the outside");

                dungeon.waitForEnter();

                dungeon.fancyOutput("Do you:");
                
                decision3 = dungeon.getOptionIntSafe(
                    " Call for somebody",
                    " Continue to sulk and cry");


                if (decision3 == 1)
                {
                    int decision4;

                    dungeon.fancyOutput("There you are, screaming bloody murder for anybody to come to your rescue.");
                    dungeon.fancyOutput("'But this is no fairy tale or game!', you think to yourself, 'You really are ");
                    dungeon.fancyOutput("trapped and you really are on your own!' Screaming brings no progress to your ");
                    dungeon.fancyOutput("mission to get out, but, contrary to your pessimistic thoughts, screaming did");
                    dungeon.fancyOutput("end up bring somebody! Although, more accurately, it brought something!");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " 'A rat!'",
                        " 'A dog!'",
                        " 'A bear!'");

                     

                    if (decision4 == 1)
                    {
                        dungeon.fancyOutput("A rat! Thank goodness, now you're really in business. All you have to do is lure");
                        dungeon.fancyOutput("the rat over and try and train it to help you! 'While it will take a while,' you '");
                        dungeon.fancyOutput("think to yourself, 'it will pay off in the longrun!' While you think this outloud,");
                        dungeon.fancyOutput("the rat jumps through the bars of the cell and lunges onto your neck! It bites you");
                        dungeon.fancyOutput("as hard as it possibly can until you rip it off and throw it against the wall!");
                        dungeon.fancyOutput("Suddenly, you feel very dizzy and collapse onto the floor. You realize that the");
                        dungeon.fancyOutput("rat was probably sick with something, and it probably wasn't a good idea to attract");
                        dungeon.fancyOutput("a sickly animal into a very unsanitary environment. You do not get up, as you can't.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED"); 

                        return false;
                         
                        
                    }

                    else if (decision4 == 2)
                    {
                        int decision5;
    
                        dungeon.fancyOutput("A dog! Thank goodness, maybe this faithful companion can help you escape!");
                        dungeon.fancyOutput("'Hey dog! Help me please! Look for a way to get out of this cell! Please!'");
                        dungeon.fancyOutput("The dog then runs away, and you think to yourself that you will probably not");
                        dungeon.fancyOutput("see him again. Suddenly, the bars shoot down from the holes that they were");
                        dungeon.fancyOutput("protruding from, making a completely open hole! You quickly climb out of the");
                        dungeon.fancyOutput("cell and run as fast as you can!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("SUDDENLY! A GUARD STOPS YOU");
                        dungeon.fancyOutput("'HALT!' the guard says, 'IN ORDER TO LEAVE THIS AREA, YOU MUST ANSWER MY QUESTION'");
                        dungeon.fancyOutput("He looks completely decked out in some of the coolest looking armor you've ever seen.");
                        
                        dungeon.fancyOutput("'BUT BEFORE THAT, STATE YOUR NAME!'");
                        
                        decision5 = dungeon.getOptionIntSafe(
                            " Say your name",
                            " Make up a name");


                        if (decision5 == 1)
                        {
 
                            dungeon.fancyOutput(player.getName() + "!");
                            dungeon.fancyOutput("'Hmm... okay " + player.getName() + ",' he says, 'I'm going to ask you a bit of trivia, if you " );
                            dungeon.fancyOutput("manage to answer it correctly you are free to go.'");
                            dungeon.fancyOutput("Alright! Finally a chance to escape! Let's see what the question is!");
                            
                            dungeon.waitForEnter();

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("'Well, uh, my name's Eric of course!'");
                            dungeon.fancyOutput("The guard looks offended that you would even say such a thing. You realize telling");
                            dungeon.fancyOutput("the truth would have been a much better idea. 'How dare you! This was a test of trust,");
                            dungeon.fancyOutput("as I already knew your name as I saw you escaping your cell..." + player.getName() + "...'");
                            dungeon.fancyOutput("'Go back into your cell right now!' With a blade to your neck, you comply and go back.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            return false;
                             
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("'Your name son, let me hear your damn name!' He shouts. You have nothing to say,");
                            dungeon.fancyOutput("and this only makes the guard much more angry. He takes out his sword and decides it's");
                            dungeon.fancyOutput("best to stab you with it! 'Fool...' he says.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: hit the number labeled next time!");

                            return false;
                             
                            
                        }
                        
                    }

                    else if (decision4 == 3)
                    {
                        dungeon.fancyOutput("A bear! Thank goodness, maybe this beast can rip the bars straight from the cell");
                        dungeon.fancyOutput("You throw a rock at the bear, hoping to anger it enough so that it will try and find");
                        dungeon.fancyOutput("a way to attack you. After the third rock to its head, you finally anger it enough!");
                        dungeon.fancyOutput("It rips the bars straight from the cell window! Finally, a way out! However, you did");
                        dungeon.fancyOutput("not fully think this through, and you didn't necessarily think about how slim the bear");
                        dungeon.fancyOutput("really was! It has found a way into your cell and starts to maul you!");
                        dungeon.fancyOutput("In your panic, you realize how it probably wasn't a good idea to anger a bear of all");
                        dungeon.fancyOutput("creatures. Maybe in another life you will be a little more wise.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        return false;
                         
                        
                        
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("For some reason, you think that now is the best time to space out about what's happening around");
                        dungeon.fancyOutput("you. Tons of animals and people seem to go by, but you feel completely incapable to do anything");
                        dungeon.fancyOutput("about it. You realize maybe it wouldn't be so bad to live and die in this cell. After all,");
                        dungeon.fancyOutput("how would they make a cell without thinking of every possible way to get out of it! How");
                        dungeon.fancyOutput("foolish it was of you to think that there would be a fault somewhere.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU FAILED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: hit the number labeled next time!");

                        return false;
                         
                        
                        
                    }

                    
                }

                else if (decision3 == 2)
                {
                    int decision4;

                    dungeon.fancyOutput("Well, there you are, crying as if you were the same age as a newborn child.");
                    dungeon.fancyOutput("'Is this it?' you think to yourself, 'is this really how my life ends?'");
                    dungeon.fancyOutput("No! Of course not! You're " + player.getName() + "after all!");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you:");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " Try to think of something else",
                        " Continue to cry");

                     
                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("While standing there thinking of what to do, you suddenly hear footsteps coming from your left!");
                        dungeon.fancyOutput("It's a guard! Finally, now you have a chance to get out of here!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Try to pickpocket a key off of him while he's walking by",
                            " Tell him to release you immediately");
                        

                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("'Theif!' He shouts, after unlocking the door, you see absolutely no opportunity to escape");
                            dungeon.fancyOutput("'Your life ends here fool,' He pulls out his sword and trys to swing for you, although");
                            dungeon.fancyOutput("you are able to swoop out from under him and run away! You run into the first door you");
                            dungeon.fancyOutput("see, which happens to be the king sipping a cup of tea! You soil yourself right before");
                            dungeon.fancyOutput("the guard launches his sword right into your back! You are killed instantly.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             
                            
                        }

                        else if (decision5 == 2)
                        {

                            dungeon.fancyOutput("'Well okay, but you have to answer my question first.'");
                            dungeon.fancyOutput("Finally, a guard has cut you a break! Now it's time to answer his question!");
                            
                            dungeon.waitForEnter();
                            
                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                        }

                        else 
                        {
                            dungeon.fancyOutput("Not entirely sure what to do from there, you kind of just soil yourself and stand like you");
                            dungeon.fancyOutput("just lost your brain! The guard is pretty grossed out and continues to walk by, but this");
                            dungeon.fancyOutput("time much faster. You missed your opportunity to escape! Fool!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: if you've made it this far, I'm not sure what to tell you other than to hit the displayed number!");

                            return false; 
                            
                        }

                    }

                    else if (decision4 == 2)
                    {
                        int decision5;
                        
                        
                        dungeon.fancyOutput("There you are, still crying. In fact, you're crying so hard that you don't notice the guard that's");
                        dungeon.fancyOutput("standing right outside the barred door! 'WILL YOU SHUT UP ALREADY!' he screams. 'I'VE BEEN");
                        dungeon.fancyOutput("LISTENING TO YOU CRY FOR THE PAST HOUR NOW, DON'T YOU EVER STOP?!'");
                        
                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Try to ask why you're in this dungeon",
                            " Continue to cry");


                        if (decision5 == 1)
                        {

                            dungeon.fancyOutput("'Well you're in this dungeon because... um, actually... I'm not sure. In fact, do you");
                            dungeon.fancyOutput("want out? The King lets prisoners out if we ask them a question.'");
                            dungeon.fancyOutput("'YES!' you beg, kind of creeping out the guard with your enthusiasm.");

                            dungeon.waitForEnter();

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                            
                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("After continuing to cry, the guard gets so fed up that he tries to open the door strangle");
                            dungeon.fancyOutput("you! This happened completely without warning, and he eventually gets the better of your");
                            dungeon.fancyOutput("weak and exhausted body! With no strength to defend yourself, he kills you");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             
                            
                        }

                        else
                        {
                        dungeon.fancyOutput("After hearing what the guard said to you, you feel completely like a deer in headlights!");
                        dungeon.fancyOutput("You don't move or say anything, and the guard then scoffs before walking away.");
                        dungeon.fancyOutput("Now your only hope of getting out has escaped! How foolish!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU FAILED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: actually hit the key that's displayed next time!");

                        return false;
                         
                        }
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("After crying for so long, you eventually start to get a massive headache! This doesn't stop");
                        dungeon.fancyOutput("you from crying your eyes out, though, and eventually that headache turns into a migraine.");
                        dungeon.fancyOutput("The migraine gets so painful that you eventually drop to the floor and pass out. When you");
                        dungeon.fancyOutput("wake up after god knows how many hours, you continue to cry! This goes on for weeks, until");
                        dungeon.fancyOutput("you die of thirst from all the tears you've been crying.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: actually hit the button that's displayed next time!");

                        return false;
                         
                        
                        
                    }

                    
                }

                else 
                {
                    dungeon.fancyOutput("You continue to cry, thinking how you can't even manage to hit the correct");
                    dungeon.fancyOutput("number when shown! How sad! Maybe you really do belong in this cell forever!");
                    dungeon.fancyOutput("Once you think of that statement, you realize you should just rot in this cell.");
                    dungeon.fancyOutput("After an unknown amount of time, you eventually die from lack of food and water.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("YOU DIED");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Hint: hit the number you see next time!");

                    return false;
                     
                                        
                }
            }

            else
            {
                dungeon.fancyOutput("After looking outside, you come to the acceptance that");
                dungeon.fancyOutput("you will never be able to escape this dungeon. With all");
                dungeon.fancyOutput("hope lost, you lay on your bed and whither away with time.");

                dungeon.waitForEnter();

                dungeon.fancyOutput("YOU FAILED");

                dungeon.waitForEnter();

                dungeon.fancyOutput("Hint: please actually hit the indicated number!");

                return false;
                 
            }

        }
        
        else if (decision1 == 2)
        {
            int decision2;

            dungeon.fancyOutput("Walking to the cell door, you see a torch of some kind!");
            
            dungeon.waitForEnter();

            dungeon.fancyOutput("What do you do from here?");
            
            decision2 = dungeon.getOptionIntSafe(
                " Try to call for a someone",
                " Pound your head against the wall in frustration");


            if (decision2 == 1)
            {
                int decision3;

                dungeon.fancyOutput("Screaming for someone, you guess that you are the only");
                dungeon.fancyOutput("person in this hell hole. Feeling foolish, you realize that since");
                dungeon.fancyOutput("it is dark outside and there is a lit torch in the hallway outside,");
                dungeon.fancyOutput("you can't be the only one in here!");

                dungeon.waitForEnter();

                dungeon.fancyOutput("Do you:");
                
                decision3 = dungeon.getOptionIntSafe(
                    " Scream even louder, hoping to wake up someone near",
                    " Go to bed in the corner, hoping that you'll have better luck in the morning");


                if (decision3 == 1)
                {
                    int decision4;

                    dungeon.fancyOutput("You continue to scream for someone to help you. And someone did end up");
                    dungeon.fancyOutput("coming! This man is dressed fully in chainmail and looks very annoyed!");
                    dungeon.fancyOutput("He looks at you straight in the eye and screams 'Will you shut up! A royal");
                    dungeon.fancyOutput("guard has got to sleep too, you know!'");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you say:");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " 'Why am I in prison!? I did nothing wrong!'",
                        " 'If you let me free, I know a way to make you rich beyond wonders!'");
                    
                     

                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("'WHY are you here, you ask!? How am I supposed to know that!? What do I look like to you,");
                        dungeon.fancyOutput("the king himself!'");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you say:");

                        decision5 = dungeon.getOptionIntSafe(
                            " 'Can you let me out?'",
                            " 'Can you let me out, please?'");


                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("'How rude! Not even a please!?' Without warning, the clearly offended guard decides");
                            dungeon.fancyOutput("that you are not fit to live, so he whips out his sword and kills you without");
                            dungeon.fancyOutput("warning! Well, I guess that's why they teach you to say please when you're, like, 5, right?");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             
                            
                        }

                        else if (decision5 == 2)
                        {

                            dungeon.fancyOutput("'I mean... yeah... you just have to answer some trivia first... Can you do that?'");
                            dungeon.fancyOutput("'YES!' you scream! 'Okay okay! jeez, no need to get so worked up.'");

                            dungeon.waitForEnter();

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                        }

                        else
                        {
                            dungeon.fancyOutput("After hearing what the guard said to you, you feel completely like a deer in headlights!");
                            dungeon.fancyOutput("You don't move or say anything, and the guard then scoffs before walking away.");
                            dungeon.fancyOutput("Now your only hope of getting out has escaped! How foolish!");

                            dungeon.waitForEnter();
                            
                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: actually hit the key that's displayed next time!");

                            return false; 
                             
                        }
                        
                    }

                    else if (decision4 == 2)
                    {
                        int decision5;

                        dungeon.fancyOutput("'I'LL HAVE YOU KNOW THAT BRIBERY IS AGAINST THE LAW!' you start to panic over how that might");
                        dungeon.fancyOutput("not have been the best thing to say to him! He then opens the gate to try and harm you!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Try to fight the guard",
                            " Try to run pass him and book it");


                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("Not entirely sure of how to fight this guard, you throw a punch aimed for his head!");
                            dungeon.fancyOutput("While the punch does connect, you slip right into his sword! You feel pretty foolish,");
                            dungeon.fancyOutput("as you are in no condition to fight from how weak you are!");
                            
                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false; 
                             

                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("You swoop right under him and manage to escape through what seems to be another barred");
                            dungeon.fancyOutput("door, this is no problem as you just run right through it because of how thin you have");
                            dungeon.fancyOutput("become! You run and you run and eventually you have no idea where you are. But, you are");
                            dungeon.fancyOutput("outside, so technically you are free?");
                            dungeon.fancyOutput("YOU ESCAPED");

                            return true;
                             
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("The guard does exactly as you predict and cuts you completely in two! Although you");
                            dungeon.fancyOutput("had ample time to get out of there, you kind of just stood there and took it.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            dungeon.waitForEnter();
                            
                            dungeon.fancyOutput("Hint: hit the key displayed next time!");
                            
                            return false; 
                             
                            
                        }
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("After hearing what the guard said to you, you feel completely like a deer in headlights!");
                        dungeon.fancyOutput("You don't move or say anything, and the guard then scoffs before walking away.");
                        dungeon.fancyOutput("Now your only hope of getting out has escaped! How foolish!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU FAILED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: actually hit the key that's displayed next time!");

                        return false;
                         
                    }

                }

                else if (decision3 == 2)
                {
                    int decision4;

                    dungeon.fancyOutput("What a good night's sleep you had! Feeling refreshed, you completely forget");
                    dungeon.fancyOutput("that you were even in a dungeon! You were at least hoping for some scrambled");
                    dungeon.fancyOutput("eggs! Remembering where you are, you become quickly depressed and decide to");
                    dungeon.fancyOutput("see if someone is outside the cell door. You walk to the cell door and see");
                    dungeon.fancyOutput("a guard dressed in full chainmail armor!");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you say:");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " 'Hey! Come over here! Why am I here!?'",
                        " 'I bet I could take you in a fight, coward!'");
                    
                     
                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("You scream at the guard, only to have him become more annoyed than before!");
                        dungeon.fancyOutput("You continue to scream until he marches towards you with as much anger in his");
                        dungeon.fancyOutput("eyes as a tiger! You start to panic as he unlocks the door to try and harm you!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Try to fight him",
                            " Book it as soon as he opens the door");


                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("Not entirely sure of how to fight this guard, you throw a punch aimed for his head!");
                            dungeon.fancyOutput("While the punch does connect, you slip right into his sword! You feel pretty foolish,");
                            dungeon.fancyOutput("as you are in no condition to fight from how weak you are!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             

                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("You swoop right under him and manage to escape through what seems to be another barred");
                            dungeon.fancyOutput("door, this is no problem as you just run right through it because of how thin you have");
                            dungeon.fancyOutput("become! You run and you run and eventually you have no idea where you are. But, you are");
                            dungeon.fancyOutput("outside, so technically you are free?");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU ESCAPED");

                            return true;
                             
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("The guard does exactly as you predict and cuts you completely in two! Although you");
                            dungeon.fancyOutput("had ample time to get out of there, you kind of just stood there and took it.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: hit the key displayed next time!");

                            return false;
                             
                            
                        }
                        
                    }

                    else if (decision4 == 2)
                    {
                        int decision5;

                        dungeon.fancyOutput("After saying these words to the guard, his eyes light up with fire! He marches towards");
                        dungeon.fancyOutput("the cell door and as soon as he halts, he shouts 'I'll have you know, I am one of the ");
                        dungeon.fancyOutput("most talented sword fighters in my barrack! Now, how would you like to fight me?!'");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you fight using your:");

                        decision5 = dungeon.getOptionIntSafe(
                            " Fists",
                            " Swords",
                            " Mind");
                        
                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("'Very well' he says as he takes off his arm braces and drops his sword.");
                            dungeon.fancyOutput("When he raises his fists, you raise yours! Only problem is, you look at your arms");
                            dungeon.fancyOutput("and realize you're in no position to fight back, you're much too weak! He");
                            dungeon.fancyOutput("knocks you out completely with one punch to the skull. Although you're not dead,");
                            dungeon.fancyOutput("you can no longer move anything beyond your neck!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            return false;
                             
                            
                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("'Very well' he syas as he drops his shield and raises his sword in a fighting");
                            dungeon.fancyOutput("position. Finally, a fair fight! You raise the rusty sword in the corner of the room,");
                            dungeon.fancyOutput("but realize you kind of can't raise it at all! It is much to heavy for your week");
                            dungeon.fancyOutput("frame, and you drop the sword giving the guard a perfect opportunity to swing it!");
                            dungeon.fancyOutput("He cuts you in two and kills you instantly!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             
                            
                        }

                        else if (decision5 == 3)
                        {

                            dungeon.fancyOutput("Very Well...");

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                        }

                        else 
                        {
                            dungeon.fancyOutput("After soiling yourself, the guard decides he has little time for this and just walks");
                            dungeon.fancyOutput("out of your cell and leaves you alone. Although you're not dead, you didn't escape. and");
                            dungeon.fancyOutput("probably won't.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: actually hit the number displayed next time!");

                            return false; 
                             
                            
                            
                        }
                    }

                    else
                    {
                        dungeon.fancyOutput("When you see the guard, you're not entirely sure of what to do with yourself. So, ");
                        dungeon.fancyOutput("instead of doing anything about it, you decide to soil your pants and fall to the");
                        dungeon.fancyOutput("floor. You decide maybe your social anxiety got the better of you.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU FAILED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: try to hit the number that's shown next time!");

                        return false;
                         
                        
                    }

                }

                else 
                {
                    dungeon.fancyOutput("After a couple minutes of screaming doesn't help, you eventually give up on the");
                    dungeon.fancyOutput("hope you will ever leave this dungeon. It's too bad though, as you don't even know");
                    dungeon.fancyOutput("why you're carrying out a life sentence in the first place.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("YOU FAILED");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Hint: hit the number presented! Not a random character!");

                    return false;
                     
                    
                }
            }

            else if (decision2 == 2)
            {
                int decision3;

                dungeon.fancyOutput("You've really had it this time! You get so angry at the thought");
                dungeon.fancyOutput("that someone would imprison " + player.getName() + " of all people! What did you do wrong?!");
                dungeon.fancyOutput("You start to bang your head against the wall, suddenly feeling light headed");
                dungeon.fancyOutput("with blood rushing down your hears.");

                dungeon.waitForEnter();

                dungeon.fancyOutput("Do you:");
                
                decision3 = dungeon.getOptionIntSafe(
                    " Actually try to think of a solution instead of harm yourself",
                    " Charge full speed ahead at the bars like a bull");


                if (decision3 == 1)
                {
                    int decision4;

                    dungeon.fancyOutput("After think long and hard, you begin to realize that it is not normal");
                    dungeon.fancyOutput("for this amount of blood to be leaving your body all at once! Any amount");
                    dungeon.fancyOutput("for that matter! You need to determine what to do fast before something bad is");
                    dungeon.fancyOutput("to happen!");
                    
                    decision4 = dungeon.getOptionIntSafe(
                        " 'The blood is probably coming from my brain!'",
                        " 'AAAA!!! CRAP!!!!!! MY ANATOMY TEACHER WAS RIGHT TO FAIL ME!!'");

                     

                    if (decision4 == 1)
                    {
                        dungeon.fancyOutput("Coming to this conclusion, you try to think about the best way to treat a rattled");
                        dungeon.fancyOutput("brain. 'Of course!' you exclaim, 'If I wrap a shirt around my head, I'll stop the");
                        dungeon.fancyOutput("bleeding!' When trying to tie the shirt around your head, however, you realize maybe");
                        dungeon.fancyOutput("you tied the shirt a little too tight around your head, or maybe it's the concussion.");
                        dungeon.fancyOutput("You fall to the floor, dead.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        return false;
                         
                        
                        
                    }

                    else if (decision4 == 2)
                    {
                        dungeon.fancyOutput("You start to freak out about what to do next that you think that maybe slamming your");
                        dungeon.fancyOutput("head against the wall wasn't the best idea that you had thought of. You continue");
                        dungeon.fancyOutput("to freak out and run around your cell until you get so tired you collapse onto the");
                        dungeon.fancyOutput("floor, dead.");
                        dungeon.fancyOutput("YOU DIED");       

                        return false;
                                         
                    }

                    else
                    {
                        dungeon.fancyOutput("Realizing it was a bad idea to rattle your brain against the wall, you kind of just");
                        dungeon.fancyOutput("stand there until you feel like you're too weak to even do that. You collapse");
                        dungeon.fancyOutput("onto the floor, dead.");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU DIED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: although in this scenario, hitting any button would have killed you. GG");

                        return false;
                         
                        
                    }

                    
                }

                else if (decision3 == 2)
                {
                    int decision4;

                    dungeon.fancyOutput("You begin to kick the dirt up behind you! You're really determined to take");
                    dungeon.fancyOutput("out all of your rage on this metal bar ahead of you! Then...");
                    dungeon.fancyOutput("You charge! But what happened? You didn't end up hitting anything? In fact,");
                    dungeon.fancyOutput("you're on the other side of the cell door now! After analyzing what happened,");
                    dungeon.fancyOutput("you concluded that you were actually slim enough to wiggle your way through");
                    dungeon.fancyOutput("the bars! They are quite wide apart after all.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Do you:");
                   
                    decision4 = dungeon.getOptionIntSafe(
                        " Turn left and look for something",
                        " Turn right and look for something");

                     

                    if (decision4 == 1)
                    {
                        int decision5;

                        dungeon.fancyOutput("You run to the left and look for anything that could help you. You then see");
                        dungeon.fancyOutput("a grand door! When you open it, you see a man in a throne with 10 guards all");
                        dungeon.fancyOutput("around! It's the King of course! 'Prisoner! Guards, sieze him!' They all surround");
                        dungeon.fancyOutput("you and hold you as tight as possible! 'WAIT!' the king proclaims, 'I have a deal");
                        dungeon.fancyOutput("to strike with you, answer my one question and you are free to go!");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you reply with:");

                        decision5 = dungeon.getOptionIntSafe(
                            " 'GO TO HELL!!'",
                            " 'Please! Anything!!'");


                        if (decision5 == 1)
                        {
                            dungeon.fancyOutput("'Oh... okay... nevermind... just kill him boys'");
                            dungeon.fancyOutput("This was probably not the best decision you've made, as the very second those");
                            dungeon.fancyOutput("words leave his mouth, your head is removed from your body!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU DIED");

                            return false;
                             
                            
                        }

                        else if (decision5 == 2)
                        {

                            dungeon.fancyOutput("Alright... Hmmm...");
                                                        
                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }
                        }

                        else 
                        {
                            dungeon.fancyOutput("The king sits there waiting for you to reply, to which you do not. He's clearly");
                            dungeon.fancyOutput("annoyed and just waves his hands. After this action, you are escorted back into");
                            dungeon.fancyOutput("you cell. You really messed it up this time bud.");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            return false;
                             
                            
                        }
                        
                        
                    }

                    else if (decision4 == 2)
                    {
                        int decision5;

                        dungeon.fancyOutput("When you run to the right, a guard stops you! 'HALT!' he says, 'I see that you");
                        dungeon.fancyOutput("are trying to escape the kings dungeon! Well, I don't care for this job much so");
                        dungeon.fancyOutput("I'll make a deal with you. I have one question and one question only. If you");
                        dungeon.fancyOutput("can give me the correct answer to this question, I'll let you go, deal?'");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Do you reply with:");

                        decision5 = dungeon.getOptionIntSafe(
                            " YES, I BEG OF YOU",
                            " Nah, no deal Howie");


                        if (decision5 == 1)
                        {
 
                            dungeon.fancyOutput("Okay...");

                            int randomquestionnumber = (int) (Math.random() * 8);

                            if(randomquestionnumber == 1)
                            {
                                int answer;
                                dungeon.fancyOutput("'Is (1 2 +) valid code in clojure?'");
                                                                                    
                                answer = dungeon.getOptionIntSafe(
                                    " 'YES'",
                                    " 'NO'",
                                    " 'NO... WAIT YES... I DON'T KNOW!!'");


                                if(answer == 2)
                                {
                                    dungeon.fancyOutput("'Alright, cool cool, you're free to go I guess.");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true; 
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nah, sorry. Guards, put him back!'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 2)
                            {
                                int answer;
                                dungeon.fancyOutput("'In the Java coding language, why do we use recursion?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " 'Be - Because it takes up less memory than iteration of course!'",
                                    " 'Well... uh... because it's faster than iteration?'",
                                    " 'Maybe... because um... it's simpler and more intuitive than iteration?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                            
                            }

                            else if(randomquestionnumber == 3)
                            {
                                int answer;
                                dungeon.fancyOutput("'If you're doing a binary search of over 1000 sorted names, how many names");
                                dungeon.fancyOutput("Do you have to look through to find the name you're looking for?");

                                answer = dungeon.getOptionIntSafe(
                                    " 'W - What?'",
                                    " '1, right?'",
                                    " 'I think this one is 100!'",
                                    " '10... I think?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");
                                        
                                    return false;
                                    
                                }
                                    
                            }

                            else if(randomquestionnumber == 4)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is the error called when you try to compile your Java file?'");
                                                        
                                answer = dungeon.getOptionIntSafe(
                                    " 'M - My what?'",
                                    " 'Run time... error?'",
                                    " 'Well that my dear friend... would be... um... Stack overflow?'",
                                    " 'Compile error? Is... is it compilation error?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");
                                    
                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                                        
                            }

                            else if(randomquestionnumber == 5)
                            {
                                int answer;
                                dungeon.fancyOutput("'In Java, what is the return type of a method that does not return a value?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Java? Uh... coffee??'",
                                    " 'that would be a double, I'm going to have that be my final answer!",
                                    " 'Well... uh... a float? Because they, like, float away?'",
                                    " 'Um... void? Like they're void of anything? Get it?");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                            }

                            else if(randomquestionnumber == 6)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is not part of merge sort's general strategy?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'Um... merging?'",
                                    " 'Um... splitting the items into roughly two even pieces?'",
                                    " 'well... to Mergesort each half recursively?'",
                                    " 'To... Partision items around a random pivot?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 7)
                            {
                                int answer;
                                dungeon.fancyOutput("'In a neural network, what part is actually 'trained' ?'");

                                answer = dungeon.getOptionIntSafe(
                                    " 'The... neutrons?'",
                                    " 'is it the... brain?'",
                                    " 'The... color? Maybe? No?'",
                                    " 'The edge weights... right?'");


                                if(answer == 4)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false;
                                        
                                    
                                }
                                
                            }

                            else if(randomquestionnumber == 8)
                            {
                                int answer;
                                dungeon.fancyOutput("'What is logarithm of 1000 to base 2?'");

                                answer = dungeon.getOptionIntSafe(
                                    " '1,000,000 of course! Come on, I passed Algebra with a D!'",
                                    " '1 of course! I mean, I failed Algebra how am I supposed to know!'",
                                    " '10 of course! A person of my knowledge would know! I count and talk real good!'");


                                if(answer == 3)
                                {
                                    dungeon.fancyOutput("'Hey! Good job! You're free to go!'");
                                    dungeon.fancyOutput("Nice! you were successful in your attempt to get out of the dungeon!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU ESCAPED");

                                    return true;
                                        
                                    
                                }

                                else
                                {
                                    dungeon.fancyOutput("'Nope, sorry, get back into your cell.'");
                                    dungeon.fancyOutput("Rats! If only you paid more attention in class!");

                                    dungeon.waitForEnter();

                                    dungeon.fancyOutput("YOU FAILED");

                                    return false; 
                                    
                                }
                                

                            }

                        }

                        else if (decision5 == 2)
                        {
                            dungeon.fancyOutput("'Oh okay, go back in your cell.'");
                            dungeon.fancyOutput("You for some reason did not take his offer and comply, completely biffing your");
                            dungeon.fancyOutput("chance to escape!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            return false; 
                            
                            
                        }

                        else 
                        {
                            dungeon.fancyOutput("'Um... hello?' The guard is pretty puzzled when you just say nothing to his offer.");
                            dungeon.fancyOutput("He eventually just picks you up and carries you back to your cell, where you soil");
                            dungeon.fancyOutput("yourself. Good job!");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("YOU FAILED");

                            dungeon.waitForEnter();

                            dungeon.fancyOutput("Hint: next time, hit the number labled!");

                            return false;
                             
                            
                        }
                        
                    }

                    else
                    {
                        dungeon.fancyOutput("Realizing what you did, you walk back into the cell afraid that you'll get in");
                        dungeon.fancyOutput("even more trouble for breaking the law. Maybe you'll get out sooner if you're on");
                        dungeon.fancyOutput("good behavior?");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("YOU FAILED");

                        dungeon.waitForEnter();

                        dungeon.fancyOutput("Hint: please hit the number displayed next time!");

                        return false;
                         
                        
                    }

                                        
                }

                else 
                {
                    dungeon.fancyOutput("Unable to think of anything to follow that up with, you continue to smash your head");
                    dungeon.fancyOutput("against the hard wall infront of you. While the wall stays the same, you start to");
                    dungeon.fancyOutput("feel less and less pain. Actually, you then notice you are becoming quite tired.");
                    dungeon.fancyOutput("Looking down, you see more blood stains on the floor than you have ever seen in your");
                    dungeon.fancyOutput("life. Lightheaded, you collapse onto the floor. You are dead.");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("YOU DIED");

                    dungeon.waitForEnter();

                    dungeon.fancyOutput("Hint: don't hit random keys! Hit the numbers that preceed the choices!");

                    return false;
                     
                    

                }
            }

            else
            {
                dungeon.fancyOutput("Unable to really follow up with anything after looking out the cell door,");
                dungeon.fancyOutput("you start to get bored with this new life in a prison cell.");
                dungeon.fancyOutput("Suddenly, you realize that maybe living in this prison cell can't be that");
                dungeon.fancyOutput("bad! After all, what debts do you have to pay or contracts do you have to");
                dungeon.fancyOutput("honor as a prisoner! You eventually realize that maybe this is for the best");
                dungeon.fancyOutput("you come to the conclusion that maybe you deserve to be in here. After all,");
                dungeon.fancyOutput("who would arrest an innocent man! Enjoy your new life (and possibly imminent death)!");

                dungeon.waitForEnter();

                dungeon.fancyOutput("YOU FAILED");

                dungeon.waitForEnter();

                dungeon.fancyOutput("Hint: follow directions next time! Do you really want to live here forever?");

                return false;
                 
            }
        }
        
        else
        {
            dungeon.fancyOutput("For some reason, you were completely unable to even think,");
            dungeon.fancyOutput("almost as if your mind and body stopped functioning.");
            dungeon.fancyOutput("You ended up standing in place, with days feeling like seconds");
            dungeon.fancyOutput("and weeks feeling like minutes. Eventually, you collapse and die.");

            dungeon.waitForEnter();

            dungeon.fancyOutput("YOU DIED");

            dungeon.waitForEnter();

            dungeon.fancyOutput("Hint: hit the indicated number next time!");

            return false;
             
        }   

        return true;
   
    }
    
}