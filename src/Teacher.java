public class Teacher extends Person
{
    private String subject;
    public Teacher (String theFirstName, String theLastName, String thePhoneNumber, String theSubject)
    {
        super(theFirstName, theLastName, thePhoneNumber);
        subject = theSubject;
    }
    public String getSubject()
    {
        return subject;
    }

    public String toString()
    {
        return super.toString() + " Subject: " + subject;
    }
}
