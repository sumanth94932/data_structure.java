import java.lang.reflect.Array;
import java.util.Arrays;

public class pro3 {
    static int[] memo;

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = (n % 10) + sumDigits(n / 10);
        return memo[n];
    }

    public static void main(String args[]) {
        int n = 12345;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(sumDigits(n));
    }
}
