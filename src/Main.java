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
        messenger.sendMessage("The sum of 5 and 7 is: " + result);

        Person[] people = new Person[5];
        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Alice Smith", 25);
            people[2] = new Person("Bob Johnson", 40);
            people[3] = new Person("Emma Brown", 35);
            people[4] = new Person("Michael Davis", 20);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }

        Messenger messenger3 = new EmailMessenger();

        for (Person person : people) {
            if (person != null) {
                int result2 = MathUtils.add(person.getAge(), b);
                System.out.println("Result for " + person.getName() + ": " + result);
                messenger3.sendMessage("Result for " + person.getName() + ": " + result); 
            }
        }
    }
}
