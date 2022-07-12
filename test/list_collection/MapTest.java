package list_collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MapTest {
    private Map map;
    @BeforeEach
    public void initializeMap(){
        map = new Map();
    }

    @Test
    public void MapCanCreateKeyValueSetTest(){
        map.create("key", "value");

        String val = map.get("key");

        assertEquals("value", val);
    }

    @Test
    public void MapCanDeleteItemsTest(){
        map.create("key", "value");

        map.delete("key");

        assertNull(map.get("key"));
    }

    @Test
    public void MapCanUpdateValueOfAKeyTest(){
        map.create("key", "value");
        map.update("key", "value2");

        assertEquals(map.get("key"), "value2");
    }

    @Test
    public void MapHasUniqueKeys(){
        map.create("key", "value");
        map.create("key", "value2");

        assertEquals(map.get("key"), "value");
    }
}
