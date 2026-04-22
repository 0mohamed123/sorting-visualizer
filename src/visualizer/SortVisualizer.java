package visualizer;

import algorithms.*;
import java.util.Arrays;
import java.util.Random;

public class SortVisualizer {

    interface Sorter { void sort(int[] arr); }

    static int[] generateRandom(int size) {
        Random rand = new Random(42);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(10000);
        return arr;
    }

    static int[] generateReversed(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = size - i;
        return arr;
    }

    static int[] generateSorted(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        return arr;
    }

    static long measureTime(Sorter sorter, int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        sorter.sort(copy);
        return (System.nanoTime() - start) / 1000;
    }

    static void printHeader() {
        System.out.println("=".repeat(72));
        System.out.printf("%-18s %12s %12s %12s %12s%n",
            "Algorithm", "n=1000", "n=5000", "n=10000", "n=50000");
        System.out.println("=".repeat(72));
    }

    static void benchmark(String name, Sorter sorter) {
        int[] sizes = {1000, 5000, 10000, 50000};
        System.out.printf("%-18s", name);
        for (int size : sizes) {
            int[] arr = generateRandom(size);
            long time = measureTime(sorter, arr);
            System.out.printf(" %10d us", time);
        }
        System.out.println();
    }

    public static void runBenchmark() {
        System.out.println("\nComplexity Analyzer — Random Arrays");
        printHeader();
        benchmark("Bubble Sort",    arr -> BubbleSort.sort(arr));
        benchmark("Selection Sort", arr -> SelectionSort.sort(arr));
        benchmark("Insertion Sort", arr -> InsertionSort.sort(arr));
        benchmark("Merge Sort",     arr -> MergeSort.sort(arr));
        benchmark("Quick Sort",     arr -> QuickSort.sort(arr));
        benchmark("Heap Sort",      arr -> HeapSort.sort(arr));
        System.out.println("=".repeat(72));

        System.out.println("\nComplexity Analyzer — Worst Case (Reversed Arrays)");
        printHeader();
        benchmark("Bubble Sort",    arr -> BubbleSort.sort(arr));
        benchmark("Selection Sort", arr -> SelectionSort.sort(arr));
        benchmark("Insertion Sort", arr -> InsertionSort.sort(arr));
        benchmark("Merge Sort",     arr -> MergeSort.sort(arr));
        benchmark("Quick Sort",     arr -> QuickSort.sort(arr));
        benchmark("Heap Sort",      arr -> HeapSort.sort(arr));
        System.out.println("=".repeat(72));

        System.out.println("\nComplexity Analyzer — Best Case (Sorted Arrays)");
        printHeader();
        benchmark("Bubble Sort",    arr -> BubbleSort.sort(arr));
        benchmark("Selection Sort", arr -> SelectionSort.sort(arr));
        benchmark("Insertion Sort", arr -> InsertionSort.sort(arr));
        benchmark("Merge Sort",     arr -> MergeSort.sort(arr));
        benchmark("Quick Sort",     arr -> QuickSort.sort(arr));
        benchmark("Heap Sort",      arr -> HeapSort.sort(arr));
        System.out.println("=".repeat(72));
    }
}