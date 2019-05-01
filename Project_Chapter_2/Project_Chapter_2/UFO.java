/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/27/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class UFO{
    //Declare constant variable
    public static final int SIZE = 4;
    public static void main(String []args){
        UFO();
    }
    /*public static void UFO(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE * 3 - 1; j++){
                System.out.print(".");
            }
            System.out.print("||");
            System.out.println();
        }
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE * 3 - 3 - i * 3; j++){
                System.out.print(".");
            }
            System.out.print("_/");
            for(int j = 0; j < 3 * i; j++){
                System.out.print(":");
            }
            System.out.print("||");
            for(int j = 0; j < SIZE * i - i; j++){
                System.out.print(":");
            }
            System.out.print("\\_");
            
            System.out.println();
            
        }*/
        
    public static void UFO(){
        /*NECK 
                    ||
                    ||
                    ||
                    ||
                        
                        */
                        
        //Spawn columns according to SIZE
        for(int i=1; i<=SIZE; i++){
            //Spaces at the begin
            for(int j = 1; j <= 3 * SIZE; j++){
                System.out.print(" ");
            }
            //Printing || after spaces 
            System.out.println("||");

        }
        
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        //UPPER HALF OF TOP BASE
        
        //Spawn columns according to SIZE
        for(int i = 1; i <= SIZE; i++){
            //Spaces reducing 3 each times
            for(int j = 1; j <= (3 * SIZE) - (3 * i); j++){
                System.out.print(" ");
            }
            // Printing '__/' each times after spaces
            System.out.print("__/");
            // Increment of ':' 3 each times
            for(int j = 1; j <= (3 * i) - ( 3); j++){
                System.out.print(":");
            }
            //Printing it's base middle
            System.out.print("||");
            //Copy and PASTE from above
            for(int j = 1; j <= (3 * i) - (3); j++){
                System.out.print(":");
            }
            //Printing "\__" each times after ':'
            System.out.println("\\__");
            }
            
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //Making this ->  
        
        //                  | (number of double quotes) |
        
        
        System.out.print("|");

        for(int i=1; i<=6*SIZE; i++){
            System.out.print("\"");

        }
        System.out.println("|");

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++  

        // LOWER HALF OF THE TOP BASE
        
        //Spawn columns according to SIZE
        for(int i = 1; i <= SIZE; i++){
            //Spaces reducing each times
            for(int j = 1; j <= (2 * i) - 2; j++){
                System.out.print(" ");
            }
            //Printing '\__' each times after spaces
            System.out.print("\\_");
            //Increase the constant value by 1 and increment and printing '/\' 
            for(int j = 1; j <= ((3 * SIZE) + 1 ) - ( 2 * i); j++){
               System.out.print("/\\");
            }
            //Printing "_/" each times after '/\'
            System.out.println("_/");

        }
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //NECK
        
        
        for(int i = 1; i <= SIZE; i++){

            for(int j=1; j<=(3*SIZE); j++){
                System.out.print(" ");
            }

            System.out.print("||");

            for(int j=1; j<=(3*SIZE); j++){
                System.out.print(" ");
            }

            System.out.println();

        }
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //BODY
        
        //Printing columns according to SIZE ^ 2
        for(int i = 1; i <= SIZE * SIZE; i++){
            //Spaes 
            for(int j = 1; j <= (3 * SIZE) - 3; j++){
                System.out.print(" ");
            }
            //Printing "|%%||%%|" each times after spaces
            System.out.println("|%%||%%|");

        }
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //COPY AND PASTE :P 
        
        // UPPER HALF OF TOP BASE
        for(int i=1; i <= SIZE; i++){

            for(int j=1; j<=((3*SIZE)-(3*i)); j++){
                System.out.print(" ");
            }

            System.out.print("__/");

            for(int j=1; j<=((3*i)-(3)); j++){
                System.out.print(":");
            }

            System.out.print("||");

            for(int j=1; j<=((3*i)-(3)); j++){
                System.out.print(":");
            }
                System.out.print("\\__");
            System.out.println();
            }
        
        
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //NECK 
        System.out.print("|");

        for(int i=1; i<=6*SIZE; i++){
            System.out.print("\"");

        }
        System.out.println("|");
    }
    
}