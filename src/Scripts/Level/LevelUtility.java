package Scripts.Level;

import UtilityLib.*;

public interface LevelUtility {
    public boolean isEmpty(Position2D pos);
    public boolean isBlueTile(Position2D pos);
    public int getHeightFromZeroLevel(Position2D pos);

    public boolean areOnSameLevel(Position2D pos1,Position2D pos2);
}
