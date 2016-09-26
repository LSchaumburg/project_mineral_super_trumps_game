import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luke on 13/09/2016.
 */
public class STGame {
    private static final int CARDS_DEALT = 8;
    private int numPlayers;
    private int dealerID;
    private STPlayers[] players;
    private STDeck deck;
    protected int humanPlayerID;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
        dealerID = new Random().nextInt(numPlayers);
        System.out.println("");
        System.out.println("dealerID = " + dealerID);
    }

    public void dealCards() {
        players = new STPlayers[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            players[i] = new STPlayers("PlayerID = " + i);
        }

        for (STPlayers player : players) {
            ArrayList<STCard> cards = deck.dealHandCards(CARDS_DEALT);
            player.setHandCards(cards);

            if (player == players[0]) {
//                System.out.println(player);
                System.out.println("Your Hand: " + cards);
            }
        }
    }

    public STPlayers selectHumPlayer() {
        int humanPlayerID = 0;
        return players[humanPlayerID];
    }
}
