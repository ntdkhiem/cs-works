import java.util.PriorityQueue;

public class TreePriorityQueue implements PriorityQueue {
    private TreeNode root;

    public TreePriorityQueue() {
        root = null;
    }

    public boolean isEmpty() {
        return false;
    }

    public void add(Object j) {
        root = addHelper((Comparable) j, root);
    }
}