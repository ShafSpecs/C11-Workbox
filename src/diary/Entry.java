package diary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {
    private int id;
    private String title;
    private String body;
    private String createdAt;

    private Entry() {}

    public Entry (String body) {
        this.id = (int) Math.random() * 1_000_000;
        this.title = "New Entry - " + id;
        this.body = body;

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = date.format(myFormatObj);
        this.createdAt = formattedDate;
    }

    public Entry(String title, String body) {
        this.id = (int) Math.random() * 1_000_000;
        this.title = title;
        this.body = body;

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = date.format(myFormatObj);
        this.createdAt = formattedDate;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return createdAt;
    }

    public String getEntryBody() {
        return body;
    }

    public String getEntryTitle() {
        return title;
    }

    public void setTitle(String new_title) {
        this.title = new_title;
    }

    public void setBody(String new_body) {
        this.body = new_body;
    }
}
