import java.lang.reflect.Array;
import java.util.Scanner;
public class task3greedy {
    public static void main(String[] args) {
        int[] start={1,3,6,8,9,5,4};
        int[] end={2,6,8,9,0,3,1};
        int n=start.length;
        int lastEnd=end[0];
        System.out.println("Activity 0 ->("+start[0]+","+end[0]+")");
        for(int i=1;i<n;i++){
            if(start[i]>=lastEnd){
                System.out.println("Activity i ->("+start[i]+","+end[i]+")");
            }
        }
    }

    
}
