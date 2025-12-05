import java.util.Arrays;

public class dynamicpro {
    static int[] dp = new int[100]; // Memoization array

    // Fibonacci function with memoization
    static int fib(int n) {
        if (n <= 1) return n; // Base case

        if (dp[n] != -1) return dp[n]; // Return already calculated value

        dp[n] = fib(n - 1) + fib(n - 2); // Store result in dp
        return dp[n];
    }

    public static void main(String[] args) {
        Arrays.fill(dp, -1); // Initialize dp array with -1
        int n = 6;
        System.out.println("Fibonacci number at " + n + " = " + fib(n));
    }
}
