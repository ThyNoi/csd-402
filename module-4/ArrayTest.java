/*
    Eric Sengvanhpheng
    August 27, 2026
    CSD 402 Module 4.2

*/

public class TestArrays {

    public static void main(String[] args) {

        // Create arrays
        short[] shortScores = {10, 20, 30, 40, 50};
        int[] intScores = {1, 3, 5, 7};
        long[] longScores = {100L, 200L, 300L,};
        double[] doubleScores = {72.8, 34.3, 54.6, 44.4, 87.3, 90.2, 67.0};


        // Short array original values
        System.out.print("Original short array: ");
        for (short value : shortScores ) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Short array method calling parameter
        short shortAvg = average(shortScores);
        System.out.println("Short array average: " + shortAvg);
        System.out.println();

        // Int array
        System.out.print("Original int array: ");
        for (int value : intScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Int array method calling parameter
        int intAvg = average(intScores);
        System.out.println("Int array average: " + intAvg);
        System.out.println();

        // Long array
        System.out.print("Original long array: ");
        for (long value : longScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Long array method calling parameter
        long longAvg = average(longScores);
        System.out.println("Long array average: " + longAvg);
        System.out.println();

        // Double array
        System.out.print("Original double array: ");
        for (double value : doubleScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Long array method calling parameter
        double doubleAvg = average(doubleScores);
        System.out.println("Double array average: " + doubleAvg);
        System.out.println();

    }
    // Method creation for short array average calculation
    public static short average(short[] scores) {
        short sum = 0;
        for (short value : scores) {
            sum += value; // add each score
        }
        return (short) (sum / scores.length);
    }
    public static int average(int[] scores) {
        int sum = 0;
        for (int value : scores) {
            sum += value; // add each score
        }
        return (int) (sum / scores.length);
    }
    public static long average(long[] scores) {
        long sum = 0;
        for (long value : scores) {
            sum += value; // add each score
        }
        return (long) (sum / scores.length);
    }
    public static double average(double[] scores) {
        double sum = 0;
        for (double value : scores) {
            sum += value; // add each score
        }
        return (double) (sum / scores.length);
    }
}
