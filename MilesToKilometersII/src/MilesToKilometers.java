import javax.swing.JOptionPane;

/**
 * Created by Chris on 2/20/2016.
 */
public class MilesToKilometers
{
    public static void main(String[] args)
    {
        double miles;            // Miles to convert from user
        double kilometers;   // Conversion from miles to kilometers

        // Get the number of miles
        miles = getMiles();

        // Convert miles to kilometers
        kilometers = milesToKilometers(miles);

        // Display results
        displayResults(miles, kilometers);
        System.exit(0);
    }

    /**
     * The getMiles method prompts the user to enter a number of miles to convert.
     * @return the number of miles entered by the user.
     */

    public static double getMiles()
    {
        String input;       // to hold input
        double numMiles;    // to hold miles.

        // Get the number of miles from the user.
        input = JOptionPane.showInputDialog("Enter the number of miles.");

        // Convert the input to a double.
        numMiles = Double.parseDouble(input);

        // Return the number of miles.
        return numMiles;
    }

    /**
     * The milestoKilometers method converts a number of
     * miles to kilometers, using the formula
     * 1 mile = 1.609 kilometers.
     * @param numMiles The number of miles to convert.
     * @return The number of kilometers.
     */

    public static double milesToKilometers(double numMiles)
    {
        return numMiles * 1.609;
    }

    /**
     * The displayResults method displays a message showing
     * the results of the conversion.
     * @param miles A number of miles.
     * @param kilometers A number of kilometers.
     */

    public static void displayResults(double miles, double kilometers)
    {
        // Display the number of kilometers.
        JOptionPane.showMessageDialog(null,
                miles + " miles equals " +
                kilometers + " kilometers.");
    }
}
