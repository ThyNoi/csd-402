/*
    Eric Sengvanhpheng
    October 4, 2026
    CSD 402 Module 10

    Program dealing with Abstract Classes and Interfaces.
*/

package csd402_mod10;

public abstract class Division {
    private String name;
    private int accountNumber;

    // constructor accepts both values
    public Division(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    // getter methods
    public String getName() {
        return name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    // abstract method to be defined in subclass
    public abstract void display();
}
