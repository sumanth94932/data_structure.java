public class largepalindrome {

    // Function to check if a string is palindrome
    public static boolean pal(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "abbababcabccabcabbcabcabbca";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

                // check palindrome and update longest
                if (pal(sub) && sub.length() > temp.length()) {
                    temp = sub;
                }
            }
        }

        System.out.println("Largest Palindrome: " + temp);
        System.out.println("Length: " + temp.length());
    }
}
