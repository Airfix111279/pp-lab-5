import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("Hello, this is a test email message.");
    }
}
