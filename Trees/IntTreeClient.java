public class IntTreeClient {
    public static void main() 
    {
    IntTree t = new IntTree(12);
        System.out.println("Tree structure on its side:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
    }
}
