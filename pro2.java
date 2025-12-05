public class pro2 {
    public static void maxcount(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        int max=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
                max=Math.max(max,dp[i]);
            }
        }
    }
    
}
