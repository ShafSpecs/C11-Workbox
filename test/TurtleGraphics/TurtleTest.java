package TurtleGraphics;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    private Turtle turtle;
    private Sketchpad draw;

    @BeforeEach
    public void initializeTurtle(){
        turtle = new Turtle();
    }

    @BeforeEach
    public void initializeSketchPad() { draw = new Sketchpad(5, 5); }

    @Test
    @DisplayName("Turtle creation test.")
    @Description("Test that turtle can be created.")
    public void turtleCanBeCreated(){
        assertNotNull(turtle);
    }

    @Test
    public void turtleIsCreatedWithPenUpDefault(){
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void turtlePenCanGoDownTest(){
        assertTrue(turtle.penIsUp());

        turtle.penDown();

        assertFalse(turtle.penIsUp());
    }

    @Test
    public void turtlePenCanGoBackUp(){
        assertTrue(turtle.penIsUp());

        turtle.penDown();
        turtle.penUp();

        assertTrue(turtle.penIsUp());
    }

    @Test
    public void whileFacingEast_turtleCanTurnRight(){
        assertSame(Direction.EAST, turtle.getDirection());

        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.getDirection());
    }

    @Test
    public void whileFacingSouth_turtleCanTurnRight(){
        whileFacingEast_turtleCanTurnRight();
        turtle.turnRight();

        assertSame(Direction.WEST, turtle.getDirection());
    }

    @Test
    public void whileFacingWest_turtleCanTurnRight(){
        whileFacingSouth_turtleCanTurnRight();
        turtle.turnRight();

        assertSame(Direction.NORTH, turtle.getDirection());
    }

    @Test
    public void whileFacingNorth_turtleCanTurnRight(){
        whileFacingWest_turtleCanTurnRight();
        turtle.turnRight();

        assertSame(Direction.EAST, turtle.getDirection());
    }

    @Test
    public void whileFacingEast_turtleCanTurnLeft(){
        assertSame(Direction.EAST, turtle.getDirection());

        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.getDirection());
    }

    @Test
    public void whileFacingSouth_turtleCanTurnLeft(){
        whileFacingEast_turtleCanTurnRight();
        turtle.turnLeft();

        assertSame(Direction.EAST, turtle.getDirection());
    }

    @Test
    public void whileFacingWest_turtleCanTurnLeft(){
        whileFacingSouth_turtleCanTurnRight();
        turtle.turnLeft();

        assertSame(Direction.SOUTH, turtle.getDirection());
    }

    @Test
    public void whileFacingNorth_turtleCanTurnLeft(){
        whileFacingWest_turtleCanTurnRight();
        turtle.turnLeft();

        assertSame(Direction.WEST, turtle.getDirection());
    }

    @Test
    public void turtleCanMoveTest(){
        turtle.move(4, draw);

        Position expectedPos = new Position(4, 0);

        assertEquals(expectedPos, turtle.getCurrentPosition());
    }

//    TODOs: Create your `assert` for the two tests.

    @Test
    public void whenPenIsDown_TurtleCanWrite(){
        Sketchpad draw = new Sketchpad(5, 5);
        turtle.penDown();
        turtle.move(4, draw);

        int currentColumn = turtle.getCurrentPosition().getX();
        int currentRow = turtle.getCurrentPosition().getY();

        assertEquals(new Position(4, 0), turtle.getCurrentPosition());

        for (int i = 0; i < draw.getFloor().length; i++) {
            assertEquals(1, draw.getFloor()[currentRow][i]);
        }
//        System.out.println(Arrays.deepToString(draw.getFloor()));
    }

    @Test
    public void whenPenIsDown_AssertAllPossibilities_DrawACircleTest(){
        turtle.penDown();
        turtle.move(4, draw);
        turtle.turnRight();

        turtle.move(4, draw);
        turtle.turnRight();

        turtle.move(4, draw);
        turtle.turnRight();

        turtle.move(4, draw);
        turtle.turnRight();

        System.out.println(Arrays.deepToString(draw.getFloor()));
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }

    @Test
    public void whileTurtleIsOnZero_TurtleCannotMoveNegativelyRow() {
        turtle.turnLeft();
        turtle.move(3, draw);

        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
    }

    @Test
    public void whileTurtleIsOnZero_TurtleCannotMoveNegativelyColumn(){
        
    }
}
