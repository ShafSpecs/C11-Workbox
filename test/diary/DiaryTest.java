package diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test
    public void getDiaryName() {
        Diary newDiary = new Diary("My Diary");

        String diaryName = newDiary.getName();

        assertEquals("My Diary", diaryName);
    }

    @Test
    public void setDiaryName() {
        Diary newDiary = new Diary("My Diary");

        newDiary.setName("Edited Diary");

        assertEquals("Edited Diary", newDiary.getName());
    }

    @Test
    public void addEntryTest() {
        Diary newDiary = new Diary("New Diary");
        Entry newEntry = new Entry("Title", "Entry Body");

        newDiary.addEntry(newEntry);
        int entrySize = newDiary.getEntrySize();

        assertEquals(1, entrySize);
    }

    @Test
    public void getEntryTest() {
        Diary newDiary = new Diary("New Diary");
        Entry newEntry = new Entry("Title", "Entry Body");

        newDiary.addEntry(newEntry);
        Entry gottenEntry = newDiary.getEntry(newEntry.getId());

        assertEquals("Title", gottenEntry.getEntryTitle());
    }

    @Test
    public void setEntryBodyTest() {
        Diary newDiary = new Diary("New Diary");
        Entry newEntry = new Entry("Title", "Entry Body");

        newDiary.addEntry(newEntry);
        Entry gottenEntry = newDiary.getEntry(newEntry.getId());

        gottenEntry.setBody("Edited Body");
        assertEquals("Edited Body", gottenEntry.getEntryBody());
    }

    @Test
    public void deleteEntry() {
        Diary newDiary = new Diary("New Diary");
        Entry newEntry = new Entry("Title", "Entry Body");

        newDiary.addEntry(newEntry);

        newDiary.deleteEntry(newEntry);

        assertEquals(0, newDiary.getEntrySize());
    }
}
