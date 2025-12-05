public class search
 {
    public static void main(String args[])
    {
        int[] arr={12,3,4,9,5,6,8};
         int target=9;
         System.out.println(value(arr,target));
    }
    
    public static boolean value(int[] arr,int target)
    {                                                                                                                                                                     
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
            
        }
        
            return false                                                                    ;

    }
    
}

