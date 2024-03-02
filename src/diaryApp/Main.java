package diaryApp;


public class Main {
    public static void main(String[] args) {
        Diary myDiary = new Diary("username", "password");
        myDiary.unlockDiary("password");
        myDiary.createEntry("2022-02-22", "Today was a great day!");
        myDiary.createEntry("2022-02-23", "Feeling happy and motivated.");
        myDiary.lockDiary();
        myDiary.createEntry("2022-02-24", "Locked diary. Unable to create entry.");
    }
}