/*
    Eric Sengvanhpheng
    September 20, 2026
    CSD 402 Module 8

    Create an arraylist, get user input and check for 0
    loop through list and return highest value
 */

import java.util.ArrayList;
import java.util.Scanner; // import scanner class for input

public class EricArrayListTest {

    public static void main(String[] args) {

        // initialize an ArrayList to store user input Integers
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in); // create scanner object
        System.out.println("Enter a number for the arraylist (0 to stop): ");

       // read integers from user input into the list until 0 is entered
        while (true) {
            int userNumber = sc.nextInt();
            list.add(userNumber);
            if (userNumber == 0) {
                break;
            }
        }
        // when max(list) called, highest number is returned
        Integer largest = max(list);
        System.out.println("The highest value from arraylist is " + largest);
        System.out.println();

        // additional test for an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Empty list result: " + max(emptyList));

        // close scanner
        sc.close();

    }

    // method for ArrayList, will return one single whole number.
    // Integer return type with a parameter that only accepts
    // arraylist with Integers
    // isEmpty returns true if list has no elements
    public static Integer max(ArrayList<Integer> list) {
        // high integer value check in arraylist
        // returns the element at specified index

        if (list.isEmpty()) {
            System.out.println("The list is empty");
            return 0;
        }
        Integer highest = list.get(0); // starting stored value
        for (Integer num : list) {
            if (num > highest) {
                highest = num; // update highest
            }
        }
        return highest; // hand back the highest value
    }
}

