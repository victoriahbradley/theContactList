public class Student extends Person
{
    private int grade;
    public Student (String theFirstName, String theLastName, String thePhoneNumber, int theGrade)
    {
        super(theFirstName, theLastName, thePhoneNumber);
        grade = theGrade;
    }

    public int getGrade()
    {
        return grade;
    }

    public String toString()
    {
        return super.toString() + " Grade: " + getGrade();
    }


}
