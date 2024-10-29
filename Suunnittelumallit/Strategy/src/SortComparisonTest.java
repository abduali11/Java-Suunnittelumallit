import java.util.Random;

public class SortComparisonTest {
    public static void main(String[] args) {
        int[] dataSet1 = generateData(1000);
        int[] dataSet2 = generateData(10000);

        SortContext context = new SortContext();

        // Test Bubble Sort
        context.setStrategy(new Bubble_sort());
        testPerformance(context, dataSet1.clone(), "BubbleSort");
        testPerformance(context, dataSet2.clone(), "BubbleSort");

        // Test Insertion Sort
        context.setStrategy(new InsertionSort());
        testPerformance(context, dataSet1.clone(), "InsertionSort");
        testPerformance(context, dataSet2.clone(), "InsertionSort");

        // Test Merge Sort
        context.setStrategy(new MergeSort());
        testPerformance(context, dataSet1.clone(), "MergeSort");
        testPerformance(context, dataSet2.clone(), "MergeSort");
    }

    private static int[] generateData(int size) {
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(size);
        }
        return data;
    }

    private static void testPerformance(SortContext context, int[] data, String algorithmName) {
        long startTime = System.nanoTime();
        context.executeStrategy(data);
        long endTime = System.nanoTime();
        System.out.println(algorithmName + " took " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
