package Scripts.Bot;

import Scripts.Bot.SpriteNavigation.Navigator;
import Scripts.Mechanics.CommandStructure.Command;
import UtilityLib.*;


public class Bot {

    private Navigator navigatorHandler;


    public void setNavigation(Navigator navigatorHandler) {
        this.navigatorHandler = navigatorHandler;
    }

    public Position3D getPos(){
        return this.navigatorHandler.getSprite().getPosition();
    }

    public void setPos(Position3D pos){
        this.navigatorHandler.getSprite().setPosition(pos);
    }

    public Direction2D getDir(){
        return this.navigatorHandler.getSprite().getDirection();
    }

    public void setDir(Direction2D dir){
        this.navigatorHandler.getSprite().setDirection(dir);
    }

    public boolean isVisible(){
        return this.navigatorHandler.getSprite().getVisibility();
    }

    public void setVisibility(boolean visibility){
        this.navigatorHandler.getSprite().setVisibility(visibility);
    }
    public Navigator getNavigationHandler() {
        return navigatorHandler;
    }

    public void nextCommand(Command command) {
        command.execute(this);
    }

}
