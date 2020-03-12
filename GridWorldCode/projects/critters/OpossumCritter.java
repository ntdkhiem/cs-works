import info.gridworld.actor.*;
import info.gridworld.grid.Location;

import java.awt.Color; 
import java.util.*;

public class OpossumCritter extends Critter {
    private int numStepsDead;
    
    public OpossumCritter() {
        numStepsDead = 0;
        setColor(Color.ORANGE);
    }
    
    public void processActors(ArrayList<Actor> actors) {
        int n = 0;
        for (Actor a: actors) {
            if (a instanceof Flower && a instanceof Critter) {
                if (numStepsDead != 0) {
                    numStepsDead = 0;
                }
                n++; // friend
                System.out.println("Found a friend, n = " + n);
            }
            else if (a instanceof Rock) {
                
                n--; // foe
                System.out.println("Found a foe, n = " + n);
            }
        }
        
        if (n >= 0) setColor(Color.ORANGE);
        else {
            setColor(Color.BLACK);
            numStepsDead++;
            System.out.println("Pretend dead...");
        }
    }
    
    public Location selectMoveLocation(ArrayList<Location> locs) {
        if (numStepsDead != 0) {
            if (numStepsDead >= 3) {
                return null;
            }
            //getLocation();
        }
        
        return super.selectMoveLocation(locs);
    }
}