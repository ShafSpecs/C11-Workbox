package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void createDiary() {
        User diaryUser = new User("Shibuzor");

        diaryUser.createNewDiary("Shibuzor's Diary");

        assertEquals(1, diaryUser.getDiaries().size());
    }

    @Test
    public void getUserName() {
        User diaryUser = new User("Shibuzor");

        diaryUser.createNewDiary("Shibuzor's Diary");

        assertEquals("Shibuzor", diaryUser.getUserName());
    }
}
