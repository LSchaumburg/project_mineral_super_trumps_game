import java.util.ArrayList;

/**
 * Created by Luke on 13/09/2016.
 */
public class STPlayers {
    private ArrayList<STCard> cards;
    private String playerID;

    public STPlayers(String playerID) {
        this.playerID = playerID;
    }

    public void setHandCards(ArrayList<STCard> cards) {
        this.cards = cards;
    }

    public String toString(){
        return playerID;
    }
}
