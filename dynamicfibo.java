import java.util.Scanner;

class dynamicfibo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 0;

        if (n > 0) {
            dp[1] = 1;
        }

        for (int i = 2; i <= n; i++) {  // changed i<n to i<=n
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("fib number at " + n + " = " + dp[n]);
    }
}
