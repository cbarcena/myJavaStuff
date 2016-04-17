import javax.swing.JOptionPane;
/**
 * Created by Chris on 1/30/2016.
 */
public class PayrollDialog {
    public static void main (String[] args)
    {
        // Variable Declaration
        String inputString;     // For reading input
        String name;            // The user's name
        int hours;              // The number of hours worked
        double payRate;         // The users hourly pay rate
        double grossPay;        // The users gross pay

        // Input the users name.
        name = JOptionPane.showInputDialog("What is " +
                "your name? ");

        // Input the hours worked.
        inputString =
                JOptionPane.showInputDialog("How many hours " +
                        "did you work this week? ");

        // Convert the input integer to an int.
        hours = Integer.parseInt(inputString);

        // Input the hourly pay rate.
        inputString =
                JOptionPane.showInputDialog("What is your " +
                        "hourly pay rate? ");

        // Convert the input to a double.
        payRate = Double.parseDouble(inputString);


        // Processing
        grossPay = hours * payRate;

        // Output
        JOptionPane.showMessageDialog(null, "Hello " +
                name + ". Your gross pay is $" +
                grossPay);

        // End the program.
        System.exit(0);
    }
}
