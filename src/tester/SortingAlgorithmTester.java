package tester;

import dataGenerator.RandomArrayGenerator;
import sortAlgorithm.SortingAlgorithm;

public class SortingAlgorithmTester {

    public SortingAlgorithm sortingAlgorithm;
    public static final int[] RANDOM_INTEGER_ARRAY_1H = RandomArrayGenerator.generateRandomDataArray(100, 100);
    public static final int[] RANDOM_INTEGER_ARRAY_1K = RandomArrayGenerator.generateRandomDataArray(1000, 1000);
    public static final int[] RANDOM_INTEGER_ARRAY_10K = RandomArrayGenerator.generateRandomDataArray(10000, 10000);
    public static final int[] RANDOM_INTEGER_ARRAY_50K = RandomArrayGenerator.generateRandomDataArray(50000, 50000);
    public static final int[] RANDOM_INTEGER_ARRAY_100K = RandomArrayGenerator.generateRandomDataArray(100000, 100000);
    public static final int[] RANDOM_INTEGER_ARRAY_500K = RandomArrayGenerator.generateRandomDataArray(500000, 500000);
    public static final int[] RANDOM_INTEGER_ARRAY_1M = RandomArrayGenerator.generateRandomDataArray(1000000, 1000000);

    public <T extends SortingAlgorithm> SortingAlgorithmTester(
            Class<T> sortingAlgorithmClazz
    ) throws Exception {
        this.sortingAlgorithm = sortingAlgorithmClazz.getDeclaredConstructor().newInstance();
    }


    public void test() throws Exception {
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_1H, 0, RANDOM_INTEGER_ARRAY_1H.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_1K, 0, RANDOM_INTEGER_ARRAY_1K.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_10K, 0, RANDOM_INTEGER_ARRAY_10K.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_50K, 0, RANDOM_INTEGER_ARRAY_50K.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_100K, 0, RANDOM_INTEGER_ARRAY_100K.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_500K, 0, RANDOM_INTEGER_ARRAY_500K.length - 1);
        sortingAlgorithm.testAlgorithm(RANDOM_INTEGER_ARRAY_1M, 0, RANDOM_INTEGER_ARRAY_1M.length - 1);
        System.out.println();
    }

}
