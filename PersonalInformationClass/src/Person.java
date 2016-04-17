/**
 * Created by Chris on 3/5/2016.
 */
public class Person
{
    private String name;    //A person's name
    private String address; //A person's address
    private int age;        //A person's age
    private String phone;   //A person's phone

    /**
     * no-arg constructor initializes an empty object
     */
    public Person()
    {
        name = "";
        address = "";
        age = 0;
        phone = "";
    }
    /**
     *Parametrized constructor accepts arguments for the objects fields
        @param myName A persons name.
        @param myAddress A persons address.
        @param myAge A persons age.
        @param myPhone A persons phone.
    */
    public Person(String myName, String myAddress, int myAge, String myPhone)
    {
        name = myName;
        address = myAddress;
        age = myAge;
        phone = myPhone;
    }
    /**
     * The setName method sets the person's name
        @param myName The person's name.
     */
    public void myName(String myName)
    {
        name = myName;
    }

    /**
     * The setAddress method sets the person's address
        @param myAddress The person's address.
     */
    public void myAddress(String myAddress)
    {
        address = myAddress;
    }

    /**
     * The setAge method sets the person's age
        @param myAge The person's age
     */
    public void myAge (int myAge)
    {
        age = myAge;
    }

    /**
     * The setPhone method sets the person's phone number
        @param myPhone The person's phone
     */
    public void myPhone (String myPhone)
    {
        phone = myPhone;
    }
    /**
     * The getName method returns the persons name
        @return The person's name
     */
    public String getName()
    {
        return name;
    }
    /**
     * The getAddress method returns the persons name
        @return The person's name
     */
    public String getAddress()
    {
        return address;
    }
    /**
     * The getAge method returns the person's age
        @return The person's age
     */
    public int getAge()
    {
        return age;
    }
    /**
     * The getPhone method returns the person's age
        @return The person's phone number
     */
    public String getPhone()
    {
        return phone;
    }
}
