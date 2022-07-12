package list_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void initializeStack(){
        stack = new Stack();
    }

    @Test
    public void StackHasSize(){
        int size = stack.stackSize();

        assertEquals(0, size);
    }

    @Test
    public void StackCanAddValuesToItTest(){
        stack.add("New");

        stack.add("Modern");

        assertEquals(2, stack.stackSize());
    }

    @Test
    public void StackCanBePeeked(){
        stack.add("New");
        stack.add("Bored");
        stack.add("Energy");

        String lastIn = stack.peek();

        assertEquals("Energy", lastIn);
    }

    @Test
    public void StackRemovesLatestElementTest(){
        stack.add("New");
        stack.add("Boy");

        stack.remove();

        assertEquals(1, stack.stackSize());
        assertEquals("New", stack.peek());
    }

    @Test
    public void StackThrowsExceptionWhenEmpty(){
        assertEquals(0, stack.stackSize());
        assertThrows(RuntimeException.class, () -> stack.peek());
    }

    @Test
    public void StackCanPopElementTest(){
        stack.add("New");
        stack.add("Value");
        stack.add("Boy");

        assertEquals("Value", stack.pop());
    }

    @Test
    public void StackCanBeSearchedForElementTest(){
        stack.add("New");
        stack.add("Value");
        stack.add("Play");
        stack.add("Boy");
        stack.add("Play");

        int lastIndex = stack.search("Play");

        assertEquals(4, lastIndex);
        assertEquals(-1, stack.search("Hello"));
    }

    @Test
    public void StackCanReturnElementsBasedOnIndexSearchTest(){
        stack.add("New");
        stack.add("Value");
        stack.add("Play");
        stack.add("Boy");
        stack.add("Play");

        assertEquals("Boy", stack.get(3));
    }
}
