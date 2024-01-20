// Contact List
// Victoria Harding Bradley
// January 19, 2024

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


    // Getters and Setters for First Name.
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // Getters and Setters for Last Name.
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // Getters and Setters for Phone Number.
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // Comparing the names or phone number.
    public int compareTo(Person p2, int mode)
    {
        // a.compareTo(x) -> negative
        // z.compareTo(a) -> positive
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

    // Person return statement.
    public String toString() {
        return firstName + " " + lastName
                + " - " + phoneNumber;
    }
}
