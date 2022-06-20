package TurtleGraphics;

public class Position {
    private int x;
    private int y;

    public Position(int xAxis, int yAxis) {
        this.x = xAxis;
        this.y = yAxis;
    }

    @Override
    public String toString() {
        return "Current Position = (" +
                "x: " + x +
                ", y: " + y +
                ')';
    }

    @Override
    public boolean equals(Object o){
        Position compared = (Position) o;

        if(x == compared.getX() && y == compared.getY()) return true;
        return false;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
