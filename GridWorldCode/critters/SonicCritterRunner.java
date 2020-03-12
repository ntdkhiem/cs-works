
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
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

//import info.gridworld.actor.Actor;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

import java.awt.Color;
import java.lang.Math;


public class SonicCritterRunner {
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(50, 50));
        world.add(new Location(7, 8), new Rock());
        world.add(new Location(3, 3), new Rock());
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            world.add(generateRandomLocation(world), new SonicCritter(i, randomColor(), world));
        }
//        world.add(generateRandomLocation(world), new SonicCritter(6, randomColor()));
        // generate flowers at random location
        for (int i = 0; i < Integer.parseInt(args[1]); i++) {
            world.add(generateRandomLocation(world), new Flower(Color.BLUE));
        }
        world.show();
    }

    private static Color randomColor() {
        int num = (int) (Math.random() * 6);
        switch (num) {
            case 0:
                return Color.RED;
            case 1:
                return Color.YELLOW;
            case 3:
                return Color.GREEN;
            case 4:
                return Color.CYAN;
            case 5:
                return Color.ORANGE;
            default:
                return Color.PINK;
        }
    }

    private static Location generateRandomLocation(ActorWorld world) {
        int row = 0;
        int col = 0;
        Location loc;
        int limit = 10;
        do {
            row = (int) (Math.random() * world.getGrid().getNumRows());
            col = (int) (Math.random() * world.getGrid().getNumCols());
            // System.out.println(row + "  " + col);
            loc = new Location(row, col);
            limit--;
            if (limit == 0) {
                throw new ExceptionInInitializerError();
            }
        } while (world.getGrid().get(loc) != null);
        return loc;
    }
}



