import java.util.ArrayList;
import java.util.Random;

import static sun.audio.AudioPlayer.player;

/**
 * Created by Luke on 13/09/2016.
 */
public class STGame {
    private static final int NUM_CARDS_TO_DEAL = 8;
    private int numPlayers;
    private int dealerID;
    private STPlayers[] players;
    private STDeck deck;
    int humanPlayerID;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new STDeck();
    }

    public void selectDealer() {
//        random int value to select dealer
        dealerID = new Random().nextInt(3);
    }

    public void dealCards() {
        players = new STPlayers[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            players[i] = new STPlayers("playerID = " + i);
        }

        for (STPlayers player : players) {
            ArrayList<STCard> cards = deck.dealHandCards(NUM_CARDS_TO_DEAL);
            player.setHandCards(cards);
        }
    }

    public void selectHumanPlayer() {
        int humanPlayerID = 0;
    }

    public STPlayers getHumanPlayer() {
        return players[humanPlayerID];
    }
}
