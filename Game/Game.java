import java.util.Scanner;

/**
 * Created by Luke on 13/09/2016.
 */
public class Game {
    public static void main(String[] args) {

        showWelcomeMenu();
    }

    private static void showWelcomeMenu() {
        int userSelection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Mineral Super Trumps!" + "\n1. Start New Game" + "\n2. Exit");
        userSelection = scanner.nextInt();

//        use switch apparently
        if (userSelection == 1) {
            startNewGame();
        }
        else {
            System.out.println("Thanks for playing");
        }
    }

    private static void startNewGame() {

        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);

        game.selectDealer();
        game.dealCards();
        game.selectHumanPlayer();
        game.getHumanPlayer();

        STPlayers humanPlayer = game.getHumanPlayer();
        showPlayer(humanPlayer);

    }

    private static void showPlayer(STPlayers humanPlayer) {
        System.out.println("Player One = " + humanPlayer);
    }

    public static int getNumPlayers() {
        int numPlayers;
        Scanner numPlayerScan = new Scanner(System.in);
        System.out.println("How many players are in this game? ");
        numPlayers = numPlayerScan.nextInt();
        return numPlayers;
    }
}

