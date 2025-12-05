public class bubble {
    public static void  bubbleSort(int[]arr)  {
        int  n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            for(Object K:arr){
                System.out.print(K+" ");
            }
        }

    }
    public static void main(String args[]){
        int[] arr={3,5,6,7,9,2,0,1,7};
        System.out.println("befor sort");
        bubbleSort(arr);
        for(int j:arr){
            System.out.print(j+" ");
        }
        bubbleSort(arr);
        System.out.println("after sorting");
        for( int i:arr){
            System.out.print(i+" ");
        }
    }
}
