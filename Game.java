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
//        initialises the game. gets the number of players, deals the hands, and declares the human/bot players
        int numPlayers = getNumPlayers();
        STGame game = new STGame(numPlayers);

        game.selectDealer();
        System.out.println("");
        System.out.println("Players:");
        game.dealCards();
        game.selectHumPlayer();

//        starting player states category
//        int startingPlayer = (dealerID + 1);
//        players[startingPlayer] = turnActive
//        starting player plays card
//        nextPlayerTurn:
//          1: play card of the same category and state the card
//              if (handCardsCategory != currentCategory || handCard < currentValue)
//                  go to 3
//          2: play supertrump to change categories and state the card
//          3: passes and picks up a card from the deck
//        repeat nextPlayerTurn until (numPlayers - 1) == passTurn
//
//        shows which player in the array is the player controlled by the user
//          STPlayers humanPlayer = game.selectHumPlayer();
//          showPlayer(humanPlayer);
//          beginRounds();


    }

    private static int getNumPlayers() {
        int numPlayers;
        Scanner numPlayerScan = new Scanner(System.in);
        System.out.println("");
        System.out.println("How many players are in this game? ");
        numPlayers = numPlayerScan.nextInt();
        while (numPlayers < 3 || numPlayers > 5) {
            System.out.println("This game can only be played with 3 - 5 players.\nHow many players are in this game?");
            numPlayers = numPlayerScan.nextInt();
        }
//        numPlayers = 3;
        System.out.println("");
        System.out.println("There are " + numPlayers + " players in this game.");
        return numPlayers;
    }

    private static void gameExit() {
//        String[] leaderboard = new String[]{};
//        goodbye message. might have the final results in it too
//        should i make these separate classes?
//        System.out.println(leaderboard);
        System.out.println("Thanks for playing!");
    }
}
