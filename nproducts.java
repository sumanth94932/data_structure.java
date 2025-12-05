import java.util.Scanner;

public class nproducts {

    static int product(int[] arr, int n) {
        if (n == 0) {
            return 1;  // base case
        }
        return arr[n - 1] * product(arr, n - 1);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n]; // create array

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int result = product(arr, n);
        System.out.println("product of numbers is: " + result);
    }
}
