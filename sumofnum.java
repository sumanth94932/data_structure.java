import java.util.*;
public class sumofnum {
    public static void main(String args[]){
        int[] arr={10,3,70,5};
        int target=8;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("sum of 2 nums is target  ->"+(arr[i]+","+arr[j])+":"+(arr[i]+arr[j]));
                }
            }
        }
    }
    
}
