package palindrome;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
    public class PalindromeTest {

        @Test
        public void testIsPalindrome_EmptyString() {
            String emptyString = "";
            assertTrue(Palindrome.isPalindrome(" "));
        }

        @Test
        public void testIsPalindrome_SingleCharacter() {
            String singleCharacter = "a";
            assertTrue(Palindrome.isPalindrome(singleCharacter));
        }

        @Test
        public void testIsPalindrome_PalindromeWord() {
            String palindromeWord = "radar";
            assertTrue(Palindrome.isPalindrome(palindromeWord));
        }

        @Test
        public void testIsPalindrome_NonPalindromeWord() {
            String nonPalindromeWord = "hello";
            assertFalse(Palindrome.isPalindrome(nonPalindromeWord));
        }

        @Test
        public void testIsPalindrome_PalindromePhrase() {
            String palindromePhrase = "A man, a plan, a canal, Panama";
            assertFalse(Palindrome.isPalindrome(palindromePhrase));
        }

    }

