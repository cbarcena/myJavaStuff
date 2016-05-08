/**
 * Created by Chris on 5/1/2016.
 */
public class WorkerDemo
{
    public static void main (String[] args)
    {
        //Create a ProductionWorker object and pass the initialization
        //date to the constructor
        ProductionWorker pw =
                new ProductionWorker("John Smith", "123-A", "11-15-2012",
                        ProductionWorker.DAY_SHIFT, 26.50);

        //Display the data
        System.out.println("Here's the first production worker. ");
        System.out.println(pw);

        //Create another ProductionWorker object and use the
        //set methods
        ProductionWorker pw2 = new ProductionWorker();
        pw2.setName("Jane Doe");
        pw2.setEmployeeNumber("123-E");
        pw2.setHireDate("12-12-2012");
        pw2.setShift(ProductionWorker.NIGHT_SHIFT);
        pw2.setPayRate(28.50);

        //Display Data
        System.out.println("\nHere's the next production worker. ");
        System.out.println(pw2);
    }
}
