// Contact List
// Victoria Harding Bradley
// January 19, 2024

import java.util.ArrayList;
import java.util.Scanner;
public class ContactList
{
    private ArrayList<Person> contacts;
    private int number = 0;
    public ContactList ()
    {
        contacts = new ArrayList<Person>();
    }

    // Bubble Sort sourced from GeeksforGeeks.com.
    //https://www.geeksforgeeks.org/bubble-sort/
    public void sort(int sortBy)
    {
        int n = contacts.size();
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if ( 0 < contacts.get(j).compareTo(contacts.get(j + 1), sortBy))
                {
                    // Swap temp and person.
                    Person temp = contacts.get(j);
                    contacts.set(j, contacts.get(j+1));
                    contacts.set(j+1, temp);
                }
            }
        }
    }
    // Returns the Contacts.
    public ArrayList<Person> getContacts()
    {
        return contacts;
    }
    // Returns the Number.
    public int getNumber()
    {
        return number;
    }
    // Adds the specified contact.
    public void addContact(Person p)
    {
        contacts.add(p);
    }
    // Prints out all the contacts.
    public void printContacts()
    {
        for (Person contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    // Iterates through contacts and finds the matching first name.
    public Person searchByFirstName(String firstName)
    {
        for (Person contact : contacts) {
            if (firstName.equals(contact.getFirstName())) {
                return contact;
            }
        }
        // If no match is found, returns null.
        System.out.println("There is no contact under that name");
        return null;
    }

    // Iterates through contacts and finds the matching last name.
    public Person searchByLastName(String lastName)
    {
        for (Person contact : contacts) {
            if (lastName.equals(contact.getLastName())) {
                return contact;
            }
        }
        // If no match is found, returns null.
        System.out.println("There is no contact under that name");
        return null;
    }

    // Iterates through contacts and finds the matching phone number.
    public Person searchByPhoneNumber(String firstName)
    {
        for (Person contact : contacts) {
            if (firstName.equals(contact.getFirstName())) {
                return contact;
            }
        }
        // If no match is found, returns null.
        System.out.println("There is no contact under that number");
        return null;
    }

    // Prints out all the students.
    public void listStudents()
    {
        for (Person contact : contacts)
        {
            if (contact instanceof Student)
            {
                System.out.println(contact);
            }
        }
    }

    // Prints the introduction.
    public void introduction()
    {
        System.out.print("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options");
        System.out.println(" ");
    }

    // Prints the instructions.
    public void instructions()
    {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts by First Name");
        System.out.println("3. List All Contacts by Last Name");
        System.out.println("4. List All Contacts by Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search by First Name");
        System.out.println("7. Search by Last Name");
        System.out.println("8. Search by Phone Number");
        System.out.println("0. Exit");
    }

    // Runs the gameplay.
    public void run()
    {
        // Scans the users input.
        Scanner scan = new Scanner (System.in);
        int input = -1;

        while (input != 0)
        {
            input = scan.nextInt();
            scan.nextLine();
            if (input == 1)
            {
                // Adds new contact.
                System.out.println("First Name: ");
                String a = scan.nextLine();
                System.out.println("Last Name: ");
                String b = scan.nextLine();
                System.out.println("Phone Number:  ");
                String c = scan.nextLine();

                // Specifies what type the contact is.
                System.out.println("If contact is a student type 1");
                System.out.println("If contact is a teacher type 2");
                System.out.println("If contact is neither type 3");
                int type = scan.nextInt();
                scan.nextLine();

                if(type == 1)
                {
                    // If the contact is a student.
                    System.out.println("What grade is the student in?");
                    int grade = scan.nextInt();
                    Student d = new Student (a, b, c, grade);

                }
                else if (type == 2)
                {
                    // If the contact is a teacher.
                    System.out.println("What class does the teacher teach?");
                    String subject = scan.nextLine();
                    Teacher e = new Teacher (a, b, c, subject);
                }
                else if (type == 3)
                {
                    // If the contact is neither a teacher or student.
                    Person f = new Person (a, b, c);
                }
                break;
            }
            else if (input == 2)
            {
                // Creates new arraylist the same size as contacts.
                ArrayList<Person> people = new ArrayList<Person>(contacts);

                // Adds all the contact into people.
                for (int i = 0; i < people.size() - 1; i++)
                {
                    people.add(contacts.get(i));
                }

                // Iterates through the contacts arraylist.
                for ( int i = 0; i < people.size() - 1; i++)
                {
                    for (int j = 0; j < people.size() - 1; j++) {
                        String name1 = people.get(j).getFirstName();
                        String name2 = people.get(j + 1).getFirstName();

                        // Compares the two names.
                        if (name1.compareTo(name2) > 0) {
                            Person temp = people.get(j);
                            people.set(j, people.get(j + 1));
                            people.set(j + 1, temp);
                        }
                    }
                }
                System.out.println(people.toString());
                break;
            }
            else if (input == 3)
            {
                // Creates new arraylist the same size as contacts.
                ArrayList<Person> people = new ArrayList<Person>(contacts);

                // Adds all the contact into people.
                for (int i = 0; i < people.size() - 1; i++)
                {
                    people.add(contacts.get(i));
                }

                // Iterates through the contacts arraylist.
                for (int i = 0; i < people.size() - 1; i++) {
                    for (int j = 0; j < people.size(); j++) {
                        String name1 = people.get(j).getFirstName();
                        String name2 = people.get(j + 1).getFirstName();

                        // Compares the two names.
                        if (name1.compareTo(name2) > 0) {
                            Person temp = people.get(j);
                            people.set(j, people.get(j + 1));
                            people.set(j + 1, temp);
                        }
                    }
                }
                System.out.println(people.toString());
                break;
            }
            else if (input == 4)
            {
                // Creates new arraylist the same size as contacts.
                ArrayList<Person> people = new ArrayList<Person>(contacts);

                // Adds all the contact into people.
                for (int i = 0; i < people.size() - 1; i++)
                {
                    people.add(contacts.get(i));
                }

                // Iterates through the contacts arraylist.
                for ( int i = 0; i < people.size() - 1; i++)
                {
                    for (int j = 0; j < people.size(); j++) {
                        String number1 = people.get(j).getPhoneNumber();
                        String number2 = people.get(j + 1).getPhoneNumber();

                        // Compares the two names.
                        if (number1.compareTo(number2) > 0) {
                            Person temp = people.get(j);
                            people.set(j, people.get(j + 1));
                            people.set(j + 1, temp);
                        }
                    }
                }
                System.out.println(people.toString());
                break;
            }
            else if (input == 5)
            {
                listStudents();
                break;
            }
            else if (input == 6)
            {
                System.out.println("First Name: ");
                String name = scan.nextLine();
                searchByFirstName(name);
                break;
            }
            else if (input == 7)
            {
                System.out.println("Last Name: ");
                String name = scan.nextLine();
                searchByLastName(name);
                break;
            }
            else if (input == 8)
            {
                System.out.println("Phone Number: ");
                String number = scan.nextLine();
                searchByPhoneNumber(number);
                break;
            }
            else if (input == 0)
            {
                number = 1;
                break;
            }
        }
    }
}
