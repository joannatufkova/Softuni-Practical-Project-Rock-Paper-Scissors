import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper, [s]cissors: ");
        String playerMove = scanner.nextLine();

        if(playerMove.equals("r") || playerMove.equals("Rock")){
            playerMove = ROCK;
        } else if(playerMove.equals("p") || playerMove.equals("Paper")){
            playerMove = PAPER;
        } else if(playerMove.equals("s") || playerMove.equals("Scissors")){
            playerMove = SCISSORS;
        } else {
            System.out.println("Invalid input. Try again..");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";

        switch (computerRandomNumber){
            case 1:
                computerMove = "Rock"; break;
            case 2:
                computerMove = "Paper"; break;
            case 3:
                computerMove = "Scissors"; break;
        }
        System.out.printf("The computer chose %s.%n", computerMove);

        if((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                        (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))){
            System.out.println("Congratulations! You win!");
        } else if((computerMove.equals(ROCK) && playerMove.equals(SCISSORS)) ||
                (computerMove.equals(PAPER) && playerMove.equals(ROCK)) ||
                (computerMove.equals(SCISSORS) && playerMove.equals(PAPER))){
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }

    }
}