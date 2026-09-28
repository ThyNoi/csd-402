/*
    Eric Sengvanhpheng
    September 27, 2026
    CSD 402 Module 9

    Create a program that opens/reads a data file, appends to the file
    and prints the file contents.
 */

// imports to allow use for all the Java classes needed
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class DataFileProgram {
    public static void main(String[] args) {
        try {
            // open data.file in append mode, create it if it doesn't exist
            FileWriter writer = new FileWriter("data.file", true);
            Random rand = new Random();
            // generate and append 10 random integers from 0 to 99
            for (int i = 0; i < 10; i++) {
                // generate a number from 0 to 99 and write it followed by a space
                writer.write(rand.nextInt(100) + " ");
            }
            writer.close();
            // create a Scanner connected to data.file so we can read its contents
            Scanner scan = new Scanner(new File("data.file"));
            while (scan.hasNextInt()) {
                System.out.println(scan.nextInt());
            }
            scan.close();
        } catch (IOException e) {
            System.out.println("There was a problem working with the file.");
        }
    }
}
