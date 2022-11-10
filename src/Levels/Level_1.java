package Levels;

import Scripts.Level.*;
import UtilityLib.*;


public class Level_1 extends LevelBuilder implements LevelUtility {

    public Level_1() {
        super(1,3);
        super.addBlockAt(0,0);
        super.addBlockAt(0,1);
        super.addBlockAt(0,2);
        super.setUpBlueTileAt(0,2);
    }

    @Override
    public boolean isEmpty(Position2D pos) {
        return (super.mapMatrix[pos.y][pos.x] == 0);
    }

    @Override
    public boolean isBlueTile(Position2D pos) {
        return (super.mapMatrix[pos.y][pos.x] < 0);
    }

    @Override
    public int getHeightFromZeroLevel(Position2D pos) {
        return Math.abs(super.mapMatrix[pos.y][pos.x]);
    }

    @Override
    public boolean areOnSameLevel(Position2D pos1, Position2D pos2) {
        int diffLevel = getHeightFromZeroLevel(pos1) - getHeightFromZeroLevel(pos2);
        return (diffLevel == 0);
    }
}
