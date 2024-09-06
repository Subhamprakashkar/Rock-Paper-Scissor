import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your choice (rock/paper/scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        String computerChoice = getComputerChoice(random);

        System.out.println("Computer chose: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);

        System.out.println(result);
    }

    private static String getComputerChoice(Random random) {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[random.nextInt(choices.length)];
    }

    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice) {
            case "rock":
                return computerChoice.equals("scissors") ? "Rock crushes scissors! You win!" : "Paper covers rock! You lose!";
            case "paper":
                return computerChoice.equals("rock") ? "Paper covers rock! You win!" : "Scissors cuts paper! You lose!";
            case "scissors":
                return computerChoice.equals("paper") ? "Scissors cuts paper! You win!" : "Rock crushes scissors! You lose!";
            default:
                return "Invalid choice!";
        }
    }
}   

