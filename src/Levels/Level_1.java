package Levels;

import Scripts.Bot.Bot;
import Scripts.LevelBuilder.*;
import Scripts.LevelMatrix.LevelMatrix;
import UtilityLib.*;


public class Level_1 extends LevelStructure{

    private static Level_1 self;

    private Level_1(int x, int y) {
        levelBuilder = new LevelBuilder(x,y);
        init();
    }

    @Override
    public void initBot() {
        bot = new Bot();
        bot.setMatrix(levelBuilder.getLevelMatrix());
    }

    @Override
    public void spawnBot() {
        
    }

    @Override
    public void createMap() {

    }
}
