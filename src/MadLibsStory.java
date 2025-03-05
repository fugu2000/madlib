
public class MadLibsStory 
{
    int num;
    int length;
    public MadLibsStory(int theNum)
    {
        // simply defines story length
        num = theNum;
        if(num == 0)
        {
            length = Main.s1.length;
        }
        else if(num == 1)
        {
            length = Main.s2.length;
        }
        else if(num == 2)
        {
            length = Main.s3.length;
        }
        else
        {
            length = Main.s4.length;
        }
    }
    public int getLength()
    {
        return length;
    }
    public void request(int theI)
    {
        // asks for input based on the data type
        if(num == 0)
        {
            UserInputHandler.ask(Main.s1[theI]);
        }
        else if(num == 1)
        {
            UserInputHandler.ask(Main.s2[theI]);
        }
        else if(num == 2)
        {
            UserInputHandler.ask(Main.s3[theI]);
        }
        else
        {
            UserInputHandler.ask(Main.s4[theI]);
        }
    }
    
}
