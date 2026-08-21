/*
    Eric Sengvanhpheng
    August 20, 2026
    CSD 402 Module 2.
*/

import java.util.Scanner; // for input

public class RockPaperScissors {
    public static void main(String[] args) {

        int ROCK = 1;
        int PAPER = 2;
        int SCISSORS = 3;
        
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        int computerChoice = (int)(Math.random() *3) + 1;

        System.out.println(userChoice);

        if (userChoice == 1){
            System.out.println("User chooses" + userChoice);
        }

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        }

        else if (userChoice == 1 && computerChoice == 3) {
            System.out.println("You win!");
        }
        else if (userChoice == 2 && computerChoice == 1) {
            System.out.println("You");
        }
        else if (userChoice == 3 && computerChoice == 2) {
            System.out.println("You");
        }
        else {
            System.out.println("You");
        }
    }

}
