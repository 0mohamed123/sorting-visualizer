import algorithms.*;
import java.util.Arrays;

public class TestSorting {

    static int passed = 0;
    static int failed = 0;

    static void test(boolean condition, String name) {
        if (condition) {
            System.out.println("  [PASS] " + name);
            passed++;
        } else {
            System.out.println("  [FAIL] " + name);
            failed++;
        }
    }

    static int[] sorted   = {1, 2, 3, 4, 5, 6, 7};
    static int[] reversed = {7, 6, 5, 4, 3, 2, 1};
    static int[] random   = {64, 34, 25, 12, 22, 11, 90};
    static int[] single   = {42};
    static int[] duplicates = {3, 1, 4, 1, 5, 9, 2, 6, 5};
    static int[] expected_dup = {1, 1, 2, 3, 4, 5, 5, 6, 9};

    static int[] copy(int[] arr) { return Arrays.copyOf(arr, arr.length); }

    static void testAlgorithm(String name, Sorter sorter) {
        System.out.println("\n[" + name + "]");

        int[] arr;

        arr = copy(random);
        sorter.sort(arr);
        test(Arrays.equals(arr, new int[]{11, 12, 22, 25, 34, 64, 90}), "sort random array");

        arr = copy(sorted);
        sorter.sort(arr);
        test(Arrays.equals(arr, sorted), "sort already sorted");

        arr = copy(reversed);
        sorter.sort(arr);
        test(Arrays.equals(arr, sorted), "sort reversed array");

        arr = copy(single);
        sorter.sort(arr);
        test(arr[0] == 42, "sort single element");

        arr = copy(duplicates);
        sorter.sort(arr);
        test(Arrays.equals(arr, expected_dup), "sort with duplicates");

        arr = new int[]{};
        sorter.sort(arr);
        test(arr.length == 0, "sort empty array");
    }

    interface Sorter { void sort(int[] arr); }

    public static void main(String[] args) {
        System.out.println("Running all sorting tests...");

        testAlgorithm("BubbleSort",    arr -> BubbleSort.sort(arr));
        testAlgorithm("SelectionSort", arr -> SelectionSort.sort(arr));
        testAlgorithm("InsertionSort", arr -> InsertionSort.sort(arr));
        testAlgorithm("MergeSort",     arr -> MergeSort.sort(arr));
        testAlgorithm("QuickSort",     arr -> QuickSort.sort(arr));
        testAlgorithm("HeapSort",      arr -> HeapSort.sort(arr));

        System.out.println("\n==============================");
        System.out.println("  " + passed + " passed | " + failed + " failed");
        System.out.println("==============================");
    }
}