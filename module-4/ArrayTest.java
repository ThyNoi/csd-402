public class ArrayTest {

    public static void main(String[] args) {

        short[] scores = {10, 20, 30, 40, 50}; // short array
        int[] intScores = {1, 3, 5, 7}; // int array

        short average = calculateAverage(scores);
        System.out.println("Average: " + average);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Array element " + scores[i]);
        }
    }

    public static short calculateAverage(short[] shortScores) {
        short sum = 0;
        for (short value : shortScores) {
            sum += value; // add each score
        }
        return (short) (sum / shortScores.length);
    }
}

