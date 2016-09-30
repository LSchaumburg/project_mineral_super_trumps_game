import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * Created by jc247746 on 29/09/16.
 */
public class STTrumpCard extends STCard {
    private String description;

    public STTrumpCard(int id, String title, String[] categories, String description) {
        super(id, title, categories);
        this.description = description;
    }
}
