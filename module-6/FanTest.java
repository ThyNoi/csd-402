/*
    Eric Sengvanhpheng
    October 11, 2026
    CSD 402 Module 6.2

    Program that demonstrates a Fan class using constants,
    private fields, constructors, getters, setters, and toString().
 */

/*
    FanTest calls getter
    getter runs inside Fan
    getter reads the private field
    getter returns the value
    FanTest prints it
*/

class FanTest {
    public static void main(String[] args) {

        // Create new Fan object, will call the
        // no-argument constructor because empty ().
        Fan defaultFan = new Fan();

        // Call getSpeed() on defaultFan to retrieve
        // its private speed field, then print it.
        System.out.println("Default fan speed: " + defaultFan.getSpeed());
        System.out.println("Default fan on: " + defaultFan.isOn());
        System.out.println("Default fan radius: " + defaultFan.getRadius());
        System.out.println("Default fan color: " + defaultFan.getColor());
        System.out.println();

        // Create a new Fan object with custom values.
        // The values are passed to the argument constructor.
        Fan customFan = new Fan(Fan.FAST, true, 10, "black");

        System.out.println("Custom fan speed: " + customFan.getSpeed());
        System.out.println("Custom fan on: " + customFan.isOn());
        System.out.println("Custom fan radius: " + customFan.getRadius());
        System.out.println("Custom fan color: " + customFan.getColor());
        System.out.println();

        // Changes existing object
        customFan.setSpeed(Fan.SLOW);
        System.out.println("Updated speed: " + customFan.getSpeed());

        customFan.setOn(false);
        System.out.println("Updated on state: " + customFan.isOn());

        customFan.setRadius(4.0);
        System.out.println("Updated radius: " + customFan.getRadius());

        customFan.setColor("green");
        System.out.println("Updated color: " + customFan.getColor());
        System.out.println();

        // Printing the object automatically calls its toString() method.
        System.out.println("Default fan: " + defaultFan);
        System.out.println("Custom fan: " + customFan);

    }
}
