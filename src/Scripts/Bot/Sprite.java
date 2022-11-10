package Scripts.Bot;

import UtilityLib.Direction2D;
import UtilityLib.Position3D;

public class Sprite {
    public Position3D position;
    public Direction2D direction;

    public Sprite(){
        this.position = new Position3D(0,0,0);
        direction = Direction2D.South;
    }

    public Sprite(Position3D position, Direction2D direction) {
        this.position = position;
        this.direction = direction;
    }
}
