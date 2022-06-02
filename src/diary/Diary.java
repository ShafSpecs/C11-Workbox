package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Diary {
    private String name;
    private String date;
    private ArrayList<Entry> entries;

    private Diary() {}

    public Diary(String name) {
        this.name = name;

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = date.format(myFormatObj);
        this.date = formattedDate;

        this.entries = new ArrayList<Entry>();
    }

    public String getName() {
        return name;
    }

    public void setName(String edited_diary) {
        this.name = edited_diary;
    }

    public void addEntry(Entry newEntry) {
        entries.add(newEntry);
    }

    public int getEntrySize() {
        return entries.size();
    }

    public Entry getEntry(int id) {
        for (int i = 0; i < entries.size(); i++) {
            Entry entry = entries.get(i);

            if(entry.getId() == id) {
                return entry;
            }
        }

        return null;
    }

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public void deleteEntry(Entry newEntry) {
        entries.remove(newEntry);
    }
}
