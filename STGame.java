import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luke on 13/09/2016.
 */
public class STGame {
    private static final int CARDS_DEALT = 8;
    private int numPlayers;
    private int dealerID;
    private STPlayer[] players;
    private STDeck deck;
    protected int humanPlayerID;
    private String currentCategory;

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
        players = new STPlayer[numPlayers];
        for (int i = 0; i < numPlayers; i++){
            players[i] = new STPlayer("Player" + i);
        }

        for (STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealHandCards(CARDS_DEALT);
            player.setHandCards(cards);
            System.out.println(player.toString());

            if (player == players[0]) {
                System.out.println("Your Hand: " + cards);
            }
            else {
                System.out.println("bot" + player + " Hand: " + cards);
            }
        }
    }

    public STPlayer selectHumPlayer() {
        int humanPlayerID = 0;
        return players[humanPlayerID];
    }

//    public void playRound() {
//        currentCategory;
//        for (STPlayer player : players)
//          if player = player[0]
//              humanTurn()
//              show them cards, give them options, validation of input, etc.
//          if bot do botTurn()
//        for each card : hand
//              check value of each card in the currentCategory
//              if it has a higher value than current AND lowest in their hand
//                  play STPlayCard
//              if cant play any other cards but has ST
//                  play STTrumpCard
//              else {
//                  pick up from deck
//                  playerState = pass
//              }
//    }
}
