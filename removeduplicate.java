import java.util.HashMap;
import java.util.LinkedHashMap;

public class removeduplicate {
    public static void main(String args[]){
        String str="missing a lot";
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char i:str.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char c:map.keySet()){
            System.out.println(c+"="+map.get(c));
        }
    }
    
}
