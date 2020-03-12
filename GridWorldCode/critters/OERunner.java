import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class OERunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(2,2));
        /* (5,5) attractive Critter
        world.add(new Location(1,1), new Flower());
        world.add(new Location(1,2), new AttractiveCritter());
        world.add(new Location(4,2), new Rock());
         */
        /* (4,4) RetroBug
        world.add(new Location(0,0), new Rock());
        world.add(new Location(0,3), new Rock());
        world.add(new Location(1,1), new Flower());
        world.add(new Location(1,2), new Rock());
        world.add(new Location(2,1), new RetroBug());
        world.add(new Location(3,0), new Critter());
         */
        world.add(new Location(0,0), new JumpingCritter());
        world.add(new Location(0,1), new Rock());
        world.add(new Location(1,0), new Rock());
        world.add(new Location(1,1), new Rock());
        world.show();
    }
}