package Scripts.Mechanics.CommandLines;

import Scripts.Bot.Bot;
import Scripts.Mechanics.CommandStructure.Command;
import UtilityLib.Direction2D;

public class RotateClockWise implements Command {
    @Override
    public void execute(Bot bot) {
        switch (bot.getDir()){
            case NORTH:
                bot.setDir(Direction2D.EAST);
                break;
            case EAST:
                bot.setDir(Direction2D.SOUTH);
                break;
            case SOUTH:
                bot.setDir(Direction2D.WEST);
                break;
            case WEST:
                bot.setDir(Direction2D.NORTH);
                break;
        }
    }
}
