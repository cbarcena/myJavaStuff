import javax.swing.JOptionPane;
/**
 * Created by Chris on 4/16/2016.
 */
public class SentenceCapitalizer
{
    public static void main(String[] args)
    {
        String input;       //To hold to users input

        //Get String
        input = JOptionPane.showInputDialog("Enter a string.");

        //Display the string with the first letter of each
        //sentence capitalized
        JOptionPane.showMessageDialog(null, sentenceCap(input));

        //Exit application
        System.exit(0);
    }

    /**
     * The sentenceCap method makes a copy of a string
     * where on the copy of the first letter of each sentence
     * is capitalized.
     * @param str The string to perform the operation on.
     * @retun A reference to the sentence-capitalized copy.
     */

    public static String sentenceCap(String str)
    {
        //The variable i will be used to get an index
        //within a string.
        int i;

        //Create a StringBuilder object initialized with
        //the argument String
        StringBuilder temp = new StringBuilder(str);

        //Capitalize the first letter
        if (temp.length() > 0)
            temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));

        //Get the index of the first period followed by space
        i = temp.indexOf(". ");

        while (i != -1)
        {
            //Increment i so it refers to the position of the space
            i++;

            //Find the first character of the next sentence
            while (i < temp.length() && temp.charAt(i) == ' ')
                i++;

            //Capitalize the character
            temp.setCharAt(i, Character.toUpperCase(temp.charAt(i)));

            //Get the index of the next period followed by a space
            i = temp.indexOf(". ", i);
        }
        return temp.toString();
    }
}
