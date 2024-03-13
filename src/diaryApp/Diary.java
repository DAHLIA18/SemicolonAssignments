package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {

        private String username;
        private String password;
        private boolean isLocked;
        private List<Entry> entries = new ArrayList<>();

        public Diary(String user, String pass) {
                this.username = user;
                this.password = pass;
//        this.isLocked = false;
        }

        public void unlockDiary(String pass) {
                if (password.equals(pass)) {
                        isLocked = true;
                        System.out.println("Diary unlocked successfully.");
                } else {
                        System.out.println("Incorrect password. Unable to unlock diary.");
                }
                isLocked = false;
        }

        public void lockDiary() {
                isLocked = true;
                System.out.println("Diary locked successfully.");
        }

        public boolean isLocked() {
                return isLocked;
        }

        public void createEntry(int id, String title, String body) {
                if (!isLocked) {
                        Entry entry = new Entry(1, title, body);
                        entries.add(entry);
                        System.out.println("Entry created successfully.");
                } else {
                        System.out.println("Diary is locked. Cannot create entry.");
                }
        }

        public void deleteEntry(int id) {
                if (!isLocked) {
                        Entry foundEntry = findEntryById(id);
                        for (Entry entry : entries) {
                                if (entry.getId() == id) {
                                        entries.remove(entry);
                                        System.out.println("Entry deleted successfully.");
                                }else {
                                        System.out.println("Cannot delete entry.");
                                }
                        }
                }
        }

        public Entry findEntryById(int entryId) {
                if (!isLocked) {
                        for (Entry entry : entries) {
                                if (entry.getId() == entryId) {
                                        return entry;
                                }
                        }
                } else {
                        System.out.println("Cannot find entry.");
                }
                return entries.get(entryId);
        }

        public void updateEntry(int entryId, String newTitle, String newBody) {
                if (!isLocked) {
                        Entry entry = findEntryById(entryId);
                        if (entry != null) {
                                entry.setTitle(newTitle);
                                entry.setBody(newBody);
                                System.out.println("Entry updated successfully.");
                        } else {
                                System.out.println("Entry not found.");
                        }
                } else {
                        System.out.println("Diary is locked. Cannot update entry.");
                }
        }

        public List<Entry> getEntries() {
                return entries;
        }

        public String getUsername() {
                return username;
        }

        public void printHomeScreen() {
                System.out.println("Welcome to your diary, " + username + "!");

        }
}