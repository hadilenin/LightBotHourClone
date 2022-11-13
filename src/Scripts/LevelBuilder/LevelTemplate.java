package Scripts.LevelBuilder;

import Scripts.Bot.Bot;

public abstract class LevelTemplate {
    public LevelBuilder levelBuilder;
    public Bot bot;

    public final void init(){
        createMap();
        initBot();
        spawnBot();
    }
    public abstract void initBot();
    public abstract void spawnBot();
    public abstract void createMap();

}
