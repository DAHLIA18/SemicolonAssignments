package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary( "user", "1234");
    }

    @Test
    public void testDiaryClassExist(){
//        Diary diary  = new Diary("user", "password");
        assertNotNull(diary);

    }

    @Test
    public void testUnlockDairyWithIncorrectPassword() {
        Diary diary = new Diary("user", "1234");
        diary.unlockDiary("1234");
        assertEquals(true, diary.isLocked());
    }

    @Test
    public void testDiaryCanBeLocked() {
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testCreateEntryWhenDiaryIsUnlocked() {
        diary.unlockDiary("1234");
        diary.createEntry(1,"title", "Today's is a good day");
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testCreateEntryWithEmptyContent() {
        diary.unlockDiary("1234");
        diary.createEntry(1, "title", " ");
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testDeleteEntryWithInvalidID() {
        diary.unlockDiary("1234");
        diary.createEntry(1, "title", "My diary");
        diary.deleteEntry(10);
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testDeleteEntryWithValidID() {
        diary.unlockDiary("1234");
        diary.createEntry(1, "title", "My diary");
        diary.createEntry(2, "title2", "My diary post");
        diary.deleteEntry(1);
        assertEquals(1, diary.getEntries().size());
    }

    @Test
    public void testFindEntryByID() {
        diary.unlockDiary("1234");
        diary.createEntry(1, "title", "My diary");

        assertEquals(1, diary.findEntryById(1).getId());
    }

    @Test
    public void testUpdateEntryWithInvalidID() {
        diary.unlockDiary("1234");
        diary.createEntry(1, "title", "My diary");
        diary.createEntry(2, "title2", "My dairy 2");
        diary.updateEntry(2, "titleNew", "Updated entry");
        assertEquals("titleNew", diary.findEntryById(2).getTitle());
    }

}