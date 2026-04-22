package algorithms;

public class SelectionSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx]) minIdx = j;
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static String getName() { return "Selection Sort"; }
    public static String getTimeComplexity() { return "O(n^2)"; }
    public static String getSpaceComplexity() { return "O(1)"; }
}