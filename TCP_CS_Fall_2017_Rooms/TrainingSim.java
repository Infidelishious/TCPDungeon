/*
* Author: John Kaine
* Class: TrainingSim
*/

public class TrainingSim extends Room
{
    public String getAuthor()
    {
        return "John Kaine";
    }

    public String getRoomName()
    {
        return "Combat Training Simulation";
    }

    public boolean playerEnters(Player player) throws Exception
    {

        dungeon.fancyOutput(
            "You walk into the next room. It is stark white with a computer console in the center." +
            "The only door in the room is the one you walked through."+
            "Upon examination of the computer console, everything in the room dissapears.\n \n"+
            "Your vision is filled with text reading:\n"+
            "Kobayashi Maru type starship command training simulation v3.53.87.\n" +
            "What is your training? \n" +
            "1. Tactical\n" + //training = 1
            "2. Command\n" + //training = 2
            "3. Science\n"); //training = 3
        
        int answer = dungeon.getIntSafe();
        int training;
        int score = 100;
        
        if(answer == 1) //Tactical Training
        {
            training = 1;
            dungeon.fancyOutput(
                "Your tactical training has given you an extensive knowlege of starship weapons and shield systems. \n" +
                "You know precicely the best ways to use them in combat for both attack and defence."
            );
        }
        else if(answer == 2) //Command Training
        {
            training = 2;
            dungeon.fancyOutput(
                "Your training was not centered on your use of weapons or systems, but others' usage of them.\n" +
                "You know how to get people to do things you want and the best ways to have them do it."
            );
        }
        else//Science Training
        {
            training = 3;
            dungeon.fancyOutput(
                "You went to the academy to learn the workings of the universe and how to apply that knowlege." +
                "You know all the workings of starship systems like the back of your hand, from cloaking devices to warp engines."
            );
        }

        dungeon.waitForEnter();

        dungeon.fancyOutput(
            "You have been placed in command of a Yamato-X class dreadnought assigned to peacekeeping operations in the Delta Quadrant.\n" +
            "There have been recent reports of Vaadwaur attacks throughout federation holdings in the quadrant."
        );

        dungeon.waitForEnter();

        dungeon.fancyOutput(
            "Aboard the USS Kathryn Janeway, NCC-1337.\n" +
            "Stardate 182643.63"
        );

        dungeon.waitForEnter();

        /*Choice One*/
        dungeon.fancyOutput(
            "Your communicator chirps. It's the bridge. \n" +
            "Captain! You need to get up here, we're recieving what appears to be a distress call from the freighter Kobayashi Maru.\n" +
            "They say that a warp core breach is imminent. If we do not arrive soon the antimatter in their warp core might leak and destroy their entire ship.");
        
        dungeon.fancyOutput("You: ");
        answer = dungeon.getOptionIntSafe(
            "1. Respond: 'On my way!' and take the nearest turbolift to the bridge",
            "2. Respond: 'It must be a Vaadwaur trick. If we do not recieve another transmission within 5 minutes, set a course and let me know.'",
            "3. Ignore the message and continue playing with commander Data's cat spot");
        
        if(answer == 1)//Respond
        {
            dungeon.fancyOutput("Understood Captain.");
            dungeon.waitForEnter();
        }
        else if(answer == 2)//Wait Then Respond
        {
            score = score - 5;
            dungeon.fancyOutput("Understood Captain. We will wait for 5 minutes before proceeding to their location.");
            dungeon.waitForEnter();
        }
        else//Don't Respond
        {
            score = score - 100;
            dungeon.fancyOutput("Simulation terminated.");
            dungeon.fancyOutput("If you were a comissioned officer and you disregarded your absolute duty to this degree, you would be court martialed.");
            dungeon.fancyOutput("You scored" + score);
            return endScenario(score);
        }
        dungeon.waitForEnter();

        /*Choice Two*/
        dungeon.fancyOutput("When you arrive on the bridge you instruct the helmsman to lay in a course to the Kobayashi Maru.");
        dungeon.fancyOutput("Upon arriving at the transmitted coordinates, your crew finds a Vaadwaur battleship in the area. They are charging weapons.");
        dungeon.fancyOutput("You order the crew to go to red alert and:");
        answer = dungeon.getOptionIntSafe(
            "1. Prepare to fight!",
            "2. Prepare to flee!",
            "3. Prepare to abandon ship!");
        
        if(answer == 1)//fight
        {
            if(training == 1)//Tactical Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, charge phasers, and make photon torpedo tubes ready in all respects! Fire on my command!",
                    "2. Helm, anchor the ship in place on all non-rotational axis. Prepare to fire the prototype phaser lance on my command!.");

                if(answer == 1)
                {
                    score = score - 5;
                    dungeon.fancyOutput("After a prolonged battle with the Vaadwaur ship a torpedo slips past their shields and breaches their warp core, destroying the entire ship.");
                    dungeon.fancyOutput("Perhaps there was an easier way to destroy the ship.");
                }
                else
                {
                    dungeon.fancyOutput("The phaser lance works perfectly. As soon as the Vaadwaur ship was within range it was destroyed by one shot from the lance.");
                    dungeon.fancyOutput("Your ship sustained no damage during the fight.");
                }
                
            }
            else if(training == 2)//Command Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, charge phasers, and make photon torpedo tubes ready in all respects! Fire on my command!",
                    "2. Transfer command to the battle bridge! Prepare to seperate the saucer section. Both sections will open fire with all weapons on my command!");
                
                if(answer == 1)
                {
                    score = score - 5;
                    dungeon.fancyOutput("After a prolonged battle with the Vaadwaur ship a torpedo slips past their shields and breaches their warp core, destroying the entire ship.");
                    dungeon.fancyOutput("Perhaps there was an easier way to destroy the ship.");
                }
                else
                {
                    dungeon.fancyOutput("The Vaadwaur thought the seperating saucer section was the crew abandoning ship. It convinced them to come in slow. In their ignorance, they were destroyed almost immediately by the combined firepower of both ship sections.");
                    dungeon.fancyOutput("Your ship sustained no damage during the fight.");
                }
            }
            else//Science Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, charge phasers, and make photon torpedo tubes ready in all respects! Fire on my command!",
                    "2. Use the deflector dish to generate a graviton singularity and detonate it near their ship with a photon torpedo. Go to warp immediately after, the gravimetric shear will destroy anything within 1 light hour!");
                
                if(answer == 1)
                {
                    score = score - 5;
                    dungeon.fancyOutput("After a prolonged battle with the Vaadwaur ship a torpedo slips past their shields and breaches their warp core, destroying the entire ship.");
                    dungeon.fancyOutput("Perhaps there was an easier way to destroy the ship.");
                }
                else
                {
                    dungeon.fancyOutput("The Vaadwaur never knew what was going on. Upon detonation, the graviton singularity completely and instantly destroyed everything in the area.");
                    dungeon.fancyOutput("Your ship sustained no damage during the fight.");
                }
            }
        }
        else if(answer == 2)//Flee
        {
            if(training == 1)//Tactical Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, divert full power to engines! Plot a course to the nearest starbase!",
                    "2. Prepare to fire an antimatter spread to disrupt their sensors. Once we do, go to maximum warp to the nearest starbase. They won't be able to see us through the antimatter.");

                if(answer == 1)
                {
                    score = score - 55;
                    dungeon.fancyOutput("After a short battle with the Vaadwaur ship you are able to leave weapons range and escape. However, you did take damage during the fight.");
                    dungeon.fancyOutput("Perhaps there was a way to escape without taking damage.");
                }
                else
                {
                    dungeon.fancyOutput("The antimatter spread worked perfectly. The Vaadwaur couldnt see anything on sensors and you easily escaped into warp.");
                    dungeon.fancyOutput("Your ship sustained no damage during the escape.");
                }
            }
            else if(training == 2)//Command Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, divert full power to engines! Plot a course to the nearest starbase!",
                    "2. Launch fighters on remote control! Use them as distractions so we can go to warp safely!");
                
                if(answer == 1)
                {
                    score = score - 5;
                    dungeon.fancyOutput("After a short battle with the Vaadwaur ship you are able to leave weapons range and escape. However, you did take damage during the fight.");
                    dungeon.fancyOutput("Perhaps there was a way to escape without taking damage.");
                }
                else
                {
                    dungeon.fancyOutput("The fighters are the perfect diversion, the Vaadwaur were so destracted trying to destroy them that they alowed you to escape.");
                    dungeon.fancyOutput("Your ship sustained no damage during the escape.");
                }
            }
            else//Science Training
            {
                answer = dungeon.getOptionIntSafe(
                    "1. Raise shields, divert full power to engines! Plot a course to the nearest starbase!",
                    "2. Use the deflector dish to generate a tachyon field to disrupt their sensors and activate the cloaking device! Maximum warp to the nearest starbase.");
                
                if(answer == 1)
                {
                    score = score - 5;
                    dungeon.fancyOutput("After a short battle with the Vaadwaur ship you are able to leave weapons range and escape. However, you did take damage during the fight.");
                    dungeon.fancyOutput("Perhaps there was a way to escape without taking damage.");
                }
                else
                {
                    dungeon.fancyOutput("Your guns will not hit what your eyes will not see. The tachyon field and cloaking device enabled you to make the easiest escape from combat ever recorded.");
                    dungeon.fancyOutput("Your ship sustained no damage during the escape.");
                }
            }
        }
        else//abandon
        {
            score = score - 100;
            dungeon.fancyOutput("Simulation terminated.");
            dungeon.fancyOutput("There is no reason to abandon a perfectly good ship, however powerful your opponent might be.");
            return endScenario(score);
        }
        dungeon.waitForEnter();
        
        /*Choice Three*/
        Boolean detectionAdvantage;
        dungeon.fancyOutput("After a briefing of all your senior officers you collectively decide to notify Starfleet Command about the incident.");
        dungeon.fancyOutput("In addition to contacting command, your crew decides to: ");
        if(training == 2)//Command Training
        {
            answer = dungeon.getOptionIntSafe(
                "1. Continue returning to the nearest starbase to resupply and repair.",
                "2. Stay in the area and report the location of any Vaadwaur ships to command.",
                "3. Contact other ships in the region and create a patrol grid of the area to look for Vaadwaur ships.");

            if(answer == 1)
            {
                score = score - 10;
                dungeon.fancyOutput("You keep the ship steady as it goes to Deep Space 14.");
                dungeon.fancyOutput("However, you keep feeling that something bad could happen with nobody watching your sector of space.");
                detectionAdvantage = false;
            }
            else if(answer == 2)
            {
                score = score - 5;
                dungeon.fancyOutput("You instruct the crew to maintain a close sensor watch and patrol the local region.");
                dungeon.fancyOutput("However, you keep feeling that one ship is several too few for a large region of space.");
                detectionAdvantage = false;
            }
            else
            {
                dungeon.fancyOutput("Exploiting starfleet command regulations, you order several small ships to assist you in patrolling the region.");
                dungeon.fancyOutput("The size of the impomptu fleet will be more than enough to cover the entire region of space.");
                detectionAdvantage = true;
            }
        }
        else if(training == 3)//Science Training
        {
            answer = dungeon.getOptionIntSafe(
                "1. Continue returning to the nearest starbase to resupply and repair.",
                "2. Stay in the area and report the location of any Vaadwaur ships to command.",
                "3. Deploy a series of subspace beacons to cover the area in a sensor net to find any Vaadwaur ships.");

            if(answer == 1)
            {
                score = score - 10;
                dungeon.fancyOutput("You keep the ship steady as it goes to Deep Space 14.");
                dungeon.fancyOutput("However, you keep feeling that something bad could happen with nobody watching your sector of space.");
                detectionAdvantage = false;
            }
            else if(answer == 2)
            {
                score = score - 5;
                dungeon.fancyOutput("You instruct the crew to maintain a close sensor watch and patrol the local region.");
                dungeon.fancyOutput("However, you keep feeling that one ship is several too few for a large region of space.");
                detectionAdvantage = false;
            }
            else
            {
                dungeon.fancyOutput("Remembering some of your academy training you modify several photon torpedos to act as sensor buoys.");
                dungeon.fancyOutput("Their sensor capability will cover the entire region and alert you if anything tries to pass through.");
                detectionAdvantage = true;
            }
        }
        else//Tactical Training
        {
            answer = dungeon.getOptionIntSafe(
                "1. Continue returning to the nearest starbase to resupply and repair.",
                "2. Stay in the area and report the location of any Vaadwaur ships to command.");
            
            if(answer == 1)
            {
                score = score - 10;
                dungeon.fancyOutput("You keep the ship steady as it goes to Deep Space 14.");
                dungeon.fancyOutput("However, you keep feeling that something bad could happen with nobody watching your sector of space.");
                detectionAdvantage = false;
            }
            else
            {
                score = score - 5;
                dungeon.fancyOutput("You instruct the crew to maintain a close sensor watch and patrol the local region.");
                dungeon.fancyOutput("However, you keep feeling that one ship is several too few for a large region of space.");
                detectionAdvantage = false;
            }
        }
        dungeon.waitForEnter();

        /*Choice Four*/
        dungeon.fancyOutput("After carrying out your plan, you return to the local staging area where you originially picked up the distress call.");
        dungeon.fancyOutput("Suddenly you recieve a priority 1 transmission from Starfleet Command");
        dungeon.waitForEnter();
        if(detectionAdvantage = true)
        {
            dungeon.fancyOutput("We have detected a fleet of Vaadwaur ships advancing on Deep Space 14.");
            dungeon.fancyOutput("You are the only ship close enough to intercept them before they reach the station.");
            dungeon.fancyOutput("We are sending reinforcements that will arrive shortly after you do.");
            dungeon.waitForEnter();
            if(training == 2)
            {
                dungeon.fancyOutput("You order your small fleet to accompany you to the station and prepare for combat.");
                dungeon.fancyOutput("Scanners show that the fleet is comprised of several dreadnoughts supported by a carrier and several small cruisers.");
                dungeon.fancyOutput("You instruct the fleet to focus attacks on:");
                answer = dungeon.getOptionIntSafe(
                    "1. The dreadnoughts, their firepower will tear us apart.",
                    "2. The carriers, those fighters will overwhelm us.",
                    "3. The cruisers, without their support the bigger ships will be open to attack.");
                if(answer == 1)
                {
                    dungeon.fancyOutput("Your forces target the dreadnoughts.");
                    dungeon.fancyOutput("Once they fall, the rest of the Vaadwaur warp away.");
                    dungeon.fancyOutput("You have averted a catastrophe.");
                    return endScenario(score);
                }
                else if(answer == 2)
                {
                    score = score - 5;
                    dungeon.fancyOutput("Your forces target the carrier.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, some of your fleet is destroyed.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
                else
                {
                    score = score - 10;
                    dungeon.fancyOutput("Your forces target the screen of light cruisers.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, your fleet is destroyed and you barely survive.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
            }
            else
            {
                dungeon.fancyOutput("You instruct the crew to prepare for combat.");
                dungeon.fancyOutput("Scanners show that the fleet is comprised of several dreadnoughts supported by a carrier and several small cruisers.");
                dungeon.fancyOutput("You instruct the crew to focus attacks on:");
                answer = dungeon.getOptionIntSafe(
                    "1. The dreadnoughts, their firepower will tear us apart.",
                    "2. The carriers, those fighters will overwhelm us.",
                    "3. The cruisers, without their support the bigger ships will be open to attack.");

                if(answer == 1)
                {
                    dungeon.fancyOutput("You target the dreadnoughts.");
                    dungeon.fancyOutput("Once they fall, the rest of the Vaadwaur warp away.");
                    dungeon.fancyOutput("You have averted a catastrophe.");
                    return endScenario(score);
                }
                else if(answer == 2)
                {
                    score = score - 5;
                    dungeon.fancyOutput("You target the carrier.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, your ship takes slight damage.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
                else
                {
                    score = score - 10;
                    dungeon.fancyOutput("You target the screen of light cruisers.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, your ship is destroyed with most hands lost.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
            }
        }
        else
        {
            dungeon.fancyOutput("Deep Space 14 is under attack by a fleet of Vaadwaur ships.");
            dungeon.fancyOutput("You are the only ship close enough to save the station.");
            dungeon.fancyOutput("The closest reinforcements are at least 15 minutes away. Do your duty.");
            dungeon.waitForEnter();
            if(training == 1)
            {
                dungeon.fancyOutput("You instruct the crew to prepare for combat.");
                dungeon.fancyOutput("Scanners show that the fleet is comprised of several dreadnoughts supported by a carrier and several small cruisers.");
                dungeon.fancyOutput("You instruct the crew to focus attacks on the support ships.");
                dungeon.fancyOutput("Your tactical training tells you that without their support, the heavy ships will be open for attack.");
                
                dungeon.waitForEnter();
                
                dungeon.fancyOutput("The ship flies through the center of the formation, every phaser emitter operating at maximum power, spreads of photon torpedos flying everywhere.");
                dungeon.fancyOutput("In one pass, half the fleet is destroyed.");
                dungeon.fancyOutput("After the brief encounter, the enemy fleet is routed. The Vaadwaur will think twice before attacking again.");
                return endScenario(score);
            }
            else if(training == 2)
            {
                dungeon.fancyOutput("You order your small fleet to accompany you to the station and prepare for combat.");
                dungeon.fancyOutput("Scanners show that the fleet is comprised of several dreadnoughts supported by a carrier and several small cruisers.");
                dungeon.fancyOutput("You instruct the fleet to focus attacks on:");
                answer = dungeon.getOptionIntSafe(
                    "1. The dreadnoughts, their firepower will tear the station apart.",
                    "2. The carriers, those fighters will overwhelm the station defence grid.",
                    "3. The cruisers, without their support the bigger ships will be open to attack.");
                
                if(answer == 1)
                {
                    dungeon.fancyOutput("You target the dreadnoughts.");
                    dungeon.fancyOutput("Once they fall, the rest of the Vaadwaur warp away.");
                    dungeon.fancyOutput("You have averted a catastrophe.");
                    return endScenario(score);
                }
                else if(answer == 2)
                {
                    score = score - 5;
                    dungeon.fancyOutput("You target the carrier.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, the station takes slight damage.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
                else
                {
                    score = score - 10;
                    dungeon.fancyOutput("You target the screen of light cruisers.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, the station suffered severe casualties.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
            }
            else
            {
                dungeon.fancyOutput("You instruct the crew to prepare for combat.");
                dungeon.fancyOutput("Scanners show that the fleet is comprised of several dreadnoughts supported by a carrier and several small cruisers.");
                dungeon.fancyOutput("You instruct the crew to focus attacks on:");
                answer = dungeon.getOptionIntSafe(
                    "1. The dreadnoughts, their firepower will tear the station.",
                    "2. The carriers, those fighters will overwhelm the station defences.",
                    "3. The cruisers, without their support the bigger ships will be open to attack.");
                
                if(answer == 1)
                {
                    score = score + 5;
                    dungeon.fancyOutput("You target the dreadnoughts.");
                    dungeon.fancyOutput("Once they fall, the rest of the Vaadwaur attempt to warp away. You errect a graviton field to stop them. At that point they have no choice but to capitulate.");
                    dungeon.fancyOutput("You have averted a catastrophe.");
                    return endScenario(score);
                }
                else if(answer == 2)
                {
                    score = score - 5;
                    dungeon.fancyOutput("You target the carrier.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, your ship and the station take slight damage.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
                else
                {
                    score = score - 5;
                    dungeon.fancyOutput("You target the screen of light cruisers.");
                    dungeon.fancyOutput("Once it falls, the Vaadwaur are more open to attack.");
                    dungeon.fancyOutput("However, in the effort to destroy the rest of the fleet, your ship is destroyed with most hands lost.");
                    dungeon.fancyOutput("Their sacrifice was not in vain. You have averted a catastrophe.");
                    return endScenario(score);
                }
            }
        }
    }




    public boolean endScenario(Integer score)
    {
        if(score >= 75)//Pass
        {
            dungeon.fancyOutput("Simulation Complete. Congratulations! You have completed the Starfleet Academy final exam training simulation with a passing score.");
            dungeon.fancyOutput("Your score was" + score);
            return true;
        }
        else//Fail
        {
            dungeon.fancyOutput("However determined you may be, your performance on the exam was not satisfactory.");
            dungeon.fancyOutput("I regret to inform you that you have been discharged from the academy.");
            dungeon.fancyOutput("Your score was" + score);
            return false;
        }
    }
}