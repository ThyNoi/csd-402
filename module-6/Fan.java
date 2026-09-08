/*
    Eric Sengvanhpheng
    September 8, 2026
    CSD 402 Module 6.2

    Program that demonstrates a Fan class using constants,
    private fields, constructors, getters, setters, and toString().
 */

public class Fan {

    // Constants with final so values cant be changed.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Define what every Fan object stores.
    // Private fields can only be accessed directly in Fan class.
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No argument constructor, sets up every new object with these values.
    // Goes inside Fan class.
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";

    }
    // Argument constructor, lets you create a fan with custom
    // starting values instead of defaults.
    // this used to assign to the object currently being created.
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    // Getter methods, need to return values.
    public int getSpeed() {
        return speed;
    }
    // Word (is) commonly used for boolean getters.
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    // Setter methods take values from outside the class
    // and store them in this object's private fields.
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Override Object's toString() so printing
    // a Fan displays its current state
    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

} // Fan class ends here

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
