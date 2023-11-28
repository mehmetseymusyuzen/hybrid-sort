package sortAlgorithm;

public interface SortingAlgorithm {
    int[] sortArr(
            final int[] arrayToBeSort,
            final int... varargs
    );

    default void testAlgorithm(
            final int[] arrayToBeSort,
            final int... varargs
    ) {
        final long startTime = System.nanoTime();
        sortArr(arrayToBeSort, varargs);
        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1_000_000_000.0);

        System.out.println("Time taken by : " + sec + " sec, with " + arrayToBeSort.length + " size data.");
    }
}
