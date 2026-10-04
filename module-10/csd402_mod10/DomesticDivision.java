/*
    Eric Sengvanhpheng
    October 4, 2026
    CSD 402 Module 10

    Program dealing with Abstract Classes and Interfaces.
*/

package csd402_mod10;

public class DomesticDivision extends Division {
    public String state;

    // constructor with all fields
    public DomesticDivision(String name, int accountNumber, String state) {
        super(name, accountNumber); // hands name and accountNumber up to Division's constructor
        this.state = state; // sets DomesticDivision's own field
    }
    @Override
    // it is now a concrete method
    public void display() {
        System.out.println("Division Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("State: " + state);
    }
}
