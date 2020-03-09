import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        // STEP 1: use the data below to fill edgeList.
        String[] data = {"6\n"
                + "0 1 2\n"
                + "1 0 3\n"
                + "2 0 3 4\n"
                + "3 1 2 4 5\n"
                + "4 2 3 5\n"
                + "5 3 4",
                "6\n"
                        + "0 1 2 3\n"
                        + "1 0 3\n"
                        + "2 0 3 \n"
                        + "3 0 1 2\n"
                        + "4 5\n"
                        + "5 4",
                "3\n"
                        + "0 1 2 \n"
                        + "1 0\n"
                        + "2 0\n",
                "7\n" +
                        "0 4 5\n" +
                        "1 4\n" +
                        "2 5 6\n" +
                        "3 4 5 6\n" +
                        "4 0 1 3\n" +
                        "5 0 2 3\n" +
                        "6 2 3\n"};
        UnweightedGraph<Integer> g1 = build_from_string(data[0]);
        UnweightedGraph<Integer> g2 = build_from_string(data[1]);
        UnweightedGraph<Integer> g3 = build_from_string(data[2]);
        UnweightedGraph<Integer> g4 = build_from_string(data[3]);
        //*28.5 (Find paths)
        System.out.println("g1.getPath(0,3): " + g1.getPath(0, 3));
        System.out.println("g2.getPath(0,3): " + g2.getPath(0, 3));
        //*28.6 (Detect cycles)
        System.out.println("g1.isCyclic(True) --> " + g1.isCyclic());
        System.out.println("g2.isCyclic(True)(two parts!) --> " + g2.isCyclic());
        System.out.println("g3.isCyclic(False) --> " + g3.isCyclic());
        //*26.8 is Biparthite
        System.out.println("g1.isBiparthite(false) --> " + g1.isBipartite());
        System.out.println("g2.isBiparthite(false) --> " + g2.isBipartite());
        System.out.println("g3 is left out because it has two parts.");
        System.out.println("g4.isBiparthite(true) --> " + g4.isBipartite());
        //*28.9 get Bipartite
        System.out.print("g4.getBipartite --> ");
        List<List<Integer>> sets = g4.getBipartite();
        for (int i = 0; i <= 1; i++) {
            System.out.print("\nset" + i + "  = ");
            for (int vertex : sets.get(i))
                System.out.print(vertex + " ");
        }
        System.out.println();
        System.out.println("g1.getBipartite (null) --> " + g1.getBipartite());
    } // main

    public static UnweightedGraph<Integer> build_from_string(String s) {
        List<AbstractGraph.Edge> edgeList = new ArrayList<>();
        Scanner scan = new Scanner(s);
        int numVerticesInList = Integer.parseInt(scan.nextLine());
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitLine = line.split(" ");
            int u = Integer.parseInt(splitLine[0]);
            for (int j = 1; j < splitLine.length; j++) {
                int v = Integer.parseInt(splitLine[j]);
                edgeList.add(new AbstractGraph.Edge(u, v));
            }
        }
        return new UnweightedGraph<>(edgeList, numVerticesInList);
    }
}
