import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

import java.awt.Color;
import java.util.ArrayList;

public class NSEWBug extends Bug
{
    public NSEWBug()
   {
       setColor(Color.YELLOW);
   }
   
   public void act() 
   {
       Grid<Actor> gr = getGrid();
       if (gr == null) {return;}
       ArrayList<Location> locs = getLocations();
       int randomMove = (int)(Math.random() * locs.size());    
       if (!locs.isEmpty()) {
           moveTo(locs.get(randomMove));
           setDirection(randomMove * 90);
       }
   }
   public ArrayList<Location> getLocations() 
   {
       Grid<Actor> gr = getGrid();
       ArrayList<Location> locs = new ArrayList<Location>();
       Location loc = getLocation();
       Location next;
       for(int i = 0; i < 4; i++) {
           next = loc.getAdjacentLocation(i * 90);
           if (gr.isValid(next)) {
               locs.add(next);
           }
       }
       return locs;
   }
}