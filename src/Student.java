// Contact List
// Victoria Harding Bradley
// January 19, 2024

public class Student extends Person
{
    private int grade;
    public Student (String theFirstName, String theLastName, String thePhoneNumber, int theGrade)
    {
        // Referring to the Person Class for names and phone number.
        super(theFirstName, theLastName, thePhoneNumber);
        grade = theGrade;
    }

    // Returns the Grade.
    public int getGrade()
    {
        return grade;
    }

    public String toString()
    {
        return super.toString() + " Grade: " + getGrade();
    }


}
