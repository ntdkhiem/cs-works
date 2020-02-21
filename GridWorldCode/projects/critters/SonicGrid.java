import info.gridworld.actor.*;
import info.gridworld.grid.BoundedGrid;

public class SonicGrid extends ActorWorld 
{
    private static final int SIZEROW = 50;
    private static final int SIZECOL = 50;
    
    public SonicGrid() {
        super(new BoundedGrid<Actor>(SIZEROW, SIZECOL));
    }
    
    public int getSIZEROW() {
        return SIZEROW;
    }
    
    public int getSIZECOL() {
        return SIZECOL;
    }
}