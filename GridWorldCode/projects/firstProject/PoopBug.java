 

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

import java.awt.Color;

public class PoopBug extends Bug 
{
   public PoopBug()
   {
       setColor(Color.BLACK);
   }    
   public void move()
   {
       Grid<Actor> gr = getGrid();
       if (gr == null) {return;}
       Location loc = getLocation();
       Location next = loc.getAdjacentLocation(getDirection());
       if (gr.isValid(next))
       {
           moveTo(next);
       }
       else 
       {
           removeSelfFromGrid();
       }
       Rock rock = new Rock(Color.RED);
       rock.putSelfInGrid(gr, loc);
   }
}
