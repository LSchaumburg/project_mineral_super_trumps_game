/**
 * Created by Luke on 29/09/2016.
 */
public class STPlayCard extends STCard{
    private String chemistry;
    private String classification;
    private String crystalSystem;
    private String[] occurrence = new String[]{};
    private float hardness;
    private float specificGravity;
    private String cleavage;
    private String crustalAbundance;
    private String economicValue;

    public STPlayCard(int id, String title, String[] categories, String chemistry, String classification, String crystalSystem, String[] occurrence, String hardness, String specificGravity, String cleavage, String crustalAbundance, String economicValue) {
        super(id, title, categories);
        this.chemistry = chemistry;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.occurrence = occurrence;
        this.hardness = Float.parseFloat(hardness);
        this.specificGravity = Float.parseFloat(specificGravity);
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
    }
}
