package Scripts.Bot.SpriteNavigation;

import Scripts.LevelMatrix.LevelMatrix;
import UtilityLib.Direction2D;
import UtilityLib.Position2D;
import UtilityLib.Position3D;

public class Navigator {

    private Sprite sprite;
    private LevelMatrix map;

    public Navigator(Sprite sprite, LevelMatrix matrix) {
        this.sprite = sprite;
        this.map = matrix;
    }

    public void teleport3D(Position2D nextPos) {
        if (map.isInBound(nextPos.x, nextPos.y) && map.get(nextPos.x, nextPos.y) != 0) {
            int z = Math.abs(map.get(nextPos.x, nextPos.y));
            sprite.setPosition(new Position3D(nextPos.x, nextPos.y, z));
        }
    }

    public void teleport2D(Position2D nextPos) {
        boolean isInBound = map.isInBound(nextPos.x, nextPos.y);
        boolean isNotEmpty = (map.get(nextPos.x, nextPos.y) != 0);

        Position2D currentPos = new Position2D(sprite.getPosition().x, sprite.getPosition().y);
        boolean isOnSameLevel = (map.getLevelDifference(currentPos, nextPos) == 0);

        if (isInBound && isNotEmpty && isOnSameLevel) {
            sprite.setPosition(new Position3D(nextPos.x, nextPos.y, sprite.getPosition().z));
        }
    }

    public void walkAlignToDir(int steps) {
        Direction2D dir = sprite.getDirection();
        Position2D currentPos = new Position2D(sprite.getPosition().x, sprite.getPosition().y);

        while (steps >= 0) {
            switch (dir) {
                case SOUTH:
                    teleport2D(new Position2D(currentPos.x, currentPos.y - 1));
                    break;
                case NORTH:
                    teleport2D(new Position2D(currentPos.x, currentPos.y + 1));
                    break;
                case EAST:
                    teleport2D(new Position2D(currentPos.x + 1, currentPos.y));
                    break;
                case WEST:
                    teleport2D(new Position2D(currentPos.x - 1, currentPos.y));
                    break;
            }

            steps--;
        }
    }

    public Sprite getSprite() {
        return sprite;
    }

    public LevelMatrix getMap(){
        return this.map;
    }

}
