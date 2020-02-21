import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import java.lang.Math;
import java.awt.Color;

public class SonicCritter extends Critter {
    private int collectedFlowers;
    private int id;
    private ActorWorld world;

    public SonicCritter(int id, Color c, ActorWorld world) {
        collectedFlowers = 0;
        this.id = id;
        this.world = world;
        String colorName = "";
        if (Color.RED.equals(c)) {
            colorName = "RED";
        } else if (Color.YELLOW.equals(c)) {
            colorName = "YELLOW";
        } else if (Color.GREEN.equals(c)) {
            colorName = "GREEN";
        } else if (Color.CYAN.equals(c)) {
            colorName = "CYAN";
        } else if (Color.ORANGE.equals(c)) {
            colorName = "ORANGE";
        } else if (Color.PINK.equals(c)) {
            colorName = "PINK";
        }
        setColor(c);
        System.out.println("SonicCritter " + id + ": " + colorName);
    }

    public void processActors(ArrayList<Actor> actors) {
        int currentFlowers = 0;
        for (Actor a : actors) {
            if (!(a instanceof Rock) && !(a instanceof SonicCritter)) {
                // assuming its flower
//                System.out.println("SonicCritter " + id + " Found a flower at location:" + a.getLocation().getCol() + "," + a.getLocation().getRow());
                a.removeSelfFromGrid();
                currentFlowers++;
            }
        }
        if (currentFlowers != 0) {
            this.collectedFlowers += currentFlowers;
            System.out.println("SonicCritter " + id + " collected " + currentFlowers + " flower(s)\t(currently: " + collectedFlowers + " )");
        }
    }

    public ArrayList<Location> getMoveLocations() {
        return getGrid().getValidAdjacentLocations(getLocation());
    }

    // only ignore rocks
    public Location selectMoveLocation(ArrayList<Location> locs) {
        for (int i = locs.size() - 1; i > 0; i--) {
            if (getGrid().get(locs.get(i)) instanceof Rock) {
                locs.remove(i);
            }
        }
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
            if (a instanceof SonicCritter) {
                SonicCritter A = ((SonicCritter) a);
                System.out.print("SonicCritter " + id + " is clashing with SonicCritter " + A.getID() + ": ");
                if (A.getCollectedFlowers() < getCollectedFlowers()) {
                    System.out.println("SonicCritter " + id + " is stronger!");
                    A.moveBack();
                    A.losePoint();
                } else if (A.getCollectedFlowers() > getCollectedFlowers()) {
                    System.out.println("SonicCritter " + A.getID() + " is stronger!");
                    moveBack();
                    losePoint();
                } else {
                    System.out.println("Both is equally the same! therefore justice falls upon both!");
                    A.moveBack();
                    A.losePoint();
                    moveBack();
                    losePoint();
                }
            } else
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
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        for (int dir : dirs) {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + dir);
            if (gr.isValid(neighborLoc)) {
                // move if the grid is empty
                if (getGrid().get(neighborLoc) == null) {
                    // System.out.println("SonicCritter " + id + " able to move back!");
                    moveTo(neighborLoc);
                    return;
                }
            }
        }
        // if can't move then remove;
        System.out.println("SonicCritter " + id + " can't move therefore shall be remove!");
        removeSelfFromGrid();
    }

    public void losePoint() {
        int prevPoints = collectedFlowers;
        collectedFlowers = (int) ((double) collectedFlowers * 0.5);
        if (collectedFlowers == 0) {
            System.out.println("SonicCritter " + id + " died from starvation");
            removeSelfFromGrid();
            return;
        }
        System.out.println("SonicCritter " + id + " loses point: from " + prevPoints + " flowers to " + collectedFlowers);
        scatterFlowers(prevPoints - collectedFlowers);
    }

    public void scatterFlowers(int amount) {
        System.out.print("Scattering " + amount + " flowers: ");
        for (int i = 0; i < amount; i++) {
            world.add(generateRandomLocation(), new Flower(Color.RED));
        }
        System.out.println("DONE");
    }

    private Location generateRandomLocation() {
        int row = 0;
        int col = 0;
        Location loc;
        do {
            row = (int) (Math.random() * getGrid().getNumRows());
            col = (int) (Math.random() * getGrid().getNumCols());
            // System.out.println(row + "  " + col);
            loc = new Location(row, col);
        } while (getGrid().get(loc) != null);
        return loc;
    }
}


