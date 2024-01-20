// Contact List
// Victoria Harding Bradley
// January 19, 2024

public class Teacher extends Person
{
    private String subject;
    public Teacher (String theFirstName, String theLastName, String thePhoneNumber, String theSubject)
    {
        // Refers to the super class for the names and number.
        super(theFirstName, theLastName, thePhoneNumber);
        subject = theSubject;
    }

    // Returns the subject.
    public String getSubject()
    {
        return subject;
    }

    public String toString()
    {
        return super.toString() + " Subject: " + subject;
    }
}
