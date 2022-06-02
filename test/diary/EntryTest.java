package diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryTest {
    @Test
    public void CreateEntryBody() {
        Entry newEntry = new Entry("A new Entry");

        assertEquals("A new Entry", newEntry.getEntryBody());
    }

    @Test
    public void CreateEntryTitle() {
        Entry newEntry = new Entry("Small Title", "A new Entry");

        assertEquals("Small Title", newEntry.getEntryTitle());
    }

    @Test
    public void setTitle() {
        Entry newEntry = new Entry("Entry Title", "Entry Body");

        newEntry.setTitle("New Title");

        assertEquals("New Title", newEntry.getEntryTitle());
    }

    @Test
    public void setBody() {
        Entry newEntry = new Entry("Entry Body");

        newEntry.setBody("New Body");

        assertEquals("New Body", newEntry.getEntryBody());
    }
}
