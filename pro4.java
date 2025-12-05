import java.util.*;
public class pro4 {
    static int[] memo;
    public static int sumDigit(int n){
        if(n==0 || n==1 ){
            return 1;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=n*sumDigit(n-1);
        return memo[n];
    }
    public static void main(String args[]){
        int n=5;
        memo =new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println("factorial = "+sumDigit(n));
    }

}