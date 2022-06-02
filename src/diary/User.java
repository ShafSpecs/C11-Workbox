package diary;

import java.util.ArrayList;
import java.util.Collection;

public class User {
    private String name;
    private ArrayList<Diary> diaries;

    private User() {}

    public User(String name) {
        this.name = name;
        this.diaries = new ArrayList<Diary>();
    }

    public void createNewDiary(String diaryName) {
        Diary newDiary = new Diary(diaryName);
        diaries.add(newDiary);
    }

    public ArrayList<Diary> getDiaries() {
        return diaries;
    }

    public String getUserName() {
        return name;
    }
}
