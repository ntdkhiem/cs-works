import info.gridworld.actor.*;
import info.gridworld.grid.*;

import java.awt.Color;

public class Director extends Rock {
    public Director() {
        setColor(Color.RED);
    }

    public void act() {
        if (getColor() == Color.GREEN) {
            for (Location loc : getGrid().getOccupiedAdjacentLocations(getLocation())) {
                Actor a = getGrid().get(loc);
                a.setDirection(a.getDirection() + 90);
            }
        }

        if (getColor() == Color.GREEN) {
            setColor(Color.RED);
        }
        else {
            setColor(Color.GREEN);
        }
    }
}
