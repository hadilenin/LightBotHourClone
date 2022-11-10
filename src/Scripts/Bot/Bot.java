package Scripts.Bot;

import Scripts.LevelMatrix.LevelMatrix;
import Scripts.Mechanics.Command;
import UtilityLib.*;


public class Bot {

    private Position3D position;
    private Direction2D direction;
    private LevelMatrix matrix;


    public void setMatrix(LevelMatrix levelMatrix){
        this.matrix = levelMatrix;
    }
    public void setPos(int x,int y,int z){
        position.x = x;
        position.y = y;
        position.z = z;
    }

    public Position3D getPos(){
        return position;
    }

    public void setDir(Direction2D dir){
        direction = dir;
    }

    public Direction2D getDir(){
        return direction;
    }


    public void nextCommand(Command command) {
        command.execute(this);
    }
}
