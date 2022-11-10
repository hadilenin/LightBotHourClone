package Scripts.Level;


public class LevelBuilder {
    public int[][] mapMatrix;

    public LevelBuilder(int xAxisSize, int yAxisSize) {
        mapMatrix = new int[yAxisSize][xAxisSize];
    }

    public void addBlockAt(int x, int y) {
        if (mapMatrix[y][x] < 0)
            addingOnBlueTileNotAllowed();
        else
            mapMatrix[y][x] += 1;
    }

    public void removeBlockFrom(int x, int y) {
        if (mapMatrix[y][x] > 0)
            mapMatrix[y][x] -= 1;
        if (mapMatrix[y][x] < 0)
            mapMatrix[y][x] += 1;
        else
            blockNotFound();
    }

    public void setUpBlueTileAt(int x, int y) {
        if (mapMatrix[y][x] == 0) {
            mapMatrix[y][x] += 1;           //creating new block
            mapMatrix[y][x] *= -1;          // setting it as blue tile
        } else if (mapMatrix[y][x] < 0)
            foundBlueTile();
        else
            mapMatrix[y][x] *= -1;
    }

    public void removeBlueTileFrom(int x, int y) {
        if (mapMatrix[y][x] < 0)
            mapMatrix[y][x] *= -1;
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
