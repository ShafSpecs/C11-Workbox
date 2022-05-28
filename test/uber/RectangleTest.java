package uber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    public void getLength() {
        Rectangle littleRect = new Rectangle(10.0, 16.0);

        int length = (int) littleRect.getLength();
        assertEquals(16, length);
    }

    @Test
    public void getWidth() {
        Rectangle littleRect = new Rectangle(12.5, 1.0);

        double width = littleRect.getWidth();
        assertEquals(12.5, width);
    }

    @Test
    public void setWidth() {
        Rectangle bigRect = new Rectangle();

        bigRect.setWidth(15);

        assertEquals(15.0, bigRect.getWidth());
    }

    @Test
    public void setLength() {
        Rectangle smallRect = new Rectangle();

        smallRect.setLength(12.65);

        assertEquals(12.65, smallRect.getLength());
    }

    @Test
    public void testDefault() {
        Rectangle rect = new Rectangle();

        assertEquals(1.0, rect.getLength());
        assertEquals(1.0, rect.getWidth());
    }

    @Test
    public void getException() {
        Rectangle bigRect = new Rectangle(10, 17);

        assertThrows(RuntimeException.class, () -> bigRect.setWidth(22.8));
    }
}
