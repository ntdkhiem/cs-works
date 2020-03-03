import java.util.*;

public class MyGraph<V> extends UnweightedGraph<V> {
    public MyGraph(List<Edge> edges, int numberOfVertices) {
        super(edges, numberOfVertices);
    }
    
    public List<List<Integer>> getConnectedComponents() {
        List<List<Integer>> result = new ArrayList<>();
        AbstractGraph.Tree tree = dfs(0);
        result.add(tree.getSearchOrder());
        if (tree.getNumberOfVerticesFound() != getSize()) {
            result.add(bfs(tree.getNumberOfVerticesFound()).getSearchOrder());
        }
        return result;
    }
}