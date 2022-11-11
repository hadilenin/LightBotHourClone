package Levels;

import Scripts.Bot.Bot;
import Scripts.Bot.SpriteNavigation.Navigator;
import Scripts.Bot.SpriteNavigation.Sprite;
import Scripts.LevelBuilder.*;
import UtilityLib.Direction2D;
import UtilityLib.Position3D;


public class Level_1 extends LevelTemplate {

    private static Level_1 self;

    private Level_1() {
        levelBuilder = new LevelBuilder(1, 3);
        init();
    }

    @Override
    public void initBot() {
        bot = new Bot();
        bot.setNavigation(new Navigator(new Sprite(),levelBuilder.getLevelMatrix()));
    }

    @Override
    public void spawnBot() {
        bot.setPos(new Position3D(0,2,1));
        bot.setDir(Direction2D.SOUTH);
        bot.setVisibility(true);
    }

    @Override
    public void createMap() {
        for (int i = 0; i < 3; i++)
            levelBuilder.addBlockAt(0, i);

        levelBuilder.setUpBlueTileAt(0,2);
    }

    public static Level_1 getInstance(){
        if (self == null)
            return new Level_1();
        else
            return null;
    }

}
