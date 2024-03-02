package diaryApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class DiaryTest {

//    private void testUpdateEntryWithInvalidsID() {
//    }
//
//    private void testUnlockDiaryWithIncorrectPassword() {
//    }
//
//    private void testCreateEntryWhenDiaryIsLocked() {
//    }
        @Test
        public void testDiaryClassExist(){
                Diary diary  = new Diary("user", "password");
                assertNotNull(diary);

        }
        @Test
        public void testUnlockDairyWithIncorrectPassword() {
            Diary diary = new Diary("user", "password");
            diary.unlockDiary("incorrect password");
        }

        @Test
        public void testCreateEntryWhenDiaryIsLocated() {
                Diary diary = new Diary("user", "password");
                diary.createEntry("2024-05-30", "Today's is a good day");
        }

        @Test
        public void testCreateEntryWithInvalidDateFormat(){
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                diary.createEntry("22-02-2022", "Invalid date format");
        }
        @Test
        public void testCreateEntryWithEmptyContent() {
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                diary.createEntry("2022-02-23", "");
        }
        @Test
        public void testDeleteEntryWithInvalidID() {
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                diary.deleteEntry(10);
        }
        @Test
        public void testFindEntryByInvalidID() {
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                Entry entry = diary.findEntryById(10);
        System.out.println(entry);
        }

        @Test
        public void testUpdateEntryWithInvalidID() {
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                diary.updateEntry(10, "2022-02-23", "Updated entry");
        }
        @Test
        public void testUpdateEntryWithInvalidDateFormat() {
                Diary diary = new Diary("user", "password");
                diary.unlockDiary("password");
                diary.createEntry("2022-02-23", "Entry to be updated");
                diary.updateEntry(2, "23-02-2022", "Invalid date format");
        }
    }


