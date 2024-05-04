import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

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
        
        int result = MathUtils.add(5, 7);
        System.out.println("Sum of 5 and 7 is: " + result);
        
        Messenger messenger2 = new EmailMessenger();
        messenger2.sendMessage("The sum of 5 and 7 is: " + result);
    }
}
