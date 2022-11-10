package Levels;

import Scripts.LevelBuilder.*;
import UtilityLib.*;


public class Level_1 extends LevelBuilder {

    public Level_1() {
        super(1,3);
        super.addBlockAt(0,0);
        super.addBlockAt(0,1);
        super.addBlockAt(0,2);
        super.setUpBlueTileAt(0,2);

    }

}
