package palindrome;

public class Palindrome {
        public static boolean isPalindrome(String string) {
            if (string == null || string.isEmpty()) {
                throw new IllegalArgumentException("String is null or empty");
            }

            String str = string.toLowerCase();
            int left = 0;
            int right = string.length() - 1;

            while (left < right) {
                if (string.charAt(left) != string.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        public static void main(String[] args) {

            String palindrome1 = "level";
            String palindrome2 = "Racer";
            String notPalindrome = "hello";


            System.out.println(palindrome1 + " is palindrome? " + isPalindrome(palindrome1));
            System.out.println(palindrome2 + " is palindrome? " + isPalindrome(palindrome2));
            System.out.println(notPalindrome + " is palindrome? " + isPalindrome(notPalindrome));
        }
    }


