import sortAlgorithm.*;
import tester.SortingAlgorithmTester;

public class Main {
    public static void main(String[] args) throws Exception {

        SortingAlgorithmTester insertionTester = new SortingAlgorithmTester(InsertionSort.class);
        SortingAlgorithmTester quickSortTester = new SortingAlgorithmTester(QuickSort.class);
        SortingAlgorithmTester radixSortTester = new SortingAlgorithmTester(RadixSort.class);
        SortingAlgorithmTester heapSortTester = new SortingAlgorithmTester(HeapSort.class);
        SortingAlgorithmTester hybridSortTester = new SortingAlgorithmTester(HybridSort.class);

        System.out.println("InsertionSortAlgorithm");
        insertionTester.test();

        System.out.println("RadixSortAlgorithm");
        radixSortTester.test();

        System.out.println("HeapSortAlgorithm");
        heapSortTester.test();

        System.out.println("QuickSortAlgorithm");
        quickSortTester.test();

        System.out.println("HybridSortAlgorithm");
        hybridSortTester.test();

    }
}
