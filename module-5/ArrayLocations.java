/*
    Eric Sengvanhpheng
    September 5, 2026
    CSD 402 Module 5.2

    This program searches two-dimensional int and double
    arrays to find the locations of their largest and smallest
    elements. Each method returns a one-dimensional array.
 */

import java.util.Arrays;

public class ArrayLocations {

    public static void main(String[] args) {

        // Create int and double arrays with values
        int[][] numbers = {
                {2, 4, 6},
                {20, 8, 60, 80}
        };

        double[][] decimalNumbers = {
                {6.66, 4.78, 8.44},
                {77.32, 98.7, 440.23, 88.29,}
        };

        int[] location = locateLargest(numbers);
        System.out.println("--- Largest value in int array ---");
        System.out.println("Row: " + location[0]);     // first slot -> row value
        System.out.println("Column: " + location[1]);  // second slot -> column value
        System.out.println();

        int[] doubleLocation = locateLargest(decimalNumbers);
        System.out.println("--- Largest value in double array ---");
        System.out.println("Row: " + doubleLocation[0]);
        System.out.println("Column: " + doubleLocation[1]);
        System.out.println();

        int[] smallestLocation = locateSmallest(numbers);
        System.out.println("--- Smallest value in int array ---");
        System.out.println("Row: " + smallestLocation[0]);
        System.out.println("Column: " + smallestLocation[1]);
        System.out.println();

        int[] smallestDoubleLocation = locateSmallest(decimalNumbers);
        System.out.println("--- Smallest value in double array ---");
        System.out.println("Row: " + smallestDoubleLocation[0]);
        System.out.println("Column: " + smallestDoubleLocation[1]);

    }

    public static int[] locateLargest(int[][] arrayParam){

        // to start, treat the first array element as
        // largest found so far
        int largestValue = arrayParam[0][0];

        // store the row and column indexes
        // of the largest value found so far
        int largestRow = 0;
        int largestColumn = 0;

        // check every element in each row of the array
        // the inner loop uses the current row's
        // length for it's columns
        for (int row = 0; row < arrayParam.length; row++){
            for (int column = 0; column < arrayParam[row].length; column++){

                // if the current value is larger
                // save its value and location
                if (arrayParam[row][column] > largestValue) {
                    largestValue = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }
        // return a 1d array containing
        // the row and column indexes
        // of the largest value
        return new int[] {largestRow, largestColumn};
    }

    // receives 2d array of decimal values
    // locations are index and int
    public static int[] locateLargest(double[][] arrayParam){
        double largestValue = arrayParam[0][0];
        int largestRow = 0;
        int largestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++){
            for (int column = 0; column < arrayParam[row].length; column++){
                if (arrayParam[row][column] > largestValue){
                    largestValue = arrayParam[row][column];
                    largestRow = row;
                    largestColumn = column;
                }
            }
        }
        return new int[] {largestRow, largestColumn};
    }

    public static int[] locateSmallest(int[][] arrayParam){
        int smallestValue = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++){
            for (int column = 0; column < arrayParam[row].length; column++){
                if (arrayParam[row][column] < smallestValue){
                    smallestValue = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;

                }
            }
        }
        return new int[] {smallestRow, smallestColumn};
    }

    public static int[] locateSmallest(double[][] arrayParam){
        double smallestValue = arrayParam[0][0];
        int smallestRow = 0;
        int smallestColumn = 0;

        for (int row = 0; row < arrayParam.length; row++){
            for (int column = 0; column < arrayParam[row].length; column++){
                if (arrayParam[row][column] < smallestValue) {
                    smallestValue = arrayParam[row][column];
                    smallestRow = row;
                    smallestColumn = column;

                }
            }
        }
        return new int[] {smallestRow, smallestColumn};
    }
}

