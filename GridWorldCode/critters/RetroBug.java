import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class RetroBug extends Bug {
 private Location prevLoc;
 private int prevDir;
 
 public RetroBug () {
   super();
   prevLoc = null;
   prevDir = -1;
 }
 
 public void restore() {
   if (prevLoc != null && prevDir != -1) {
     if (getGrid().get(prevLoc) == null || getGrid().get(prevLoc) instanceof Flower) {
       moveTo(prevLoc);
       setDirection(prevDir);
     }
   }
 }
 
 public void move() {
   prevLoc = getLocation();
   prevDir = getDirection();
   super.move();
 }
}
