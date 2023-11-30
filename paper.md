## Sorting Slowly: Comparison Between Quick, Radix, Heap, and Insertion Sorts

### Mehmet Yuzen

## 1. Introduction

This paper aims to comprehensively compare the efficiency and performance of four fundamental sorting algorithms
in Java: Quick Sort, Radix Sort, Heap Sort, and Insertion Sort. The objective is to evaluate their effectiveness
in sorting arrays of integers based on various total order computations.

### 1.1 Quick Sort

Quick Sort is a divide-and-conquer algorithm that selects a pivot element, partitions the array, and recursively sorts
sub-arrays. It exhibits an average time complexity of O(n log n) and demonstrates O(n log n) time complexity in both
best and worst-case scenarios. Its in-place sorting approach and efficient performance make it widely used in practice.

### 1.2 Radix Sort

Radix Sort sorts integers by grouping elements by their digits. It operates with linear time complexity, dependent
on the number of digits in the elements being sorted. Radix Sort is often utilized for sorting fixed-length integers or
strings.

### 1.3 Heap Sort

Heap Sort constructs a heap from the input array and repeatedly extracts the maximum element to form a sorted array.
It exhibits an average time complexity of O(n log n) and maintains consistency in both best-case and worst-case
scenarios.
Heap Sort's in-place nature and stability make it suitable for various applications.

### 1.4 Insertion Sort

Insertion Sort repeatedly inserts elements into a sorted sequence by shifting larger elements to accommodate the
inserted
value. It operates with an average time complexity of O(n^2), with O(n) complexity in the best case scenario and O(n^2)
in the worst case scenario. Insertion Sort is efficient for small arrays or nearly sorted arrays.

## 2. Methodology

The algorithms were implemented in Java. Test results were generated for two specific categories: sorted arrays
(best case scenarios for Quick Sort and Insertion Sort) and randomly shuffled arrays.

Array sizes ranged from 100 to 1,000,000. Each algorithm underwent testing with the same input data, conducting 50
iterations for each array size to ensure consistency and accuracy.

## 3. Results

Recorded results depict the average time taken by each algorithm to sort arrays of different sizes. Graphical
representations illustrate the comparative performance among Quick Sort, Radix Sort, Heap Sort, and Insertion Sort
across varying input sizes.

 <br>

![](graph/figure1.png)
<p> Figure 1: Average time each algorithm took to sort an array of randomly shuffled
values from 0 to n − 1

 <br>

## 4. Conclusions

We conclude, that quick sort is best of the four sorts.

 <br>

![](graph/figure2.png)
<p>Figure 2: The graph shown in Figure 1 for small array sizes.

 <br>

![](graph/figure3.png)
<p>Figure 3: The graph shown in Figure 1 for big array sizes.

