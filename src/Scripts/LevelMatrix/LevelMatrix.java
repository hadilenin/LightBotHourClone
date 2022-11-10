package Scripts.LevelMatrix;

public class LevelMatrix {
    private int[][] matrix;

    public LevelMatrix(int x,int y){
        matrix = new int[y][x];
    }

    public void switchSignAt(int x,int y){
        matrix[y][x] *= -1;
    }

    public void addOneMoreAt(int x,int y){
        matrix[y][x] += 1;
    }

    public void takeOneOffAt(int x, int y){
        matrix[y][x] -= 1;
    }

    public int get(int x, int y){
        return matrix[y][x];
    }

}
