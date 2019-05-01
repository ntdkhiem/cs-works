public class Chapter1Exercises{
    public static void main(String[] args){
        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();
        Ex6();
        Ex1();
        Ex1();
        Ex1();
        Ex1();
        Ex1();
        Ex8();
        Ex9a();
        Ex9b();
        Ex9a();
        Ex9b();
        Ex9c();
        Ex8();
        Ex10TopAndBottom();
        Ex10Cross();
        Ex10box();
        Ex10Cross();
        Ex10Banner();
        Ex10Cross();
        Ex10box();
        Ex10Cross();
        Ex10TopAndBottom();
        Ex11TwoLine();
        Ex11XStars();
        System.out.println();
        Ex11TwoLine();
        Ex11XStars();
        Ex11TwoLine();
        System.out.println();
        Ex11StraightStars();
        Ex11TwoLine();
        Ex11XStars();
        Ex9a();
        Ex9a();
        //Ex10Cross();
        Ex12CrossCustom();
        Ex12StopSignCustomTop();
        Ex12Banner();
        Ex9c();
        Ex12CrossCustom();
        System.out.println("************   The exercise 11 is in line 50  ********************");
        for (int i=0; i<1001;i++){
            System.out.println("All work and no play makes Jack a dull boy.");        // This is for Exercise 11 
                            // I put it as a comment because it taking too much space
            
        }
        System.out.println();
        Pr1LeM();
        Pr1LeI();
        Pr1LeS();
        Pr1LeS();
        Pr1LeI();
        Pr1LeS();
        Pr1LeS();
        Pr1LeI();
        Pr1LeP();
        Pr1LeP();
        Pr1LeI();
        Pr2();
        Pr3();
        Pr4();
        Pr5();
        Pr6();
        Ex8();
    }
    
    /*-------------------------------------------
      |                                         |
      |     All the code of Exercises are here  |
      |             @By Khiem Nguyen            |
      |                                         |
      -------------------------------------------
    */
    public static void Ex1(){
        //System.out.println("*Exercise 1: ");
        System.out.println("//////////////////////\n|| Victory is mine! ||\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void Ex2(){
        //System.out.println("*Exercise 2: ");
        System.out.println("   \\/\n  \\\\//\n \\\\\\///\n ///\\\\\\\n  //\\\\\n   /\\\n");
    }
    public static void Ex3(){
        //System.out.println("*Exercise 3:");
        System.out.println("A well-formed Java program has\na main method with { and }\nbraces.");
        System.out.println();
        System.out.println();
        System.out.println("A System.out.println statement\nhas ( and ) and usually a\nString that starts and ends\nwith a \" character.\n(But we type\" instead!\n");
    }
    public static void Ex4(){
        //System.out.println("*Exercise 4: ");
        System.out.println("What is the difference between\na ' and \"? Or between a \" and a \\\"?");
        System.out.println();
        System.out.println();
        System.out.println("One is what we see when we're typing our programs.\nThe other is what appears on the \"console.\"\n");
    }
    public static void Ex5(){
        //System.out.println("*Exercise 5: ");
        System.out.println("A \"quoted\" String is\n'much' better if you learn\nthe rules of \"escape sequences.\"\nAlso, \"\" represents an empty String.\nDon't forget: use \\\" instead of \" !\n'' is not the same as \"\n");
    }
    public static void Ex6(){
        //System.out.println("*Exercise 6: ");
        System.out.println("There's one thing every coder must understand:\n The System.out.println command.");
        System.out.println();
        System.out.println();
    }
    public static void Ex8(){
        System.out.println("   _______\n  /       \\\n /         \\\n -\"-'-\"-'-\"-\n \\         /\n  \\_______/");
    }
    public static void Ex9a(){
        System.out.println("   _______\n  /       \\\n /         \\\n \\         /\n  \\_______/");
    }
    public static void Ex9b(){
        System.out.println("\n -\"-'-\"-'-\"-");
    }
    public static void Ex9c(){
        System.out.println(" \\         /\n  \\_______/");
    }
    public static void Ex10TopAndBottom(){
        System.out.println("    /\\       /\\\n   /  \\     /  \\\n  /    \\   /    \\");
    }
    public static void Ex10Cross(){
        System.out.println(" +------+ +------+");
    }
    public static void Ex10box(){
        System.out.println(" |      | |      |\n |      | |      |");
    }
    public static void Ex10Banner(){
        System.out.println(" |United| |United|\n |States| |States|");
    }
    public static void Ex11TwoLine(){
        System.out.println("*****\n*****");
    }
    public static void Ex11XStars(){
        System.out.println(" * *\n  *\n * *");
    }
    public static void Ex11StraightStars(){
        System.out.println("  *\n  *\n  *");
    }
    public static void Ex12CrossCustom(){
        System.out.println(" +---------+ \n");
    }
    public static void Ex12StopSignCustomTop(){
        System.out.println("   _______\n  /       \\\n /         \\");
    }
    public static void Ex12Banner(){
        System.out.println(" |   STOP  |");
    }
    public static void Pr1LeM(){
        System.out.println("M     M\nMM   MM\nM M M M\nM  M  M\nM     M\nM     M\nM     M\n");
    }
    public static void Pr1LeI(){
        System.out.println("IIIII\n  I\n  I\n  I\n  I\n  I\nIIIII\n");
    }
    public static void Pr1LeS(){
        System.out.println(" SSSSS\nS     S\nS\n SSSSS\n      S\nS     S\n SSSSS\n");
    }
    public static void Pr1LeP(){
        System.out.println("PPPPPP\nP     P\nP     P\nPPPPPP\nP\nP\nP\n\n\n");
    }
    public static void Pr2(){
        //System.out.println("NOT YET !!!\n\n");
    }
    public static void Pr3(){
        String[][] arOf3 = {
            {"fly", "spider", "bird", "cat", "dog", "horse"},
            {"She swallowed the ", " to catch the "},
            {"There was an old lady who swallowed a ", "I don't know why she swallowed that fly,", "Perhaps she 'll die."}
        };
        System.out.println(arOf3[2][0] + arOf3[0][0] + ".");
        System.out.println(arOf3[2][1]);
        System.out.println(arOf3[2][2] + "\n");
        System.out.println(arOf3[2][0] + arOf3[0][1] + ",");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        System.out.println(arOf3[1][0] + arOf3[0][1] + arOf3[1][1] + arOf3[0][0] + ",");
        System.out.println(arOf3[2][1]);
        System.out.println(arOf3[2][2]);
        System.out.println();
        System.out.println(arOf3[2][0] + arOf3[0][2]);
        System.out.println("How absurd to swallow a bird.");
        System.out.println(arOf3[1][0] + arOf3[0][2] + arOf3[1][1] + arOf3[0][1]);
        System.out.println(arOf3[1][0] + arOf3[0][1] + arOf3[1][1] + arOf3[0][0]);
        System.out.println(arOf3[2][1]);
        System.out.println(arOf3[2][2]);
        System.out.println();
        System.out.println(arOf3[2][0] + arOf3[0][3]);
        System.out.println("Imagine that to swallow a cat.");
        System.out.println(arOf3[1][0] + arOf3[0][3] + arOf3[1][1] + arOf3[0][2]);
        System.out.println(arOf3[1][0] + arOf3[0][2] + arOf3[1][1] + arOf3[0][1]);
        System.out.println(arOf3[1][0] + arOf3[0][1] + arOf3[1][1] + arOf3[0][0]);
        System.out.println(arOf3[2][1]);
        System.out.println(arOf3[2][2]);
        System.out.println();
        System.out.println(arOf3[2][0] + arOf3[0][4]);
        System.out.println("What a hog to swallow a dog.");
        System.out.println(arOf3[1][0] + arOf3[0][4] + arOf3[1][1] + arOf3[0][3]);
        System.out.println(arOf3[1][0] + arOf3[0][3] + arOf3[1][1] + arOf3[0][2]);
        System.out.println(arOf3[1][0] + arOf3[0][2] + arOf3[1][1] + arOf3[0][1]);
        System.out.println(arOf3[1][0] + arOf3[0][1] + arOf3[1][1] + arOf3[0][0]);
        System.out.println(arOf3[2][1]);
        System.out.println(arOf3[2][2]);
        System.out.println();
        System.out.println(arOf3[2][0] + arOf3[0][5]);
        System.out.println("She died of course.");
        System.out.println("\n\n");
    }
    public static void Pr4(){
        String[] ar = {"first","second","twelfth"};
        String[] ar1 = {"my true love sent to me","twelve drummers drumming,","eleven pipers piping,","ten lords a-leaping,","nine ladies dancing,","eight maids a-milking,","seven swans a-swimming,","six geese a-laying,","five golden rings,","four calling birds,","three French hens,","two turtle doves, and","a partridge in a pear tree."};
        System.out.println("On the " + ar[0] + " day of the christmas,");
        System.out.println(ar1[0] + "\n" + ar1[12]);
        System.out.println();
        System.out.println("On the " + ar[1] + " day of the christmas,");
        System.out.println(ar1[0] + "\n" + ar1[11] + "\n" + ar1[12] + "\n");
        System.out.println("On the " + ar[2] + " day of the christmas,");
        for (int i = 0; i < 13; i++){
            System.out.println(ar1[i]);    
        }
        System.out.println("\n\n");
        
    }
    public static void Pr5(){
        String[][] ar = {
            {"This is the house that Jack built", "That lay in the house that Jack built.", },
            {"malt", "rat,", "cat,", "dog,", "cow with the crumpled horn,", "maiden all forlorn"},
            {"that ate the malt,", "that killed the rat,", "that worried the cat,", "That tossed the dog,", "That milked the cow with the crumpled horn,"}
        };
        System.out.println(ar[0][0]);
        System.out.println();
        System.out.println("This is the " + ar[1][0]);
        System.out.println(ar[0][1]);
        System.out.println();
        System.out.println("This is the " + ar[1][1]);
        System.out.println(ar[2][0]);
        System.out.println(ar[0][1]);
        System.out.println();
        System.out.println("This is the " + ar[1][2]);
        System.out.println(ar[2][1]);
        System.out.println(ar[2][0]);
        System.out.println(ar[0][1]);
        System.out.println();
        System.out.println("This is the " + ar[1][3]);
        System.out.println(ar[2][2]);
        System.out.println(ar[2][1]);
        System.out.println(ar[2][0]);
        System.out.println(ar[0][1]);
        System.out.println();
        System.out.println("This is the " + ar[1][4]);
        System.out.println(ar[2][3]);
        System.out.println(ar[2][2]);
        System.out.println(ar[2][1]);
        System.out.println(ar[2][0]);
        System.out.println(ar[0][1]);
        System.out.println();
        System.out.println("This is the " + ar[1][5]);
        System.out.println(ar[2][4]);
        System.out.println(ar[2][3]);
        System.out.println(ar[2][2]);
        System.out.println(ar[2][1]);
        System.out.println(ar[2][0]);
        System.out.println(ar[0][1]);
        System.out.println("\n\n");
    }
    public static void Pr6(){
        String[][] ar9 = 
        {
            {"Bought me a ", " and the ", " pleased me,", "I fed my ", " under yonder tree."},
            {"cat", "hen", "duck", "goose", "sheep"},
            {"Cat goes fiddle-i-fee.", "Hen goes chimmy-chuck, chimmy-chuck", "Duck goes quack, quack,", "Goose goes hissy, hissy,", "Sheep goes baa, baa,"}
        };
        System.out.println(ar9[0][0] + ar9[1][0] + ar9[0][1] + ar9[1][0] + ar9[0][2] + "\n" + ar9[0][3] + ar9[1][0] + ar9[0][4]);
        System.out.println(ar9[2][0]);
        System.out.println();
        System.out.println(ar9[0][0] + ar9[1][1] + ar9[0][1] + ar9[1][1] + ar9[0][2] + "\n" + ar9[0][3] + ar9[1][1] + ar9[0][4]);
        System.out.println(ar9[2][1] + "\n" + ar9[2][0]);
        System.out.println();
        System.out.println(ar9[0][0] + ar9[1][2] + ar9[0][1] + ar9[1][2] + ar9[0][2] + "\n" + ar9[0][3] + ar9[1][2] + ar9[0][4]);
        System.out.println(ar9[2][2] + "\n" + ar9[2][1] + "\n" + ar9[2][0]);
        System.out.println();
        System.out.println(ar9[0][0] + ar9[1][3] + ar9[0][1] + ar9[1][3] + ar9[0][2] + "\n" + ar9[0][3] + ar9[1][3] + ar9[0][4]);
        System.out.println(ar9[2][3] + "\n" + ar9[2][2] + "\n" + ar9[2][1] + "\n" + ar9[2][0]);
        System.out.println();
        System.out.println(ar9[0][0] + ar9[1][4] + ar9[0][1] + ar9[1][4] + ar9[0][2] + "\n" + ar9[0][3] + ar9[1][4] + ar9[0][4]);
        System.out.println(ar9[2][4] + "\n" + ar9[2][3] + "\n" + ar9[2][2] + "\n" + ar9[2][1] + "\n" + ar9[2][0]);
        
    }
}
        
//
// System.out.println();
//{"fly","spider","bird","cat","dog","horse"},
  //                           {"She swallowed the ","to catch the "},
    //                         {"There was an old lady who swallowed a ","I don't know why she swallowed that fly,","Perhaps she 'll die."}