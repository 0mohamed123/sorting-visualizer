import algorithms.*;
import java.util.Arrays;

public class Main {

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static int[] sample() {
        return new int[]{64, 34, 25, 12, 22, 11, 90};
    }

    public static void main(String[] args) {
        System.out.println("=== Sorting Algorithms Demo ===\n");

        int[] arr;

        arr = sample();
        System.out.print("Bubble Sort:    ");
        BubbleSort.sort(arr); printArray(arr);

        arr = sample();
        System.out.print("Selection Sort: ");
        SelectionSort.sort(arr); printArray(arr);

        arr = sample();
        System.out.print("Insertion Sort: ");
        InsertionSort.sort(arr); printArray(arr);

        arr = sample();
        System.out.print("Merge Sort:     ");
        MergeSort.sort(arr); printArray(arr);

        arr = sample();
        System.out.print("Quick Sort:     ");
        QuickSort.sort(arr); printArray(arr);

        arr = sample();
        System.out.print("Heap Sort:      ");
        HeapSort.sort(arr); printArray(arr);
    }
}