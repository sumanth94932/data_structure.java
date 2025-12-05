public class taskATM {
    public static void main(String args[]){
        int[] arr={500,200,100,50,10};
        int money=10560;
        for(int i=0;i<arr.length;i++){
            int count=money/arr[i];
            money=money%arr[i];
            System.out.println(arr[i]+" "+count);
        }

    }
    
}
