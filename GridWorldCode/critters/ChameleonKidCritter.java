import info.gridworld.actor.Actor;
import java.util.ArrayList;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;

public class ChameleonKidCritter extends ChameleonCritter{
    public ChameleonKidCritter() {
        super();
        setColor(Color.YELLOW);
    }
    public ArrayList<Actor> getActor() {
        Grid gr = getGrid();
        Location loc = getLocation();
        ArrayList<Actor> actors = new ArrayList<Actor>();
        int[] dirs = {Location.AHEAD, Location.HALF_CIRCLE};
        
        for (int d: dirs) {
            Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
            if (gr.isValid(neighborLoc)) {
                Actor actor = getGrid().get(neighborLoc);
                if (actor != null) {
                    actors.add(actor);
                }
                
            }
        }
        return actors;
    }
}