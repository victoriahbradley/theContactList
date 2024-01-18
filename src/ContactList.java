import java.util.ArrayList;
public class ContactList
{
    private ArrayList<Person> contacts;
    public ContactList ()
    {
        contacts = new ArrayList<Person>();
    }
    public void sort(int sortBy)
    {
        int n = contacts.size();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if ( 0 < contacts.get(j).compareTo(contacts.get(j + 1), sortBy))
                {
                    // swap temp and arr[i]
                    Person temp = contacts.get(j);
                    contacts.set(j, contacts.get(j+1));
                    contacts.set(j+1, temp);
                }
            }
        }
    }
    public ArrayList<Person> getContacts()
    {
        return contacts;
    }
    public void addContact(Person p)
    {
        contacts.add(p);
    }
    public void printContacts()
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i).toString());
        }
    }
    public Person searchByFirstName(String firstName)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (firstName.equals(contacts.get(i).getFirstName()))
            {
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person searchByLastName(String lastName)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (lastName.equals(contacts.get(i).getLastName()))
            {
                return contacts.get(i);
            }
        }
    }

    public Person searchByPhoneNumber(String firstName)
    {
        for (int i = 0; i < contacts.size(); i++)
        {
            if (firstName.equals(contacts.get(i).getFirstName()))
            {
                return contacts.get(i);
            }
        }
    }
}
