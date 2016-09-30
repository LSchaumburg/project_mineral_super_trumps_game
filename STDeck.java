import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luke on 13/09/2016.
 */
public class STDeck {
    private static final int NUMCARDS = 60;
    private ArrayList<STCard> cards;
    private DeckBuilder deckBuilder;

    public STDeck(){
        deckBuilder = new DeckBuilder();
        cards = deckBuilder.buildDeck();
    }

    public ArrayList<STCard> dealHandCards(int numCardsDealt) {
//        creates a hand for each player
        ArrayList<STCard> hand = new ArrayList<>();
        for (int i = 0; i < numCardsDealt; i++) {
            int index = new Random().nextInt(cards.size());
            STCard card = cards.remove(index);
            hand.add(card);
//            System.out.println("Card" + card);
        }
        return hand;
    }
}
