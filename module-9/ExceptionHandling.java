/*
    Eric Sengvanhpheng
    September 27, 2026
    CSD 402 Module 9

    Create an arraylist, Get input and utilize auto boxxing and unboxing.
    Use try/catch to handle exceptions.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Honda");
        list.add("Toyota");
        list.add("Ford");
        list.add("Chevrolet");
        list.add("Nissan");
        list.add("Mazda");
        list.add("Subaru");
        list.add("Tesla");
        list.add("BMW");
        list.add("Kia");

        Scanner sc = new Scanner(System.in);

        int index = 0;

        for (String brand : list) {
            System.out.println(index + ". " + brand);
            index++;
        }

        System.out.println("Enter the index of a brand to see again: ");
        String userInput = sc.nextLine(); // Scanner reads the choice as text
        System.out.println("You have entered index: " + userInput);
        try {
            Integer selectedIndex = Integer.parseInt(userInput);
            // convert the text to a number so it can be used as a list index
            System.out.println("Text converted to a number: " + selectedIndex);
            System.out.println(list.get(selectedIndex));
        }  catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a whole-number index");
        }  catch (IndexOutOfBoundsException e) {
            // this index is a number, but there's no item at that position
            System.out.println("Exception thrown: Out of Bounds");
        }
        sc.close();
    }
}
