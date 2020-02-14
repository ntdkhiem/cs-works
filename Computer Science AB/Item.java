import java.lang.Comparable;

public class Item {
    private Comparable data;
    private int count;

    public Item(Comparable d) {
        data = d;
        count = 1;
    }

    public void ic() {
        count++;
    }

    public void dc() {
        count--;
    }

    public int gc() {
        return count;
    }

    public Comparable getData() {
        return data;
    }
}