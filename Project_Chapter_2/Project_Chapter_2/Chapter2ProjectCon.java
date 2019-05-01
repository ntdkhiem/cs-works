/*

CREATED BY: KHIEM NGUYEN
---------+++------------
DATE: 11/26/2017
---------+++------------
PURPOSE: STUDY of course

*/

public class Chapter2ProjectCon{
    //Declare constant variable
    public static final int SIZE = 3;
    public static void main(String []args){
        ROCKET();
    }
     
    public static void ROCKET(){
        // Creating 5 columns 
        for(int i = 0; i < SIZE * 2; i++){
            //Spaces for first triangle
            for(int j = 0; j < SIZE + (SIZE - 1) - i; j++){
                System.out.print(" ");
            }
            //First Triangle using "/"
            for(int j = 0; j <= i ; j++){
                System.out.print("/");
            }
            // 2 Stars between 
            System.out.print("**");
            // Second Triangle using "\"
            for(int j = 0; j <= i  ; j++){
                System.out.print("\\");
            }
            // Go to new line and return
            System.out.println();
        }
        //Spawing crossd according to SIZE
        System.out.print("+");
        for(int i = 0; i < SIZE * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
        
        //Spawing colums according to SIZE
        for(int i = 0; i < SIZE; i++ ){
            //Open Box
            System.out.print("|");
            //Spaces using dots
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            /*
                Making this -> /
                             /
                           /
            */
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("/");
            }
            //Adding '\/' inside the line above and below
            for(int j = 0; j < i; j++){
                System.out.print("\\/");
            }
            /*
                Making this -> \
                                \
                                 \
            */
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("\\");
            }
            //Copy and Paste from above 
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            //Copy and paste from above
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            //Copy and paste from above
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("/");
            }
            //Copy and paste from above
            for(int j = 0; j < i; j++){
                System.out.print("\\/");
            }
            //Copy and paste from above
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("\\");
            }
            //Copy and paste from above
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            //Close box
            System.out.println("|");
        }
        //Reverse the triangle from above
        for(int i = 0; i < SIZE; i++ ){
            System.out.print("|");
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("\\");
            }
            for(int j = SIZE; j > i + 1; j--){
                System.out.print("/\\");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("\\");
            }
            for(int j = SIZE; j > i + 1; j--){
                System.out.print("/\\");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            System.out.println("|");
        }
        //Spawning cross
        System.out.print("+");
        for(int i = 0; i < SIZE * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
        
        //Copy and PASTE from above  :P
        for(int i = 0; i < SIZE; i++ ){
            System.out.print("|");
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("\\");
            }
            for(int j = SIZE; j > i + 1; j--){
                System.out.print("/\\");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("\\");
            }
            for(int j = SIZE; j > i + 1; j--){
                System.out.print("/\\");
            }
            for(int j = 0; j < SIZE - i; j += SIZE){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            System.out.println("|");
        }
        for(int i = 0; i < SIZE; i++ ){
            System.out.print("|");
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print("\\/");
            }
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("\\");
            }
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("/");
            }
            for(int j = 0; j < i; j++){
                System.out.print("\\/");
            }
            for(int j = 0; j < SIZE - i; j += SIZE ){
                System.out.print("\\");
            }
            for(int j = 0; j < SIZE - 1 - i; j++){
                System.out.print(".");
            }
            System.out.println("|");
        }
        System.out.print("+");
        for(int i = 0; i < SIZE * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
        
        //Copy and paste the head of the rocket as it's end
        for(int i = 0; i < SIZE * 2; i++){
            
            for(int j = 0; j < SIZE + (SIZE - 1) - i; j++){
                System.out.print(" ");
            }
            
            for(int j = 0; j <= i ; j++){
                System.out.print("/");
            }
        
            System.out.print("**");

            for(int j = 0; j <= i  ; j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    
}