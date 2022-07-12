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
        move(numberOfSteps, draw, true);
    }

    @SuppressWarnings("DuplicatedCode")
    private void writeOn(int numberOfSteps, Sketchpad draw) {
        int[][] floor = draw.getFloor();

        int currentRow = currentPosition.getY();
        int currentColumn = currentPosition.getX();

        switch (currentDirection) {
            case EAST -> {
                for (int i = currentColumn; i <= currentColumn + numberOfSteps; i++) {
                    if(currentColumn + numberOfSteps < floor.length) {
                        floor[currentRow][i] = 1;
                    } else {
                        writeOn((floor.length - 1) - currentPosition.getX(), draw);
                    }
                }
            }

            case WEST -> {
                for (int i = currentColumn; i >= currentColumn - numberOfSteps; i--) {
                    if(currentColumn + numberOfSteps < floor.length) {
                        floor[currentRow][i] = 1;
                    } else {
                        writeOn((floor.length - 1) - currentPosition.getX(), draw);
                    }
                }
            }

            case NORTH -> {
                for (int i = currentRow; i >= currentRow - numberOfSteps; i--) {
                    if(currentColumn + numberOfSteps < floor.length) {
                        floor[i][currentColumn] = 1;
                    } else {
                        writeOn((floor.length - 1) - currentPosition.getY(), draw);
                    }
                }
            }

            case SOUTH -> {
                for (int i = currentRow; i <= currentRow + numberOfSteps; i++) {
                    if(currentColumn + numberOfSteps < floor.length) {
                        floor[i][currentColumn] = 1;
                    } else {
                        writeOn((floor.length - 1) - currentPosition.getY(), draw);
                    }
                }
            }
        }
    }

    private void move(int numberOfSteps, Sketchpad draw, boolean trueMoveMethod) {
        int column = currentPosition.getX();
        int row = currentPosition.getY();
        int[][] floor = draw.getFloor();

        switch (currentDirection){
            case EAST -> {
                if((currentPosition.getX() + numberOfSteps) < floor.length) {
                    currentPosition.setX(column + numberOfSteps);
                }
            }

            case WEST -> {
                if(numberOfSteps <= currentPosition.getX()) {
                    currentPosition.setX(column - numberOfSteps);
                }
            }

            case NORTH -> {
                if(numberOfSteps <= currentPosition.getY()) {
                    currentPosition.setY(row - numberOfSteps);
                }
            }

            case SOUTH -> {
                if((currentPosition.getY() + numberOfSteps) < floor.length) {
                    currentPosition.setY(row + numberOfSteps);
                }
            }
        }
    }

    public Position getCurrentPosition() {
        return new Position(currentPosition.getX(), currentPosition.getY());
    }
}
