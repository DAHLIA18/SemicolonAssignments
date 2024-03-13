package diaryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password) {
        Diary diary = new Diary( username, password);
        diaries.add(diary);
    }

    public Diary findDiaryByUser(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username))  {
                return diary;
            }
        }
        return null;
    }

    public void removeDiary(String username, String password) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                diaries.remove(diary);
                break;
            }
        }
    }
}
