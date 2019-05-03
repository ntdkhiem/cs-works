import java.util.*;
public class Main {
    public static void main(){
        return;
    }

    public static void countDownRecursively(int n) { // Outputs the numbers from n to 1.  Ex  5, 4, 3, 2, 1  with n = 5
        if (n == 1) {
            System.out.print(1);
        }
        else {
            System.out.print(n + ", ");
            countDownRecursively(n - 1);
        }
    }

    public static void countUpRecursively(int n) { // Outputs the numbers from 1 to n.   Ex 1, 2, 3, 4, 5, 6, 7   with n = 7
        if (n == 1) {
            System.out.print(1 + ", ");
        }
        else {
            int y = n - 1;
            countUpRecursively(y);
            System.out.print(n + ", ");
        }
    }

    public static void fractionCountUpRecursively(int n) { 
        if (n == 2) {
            System.out.print("1/" + n);
        }
        else {
            fractionCountUpRecursively(n - 1);
            System.out.print(", " + "1/" + n);
        }
    } // Outputs n number of fractions.  Ex. ½. 1/3. ¼. 1/5  with n = 5

    public static void printEvenNums(int n) { // Outputs  n number of even numbers.  Ex,  2, 4, 6, 8, 10  with n = 5
        if (n == 1) {
            System.out.print(2);
        }
        else {
            printEvenNums(n-1);
            System.out.print(", "+n*2);
        }
    }

    public static void printOddNums(int n) {
        if (n == 1) {
            System.out.print(n);
        }
        else {
            printOddNums(n-1);
            System.out.print(", " + (2* n -1));
        }
    } // Outputs  n number of odd numbers.  Ex,  1, 3, 5, 7, 9  with n = 5

    public static void print10sRecursively(int n) {
        if (n == 1){
            System.out.print(1);
        }
        else {
            print10sRecursively(n - 1);
            System.out.print(", " + (int) (Math.pow(10, n - 1)));
        }
    } //  Output n terms of 10.  Ex 1, 10, 100, 1000, 10000, 100000  with n = 6

    public static void printLettersRecursively(int n) {
        if (n + 96 == 97) {
            System.out.print("a");
        }
        else {
            printLettersRecursively(n - 1);
            System.out.print(", " + (char)(n+96));
        }
    } // Output n number of letters beginning with ‘a’.  Ex.  a, b, c, d, e, f, g  with n = 7

    public static void printLettersRecursivelyStartEnd(int start,int end) {
        if (end + 96 == start + 96) {
            System.out.print((char) (start+96));
        }
        else {
            printLettersRecursivelyStartEnd(start, end - 1);
            System.out.print(", " + (char)(end+96));
        }
    } // Output letters from ‘start’ to ‘end’.  Ex start = 5  end = 10   Output:  e, f, g, h, I, j

    public static void printParenthesesRecursively(int n) {
        if (n > 0) {
            System.out.print("(");
            printParenthesesRecursively(n - 1);
            System.out.print(")");
        }
    } //  Outputs n number of pair of parentheses.  Ex.   ((((( )))))  with n = 5

    public static void printRepetitiveNumber(int t,int n) {
        if (n == 1) {
            System.out.print(t);
        }
        else {
            printRepetitiveNumber(t, n - 1);
            System.out.print(t);
        }
    } // Outputs ‘t’ n number of times.   Ex.  t = 3  n = 6  Output: 333333

    public static void printTriangleRecursively(int n) {
        if (n == 1) {
            System.out.println("*");
        }
        else {
            printTriangleRecursively(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    } // Outputs  a triangle of n rows with stars as follows:	with n = 4

    public static int numberOfDigitsRecursively(long  n) {
        if (n == 0) {
            return 0;
        }
        else {
            return numberOfDigitsRecursively(n / 10) + 1;
        }
    } // Outputs the number of digits in n.   Ex.  7    with n = 1234567

    public static boolean areDigitsAllEvenRecursively(int n) {
        if (n == 0) {
            return true;
        }
        else {
            int digit = n % 10;
            if (digit % 2 != 0) {
                return false;
            }
            return areDigitsAllEvenRecursively(n / 10);
        }
    } // Outputs true/false accordingly   Ex. true   with n = 24680     Ex.  false   with n = 245680

    public static int countNumberOf_Ks_Recursively(long n, int k) {
        int digit = (int) n % 10;
        if (digit == 0) {
            return 0;
        }
        else {
            if (digit == k) {
                return countNumberOf_Ks_Recursively(n / 10, k) + 1;
            }
            return countNumberOf_Ks_Recursively(n / 10, k);
        }
    } // Outputs the number of Ks in n.   Ex 4   with n = 323345321 and k = 3

    public static void printNumberBackwards(int n) {
        if (n % 10 != 0) {
            System.out.print(n % 10);
            printNumberBackwards(n/10);
        }
    } // Outputs n backwards one digit at a time  Ex 12345 à 54321

    public static int reverseNumRecursively(int n) {
        return 0;
    }  // Returns the number reversed.  Ex 12345 à 54321

    public static int powerRecursively (int a, int b) {
        return 0;
    } // returns a^b

    public static boolean isPalindrome (long n)  {
        return true;
    } // Given n, tell whether it is a Palindrome or not.   (‘long’ is a big int)

}








