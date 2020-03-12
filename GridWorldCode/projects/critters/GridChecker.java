import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class GridChecker {
    private static BoundedGrid<Actor> gr;
//    private BoundedGrid<Actor> gr;

    public static void main(String[] args) {
//        System.out.println("Starting");
        gr = new BoundedGrid<Actor>(7,7);
        ActorWorld world = new ActorWorld(gr);
        world.add(new Location(0,0), new Rock());
        world.add(new Location(3,2), new Bug());
        world.add(new Location(3,3), new Rock());
        world.add(new Location(5,4), new Bug());
        world.add(new Location(5,6), new Bug());
        world.show();
        Actor a = actorWithMostNeighbors();
        System.out.println("Actor at " + a.getLocation() + " has the most neighbors");
        ArrayList<Location> locs = getOccupiedWithinTwo(new Location(3,3));
        System.out.print("Neighbors within two blocks of (3,3): [");
        for (Location loc: locs) {
            System.out.print(loc + ", ");
        }
        System.out.println("]");
    }

    public static Actor actorWithMostNeighbors() {
        Actor a = null;
        int totalNeighbors = 0;
        for (Location loc : gr.getOccupiedLocations()) {
            ArrayList<Location> ls = gr.getOccupiedAdjacentLocations(loc);
            if (ls.size() > totalNeighbors) {
                a = gr.get(loc);
                totalNeighbors = ls.size();
            }
        }

        return a;
    }

    public static ArrayList<Location> getOccupiedWithinTwo(Location loc) {
        ArrayList<Location> neighborsLoc = new ArrayList<>();
        int startRow = loc.getRow() - 2;
        int startCol = loc.getCol() - 2;
        int endRow = loc.getRow() + 2;
        int endCol = loc.getCol() + 2;
        while (startRow < 0) startRow++;
        while (startCol < 0) startCol++;
        while (endRow > gr.getNumRows()) endRow--;
        while (endCol > gr.getNumCols()) endCol--;

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                Location _loc = new Location(i,j);
                if (gr.get(_loc) != null && !(_loc.getRow() == loc.getRow() && _loc.getCol() == loc.getCol())) {
                    neighborsLoc.add(_loc);
                }
            }
        }
        return neighborsLoc;
    }
}
