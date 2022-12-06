import Classes.Cat;
import Classes.Data;

public class Main {
    public static void main(String[] args) {
        // Instantiate a new cat object
        Cat cat = new Cat();

        // Print the cat's name
        System.out.println("Name is currently " + cat.getName());

        // Change the cat's name to Garfield
        cat.setName("Garfield");

        // Print the cat's name again
        System.out.println("Name has been changed to " + cat.getName());

        // Instantiate a new Data object
        Data data = new Data("database");
        
        // Insert the cat into the database, into the table "Cat"
        data.insert("Cat", cat);
    }
}
