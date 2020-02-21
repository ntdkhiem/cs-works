 

 

/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.lang.Math;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class DancingBugRunner
{
    public static void main(String[] args)
    {
        int d = 200;
        ActorWorld world = new ActorWorld();
        world.setGrid(new BoundedGrid(d,d));
        for (int i = 0; i < 100; i++) {
            int row = (int) ((Math.random() * d) + 1);
            int col = (int) ((Math.random() * d) + 1);
            System.out.println("row = " + row + ", col = " + col);
            world.add(new Location( row, col ), new DancingBug());
        }
        world.add(new Location (1,1), new DancingBug());
        world.show();
    }
}