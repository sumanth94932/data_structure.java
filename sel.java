class Sel{
    public static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // last element is already in place
            int min = i;
            for (int j = i + 1; j < n; j++) { // start from i+1
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // swap arr[i] and arr[min]
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = {5, 7, 0, 2, 8, 1, 3};
        System.out.println("Before sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // line break

        selection(arr);

        System.out.println("After sort:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
