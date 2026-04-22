# Sorting Algorithms + Complexity Analyzer in Java

![Language](https://img.shields.io/badge/Language-Java%2023-orange)
![Tests](https://img.shields.io/badge/Tests-36%20passing-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

Implementation of 6 classic sorting algorithms in Java with a Complexity Analyzer
that measures real execution time across different input sizes and cases.

## Algorithms Implemented

| Algorithm | Best | Average | Worst | Space |
|-----------|------|---------|-------|-------|
| Bubble Sort | O(n) | O(n^2) | O(n^2) | O(1) |
| Selection Sort | O(n^2) | O(n^2) | O(n^2) | O(1) |
| Insertion Sort | O(n) | O(n^2) | O(n^2) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n^2) | O(log n) |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) |

## Quick Start

    git clone https://github.com/0mohamed123/sorting-visualizer.git
    cd sorting-visualizer/src
    javac -d . algorithms/*.java visualizer/SortVisualizer.java Main.java
    java Main

    # Run tests
    cd ../tests
    javac -cp ../src -d . ../src/algorithms/*.java TestSorting.java
    java -cp . TestSorting

## Benchmark Results (Random Arrays)

    Algorithm        n=1000      n=5000     n=10000     n=50000
    Bubble Sort      3094 us     11391 us    84696 us   2754696 us
    Selection Sort   1368 us      7322 us    17171 us    408191 us
    Insertion Sort   1654 us      6652 us    13485 us    101590 us
    Merge Sort        484 us       655 us     1355 us      7829 us
    Quick Sort        240 us       406 us      681 us      5974 us
    Heap Sort         621 us       866 us     1444 us      7267 us

    Key insight: Quick Sort is 461x faster than Bubble Sort at n=50000

## Test Results

    36 passed | 0 failed

    Each algorithm tested on:
    - Random array
    - Already sorted array
    - Reversed array
    - Single element
    - Array with duplicates
    - Empty array

## Project Structure

    sorting-visualizer/
    ├── src/
    │   ├── algorithms/        # 6 sorting algorithms
    │   ├── visualizer/        # Complexity Analyzer
    │   └── Main.java
    └── tests/
        └── TestSorting.java   # 36 automated tests

## Technologies

- Java 23
- No external dependencies
- Lambda expressions
- System.nanoTime() for precise benchmarking
