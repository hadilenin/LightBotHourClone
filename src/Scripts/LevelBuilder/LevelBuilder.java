package Scripts.LevelBuilder;


import Scripts.LevelMatrix.LevelMatrix;

public class LevelBuilder {
    private LevelMatrix levelMatrix;

    public LevelBuilder(int xAxisSize, int yAxisSize) {
        levelMatrix = new LevelMatrix(xAxisSize, yAxisSize);
    }

    public void addBlockAt(int x, int y) {
        if (levelMatrix.get(x, y) < 0)
            addingOnBlueTileNotAllowed();
        else
            levelMatrix.addOneMoreAt(x, y);
    }


    public void removeBlockFrom(int x, int y) {

        if (levelMatrix.get(x, y) > 0)
            levelMatrix.takeOneOffAt(x, y);

        if (levelMatrix.get(x, y) < 0) {
            levelMatrix.switchSignAt(x, y);
            levelMatrix.takeOneOffAt(x, y);
            levelMatrix.switchSignAt(x, y);
        } else
            blockNotFound();
    }


    public void setUpBlueTileAt(int x, int y) {
        if (levelMatrix.get(x, y) == 0) {
            levelMatrix.addOneMoreAt(x, y);           //creating new block
            levelMatrix.switchSignAt(x, y);          // setting it as blue tile
        } else if (levelMatrix.get(x, y) < 0)
            foundBlueTile();
        else
            levelMatrix.switchSignAt(x, y);
    }


        public void removeBlueTileFrom(int x, int y) {
            if (levelMatrix.get(x, y) < 0)
                levelMatrix.switchSignAt(x, y);
            else
                blueTileNotFound();
        }


    private void blueTileNotFound() {
        System.out.println("no blue tile to remove!");
    }

    private void foundBlueTile() {
        System.out.println("this block already has blue tile!");
    }

    private void blockNotFound() {
        System.out.println("no block to remove!!");
    }

    private void addingOnBlueTileNotAllowed() {
        System.out.println("can't add new block up on an existing blue tile!");
    }

}
