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
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
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
        return this.speed;
    }
    // Word (is) commonly used for boolean getters.
    public boolean isOn() {
        return this.on;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
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
        if (this.on) {
            return "Fan is ON [Speed: " + this.speed + ", Radius: " + this.radius + ", Color: " + this.color + "]";
        } else {
            return "Fan is OFF [Radius: " + this.radius + ", Color: " + this.color + "]";
        }
    }

} // Fan class ends here
