package Scripts.Bot.SpriteNavigation;

import UtilityLib.Direction2D;
import UtilityLib.Position3D;

public class Sprite {

    private Position3D position;
    private Direction2D direction;
    private boolean visible;

    public Position3D getPosition() {
        return position;
    }

    public void setVisibility(boolean visible){
        this.visible = visible;
    }

    public boolean getVisibility(){
        return visible;
    }

    public void setPosition(Position3D position) {
        this.position = position;
    }

    public Direction2D getDirection() {
        return direction;
    }

    public void setDirection(Direction2D direction) {
        this.direction = direction;
    }
}
