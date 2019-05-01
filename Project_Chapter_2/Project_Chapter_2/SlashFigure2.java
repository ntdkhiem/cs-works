/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/24/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class SlashFigure2 {
    //Declare constant variable
    public static final int SIZE = 5;
    
    public static void main(String[] args) {
        //Spawn columns according to SIZE
        for(int i = 1; i <= SIZE; i++) {
            //Printing '\' of even numbers
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("\\");
            //Printing '!' 4 each times start by 2 
            for(int j = 0; j < -4 * i + 4 * SIZE + 2; j++)
                System.out.print("!");
            //Copy and PASTE :P
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("/");
            // GO to new line
            System.out.println();
        }
    }
}