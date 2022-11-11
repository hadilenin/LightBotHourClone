package Scripts.Mechanics.CommandLines;

import Scripts.Bot.Bot;
import Scripts.Mechanics.CommandStructure.Command;
import UtilityLib.Position2D;

public class LightUp implements Command {
    @Override
    public void execute(Bot bot) {
        if (bot.getNavigationHandler().getMap().isNegative(bot.getPos().x,bot.getPos().y))
            bot.getNavigationHandler().getMap().switchSignAt(bot.getPos().x,bot.getPos().y);
    }
}
