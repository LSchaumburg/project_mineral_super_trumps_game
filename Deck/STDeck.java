import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Luke on 13/09/2016.
 */
public class STDeck {
    private static final int NUMCARDS = 60;
    private ArrayList<STCard> cards;

    public STDeck(){
        cards = new ArrayList<>();

        for (int i = 0; i < NUMCARDS; i++){
            cards.add(new STCard(i));
        }
    }
    public ArrayList<STCard> dealHandCards(int numCardsDealt) {
        ArrayList<STCard> result = new ArrayList<>();
        for (int i = 0; i < numCardsDealt; i++) {
            int index = new Random().nextInt(cards.size());
            STCard card = cards.remove(index);
            result.add(card);
//            System.out.println("Card" + card);
        }
        return result;
    }
}
