package Scripts.Mechanics;

import Scripts.Bot.Bot;
import Scripts.Level.LevelUtility;
import UtilityLib.Position2D;
import UtilityLib.Position3D;

public class ForwardCommand implements Command {

    Position3D intendedPos;
    Position3D currentPos;

    LevelUtility levelUtility;

    @Override
    public void execute(Bot bot) {
        currentPos = bot.position;
        moveAhead(bot);

    }

    private void moveAhead(Bot bot) {
        intendedPos = bot.position;
        switch (bot.direction) {
            case East:
                intendedPos.x += 1;
                break;
            case West:
                intendedPos.x -= 1;
                break;
            case North:
                intendedPos.y += 1;
                break;
            case South:
                intendedPos.y -= 1;
                break;
        }
    }

    private boolean collided() {
        Position2D temp_1 = new Position2D(intendedPos.x, intendedPos.y);
        Position2D temp_2 = new Position2D(currentPos.x, currentPos.y);
        return levelUtility.isEmpty(temp_1) || !(levelUtility.areOnSameLevel(temp_1,temp_2));
    }

}
