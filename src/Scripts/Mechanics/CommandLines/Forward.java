package Scripts.Mechanics.CommandLines;

import Scripts.Bot.Bot;
import Scripts.Mechanics.CommandStructure.Command;

public class Forward implements Command {

    @Override
    public void execute(Bot bot) {
        bot.getNavigationHandler().walkAlignToDir(1);
    }
}
