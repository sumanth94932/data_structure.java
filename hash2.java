import java.util.*;
import java.util.Map;
public class hash2 
{
    public static void main(String args[]){
        int[] arr1={2,4,8,5,2,1,0};
        int[] arr2={5,6,7,8,3,2};
        int target=9;
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1)
            {
                set.add(i);
            }
            for(int j:arr2)
            {
                if(set.contains(j)){
                    System.out.print(j+", ");
                }
            }
       
        }
}
        

    
    
