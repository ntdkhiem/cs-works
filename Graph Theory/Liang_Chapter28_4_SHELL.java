
/** Liang pg 1055 Chapter 28 #4
(Find connected components) Create a new class named MyGraph as a subclass
of UnweightedGraph that contains a method for finding all connected components
in a graph with the following header:
public List<List<Integer>> getConnectedComponents();
The method returns a List<List<Integer>>. Each element in the list is
another list that contains all the vertices in a connected component. For example,
for the graph in Figure 28.21b, getConnectedComponents() returns
[[0, 1, 2, 3], [4, 5]].
 */

import java.util.*;

public class Liang_Chapter28_4_SHELL
{
    public static void main()
    {
        // Data
        String data[] = {
                "6\n"
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
                + "5 4"};

        // Build the 'edges' list
        System.out.println(" Build the 'edges' list: ");
        for (int i=0; i<data.length; i++)
        {
            List<AbstractGraph.Edge> edgeList = new ArrayList<>();
            Scanner scan = new Scanner(data[i]); 
            int numVerticesInList = Integer.parseInt(scan.nextLine());
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] splitLine = line.split(" ");
                int u = Integer.parseInt(splitLine[0]);   
                for (int j = 1; j < splitLine.length; j++) {
                    int v = Integer.parseInt(splitLine[j]);
                    edgeList.add(new AbstractGraph.Edge(u, v));
                }            
            }// while

            // STEP 2: Create the graph, tree, etc
            MyGraph<Integer> graph = new MyGraph<Integer>(edgeList, numVerticesInList);
            System.out.print("[");
            for (List<Integer> lst: graph.getConnectedComponents()) {
                System.out.print("[");
                for (Integer e: lst) {
                    System.out.print(e + ", ");
                }
                System.out.print("], ");
            }
            System.out.println("]");
            
            // TODO: the result reversed
            List<Integer> path = graph.getPath(0, 5);
            System.out.println(path.toString());
            System.out.println("the graph has cycle: " + graph.isCyclic());
            System.out.println("----------------");
        } // for
        System.out.println("\n\n ------------------- All Done!! -------------------");
    } // main

}  // Liang_Chapter28_4

