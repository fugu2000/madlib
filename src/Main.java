import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // final story
    static String output;
    // Defines input types
    public static String[] s1 = { "noun", "adj", "noun", "noun", "adj", "adj", "noun", "noun", "noun", "noun", "noun", "adj", "adj", "noun", "noun", "noun", "noun", "adj", "noun", "adj" };
    public static String[] s2 = { "adj", "noun", "adj", "noun", "verb", "noun", "adj", "noun", "noun", "adj", "noun", "verb", "noun", "noun", "adj", "noun", "verb", "noun", "adj", "noun", "verb", "adj", "adj", "verb" };
    public static String[] s3 = {"adj", "noun", "pronoun", "verb", "noun", "pronoun", "verb", "noun", "pronoun", "noun", "verb", "noun", "verb", "adj", "pronoun", "verb", "pronoun", "pronoun", "verb", "adj", "pronoun", "noun", "adj"};
    public static String[] s4 = {"pronoun", "adj", "noun", "noun", "adj", "noun", "noun", "adj", "noun", "adj", "noun", "noun", "noun"};
    // Initializes scanner for input
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner boo = new Scanner(System.in);
    // Run boolean used to decide whether to repeat
    static boolean run = true;
    // Story integer used to determine which story should be used
    static public int story;
    //I HATE ARRAY LISTS
    static ArrayList<Integer> stories = new ArrayList<Integer>();
    public static ArrayList<String> storyInputs = new ArrayList<String>();
    public static void main(String[] args)
    {
        
        // Count integer to count how many stories used
        int count = 0;
        stories.add(0);
        stories.add(1);
        stories.add(2);
        stories.add(3);
        while(run)
        {
            // Welcome prompt
            System.out.println("");
            // randomize story number
            if(count > 0)
            {
                story = (int)(Math.random() * 4);
                // If story number was already chosen, choose again
                while (stories.contains(story) == false)
                {
                    story = (int)(Math.random() * 4);
                }
            }
            else
            {
                story = (int)(Math.random() * 4);
            }
            // erase story number from pool
            stories.remove(Integer.valueOf(story));
            count ++;
            // Initialize story
            MadLibsStory story1 = new MadLibsStory(story);
            
            // request required inputs
            for (int i = 0; i < story1.getLength(); i++)
            {
                story1.request(i);
            }
            // reach from text file to fill in blanks
            if(story == 0)
            {
                output = "There was once a cow. The cow really wanted to go on an adventure. This was not a normal cow. The cow had secret magic abilities and was capable of turning things into ";
                output += storyInputs.get(0);
                output += " and was ready to fight ";
                output += storyInputs.get(1);
                output += " evil ";
                output += storyInputs.get(2);
                output += ". His name was none other than Timmy. Timmy's iconic look included a";
                output += storyInputs.get(3);
                output += " and a ";
                output += storyInputs.get(4);
                output += ". Once dressed, the cow went on his ";
                output += storyInputs.get(5);
                output += " way. After a long ";
                output += storyInputs.get(6);
                output += " travel, the cow made it to ";
                output += storyInputs.get(7);
                output += "land! Here, there were three stages. Stage one was Timmy using his magic ";
                output += storyInputs.get(8);
                output += " to fight a ";
                output += storyInputs.get(9);
                output += "! It was a long tough battle, Timmy was untrained and ";
                output += storyInputs.get(10);
                output += ". Without a choice, Timmy channled it's inner ";
                output += storyInputs.get(11);
                output += ", and turned the ";
                output += storyInputs.get(12);
                output += " into a ";
                output += storyInputs.get(13);
                output += ". With the brush of a shoulder, Timmy was on his way. Next up, it was the ";
                output += storyInputs.get(14);
                output += " ";
                output += storyInputs.get(15);
                output += ". This enemy had tricks of their sleeves, as they could summon ";
                output += storyInputs.get(16);
                output += ". Using Timmy's ultimate dodging skills, it was able to tire the enemy and find the opportunity to turn the enemy into a ";
                output += storyInputs.get(17);
                output += ". Finally, Timmy was on the final stage. This time the enemy was a ";
                output += storyInputs.get(18);
                output += "The enemy used it's ultimate move: ";
                output += storyInputs.get(19);
                output += " ";
                output += storyInputs.get(20);
                output += " attack! And… oh, Timmy died. Aw shucks better luck next time. At least you can treat yourself to some ";
                output += storyInputs.get(21);
                output += " steak.";

                
            }
            else if(story == 1)
            {
                output = "Once upon a time, in a ";
                output += storyInputs.get(0);
                output += " land, there was a ";
                output += " that caused chaos wherever it went. This wasn't just any ordinary creature—this was the ";
                output += storyInputs.get(2);
                output += " ";
                output += storyInputs.get(1);
                output += " known as Fluffington. Fluffington had the power to ";
                output += storyInputs.get(3);
                output += " anyone who dared get too close, and it loved to terrorize the peaceful village of ";
                output += storyInputs.get(4);
                output += ".\n One day, the villagers decided they had enough. They gathered brave heroes to confront Fluffington and put an end to its reign of terror. With ";
                output += storyInputs.get(5);
                output += " weapons in hand, they set off on their dangerous journey. Along the way, they were forced to eat ";
                output += storyInputs.get(6);
                output += " to keep their strength up, but little did they know, Fluffington had an army of ";
                output += storyInputs.get(7);
                output += "s ready to strike. \n As the group ventured deeper into the heart of the ";
                output += storyInputs.get(8);
                output += " forest, they stumbled upon a ";
                output += storyInputs.get(9);
                output += ", which they believed would lead them to Fluffington's lair. Suddenly, they heard a ";
                output += storyInputs.get(10);
                output += " in the distance. They turned to find ";
                output += storyInputs.get(11);
                output += ", standing next to a glowing ";
                output += storyInputs.get(12);
                output += ". The ";
                output += storyInputs.get(13);
                output += " smirked and said, \"You'll never defeat Fluffington. You're too ";
                output += storyInputs.get(14);
                output += ".\" \n Just then, ";
                output += ", the village's best warrior, leapt into action. With a swift ";
                output += storyInputs.get(15);
                output += ", they took down several of Fluffington's minions. But the battle wasn't over. Fluffington, now furious, appeared with ";
                output += storyInputs.get(16);
                output += "s by its side. The heroes fought valiantly, but Fluffington was far too ";
                output += storyInputs.get(17);
                output += " for them to handle. \n In a final act of desperation, they used the ";
                output += storyInputs.get(18);
                output += " they had been carrying all along. With one mighty ";
                output += storyInputs.get(19);
                output += ", Fluffington was defeated. The village was saved, and peace was restored. The heroes were celebrated with a grand feast and ";
                output += storyInputs.get(20);
                output += " dance parties that lasted for days. \n And so, the legend of Fluffington, the ";
                output += storyInputs.get(21);
                output += " sheep, was passed down through generations. No one ever forgot the day they ";
                output += storyInputs.get(22);
                output += " and saved the village.";
                
            }
            else if(story == 2)
            {
                output = "Once upon a time in the ";
                output += storyInputs.get(0);
                output += " town, there lived a person named Isaac";
                output += storyInputs.get(1);
                output += " who had a problem. No matter how hard they tried, they couldn't stop ";
                output += storyInputs.get(2);
                output += ". It had innocently enough–just a ";
                output += storyInputs.get(3);
                output += "here or there, but soon Isaac couldn't go a single day without ";
                output += storyInputs.get(4);
                output += " at least ";
                output += storyInputs.get(5);
                output += " times. It became so bad that their friends started to notice.";
                output += storyInputs.get(6);
                output += "One morning, Isaac was at the local ";
                output += storyInputs.get(7);
                output += " when he suddenly felt the overwhelming urge to ";
                output += storyInputs.get(8);
                output += " Without even thinking, they grabbed a ";
                output += storyInputs.get(9);
                output += " and began ";
                output += storyInputs.get(10);
                output += " right there in front of everyone! A ";
                output += storyInputs.get(11);
                output += " crowd gathered around in confusion.";
                output += storyInputs.get(12);
                output += "Isaac, stop ";
                output += storyInputs.get(13);
                output += "! yelled their best friend, Isaac. But Isaac just couldn't help it. They had to ";
                output += storyInputs.get(14);
                output += " even when it made them look ";
                output += storyInputs.get(15);
                output += " The town doctor, Isaac, was called in to try and fix the issue. Isaac tried everything from ";
                output += storyInputs.get(16);
                output += " to a special potion, but nothing could stop Isaac from ";
                output += storyInputs.get(17);
                output += ". It was like a ";
                output += storyInputs.get(18);
                output += " curse had been placed on them. It kept on happening until finally, Isaac couldn't take it anymore and jumped off a ";
                output += storyInputs.get(19);
                output += ". The ";
                output += storyInputs.get(20);
                output += " problem soon seemed to fix itself.";
            }
            else
            {
                output += "One day, you found the ";

                output += storyInputs.get(0); 
                
                output += " guy by the river. You looked and found that this guy was actually Hammod! After Hammod was saved by you, he wanted to be your friend! Hammod was very ";
                
                output += storyInputs.get(1); 
                
                output += " and said to you: \"Hammond habibi!\" This made you very ";
                
                output += storyInputs.get(2); 
                
                output += ", so you invited Hammod to watch a movie. Although Hammod didn't understand because he only spoke Arabic, he still smiled at you. After watching the movie, you and Hammod went to dinner. Hammod was very ";
                
                output += storyInputs.get(3); 
                
                output += " and clapped his hands happily. He gestured, \"This is the most ";
                
                output += storyInputs.get(4);
                
                output += " thing I have ever eaten. I seem to have fallen in love with you. You are so good to me. I want to be your friend forever,\" so you decided to go a step further. After dinner, you and Hammod rowed a boat. Suddenly, Hammod fell into the water. You tried your best to save Hammod, saying: ";
                
                output += storyInputs.get(6); 
                
                output += " while saving him, but Hammod didn't say anything, just smiled at you and soon floated away. You felt very ";
                
                output += storyInputs.get(5); 
                
                output += " about this and cried bitterly, recalling every bit of Hammod and you. You wanted to say: ";
                output += storyInputs.get(7); 
                
                output += " while Hammod closed his eyes in the river... At this time, someone suddenly appears behind you. He is holding ";
                
                output += storyInputs.get(8); 
                
                output += " in his hand and keeps eating ";
                
                output += storyInputs.get(9); 
                
                output += " in his mouth. He said, \"Give up, you have gone through this cycle a thousand times, just for a Hammod that does not exist, what about it?\" This is a story about ";
                
                output += storyInputs.get(10);
                
                output += " and"; 
                
                output += storyInputs.get(11);
                 
                output += ". May your days be "; 
                
                output += storyInputs.get(12);
                 
                output += ",  "; 
                
                output += storyInputs.get(13);
                 
                output += ",  "; 
                
                output += storyInputs.get(14);
                 
                output += ",  and "; 
                
                output += storyInputs.get(15);
                 

            }
            System.out.println(output);
            // ask to repeat
            System.out.println("Would you like to leave? (I am NOT making a yes or no just type true or false gng :wilted_rose:");
            MadLibsUtility.getValidBoolean();
            if(MadLibsUtility.bInput == true)
            {
                run = false;
            }
            // clears out input list
            for(int i = storyInputs.size(); i > 0; i--)
            {
                storyInputs.remove(Integer.valueOf(i));
            }
            // check if all stories have been run through, if so, end program
            if (stories.size() == 0)
            {
                System.out.println("You've gone through all the stories!! And the program shuts down...");
                run = false;
            }
        }
    }
}
