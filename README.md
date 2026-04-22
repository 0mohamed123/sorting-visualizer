# Sorting Algorithms in Java

![Language](https://img.shields.io/badge/Language-Java%2023-orange)
![Tests](https://img.shields.io/badge/Tests-36%20passing-green)
![License](https://img.shields.io/badge/License-MIT-yellow)

Implementation of 6 classic sorting algorithms in Java with complexity analysis.
Verified by 36 automated tests covering random, sorted, reversed, and edge cases.

## Algorithms Implemented

| Algorithm | Time (Best) | Time (Avg) | Time (Worst) | Space |
|-----------|-------------|------------|--------------|-------|
| Bubble Sort | O(n) | O(n^2) | O(n^2) | O(1) |
| Selection Sort | O(n^2) | O(n^2) | O(n^2) | O(1) |
| Insertion Sort | O(n) | O(n^2) | O(n^2) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n^2) | O(log n) |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) |

## Quick Start

    git clone https://github.com/0mohamed123/sorting-visualizer.git
    cd sorting-visualizer

    # Compile and run demo
    cd src
    javac -d . algorithms/*.java Main.java
    java Main

    # Run all tests
    cd ../tests
    javac -cp ../src -d . ../src/algorithms/*.java TestSorting.java
    java -cp . TestSorting

## Demo Output

    === Sorting Algorithms Demo ===

    Bubble Sort:    [11, 12, 22, 25, 34, 64, 90]
    Selection Sort: [11, 12, 22, 25, 34, 64, 90]
    Insertion Sort: [11, 12, 22, 25, 34, 64, 90]
    Merge Sort:     [11, 12, 22, 25, 34, 64, 90]
    Quick Sort:     [11, 12, 22, 25, 34, 64, 90]
    Heap Sort:      [11, 12, 22, 25, 34, 64, 90]

## Test Results

    36 passed | 0 failed

    Each algorithm tested on:
    - Random array
    - Already sorted array
    - Reversed array
    - Single element
    - Array with duplicates
    - Empty array

## Key Design Decisions

- Each algorithm is a standalone class with sort(), getName(), getTimeComplexity()
- Bubble Sort optimized with early termination flag
- Quick Sort uses last element as pivot
- Merge Sort uses auxiliary arrays for merging
- Heap Sort builds max-heap then extracts elements

## Technologies

- Java 23
- No external dependencies
- Lambda expressions for test runner