package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries;

    public Diaries() {
        this.diaries = new ArrayList<>();
    }

    public void add(String username, String password) {
        Diary newDiary = new Diary(username, password);
        diaries.add(newDiary);
        System.out.println("Diary added successfully.");
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries) {
//            if (diary.username.equals(username)) {
//                return diary;
//            }
        }
        System.out.println("Diary not found for username: " + username);
        return null;
    }

    public void delete(String username, String password) {
        Diary diaryToDelete = findByUsername(username);
        if (diaryToDelete != null && diaryToDelete.password.equals(password)) {
            diaries.remove(diaryToDelete);
            System.out.println("Diary deleted successfully.");
        } else {
            System.out.println("Unable to delete diary. Username or password is incorrect.");
        }
    }
}
