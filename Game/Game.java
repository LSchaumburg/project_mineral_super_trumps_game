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
//        userSelection = 1;

        switch (userSelection) {
            case 1: startNewGame();
                break;
            case 2: gameExit();
                break;
            }
        }

    public static void startNewGame() {

        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);

        game.selectDealer();
        System.out.println("");
        System.out.println("Players:");
        game.dealCards();
        game.selectHumPlayer();

//        STPlayers humanPlayer = game.selectHumPlayer();
//        showPlayer(humanPlayer);
//        beginRounds();


    }

//    private static void showPlayer(STPlayers humanPlayer) {
//        System.out.println("Player One: " + humanPlayer);
//    }

    private static int getNumPlayers() {
        int numPlayers;
        Scanner numPlayerScan = new Scanner(System.in);
        System.out.println("");
        System.out.println("How many players are in this game? ");
        numPlayers = numPlayerScan.nextInt();
//        numPlayers = 3;
        System.out.println("");
        System.out.println("There are " + numPlayers + " players in this game.");
        return numPlayers;
    }

    private static void gameExit() {
        System.out.println("Thanks for playing!");
    }
}

