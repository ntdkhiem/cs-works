 

import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class BlusterCritter extends Critter {
    private int courage; 
    private int critters;
    private ArrayList<Location> neighborLocs;
    
    public BlusterCritter(int courage) {
        super();
        this.courage = courage;
        neighborLocs = new ArrayList<Location>();
    }
    
    public ArrayList<Actor> getActors() {
        int startRow = getLocation().getRow() - 2;
        int startCol = getLocation().getCol() - 2;
        int endRow = getLocation().getRow() + 2;
        int endCol = getLocation().getCol() + 2;
        Location startingLoc = new Location(getLocation().getRow() - 2, getLocation().getCol() - 2);
        
        while (startRow < 0 || startCol < 0) {
            if (startingLoc.getRow() < 0) {
                startingLoc = new Location(startingLoc.getRow() + 1, startingLoc.getCol());
            }
            if (startingLoc.getCol() < 0) {
                startingLoc = new Location(startingLoc.getRow(), startingLoc.getCol() + 1);
            }
        }
        return null;
    }
    
    public ArrayList<Actor> processActors() {
        return null;
    }
}