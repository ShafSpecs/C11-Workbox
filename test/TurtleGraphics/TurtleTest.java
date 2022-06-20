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

    @Test
    public void whenPenIsDown_TurtleCanWrite(){
        Sketchpad draw = new Sketchpad(5, 5);
        turtle.penDown();
        turtle.move(5, draw);

        assertEquals(new Position(5, 0), turtle.getCurrentPosition());
        System.out.println(Arrays.deepToString(draw.getFloor()));
    }
}
