
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

        else if (userChoice == ROCK && computerChoice == SCISSORS) {
            System.out.println("You win!");
        }
    }

}


