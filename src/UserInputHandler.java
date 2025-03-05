public class UserInputHandler
{
    static String input;
    // will ask for different words based on datatype which will then add to storyInputs
    public static void ask(String theType)
    {
        if (theType == "noun")
        {
            System.out.println("Please enter a noun.");
        }
        else if (theType == "pronoun")
        {
            System.out.println("Please enter a pronoun.");
        }
        else if (theType == "verb")
        {
            System.out.println("Please enter a verb.");
        }
        else if (theType == "adj")
        {
            System.out.println("Please enter an adjective.");
        }
        // updates str to current input needed
        MadLibsUtility.getValidString();
        // assigns to input
        input = MadLibsUtility.str;
        // adds input to word list
        Main.storyInputs.add(input);
    }
}
