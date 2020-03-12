import info.gridworld.actor.*;
import info.gridworld.grid.*;


import java.util.ArrayList;
public class GridWorldUtilities {
    
    public static void main() {
        BoundedGrid<Actor> gr = new BoundedGrid<>(10,10);
        ActorWorld world = new ActorWorld(gr);
        world.add(new Location(0,0), new Rock());
        world.add(new Location(5,5), new Rock());
        world.show();
        
        ArrayList<Location> locs = getEmptyLocations(gr);
        System.out.print("empty locs: [");
        for (Location loc: locs) {
            System.out.print(loc + " ");
        }
        System.out.println("]");
    }
    
    public static ArrayList<Location> getEmptyLocations(Grid<Actor> grid) {
        ArrayList<Location> theLocations = new ArrayList<Location>();
        for (int r = 0; r < grid.getNumRows(); r++) {
            for (int c = 0; c < grid.getNumCols(); c++) {
                Location loc = new Location(r, c);
                if (grid.get(loc) == null) {
                    theLocations.add(loc);
                }
            }
        }
        return theLocations;
    }

}