package Scripts.Bot;

import Scripts.Mechanics.Command;
import UtilityLib.*;


public class Bot extends Sprite{

    public Bot(Position3D position, Direction2D direction) {
        super(position, direction);
    }

    void nextCommand(Command command) {
        command.execute(this);
    }
}
