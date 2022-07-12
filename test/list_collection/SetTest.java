package list_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetTest {
    private Set newSet;

    @BeforeEach
    public void initializeSet(){
        newSet = new Set();
    }

    @Test
    public void SetCanAddElementsTest(){
        newSet.add("Chibuzo");

        assertEquals(newSet.size(), 1);
        assertTrue(newSet.has("Chibuzo"));
    }

    @Test
    public void SetCanRemoveElementTest(){
        newSet.add("A-String");
        newSet.add("B-String");

        newSet.remove("A-String");

        assertEquals(newSet.size(), 1);
        assertTrue(newSet.has("B-String"));
    }

    @Test
    public void SetCannotHaveDuplicateElementTest(){
        newSet.add("A-String");
        newSet.add("A-String");

        assertEquals(newSet.size(), 1);
    }

//    @Test
//    public void SetCanReturnAllItsValues(){
//        newSet.add("Play");
//        newSet.add("Joke");
//
//        System.out.println(newSet.getAll());
//    }
}
