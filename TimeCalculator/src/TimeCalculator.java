import javax.swing.JOptionPane; // Needed for JOptionPane
/**
 * Created by Chris on 2/7/2016.
 */
public class TimeCalculator {
    public static void main(String[] args) {
        int number;     //  Number of seconds
        String input;   // Users input

        // Get number of seconds from user.
        input = JOptionPane.showInputDialog("Enter 60, 3600 or " +
                "86400 seconds: ");
        number = Integer.parseInt(input);


        //Display
        if (number == 60) {
            JOptionPane.showMessageDialog(null, "1 minute in 60 seconds");
        }
        else {
            if (number == 3600)
                JOptionPane.showMessageDialog(null, "1 hour in 3600 seconds");
        }

        }
    }

