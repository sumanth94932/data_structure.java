import java.util.*;
import java.util.Map;
public class hashmap {
    public static void main(String args[]){
        int[] arr={2,4,8,5,2,1,0};
        int[] arr1={5,6,7,8,3,2};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int temp=target-arr[i];
            if(map.containsKey(temp)){
                System.out.println(arr[i]+"+"+temp);
                return;
            }
            map.put(arr[i],i );
        }
    }
    
}
