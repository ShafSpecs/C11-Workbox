package list_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    List list;
    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void add() {
        list.add("G-String");
        assertFalse(list.isEmpty());
    }
    @Test
    void addMoreItems(){
        list.add("G-String");
        list.remove("G-String");
        assertTrue(list.isEmpty());
    }
    @Test
    void addItem_sizeIncreases(){
        list.add("G-String");
        assertEquals(1,list.size());
    }
    @Test
    void addAnotherItem_sizeIncreases(){
        list.add("G-String");
        list.add("e-String");
        assertEquals(2,list.size());
    }
    @Test
    void add_remove(){
        list.add("G-String");
        list.add("e-String");
        list.remove("e-String");
        assertEquals(1,list.size());
        assertFalse(list.isEmpty());
    }
    @Test
    void retrieveItem(){
        list.add("G-String");
        assertEquals("G-String", list.get(0));
    }
    @Test
    void addTwo(){
        list.add("G-String");
        list.add("e-String");
        assertEquals("e-String", list.get(1));
    }
    @Test
    void addTwo2(){
        list.add("G-String");
        list.add("e-String");
        assertEquals("G-String", list.get(0));
    }
    @Test void listShift(){
        list.add("G-String");
        list.add("e-String");
        list.add("y- string");
        list.remove("G-String");
        assertEquals("e-String", list.get(0));
    }
    @Test
    void listShift2(){
        list.add("G-String");
        list.add("e-String");
        list.add("y-string");

        list.remove("G-String");
        list.remove("e-String");
        assertEquals("y-string", list.get(0));
    }

    @Test
    public void removeFromMiddleWouldActuallyRemoveAndMoveSiblingTest(){
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("No");

        list.remove("World");
        System.out.println(list.get(3));
        assertEquals("!", list.get(1));
    }

    @Test
    public void canGetCapacity(){
        assertEquals(4, list.capacity());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        assertEquals(8, list.capacity());
    }

    @Test
    public void canCheckIfAnItemExistsTest(){
        list.add("UwU");
        boolean test1 = list.has("UsU");
        boolean test2 = list.has("UwU");

        assertFalse(test1);
        assertTrue(test2);
    }
}
