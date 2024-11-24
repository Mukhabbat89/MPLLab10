// Rock.java - Superclass
public class Rock {
    private int sampleNumber;
    private String description;
    private double weight;

    // Constructor
    public Rock(int sampleNumber, double weight) {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = "Unclassified";
    }

    // Getters
    public int getSampleNumber() {
        return sampleNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    // Setter for description (to be used by child classes)
    protected void setDescription(String description) {
        this.description = description;
    }
}
