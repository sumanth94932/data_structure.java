import java.util.*;
import java.util.Map;
public class exam
{
    public static void main(String args[]){
                int[] arr={2,4,8,5,2,1,0};
                HashSet<Integer> set=new HashSet<>();
                for(int i:arr){
                    set.add(i);
                }
                System.out.println(set.size());
    }
}
