
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameCharacter character = new GameCharacter("Hero");

        boolean isGameActive = true;

        System.out.println("Welcome to the adventure, " + character.getName() + "!");

        while (isGameActive) {
            character.displayStatus();
            System.out.println("Select your next move: 1) Train 2) Meditate 3) Engage in Battle 4) Exit the game");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    character.train();
                    break;
                case 2:
                    character.meditate();
                    break;
                case 3:
                    character.fight();
                    break;
                case 4:
                    isGameActive = false;
                    System.out.println("Thank you for playing. " + character.getName() + "!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
