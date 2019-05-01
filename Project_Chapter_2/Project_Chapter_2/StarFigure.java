/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/26/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class StarFigure{
    // Declare constant variable
    public static final int HEIGHT = 4;
     public static void main(String[] args) {
        // Produce constant variable(HEIGHT) 's times
        for(int i = 0; i < HEIGHT;i++){
            // - 4 * i remaining -- first half using '/' 
            //Because (HEIGHT - 1) * 8 will give us total of slashes
            for(int j = 0; j < (HEIGHT - 1) * 4 - 4 * i; j++){
                System.out.print("/");
            }
            //Spaw stars according to 'i'
            for(int j = 0; j < 8 * i; j++){
                System.out.print("*");
            }
            // the second half of total of dashes using '\'
            for(int j = 0; j < (HEIGHT - 1) * 4 - 4 * i; j++){
                System.out.print("\\");
            }
            // Go to new line
            System.out.println();
        }
    }
}