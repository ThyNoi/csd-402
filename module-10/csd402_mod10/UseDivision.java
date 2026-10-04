/*
    Eric Sengvanhpheng
    October 4, 2026
    CSD 402 Module 10

    Program dealing with Abstract Classes and Interfaces.
*/

package csd402_mod10;

// has main method, driver class
public class UseDivision {
    public static void main(String[] args) {
        // create DomesticDivision objects
        DomesticDivision dom1 = new DomesticDivision(
                "Idaho Logistics Hub",
                1001,
                "Idaho");
        DomesticDivision dom2 = new DomesticDivision(
                "East Coast Tech Ops",
                1002,
                "New York");

        // InternationalDivision objects
        InternationalDivision intl1 = new InternationalDivision(
                "Tokyo Tech HQ",
                2001,
                "Japan",
                "Japanese");
        InternationalDivision intl2 = new InternationalDivision(
                "European Sorting Center",
                2002,
                "Germany",
                "German"
        );

        // display DomesticDivisions
        System.out.println("--- Domestic Divisions ---");
        dom1.display();
        System.out.println();
        dom2.display();

        System.out.println();
        System.out.println("--- International Divisions ---");
        intl1.display();
        System.out.println();
        intl2.display();
    }
}
