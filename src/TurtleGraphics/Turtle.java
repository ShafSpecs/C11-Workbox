package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {
    private boolean penUp;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(){
        this.penUp = true;
        this.currentDirection = EAST;
        this.currentPosition = new Position(0, 0);
    }

    public boolean penIsUp() {
        return penUp;
    }

    public void penDown() {
        penUp = false;
    }

    public void penUp() {
        this.penUp = true;
    }

    public Direction getDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection = SOUTH;

            case SOUTH -> currentDirection = WEST;

            case WEST -> currentDirection = NORTH;

            case NORTH -> currentDirection = EAST;
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> currentDirection = NORTH;

            case SOUTH -> currentDirection = EAST;

            case WEST -> currentDirection = SOUTH;

            case NORTH -> currentDirection = WEST;
        }
    }

    public void move(int numberOfSteps, Sketchpad draw) {
        if(!penIsUp()) writeOn(numberOfSteps, draw);
        move(numberOfSteps);
    }

    private void writeOn(int numberOfSteps, Sketchpad draw) {
        int[][] floor = draw.getFloor();

        int currentRow = currentPosition.getY();
        int currentColumn = currentPosition.getX();

        switch (currentDirection) {
            case EAST -> {
                for (int i = currentColumn; i < currentColumn + numberOfSteps; i++) {
                    floor[currentRow][i] = 1;
                }
            }
        }
    }

    private void move(int numberOfSteps) {
        int column = currentPosition.getX();
        int row = currentPosition.getY();

        switch (currentDirection){
            case EAST -> currentPosition.setX(column + numberOfSteps);

            case WEST -> currentPosition.setX(column - numberOfSteps);

            case NORTH -> currentPosition.setY(row + numberOfSteps);

            case SOUTH -> currentPosition.setY(row - numberOfSteps);
        }
    }

    public Position getCurrentPosition() {
        return new Position(currentPosition.getX(), currentPosition.getY());
    }
}
