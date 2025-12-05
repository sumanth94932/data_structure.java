public class recurtionpalindrome {

    public static boolean isPalindrome(String s) {
        // Base case: if string length is 0 or 1, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }

        // If first and last characters don't match, not a palindrome
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recurse on the substring without first and last characters
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
    }
}

    

