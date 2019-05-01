/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/24/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class ProjectChapter2Java_10{
    //Declare the constant variable
    public static final int NumberOfLine = 6;
    public static void main(String[] args){
        // 6 times
        for(int i = 1; i <= 6; i++){
            //Spaces according to constant variable
            for(int j = 1; j <= NumberOfLine; j++){
                System.out.print(" ");
            }
            //Printing '|' each time after spaces
            System.out.print("|");
        }
        //Next line
        System.out.println();
        //If i is less than NumberOfLine + 1 then keep increasing
        for(int i = 1; i < NumberOfLine + 1 ; i++){
            System.out.print(i);
        }
        //5 times
        for(int i = 1; i <= 5; i++){
            //Start i from 0 up to NumberOfLine
            for(int j = 0; j <= NumberOfLine; j++){
                System.out.print(j);
            }
        }
        //Printing 0 at the end
        System.out.print("0");
    }
}