
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.util.ArrayList;

public class StockpileCritter extends Critter {
 private int energy;
 public StockpileCritter() {
   super();
   energy = 0;
 }
 
 public void processActors(ArrayList<Actor> actors) {
   for (Actor a: actors) {
     a.removeSelfFromGrid();
     energy++;
   }
 }
 
 public void makeMove(Location loc) {
     System.out.println("Current Energy: " + energy);
   if (loc == null || energy == 0) {
     removeSelfFromGrid();
   }
   else {
     moveTo(loc);
     energy--;
   }
 }
}
