/*
    Eric Sengvanhpheng
    August 21, 2026
    CSD 402 Module 2.2

    Create a Rock, Paper, Scissors game 
    that gets an input and compares it to a random computer
    input and print the results.
*/

// Scanner import for input
import java.util.Scanner; 

public class RockPaperScissors {
    public static void main(String[] args) {
        
        // Scanner input boilerplate
        Scanner input = new Scanner(System.in);
        
        // Game rules
        System.out.println("Choose Rock, Paper, or Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): "); // Using print to keep input on same line
    
        // Get input from user, store as number
        int userChoice = input.nextInt();

        // Computer generates a random number from 1-3
        int computerChoice = (int)(Math.random() *3) + 1;

        // Convert user's numbers to words using IF statements, 
        // need an empty value to start
        String userWord = "";
        if (userChoice == 1) {
            userWord = "Rock";
        }
        else if (userChoice == 2) {
            userWord = "Paper";
        }
        else if (userChoice == 3) {
            userWord = "Scissors";
        }

        // Convert computer choice numbers to words
        String computerWord = "";
        if (computerChoice == 1) {
            computerWord = "Rock";
        }
        else if (computerChoice == 2) {
            computerWord = "Paper";
        }
        else if (computerChoice == 3) {
            computerWord = "Scissors";
        }

        
        // Display the choices as words 
        System.out.println("\n --- Results --- ");
        System.out.println("Computer chose: " + computerWord);        
        System.out.println("You chose: " + userWord);  

        // if, else if, else statements for choices and printing outcomes
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        }

        else if (userChoice == 1 && computerChoice == 3) {
            System.out.println("You win!");
        }
        else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("You win!");
        }
        else if (userChoice == 3 && computerChoice == 2) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lost!");
        }
        input.close();
    }

}
