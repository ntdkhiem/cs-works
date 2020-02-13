import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.actor.Flower;

import java.awt.Color;
import java.util.ArrayList;

public class FlowerBug extends Bug
{
    public FlowerBug() 
    {
        setColor(Color.YELLOW);
    }
    
    public void act()
    {
        // if can move then move
        if (canMove())
            // check if next grid is instance of Rock then remove it
            move();
        // else turn
        else 
            turn();
    }
    
    // overide method to check if next grid is instanceof Rock and remov
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Actor neighbor = gr.get(next);
        if (gr.isValid(next))
            if (neighbor instanceof Rock)
            {
                gr.remove(next);
            }
            moveTo(next);
        Flower flower = new Flower(getColor());
        flower.putSelfInGrid(gr, loc);
    }
    
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Rock);
        // ok to move into empty location or onto rock
        // not ok to move onto any other actor
    }
}