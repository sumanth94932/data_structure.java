public class insertion {
    public static void insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) { 
            int key = arr[i];         
            int j = i - 1;

        
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; 
        }
    }

    public static void main(String args[]) {
        int arr[] = {5, 3, 4, 5, 6, 7, 2, 1};
        System.out.println("Before sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        insertion(arr);

        System.out.println("\nAfter sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
