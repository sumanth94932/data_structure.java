public class backtrackingarray {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};
        printArray(arr, 0);
    }

    public static void printArray(int[] arr, int index) {
        if (index == arr.length) {
            return; // stop when index reaches length
        }
        System.out.println(arr[index] + " ");
        printArray(arr, index + 1);
    }
}
