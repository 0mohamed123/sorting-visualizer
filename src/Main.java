import algorithms.*;
import visualizer.SortVisualizer;
import java.util.Arrays;

public class Main {

    static int[] sample() {
        return new int[]{64, 34, 25, 12, 22, 11, 90};
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("=== Sorting Algorithms Demo ===\n");

        int[] arr;
        arr = sample(); BubbleSort.sort(arr);
        System.out.print("Bubble Sort:    "); printArray(arr);

        arr = sample(); SelectionSort.sort(arr);
        System.out.print("Selection Sort: "); printArray(arr);

        arr = sample(); InsertionSort.sort(arr);
        System.out.print("Insertion Sort: "); printArray(arr);

        arr = sample(); MergeSort.sort(arr);
        System.out.print("Merge Sort:     "); printArray(arr);

        arr = sample(); QuickSort.sort(arr);
        System.out.print("Quick Sort:     "); printArray(arr);

        arr = sample(); HeapSort.sort(arr);
        System.out.print("Heap Sort:      "); printArray(arr);

        SortVisualizer.runBenchmark();
    }
}