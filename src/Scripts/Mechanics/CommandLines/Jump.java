package Scripts.Mechanics.CommandLines;

import Scripts.Bot.Bot;
import Scripts.Mechanics.CommandStructure.Command;
import UtilityLib.Direction2D;
import UtilityLib.Position2D;

public class Jump implements Command {

    @Override
    public void execute(Bot bot) {

        Position2D nextPos = getNextPosAlignToDir(bot);

        if (nextPos != null) {

            Position2D currentPos = new Position2D(bot.getPos().x, bot.getPos().y);
            boolean nextPosIsOnDiffLevel = (Math.abs(bot.getNavigationHandler().getMap().
                    getLevelDifference(currentPos, nextPos)) == 1);

            if (nextPosIsOnDiffLevel)
                bot.getNavigationHandler().teleport3D(nextPos);
        }

    }

    private Position2D getNextPosAlignToDir(Bot bot) {

        Direction2D dir = bot.getDir();
        Position2D currentPos = new Position2D(bot.getPos().x, bot.getPos().y);
        Position2D nextPos;

        switch (dir) {
            case WEST:
                nextPos = new Position2D(currentPos.x - 1, currentPos.y);
                return currentPos;
            case EAST:
                nextPos = new Position2D(currentPos.x + 1, currentPos.y);
                return currentPos;
            case NORTH:
                nextPos = new Position2D(currentPos.x, currentPos.y + 1);
                return currentPos;
            case SOUTH:
                nextPos = new Position2D(currentPos.x, currentPos.y - 1);
                return currentPos;
        }

        return null;
    }
}
