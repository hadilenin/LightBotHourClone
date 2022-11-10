package Scripts.LevelBuilder;

import Scripts.Bot.Bot;

public abstract class LevelStructure {
    public LevelBuilder levelBuilder;
    public Bot bot;

    public final void init(){
        initBot();
        spawnBot();
        createMap();
    }
    public abstract void initBot();
    public abstract void spawnBot();
    public abstract void createMap();

}
