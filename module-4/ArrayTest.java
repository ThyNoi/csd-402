/*
    Eric Sengvanhpheng
    August 27, 2026
    CSD 402 Module 4.2

*/

public class ArrayTest {

    public static void main(String[] args) {

        // Create arrays
        short[] shortScores = {10, 20, 30, 40, 50}; 
        int[] intScores = {1, 3, 5, 7};

        // Short array original values
        System.out.print("Original short array ");
        for (short value : shortScores ) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Short array method calling parameter
        short shortAvg = calculateAverage(shortScores);
        System.out.println("Short array average: " + shortAvg);

        // Int array
        System.out.print("Original int array ");
        for (int value : intScores ) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Int array method calling parameter
        int average = calculateAverage(intScores);
        System.out.println("Int array average: " + average);


        
    }
    // Method creation for short array average calculation
    public static short calculateAverage(short[] scores) {
        short sum = 0;
        for (short value : scores) {
            sum += value; // add each score
        }
        return (short) (sum / scores.length);


    }
}

