/*
    Eric Sengvanhpheng
    August 28, 2026
    CSD 402 Module 4.2

    Build a program that creates different array types
    with overloaded methods and print the original
    values along with average values.

*/

public class ArrayTest {

    public static void main(String[] args) {

        // Create arrays of different sizes
        short[] shortScores = {10, 20, 30, 40, 50};                             // 5 elements
        int[] intScores = {1, 3, 5, 7, 9, 11};                                  // 6 elements
        long[] longScores = {100L, 200L, 300L, 400L};                           // 4 elements
        double[] doubleScores = {72.8, 34.3, 54.6, 44.4, 87.3, 90.2, 67.0};     // 7 elements

        // Short Array
        System.out.println("---- Short array (length: " + shortScores.length + "): ----");
        System.out.print("Original values: ");
        for (short value : shortScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(shortScores));
        System.out.println();

        // Int array
        System.out.println("--- Int array (length: " + intScores.length + "): ---");
        System.out.print("Original values: ");
        for (int value : intScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(intScores));
        System.out.println();

        // Long array
        System.out.println("--- Long array (length: " + longScores.length + "): ---");
        System.out.print("Original values: ");
        for (long value : longScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(longScores));
        System.out.println();

        // Double array
        System.out.println("--- Double array (length: " + doubleScores.length + "): ---");
        System.out.print("Original values: ");
        for (double value : doubleScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println("Average: " + average(doubleScores));
        System.out.println();
    }

    // Overloaded average methods
    public static short average(short[] scores) {
        int sum = 0; // Int prevents overflow, short might not hold large sums
        for (short value : scores) {
            sum += value; // Add each score
        }
        return (short) (sum / scores.length); // Cast needed: int -> short
    }
    public static int average(int[] scores) {
        int sum = 0;
        for (int value : scores) {
            sum += value;
        }
        return (sum / scores.length);
    }
    public static long average(long[] scores) {
        long sum = 0;
        for (long value : scores) {
            sum += value;
        }
        return (sum / scores.length);
    }
    public static double average(double[] scores) {
        double sum = 0;
        for (double value : scores) {
            sum += value;
        }
        return (sum / scores.length);
    }
}
