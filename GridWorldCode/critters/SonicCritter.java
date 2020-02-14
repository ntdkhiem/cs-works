import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import java.lang.Math;

public class SonicCritter extends Critter {
    private int collectedFlowers;
    private int id;

    public SonicCritter(int id) {
        collectedFlowers = 0;
        this.id = id;
    }

    public void processActors(ArrayList<Actor> actors) {
        for (Actor a: actors) {
            if (!(a instanceof Rock) && !(a instanceof Critter)) {
                // assuming its flower
                a.removeSelfFromGrid();
                System.out.println("Sonic Critter " + id + " collected a flower (currently: " + collectedFlowers + " )");
                this.collectedFlowers++;
            }
        }
    }

    public ArrayList<Location> getMoveLocations() {
        return getGrid().getValidAdjacentLocations(getLocation());
    }

    // only ignore rocks
    public Location selectMoveLocation(ArrayList<Location> locs) {
        /*
        for (Location loc: locs) {
            if (getGrid().get(loc) instanceof Rock) {
                locs.remove(loc);
            }
        }
        */
        int n = locs.size();
        if (n == 0) return getLocation();

        return locs.get((int) (Math.random() * n));
    }

    public void makeMove(Location loc) {
        if (loc == null) removeSelfFromGrid();
        else {
            // if the next location is a critter then we have a clash
            Actor a = getGrid().get(loc);
            // assuming its another SonicCritter
            if (a != null && a instanceof SonicCritter) {
                SonicCritter A = ((SonicCritter)a);
                System.out.print("SonicCritter " + id + " is clashing with SoniceCritter " +A.getID() + ": ");
                if (A.getCollectedFlowers() < getCollectedFlowers()) { 
                   System.out.println("SoniceCritter " + id + " is stronger!");
                   A.moveBack();
                   A.losePoint();
                }
                else if (A.getCollectedFlowers() > getCollectedFlowers()) {
                    System.out.println("SoniceCritter " + A.getID() + " is stronger!");
                    moveBack();
                    losePoint();
                }
                else {
                    System.out.println("Both is equally the same! therefore justice falls upon both!");
                    A.moveBack();
                    A.losePoint();
                    moveBack();
                    losePoint();
                } 
            }
            else 
                moveTo(loc);
        }
    }

    public int getCollectedFlowers() {
        return collectedFlowers;
    }

    public int getID() {
        return id;
    }
    
    // only move back 135, 180, 225 degree
    public void moveBack() {
        int[] dirs = {Location.HALF_CIRCLE, Location.HALF_CIRCLE - Location.HALF_RIGHT, Location.HALF_CIRCLE + Location.HALF_RIGHT};
        Grid gr = getGrid();
        Location loc = getLocation();
        for (int dir: dirs) {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + dir);
            if (gr.isValid(neighborLoc)) {
                // move if the grid is empty
                if (getGrid().get(neighborLoc) == null) {
                    moveTo(neighborLoc);
                    break;
                }
            }
        }
        // if can't move then remove;
        System.out.println("SonicCritter " + id + " can't move therefore shall remove it!");
        removeSelfFromGrid();
    }
    
    public void losePoint() {
        System.out.print("SonicCritter " + id + " loses half of the point: from " + collectedFlowers + " flowers to ");
        collectedFlowers = (int) ((double) collectedFlowers * 0.5);
        System.out.print(collectedFlowers + " flowers");
        if (collectedFlowers == 0) {
            System.out.println("SonicCritter " + id + " died from starvation");
            removeSelfFromGrid();
        }
        System.out.println();
    }
}


