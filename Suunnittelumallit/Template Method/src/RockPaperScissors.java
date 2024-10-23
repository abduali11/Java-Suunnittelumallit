import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors extends Game {

    private int[] scores;
    private int roundsToWin = 3;

    @Override
    public void initializeGame(int numberOfPlayers) {
        scores = new int[numberOfPlayers];
        System.out.println("Rock-Paper-Scissors game starts! The first player to win 3 rounds wins the game.");
    }

    @Override
    public boolean endOfGame() {
        for (int score : scores) {
            if (score >= roundsToWin) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Player " + (player + 1) + ", choose (1: Rock, 2: Paper, 3: Scissors): ");
        int playerChoice = scanner.nextInt() - 1;

        int computerChoice = random.nextInt(3);
        System.out.println("Computer chose: " + choices[computerChoice]);

        if (playerChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                (playerChoice == 1 && computerChoice == 0) ||
                (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("Player " + (player + 1) + " wins the round!");
            scores[player]++;
        } else {
            System.out.println("Computer wins the round!");
        }

        System.out.println("Player " + (player + 1) + "'s score: " + scores[player]);
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= roundsToWin) {
                System.out.println("Player " + (i + 1) + " is the winner!");
            }
        }
    }

    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.play(1); // One player against the computer
    }
}
