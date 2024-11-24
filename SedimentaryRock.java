// SedimentaryRock.java - Child class
public class SedimentaryRock extends Rock {
    // Constructor
    public SedimentaryRock(int sampleNumber, double weight) {
        super(sampleNumber, weight);
        // Setting specific description
        setDescription("Sedimentary rocks are formed by the accumulation of sediments.");
    }
}
