public class MadLibsUtility {
    public static String str;
    public static boolean bInput;
    public static void getValidString()
    {
        str = Main.scanner.nextLine();
        while(str == " " || str == "")
        {
            System.out.println("PLEASE ENTER VALID INPUT");
            str = Main.scanner.nextLine();
        }
    }
    public static void getValidBoolean()
    {
        Main.boo.nextLine();
        while(!Main.boo.hasNextBoolean())
        {
            System.out.println("PLEASE ENTER VALID INPUT");
            Main.boo.nextLine();
        }
        Main.boo.nextBoolean();
    }
}
