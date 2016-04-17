/**
 * Created by Chris on 3/5/2016.
 */
public class PersonalInformationClass
{
    public static void main(String[]args)
    {
        //Create the objects
        Person me = new Person ("Christine Barcena", "555 N. Main Street", 31, "555-555-5555");
        Person myFriend1 = new Person ("Jerry Rice", "555 N. Main Street", 40, "555-555-5555");
        Person myFriend2 = new Person ("Peter Cottontail", "555 N. Main Street", 3, "555-555-5555");

        /**Set info
        me.setName("Christine Barcena");
        me.setAddress("555 N Main Street");
        me.setAge(31);
        me.setPhone("555-555-5555");

        //Set friend1 info
        myFriend1.setName("Jerry Rice");
        myFriend1.setAddress("555 N Main Street");
        myFriend1.setAge(40);
        myFriend1.setPhone("555-555-5555");

        //Set friend2 info
        myFriend2.setName("Peter Cottontail");
        myFriend2.setAddress("555 N Main Street");
        myFriend2.setAge(20);
        myFriend2.setPhone("555-555-5555");
         */

        //Display my info
        System.out.println("My Information: ");
        System.out.println("Name: " + me.getName());
        System.out.println("Address: " + me.getAddress());
        System.out.println("Age: " + me.getAge());
        System.out.println("Phone: " + me.getPhone());

        //Display Friend1 info
        System.out.println("\nMy Friend Number1 Information: ");
        System.out.println("Name: " + myFriend1.getName());
        System.out.println("Address: " + myFriend1.getAddress());
        System.out.println("Age: " + myFriend1.getAge());
        System.out.println("Phone: " + myFriend1.getPhone());

        //Display Friend2 info
        System.out.println("\nMy Friend Number2 Information: ");
        System.out.println("Name: " + myFriend2.getName());
        System.out.println("Address: " + myFriend2.getAddress());
        System.out.println("Age: " + myFriend2.getAge());
        System.out.println("Phone: " + myFriend2.getPhone());
    }
}
