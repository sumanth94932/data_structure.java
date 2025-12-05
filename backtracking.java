public class backtracking {

    public static void singleSubset(String str, int index, String ans) {
        if (index == str.length()) {   
            System.out.println(ans);
            return;
        }
        singleSubset(str, index + 1, ans + str.charAt(index));
        singleSubset(str, index + 1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        singleSubset(str, 0, "");   
    }
}
