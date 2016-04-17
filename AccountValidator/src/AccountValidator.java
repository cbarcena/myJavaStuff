/**
 * Created by Chris on 3/20/2016.
 */
public class AccountValidator {
    //Array of valid numbers
    private int [] valid = {
            5658845, 4520125, 7895122, 8777541,
            8451277, 1302850, 8080152, 4562555,
            5552012, 5050552, 782587, 1250255,
            1005231, 6545231, 3852085, 7876651,
            7881200, 4581002
    };

    /** The isValid method uses a sequential search
     * to determine whether a number appears in
     * the array of valid numbers.
     @param number The number to search for.
     @return true if the number is found. false
     otherwise.
     */

    public boolean isValid(int number)
        boolean found = false;  // Search flag
        int index = 0;          // Array index

    // Search the valid array to see if
    // number appears in it.
    while (!found && index < valid.length)
    {
        if (valid[index] == number)
            found = true;
        else
            index++;
    }
    //Return the status of the search.
    return found;
}