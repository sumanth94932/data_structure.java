public class mutualrecurtionevenorodd {
    public static void main(String args[]){
        System.out.println(isEven(5));
    }
        public static boolean isEven(int n){
            if(n==0){
                return true;
            }
            return isOdd(n-1);
            
    }
     public static boolean isOdd(int n){
            if(n==0){
                return false;
            }
            return isEven(n-1);
            
    }
    
}
