import java.util.HashMap;

import java.util.HashMap;

public class web {
    public static void main(String args[]) {
        int[] arr = {2, 4, 8, 5, 2, 1, 0};

        HashMap<Integer, Integer> freq = new HashMap<>();

    
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // Print frequency
        for (int j : freq.keySet()) {
            System.out.println(j + " = " + freq.get(j));
        }
    }
}
 
    

