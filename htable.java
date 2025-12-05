import java.util.*;

public class htable {
    public static void main(String args[]) {
        String[] arr = {"ant", "bat", "eat", "ten", "hat", "ate"};

        // Map: sorted word -> list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);  // sorted characters as key

            // Add word to the list of its anagram group
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        // Print groups of anagrams
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
