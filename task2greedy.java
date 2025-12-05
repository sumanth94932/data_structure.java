import java.util.*;

public class task2greedy {
    public static void main(String args[]) {
        Scanner sr= new Scanner(System.in);

        int n = sr.nextInt();
        int[] arr = new int[n];

        System.out.println("enter no of items");

        int money = 12;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sr.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
        System.out.println("items can buy");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= money) {
                money -= arr[i];
               
                System.out.println(arr[i]);
            }
        }
    }
}
