// Eric Sengvanhpheng
// August 13, 2026
// CSD402 Java Module 1.3

// Creat a program that gets input of initial and final water temperatures 
// and calcualtes energy needed to raise it to the final temp in Joules.

// Import the scanner from java.util
import java.util.Scanner;

// Public class matching file name
public class WaterHeat {

    public static void main(String[] args) {
        
        // Creates a Scanner object and assigns its reference to the variable input
        Scanner input = new Scanner(System.in);
        
        // Get the inputs for water mass and water temperatures
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial water temperature in Celsius: ");
        double waterInitialTemp = input.nextDouble();

        System.out.print("Enter the final water temperature in Celsius: ");
        double waterFinalTemp = input.nextDouble();

        // Calculation for getting the energy needed 
        double energyJoules = waterMass * (waterFinalTemp - waterInitialTemp) * 4184;
    
        System.out.println("The energy needed to heat the water from the initial temperature to the final temperature is " + energyJoules + " Joules");

    }
}
