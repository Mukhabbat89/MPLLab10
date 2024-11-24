// DemoRocks.java - Main application
import java.util.Scanner;

public class DemoRocks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for Rock type
        System.out.print("Enter the type of rock (U: Unclassified, I: Igneous, S: Sedimentary, M: Metamorphic): ");
        String rockType = scanner.nextLine().toUpperCase();

        Rock rock;

        // Validate rock type
        if (!rockType.equals("U") && !rockType.equals("I") && !rockType.equals("S") && !rockType.equals("M")) {
            System.out.println("Invalid rock type! Creating a default unclassified rock.");
            rock = new Rock(0, 0);
        } else {
            // Prompt for sample number and weight
            System.out.print("Enter the sample number: ");
            int sampleNumber = 0;
            double weight = 0;
            try {
                sampleNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter the weight (in grams): ");
                weight = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Setting sample number and weight to 0.");
            }

            // Create specific type of Rock
            switch (rockType) {
                case "I":
                    rock = new IgneousRock(sampleNumber, weight);
                    break;
                case "S":
                    rock = new SedimentaryRock(sampleNumber, weight);
                    break;
                case "M":
                    rock = new MetamorphicRock(sampleNumber, weight);
                    break;
                default:
                    rock = new Rock(sampleNumber, weight); // Default case for Unclassified
            }
        }

        // Display Rock details
        displayRockDetails(rock);

        scanner.close();
    }

    // Method to display rock details
    public static void displayRockDetails(Rock rock) {
        System.out.println("\n--- Rock Details ---");
        System.out.println("Sample Number: " + rock.getSampleNumber());
        System.out.println("Weight: " + rock.getWeight() + " grams");
        System.out.println("Description: " + rock.getDescription());
    }
}

/*
 * ============================================Output1==============================
 
Enter the type of rock (U: Unclassified, I: Igneous, S: Sedimentary, M: Metamorphic): S
Enter the sample number: 101
Enter the weight (in grams): 250

--- Rock Details ---
Sample Number: 101
Weight: 250.0 grams
Description: Sedimentary rocks are formed by the accumulation of sediments.  




====================================================OUTPUT 2 ==========================================
Enter the type of rock (U: Unclassified, I: Igneous, S: Sedimentary, M: Metamorphic): I
Enter the sample number: 109
Enter the weight (in grams): 20

--- Rock Details ---
Sample Number: 109
Weight: 20.0 grams
Description: Igneous rocks are formed from cooled magma or lava.
 */