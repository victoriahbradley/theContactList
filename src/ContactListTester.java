// Contact List
// Victoria Harding Bradley
// January 19, 2024

import java.security.KeyStore;

public class ContactListTester
{
    private ContactList list = new ContactList();

    public void runTester()
    {
        // Runs through the game.
        list.introduction();
        while (true)
        {
            list.instructions();
            list.run();
        }
    }

    public static void main(String[] args)
    {
        ContactListTester tester = new ContactListTester();
        tester.runTester();
    }
}
