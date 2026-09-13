/*
    Eric Sengvanhpheng
    September 13, 2026
    CSD 402 Module 7.2

    Use Fan class to create multiple fan instances,
    store them in a collection,
    and display their values
    without using toString().
 */

import java.util.ArrayList;

public class UseFans {

    // method for displaying Fan object values
    // fan parameter variable name
    public static void displayFan(Fan fan) {

        // use getters to get default fan values
        System.out.println("Fan speed: " + fan.getSpeed());
        System.out.println("Fan on: " + fan.isOn());
        System.out.println("Fan radius: " + fan.getRadius());
        System.out.println("Fan color: " + fan.getColor());
        System.out.println();

    }
    // method takes arraylist and use enhanced loop
    public static void displayFanList(ArrayList<Fan> fans) {
        // loop through each Fan in the list and send current Fan
        // to displayFan so its value can be displayed.
        for  (Fan  fan : fans) {
            displayFan(fan);
        }

    }

    public static void main(String[] args) {

        // use default fan
        Fan defaultFan = new Fan();
        // New arg constructor Fan object, use chosen values
        Fan slowFan = new Fan(Fan.SLOW, false, 8, "blue");
        // New arg constructor Fan object, use chosen values
        Fan fastFan = new Fan(Fan.FAST, true, 14, "orange");

        // creates a new resizable list
        // <Fan> contains a type, allowed to contain Fan objects
        ArrayList<Fan> fans = new ArrayList<>();
        // Fan objects stored in list
        fans.add(defaultFan);
        fans.add(slowFan);
        fans.add(fastFan);

        // call method and pass the object
        displayFanList(fans);

    }
}
