package TurtleGraphics;

public class Sketchpad {
    private int[][] floor;

    public Sketchpad(int column, int row) {
        floor = new int[row][column];
    }

    public int[][] getFloor() {
        return floor;
    }
}
