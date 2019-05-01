/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/19/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class Chapter2JavaProject{
    //Declare variables of PROJECT 4
    public static final int STAIR_NUM = 5;
    public static final int WIDTH = STAIR_NUM * 5;
    
    public static void main(String []args){
         P1();
         P2();
         P3();
         //PROJET 4
         for (int i=1; i<=STAIR_NUM; i++) { 

        //calculating number of spaces before the top line of the stair
        for (int x=1; x<=(WIDTH+(i*(-5))); x++) {
            System.out.print(" ");
        }

        //printing top line of the stair
        head();

        //calculating the number of spaces after the top line of the stair
        for(int y=1; y<=((i-1)*5); y++){ 
            System.out.print(" ");
        }
        System.out.println("*");

        //calculating the number of spaces before the 1st middle line of the stair
        for (int x=1; x<=(WIDTH+(i*(-5))); x++) {
            System.out.print(" ");
        }

        //print the first middle line of the stair
        middle1();

        //calculating the number of spaces after the 1st middle line of the stair           
        for (int y=1; y<=(i*5); y++){ 
            System.out.print(" ");
        }
        System.out.println("*");

        //calculating the number of spaces before the 2nd middle line of the stair          
        for (int x=1; x<=(WIDTH+(i*(-5))); x++) {
            System.out.print(" ");
        }
        //printing the 2nd middle line of the stair
        middle2();

      //calculating the number of spaces after the 2nd middle line of the stair
        for (int y=1; y<=(i*5); y++){ 
            System.out.print(" ");
        }
        System.out.println("*");
    }

    //calculating the number of stars needed for the bottom of the stairs
    for (int z=1; z<=(WIDTH+7); z++) {
        System.out.print("*");
    }
         /*for (int stair = 1; stair <= LENGTH; stair++) {
            System.out.println("  o  ******");
            System.out.println(" /|\ *     ");
            System.out.println(" / \ *     ");
         }*/
    }
    //PROJECT 1
    public static void P1(){
        
        // intial variable that will use for Project 1
        int number_star = 6;
        int number_space = 0;
        int number_halfBox = 12;
        int number_otherhalf = 0;
        // Creating 7 columns,
        for(int i = 1; i <= 7; i++){
            //Creating star in the left
            for(int j = 1; j <= number_star; j++){
                System.out.print("*");
            }
            //Creating spaces between triangle star in the left and the box in the right
            for(int j = 0; j <= number_space; j++){
                System.out.print(" ");
            }
            //Creating the first half of the box using "/"
            for(int j = 1; j <= number_halfBox; j++){
                System.out.print("/");
            }
            //Creating the second half of the box using "\"
            for(int j = 1; j <= number_otherhalf; j++){
                System.out.print("\\");
            }
            //Creating spaces between triangle star in the right and the box in the left
            for(int j = 0; j <= number_space; j++){
                System.out.print(" ");
            }
            //Creating triangle star in the right
            for(int j = 1; j <= number_star; j++){
                System.out.print("*");
            }
            //Always go to new line
            System.out.println();
            //Increment and decrement of variables that declared before
            number_otherhalf += 2;
            number_halfBox -= 2;
            number_space++;
            number_star--;
        }
        System.out.println("\n\n");
    }
    // PROJET 2
    public static void P2(){
        //Creating the cross 
        System.out.println("+------+");
        //Initial variables that use in project
        int line = 1;
        int space = 0;
        //Creating 2 columns of first half of the PROJECT
        for(int i = 1; i <= 2; i++){
            //Creating another 3 columns inside 
            for(int j = 1; j <= 3; j++){
                //Creating the open box using "|"
                System.out.print("|");
                //Creating spaces inside the box as triangle between open box and ^ in the right
                for(int k = 0; k <= line; k++){
                    System.out.print(" ");
                }
                //Creating ^ 
                for(int k = 0; k <= 1 * j - 1;k += 5){
                    System.out.print("^");
                }
                //Putting some spaces between ^ from left and from right
                for(int k = 1; k <= space; k++){
                    System.out.print(" ");
                }
                //Creating ^ as in the right
                for(int k = 0; k <= 1 * j - 1;k += 5){
                    System.out.print("^");
                }
                //Creating triangle spaces between close box and ^ 
                for(int k = 0; k <= line; k++){
                    System.out.print(" ");
                }
                //Close Box using "|"
                System.out.print("|");
                //Always go to new line
                System.out.println();
                //increment and decrement of variables
                space += 2;
                line -= 1;
                
                
                
            }
            //Reset variables for able to use it in the next looping 
            line = 1;
            space = 0;
            
        }
        //another Cross in the middle
        System.out.println("+------+");
        //Declare another 2 variables 
        int space2 = 0;
        int space3 = 4;
        //Creating 2 columns for second half of the PROJECT
        for(int k = 1; k <= 2; k++){
            //Creating another 3 columns inside
            for(int i = 1; i <= 3; i++){
                //Open Box
                System.out.print("|");
                //Spaces between open box and "v"
                for(int j = 1; j <= space2; j++){
                    System.out.print(" ");
                }
                //Creating "v" in the left
                for(int j = 0; j <= 1 * i - 1;j += 5){
                    System.out.print("v");
                }
                //Spaces insde to able to form big V using "v"
                for(int j = 1; j <= space3; j++){
                    System.out.print(" ");
                }
                //Creating "v" in the right
                for(int j = 0; j <= 1 * i - 1;j += 5){
                    System.out.print("v");
                }
                //Spaces between close box and "v"
                for(int j = 1; j <= space2; j++){
                    System.out.print(" ");
                }
                //Close box
                System.out.print("|");
                //Always go to new line
                System.out.println();
                //Increment and decrement of variables
                space2++;
                space3 -= 2;
                
            }
            //Reset variables for able to use it in the next looping 
            space2 = 0;
            space3 = 4;
            
        }
        //End for Cross
        System.out.println("+------+");
        System.out.println("\n\n");
    }
    //PROJET 3
    /*
        There are 2 shape in the box so the first shape will be "diamon" and the second shape will be "(Top is triangle up side down and Bottom is triangle)"
    */
    public static void P3(){
        //Declare variables 
        int space = 4;
        int space__ = 1;
        int space1 = 1;
        int space__2 = 4;
        //Cross
        System.out.println("+---------+");
        //Creating 4 columns of first half of the diamon
        for(int i = 1; i <= 4; i++){
            //Open Box
            System.out.print("|");
            //Spaces between open box and "/"
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //Creating "/" from 3 - 1
            for(int j = 2; j <= space__; j++){
                System.out.print("/");
            }
            //a columns of * between "/" and "\"
            for(int j = 1; j <= 1; j++){
                System.out.print("*");
            }
            //Creating "\" from 3 - 1
            for(int j = 2; j <= space__; j++){
                System.out.print("\\");
            }
            //Spaces between close box and "\"
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //Close box
            System.out.print("|");
            //Always go to new line
            System.out.println();
            //increment and decrement of variables
            space -= 1;
            space__ += 1;
        }
        //Creating 4 columns for second half of the diamon
        for(int i = 1; i <= 4; i++){
            //Open box
            System.out.print("|");
            //Spaces between open box and "\"
            for(int j = 1; j <= space1; j++){
                System.out.print(" ");
            }
            //Creating "\" from 1 - 3
            for(int j = 2; j <= space__2; j++){
                System.out.print("\\");
            }
            //a columns of * between "\" and "/"
            for(int j = 1; j <= 1; j++){
                System.out.print("*");
            }
            //Creating "/" from 1 - 3
            for(int j = 2; j <= space__2; j++){
                System.out.print("/");
            }
            //Spaces between close box and "/"
            for(int j = 1; j <= space1; j++){
                System.out.print(" ");
            }
            //Close box
            System.out.print("|");
            //for(int j = 1; j <= space1; j++){
            //    System.out.print("*");
            //}
            //System.out.print("|");
            
            System.out.println();
            //Increment and decrement of variables
            space__2--;
            space1++;
            
        }
        //Reset variables for next use
        space = 4;
        space__ = 1;
        space1 = 1;
        space__2 = 4;
        //Middle Cross
        System.out.println("+---------+");
        //Creating 4 columns for first half of the (Top is triangle up side down and Bottom is triangle)
        for(int i = 1; i <= 4; i++){
            //Open box
            System.out.print("|");
            //Spaces between open box and '\'
            for(int j = 1; j <= space1; j++){
                System.out.print(" ");
            }
            //Creating "\" from 1 - 3
            for(int j = 2; j <= space__2; j++){
                System.out.print("\\");
            }
            //a columns of * between "\" and "/"
            for(int j = 1; j <= 1; j++){
                System.out.print("*");
            }
            //Creating '/' from 1 - 3
            for(int j = 2; j <= space__2; j++){
                System.out.print("/");
            }
            //Spaces between close box and '/'
            for(int j = 1; j <= space1; j++){
                System.out.print(" ");
            }
            //Close box
            System.out.print("|");
            //Always go to new line
            System.out.println();
            //Increment and decrement of variables
            space1++;
            space__2--;
        }
        // Creating another 4 columns for second half of the (Top is triangle up side down and Bottom is triangle)
        for(int i = 1; i <= 4; i++){
            //Open Box
            System.out.print("|");
            //Spaces between open box and '/'
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //Creating "/" from 3 - 1
            for(int j = 2; j <= space__; j++){
                System.out.print("/");
            }
            //a columns of * between "/" and "\"
            for(int j = 1; j <= 1; j++){
                System.out.print("*");
            }
            //Creating '\' from 3 - 1
            for(int j = 2; j <= space__; j++){
                System.out.print("\\");
            }
            //Spaces between close box and '\'
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            //Close box
            System.out.print("|");
            //Always go to new line
            System.out.println();
            //Increment and decrement of variables
            space--;
            space__++;
            
        }
        //Close Cross
        System.out.println("+---------+");
        System.out.println("\n\n");
    }
    // HEAD class for PROJECT 4
    public static void head() {
    System.out.print("  o  ******");
    }
    // BODY class for PROJECT 4
    public static void middle1() {
            System.out.print(" /|\\ *");
    }
    // LEG class for PROJECT 4
    public static void middle2() {
        System.out.print(" / \\ *");
    }   
	
    
}