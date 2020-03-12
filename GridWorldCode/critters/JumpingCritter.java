import info.gridworld.grid.*;
import info.gridworld.actor.*;

import java.util.ArrayList;

public class JumpingCritter extends Critter {
 public ArrayList<Location> getMoveLocations() {
   return GridWorldUtilities.getEmptyLocations(getGrid());
 }
 
 public void makeMove(Location loc) {
   if (loc == null || loc == getLocation()) {
     removeSelfFromGrid();
   }
   else {
     moveTo(loc);
   }
 }
}
