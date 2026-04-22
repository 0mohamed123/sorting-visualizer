package algorithms;

public class InsertionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static String getName() { return "Insertion Sort"; }
    public static String getTimeComplexity() { return "O(n^2)"; }
    public static String getSpaceComplexity() { return "O(1)"; }
}