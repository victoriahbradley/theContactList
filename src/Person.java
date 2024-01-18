
public class Person
{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public Person (String theFirstName, String theLastName, String thePhoneNumber)
    {
        firstName = theFirstName;
        lastName = theLastName;
        phoneNumber = thePhoneNumber;
    }



    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public int compareTo(Person p2, int mode)
    {//a.compareTo(x) -> negative
        //z.compareTo(a) -> positive
        if(mode == 0)
        {
            return firstName.compareTo(p2.getFirstName());
        }
        else if(mode == 1)
        {
            return lastName.compareTo(p2.getLastName());
        }
        else if(mode == 2)
        {
            return phoneNumber.compareTo(p2.getPhoneNumber());
        }
        return lastName.compareTo(p2.getLastName());
    }

    public String toString() {
        return firstName + " " + lastName
                + " - " + phoneNumber;
    }
}
