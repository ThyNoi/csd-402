/*
    Eric Sengvanhpheng
    August 21, 2026
    CSD 402 Module 3.2

    Build a program that uses nested loops 
    to create a pyramid shape with incrementing numbers
    up and down

*/

public class Pyramid {
    public static void main(String[] args) {
        
        int rows = 7;
        int width = 3; // Each number takes four spaces
        int rightEdge = 42; // fixed position for @

        for (int row = 1; row <= rows; row++) { // Outer loop
            
            // Print spaces to print numbers to the right
            for (int space = 1; space <= (rows - row) * width; space++){
                System.out.print(" ");
            }
            
            // Numbers going up 
            int num = 1; // create num, put 1 in it
            for (int i = 1; i <= row; i++) {
                System.out.printf("%-" + width + "d", num); // for fixed width
                num = num * 2; // double the number each time
            }
            
            // Numbers going down
            num = num / 4; 
            for (int i = 1; i <= row - 1; i++) {
                System.out.printf("%-" + width + "d", num);
                num = num / 2; 
            }
            
            // Calculate how many spaces to reach the fixed @ position
            int currentLength = (rows -row) * width + (2 * row - 1) * width;
            int spacesNeeded = rightEdge - currentLength;
            
            for (int space = 1; space <= spacesNeeded; space++) {
            System.out.print(" ");
            }
            
            // Print @ at the fixed position
            System.out.println("@");
            
        }
    }
} 
