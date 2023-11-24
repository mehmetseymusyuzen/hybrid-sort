import java.util.Arrays;
import java.util.Random;

public class RadixSortTest {
    public static int[] generateRandomDataArray(
            final int size,
            final int bound
    ) {
        Random random = new Random();
        int[] randomDataArray = new int[size];

        for (int i = 0; i < randomDataArray.length; i++) {
            randomDataArray[i] = random.nextInt(bound);
        }

        return randomDataArray;
    }

    public static void testAlgorithmTime(
            final String testNumber,
            final String algorithmName,
            int size,
            final int bound
    ) {
        final long startTime = System.nanoTime();
        RadixSort.sort(generateRandomDataArray(size, bound));
        long endTime = System.nanoTime();
        double sec = ((double)(endTime - startTime)/1_000_000_000.0);

        System.out.println(testNumber + ". Test : Time taken by " + algorithmName + ": " + sec + " sec, with " + size + " size data.");
    }

    public static void testAlgorithm(
            final String algorithmName,
            final int size,
            final int bound
    ) {


        System.out.println("Sorted Array: " + Arrays.toString(RadixSort.sort(generateRandomDataArray(size, bound))));
    }

    public static void main(String[] args) {

        testAlgorithmTime("1", "Radix Sort", 10000, 10000);//10K
        testAlgorithmTime("2", "Radix Sort", 100000, 100000);//100K
        testAlgorithmTime("3", "Radix Sort", 1000000, 1000000);//1M
    }
}
