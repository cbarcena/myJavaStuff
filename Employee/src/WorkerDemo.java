/**
 * Created by Chris on 5/1/2016.
 */
public class WorkerDemo
{
    public static void main (String[] args)
    {
        //Create a ProductionWorker object with valid date
        createWorker("Jane Doe", "123-A", "11-11-2011",
                ProductionWorker.DAY_SHIFT, 26.50);

        //Invalid number
        System.out.println("\nAttempting an invalid employee number. ");
        createWorker("Jane Doe", "123-Z", "11-11-2011",
                ProductionWorker.DAY_SHIFT, 26.50);

        //Invalid shift
        System.out.println("\nAttempting an invalid shift. ");
        createWorker("Jane Doe", "123-A", "11-11-2011",
                32, 26.50);

        //Invalid payRate
        System.out.println("\nAttempting a negative pay rate. ");
        createWorker("Jane Doe", "123-A", "11-11-2011",
                ProductionWorker.DAY_SHIFT, -6.50);
    }

    /**
     * createWorker method
     * @param n The employee's name
     * @param num The employee's number
     * @param date The employee's hire date
     * @param sh The employee's shift
     * @param rate The employee's pay rate
     */
    public static void createWorker(String n, String num, String date, int sh, double rate)
    {
        ProductionWorker pw;
        // Attempt to create an instance of the ProductionWorker
        // class and catch any resulting exceptions
        try
        {
            pw = new ProductionWorker (n, num, date, sh, rate);
            //once here object was created
            System.out.println("Object created.");
            System.out.println(pw);
        }
        catch (InvalidEmployeeNumber e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidShift e)
        {
            System.out.println(e.getMessage());
        }
        catch (InvalidPayRate e)
        {
            System.out.println(e.getMessage());
        }
    }
}
