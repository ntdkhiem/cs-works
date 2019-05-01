import java.util.Scanner;

public class Exercise20Java3
{
    public static Scanner userInput = new Scanner(System.in);
    
    public static void main()
    {        
        inputBirthday();        
    }
    public static void inputBirthday()
    {        
        System.out.print("On what day of the month were you born? ");
        if(userInput.hasNextInt())
        {
            int date = userInput.nextInt();
            System.out.println("date = " + date);
            System.out.print("What is the name of the month in which you were born? ");
            String month = userInput.next();
            System.out.println();
            System.out.print("month = " + month);
            System.out.print("abc");
            if (month.equals("\n")) System.out.println(" \\ n was in the buffer!");
        }
    }
}