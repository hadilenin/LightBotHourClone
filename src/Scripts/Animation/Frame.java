package Scripts.Animation;

import Textures.Image.Image;

import java.util.LinkedList;

public class Frame {

    private LinkedList<Image> frameList;
    private int pointer;

    public Frame() {
        frameList = new LinkedList<>();
        pointer = -1;
    }

    public void addFrame(Image newFrame) {
        if (newFrame != null)
            frameList.add(newFrame);
    }

    public void removeFrame(Image intendedFrame) {
        frameList.remove(intendedFrame);
    }

    public Image getNextFrame() {
        shiftPointer();
        return frameList.get(pointer);
    }

    private void shiftPointer(){
        if (pointer < frameList.size())
            pointer++;
        else
            pointer = -1;
    }

}
