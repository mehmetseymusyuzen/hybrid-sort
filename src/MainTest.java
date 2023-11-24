public class MainTest {
    public static void main(String[] args) {
        InsertionSortTest.testAlgorithmTime("1", "Insertion Sort", 10000, 10000);//10K
        InsertionSortTest.testAlgorithmTime("2", "Insertion Sort", 100000, 100000);//100K
        InsertionSortTest.testAlgorithmTime("3", "Insertion Sort", 1000000, 1000000);//1M

        System.out.println("-------------------");

        RadixSortTest.testAlgorithmTime("1", "Radix Sort", 10000, 10000);//10K
        RadixSortTest.testAlgorithmTime("2", "Radix Sort", 100000, 100000);//100K
        RadixSortTest.testAlgorithmTime("3", "Radix Sort", 1000000, 1000000);//1M

        System.out.println("-------------------");

        HeapSortTest.testAlgorithmTime("1", "Heap Sort", 10000, 10000);//10K
        HeapSortTest.testAlgorithmTime("2", "Heap Sort", 100000, 100000);//100K
        HeapSortTest.testAlgorithmTime("3", "Heap Sort", 1000000, 1000000);//1M
    }
}
