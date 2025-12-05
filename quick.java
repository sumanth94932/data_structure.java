public class quick {
    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[l];
        int low = l + 1;
        int high = r;

        while (low <= high) {
            while (low <= high && arr[low] <= pivot) {
                low++;
            }
            while (low <= high && arr[high] > pivot) {
                high--;
            }
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
            }
        }
        arr[l] = arr[high];
        arr[high] = pivot;

        return high;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 0, 6, 1, 7};
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
