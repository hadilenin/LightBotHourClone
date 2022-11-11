package Scripts.LevelMatrix;

import UtilityLib.Position2D;

public class LevelMatrix {
    private int[][] matrix;
    private int rows;
    private int columns;

    public LevelMatrix(int x, int y) {
        matrix = new int[y][x];
        this.rows = y;
        this.columns = x;
    }

    public void switchSignAt(int x, int y) {
        if (isInBound(x, y))
            matrix[y][x] *= -1;
    }

    public void addOneMoreAt(int x, int y) {
        if (isInBound(x, y))
            matrix[y][x] += 1;
    }

    public void takeOneOffAt(int x, int y) {
        if (isInBound(x, y))
            matrix[y][x] -= 1;
    }

    public int get(int x, int y) {
        return matrix[y][x];
    }

    public int getRowSize() {
        return rows;
    }

    public int getColumnSize() {
        return columns;
    }

    public boolean isNegative(int x,int y){
        return get(x, y) < 0;
    }

    public boolean isInBound(int x, int y) {
        return (x < rows && x >= 0 && y < columns && y >= 0);
    }

    public int getLevelDifference(Position2D pos1, Position2D pos2) {
        if (isInBound(pos1.x, pos1.y) && isInBound(pos2.x, pos2.y)) {
            int diff = Math.abs(matrix[pos1.y][pos1.x]) - Math.abs(matrix[pos2.y][pos2.x]);
            return diff;
        }
        return -1;
    }

}
