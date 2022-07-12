package list_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {
    /**
     * The Queue local, instance variable.
     */
    private Queue queue;

    @BeforeEach
    public void initializeQueue(){
        queue = new Queue(3);
    }

    @Test
    public void CanAddToQueue(){
        queue.add("A-String");

        assertEquals(1, queue.size());
    }

    @Test
    public void QueueHasAFixedLengthTest(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");
        });
    }

    @Test
    public void QueueCanGetElementAtGivenIndexTest(){
        queue.add("D-String");
        queue.add("G-String");

        assertEquals("G-String", queue.get(1));
    }

    @Test
    public void QueueExecutesAFirstInFirstOutTest(){
        queue.add("A-String");
        queue.add("B-String");
        queue.add("C-String");

        queue.remove();

        assertEquals("B-String", queue.get(0));
        assertEquals(2, queue.size());
    }

    @Test
    public void QueueCanNotRemoveElementInAnEmptyQueueTest(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> queue.remove());
    }
}
