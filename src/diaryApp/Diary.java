package diaryApp;

import java.util.ArrayList;
import java.util.List;

class Diary {
    private String username;
    private String password;
    private boolean isLocked;
    private List<Entry> entries;

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new ArrayList<>();
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
            System.out.println("Diary unlocked successfully.");
        } else {
            System.out.println("Incorrect password. Unable to unlock diary.");
        }
    }

    public void lockDiary() {
        isLocked = true;
        System.out.println("Diary locked successfully.");
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void createEntry(String title, String body) {
        if (!isLocked) {
            Entry entry = new Entry(title, body);
            entries.add(entry);
            System.out.println("Entry created successfully.");
        } else {
            System.out.println("Diary is locked. Unable to create entry.");
        }
    }

    public void deleteEntry(int id) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                entries.remove(id - 1);
                System.out.println("Entry deleted successfully.");
            } else {
                System.out.println("Invalid entry id. Unable to delete entry.");
            }
        } else {
            System.out.println("Diary is locked. Unable to delete entry.");
        }
    }

    public Entry findEntryById(int id) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                return entries.get(id - 1);
            } else {
                System.out.println("Invalid entry id. Unable to find entry.");
                return null;
            }
        } else {
            System.out.println("Diary is locked. Unable to find entry.");
            return null;
        }
    }

    public void updateEntry(int id, String title, String body) {
        if (!isLocked) {
            if (id >= 1 && id <= entries.size()) {
                Entry entry = entries.get(id - 1);
                entry.setTitle(title);
                entry.setBody(body);
                System.out.println("Entry updated successfully.");
            } else {
                System.out.println("Invalid entry id. Unable to update entry.");
            }
        } else {
            System.out.println("Diary is locked. Unable to update entry.");
        }
    }
}
