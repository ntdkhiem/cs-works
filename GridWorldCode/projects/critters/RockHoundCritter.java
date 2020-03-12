 

import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Actor;

import java.util.ArrayList;

public class RockHoundCritter extends Critter {
    public void processActors(ArrayList<Actor> actors) {
        for (Actor a: actors) {
            if (a instanceof Rock) {
                a.removeSelfFromGrid();
            }
        }
    }
}