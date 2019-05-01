/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/24/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class Chapter2Exercises{
    //Declare variable for Exercise 18
    public static final int HEIGHT = 6;
    
    public static void main(String[] args){
        q20();
        Ex7();
        Ex8();
        Ex9();
       
        Ex12();
        Ex13();
        
        Ex15();
        //Ex17();
        Ex18();
        // Ex19();  IS in with Ex18()
        //Ex20();
        
    }
    // For QUESTION 20
    public static void q20(){
        // Always go to new line
        System.out.println();
        // Creating 6 columns
        for(int x20 = 1; x20 <= 6; x20++){
            // Declare xq20 as -4 and if still less than 86 then adds 18
            for(int xq20 = -4; xq20 <= 86; xq20 += 18){
                // Output
                System.out.println(xq20);
            }
            // Breaking point
            break;
        }
    }
    // For EXERCISE 7
    public static void Ex7(){
        // Creating 7 columns
        for(int x7 = 1; x7 <= 5; x7++){
            // Triangular spaces
            for(int x7a = 0; x7a <= 5 - x7; x7a++){
                System.out.print(" ");
            }
            // Produce 5 numbers between 1 through 5
            for(int x7a = 0; x7a <= 1 * x7 - 1;x7a += 5){
                System.out.print(x7);
            }
            // Always go to new line
            System.out.println();
        }
        // ALways go to new line
        System.out.println();
    }
    // For EXERCISE 18
    public static void Ex8(){
        // Creating 5 columns
        for(int i = 1; i <= 5; i++){
            // First, creating triangular spaces
            for(int j = 1;j <= 5 - i; j++){
                System.out.print(" ");
            }
            // Producing main output
            
            for(int j = 0; j <= 1 * i - 1;j++){
                System.out.print(i);
            }
            // Always go to new line
            System.out.println();
        }
        // Always go to new line
        System.out.println();
    }
    // For EXERCISE 9 
    public static void Ex9(){
        // Declaring variables
        int k = 0;
        int k1 = 0;
        // Creating 40 lines
        
        /* ^^ Notice that it's line not column because we don't giving the 
              System.out.println(); at the end of the for loop so it's won't go to new line like columns. ^^  
        */
        for(int x9 = 0; x9 <= 40; x9++){
            // A while loop to print 40 lines of '-'
            while(k <= 40){System.out.print("-");k++;}
            // Go to new line
            System.out.println();
            // Creating "_-^-" 10 times in the same line
            for(int x9a = 1; x9a <= 10; x9a++){
                System.out.print("_-^-");
                // Continue to the next one
                continue;
            }
            // Go to new line
            System.out.println();
            // Double the output in the same line
            for (int line = 1; line <= 2; line++){
                // Counting number from 1 to 10
                for (int x9c =1; x9c <= 10; x9c++){
                    // For each output (ex: 1) double it (ex: 11)
                    for (int x9ca =1; x9ca<=2; x9ca++){
                        // Output it with modulos of 10
                        System.out.print(x9c%10);
                    }
                }
            }
            // Always go to new line
            System.out.println();
        }
        // Producing '-' 40 times
        while(k1 <= 40){System.out.print("-");k1++;}
        // Go to new line
        System.out.println("\n");
    }
    // For EXERCISE 12
    public static void Ex12(){
        // Creating 3 columns
        for(int i = 1; i <= 3; i++){
            // Counting number from 0 to 9
            for(int j = 0; j <= 9; j++){
                // Output the 'j'
                System.out.print(j);
                // Double the output (ex: 0 -> 000)
                for(int k = 1; k <= 2;k++){
                    // Printing number with modulos of 10
                    System.out.print(j % 10);
                }
            }
            // Printing new line
            System.out.println();
        }
        // Printing new line
        System.out.println("\n\n");
        
    }
    // For EXERCISE 13
    public static void Ex13(){
        // Creating 5 columns
        for(int i = 1; i <= 5; i++){
            // Counting number from 9 to 0
            for(int j = 9; j >= 0; j--){
                // Printing the output
                System.out.print(j);
                // quintuple that number
                for(int k = 1; k <= 4; k++){
                    System.out.print(j % 10);
                }
            }
            // Go to new line
            System.out.println();
        }
        System.out.println("\n\n");
                
        
    }
    public static void Ex14(){
        /*
            NOT YET FINISH
        
        */
        int k1 = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 9; j >= 1; j--){
                System.out.print(j);
                for(int k = 9; k >= k1; k++){
                    System.out.print(j % 10);
                }
                
            }
            k1++;
            
            System.out.println();
        }
        System.out.println("\n\n");
    }
    public static void Ex15(){
        //declare varialbe
        int k=1;
        //5 columns
        for(int i = 1; i <= 5; i++){
            //System.out.println();
            //dashes at the begining
            for(int j = 1; j <= 6 - i;j++){
                System.out.print("-");
            }
            //Odd number inside
            for(int j = 1; j <= k; j++){
                System.out.print(k);

            }
            //dashes at the end
            for(int j = 1; j <= 6 - i;j++){
                System.out.print("-");
            }
            //increment of variable
            k = k + 2;
            //Go to new line
            System.out.println();
        }
        System.out.println("\n\n");
    }
    
    
   
    
    public static void Ex18(){
        // Creating a solid line
        System.out.print("+");
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
        //Creating 3 line with 2 boxes and 3 spaces
        for(int i = 1; i <= HEIGHT; i++){   // Using the constant value HEIGHT
            for(int j = 1; j <= 3; j++){
                System.out.print("|");
                for(int k = 1; k <= 3; k++){
                System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        //Repeating again
        System.out.print("+");
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
        for(int i = 1; i <= HEIGHT; i++){ // Using the constant value HEIGHT
            for(int j = 1; j <= 3; j++){
                System.out.print("|");
                for(int k = 1; k <= 3; k++){
                System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        System.out.print("+");
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("=");
            }
            System.out.print("+");
        }
        System.out.println();
    }
    
    
    
}