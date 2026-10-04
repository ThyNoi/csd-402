/*
    Eric Sengvanhpheng
    October 4, 2026
    CSD 402 Module 10

    Program dealing with Abstract Classes and Interfaces.
*/

package csd402_mod10;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String name, int accountNumber, String country, String language) {
        super(name, accountNumber); // super must always be the first line
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("Division Name: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
    }
}

