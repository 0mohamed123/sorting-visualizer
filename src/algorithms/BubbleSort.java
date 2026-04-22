package algorithms;

public class BubbleSort {
    
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static String getName() { return "Bubble Sort"; }
    public static String getTimeComplexity() { return "O(n^2)"; }
    public static String getSpaceComplexity() { return "O(1)"; }
}