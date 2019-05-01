/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/26/2017
---------+++------------
PURPOSE: STUDY of course

*/
public class DollarFigure{
    //Declare constant variable
    public static final int HEIGHT = 4;
    public static void main(String[] args){
        //Spaw colums according to constant variable
        for(int i = 1; i <= HEIGHT; i++) {
            //Spaw stars according to 'i' when it changing value
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
            //Spaw dollar sign 
            for(int j = 0; j < -i + HEIGHT + 1; j++)
                System.out.print("$");
            //Spaw stars with even numbers
            for(int j = 0; j < -2 * i + 2 * HEIGHT + 2; j++)
                System.out.print("*");
            //Copy and paste from above
            for(int j = 0; j < -i + HEIGHT + 1; j++)
                System.out.print("$");
            //Copy and paste from above
            for(int j = 0; j < 2 * i - 2; j++)
                System.out.print("*");
            //Go to new line
            System.out.println();
        }
    }
    
}