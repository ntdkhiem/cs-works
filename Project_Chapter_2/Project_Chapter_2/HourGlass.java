/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/19/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class HourGlass{

     public static void main(String []args){
        //Spawning the top
        System.out.print("|");
        for(int i = 0; i < 10; i++){
            System.out.print("\"");
        }
        System.out.println("|");
        
        //Declare the variable 
        int doubleSlashs = 8;
        //Spawning 4 columns
        for(int i = 0; i < 4; i++){
            //Spaces as triangle
            for(int j = 0; j < i + 1;j++){
                System.out.print(" ");
            }
            //Printing '\' each time after the spaces
            System.out.print("\\");
            //Printing ':' using doubleSlashs declared above
            for(int j = 1; j <= doubleSlashs; j++){
                System.out.print(":");
            }
            //Printing '/' each time after ':'
            System.out.print("/");
            //Go to new line
            System.out.println();
            //Increment of variable
            doubleSlashs -= 2;
        }
        //Reset variable
        doubleSlashs = 2;
        //Spaces 5 times
        for(int i = 0; i < 5; i++){
            System.out.print(" ");
        }
        //Printing '||'
        System.out.println("||");
        //Spawning 4 columns
        for(int i = 4 ; i > 0; i--){
            //Spaces according to 'i' when it's value changing
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            //Spawn '/' each time after spaces
            System.out.print("/");
            //Spawing ':' according to doubleSlashs that just reset before
            for(int j = 1; j <= doubleSlashs; j++){
                System.out.print(":");
            }
            //Spawn '\' each time after ':'
            System.out.print("\\");
            //Go to new line
            System.out.println();
            //Increment of variable
            doubleSlashs += 2;
        }
        //Copy and PASTE of the top as it's end
        System.out.print("|");
        for(int i = 0; i < 10; i++){
            System.out.print("\"");
        }
        System.out.println("|");
     }
}