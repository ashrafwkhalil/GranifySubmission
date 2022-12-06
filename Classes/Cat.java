package Classes;

import Interfaces.Nameable;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class Cat implements Nameable{
    // a list that keeps tracks of all the names the cat has had
    private List<String> names;
    // the age of the cat
    private int age;
    // the favorite food of the cat
    private String favoriteFood;
    // the number of times the cat has spoken
    private int speakCounter;

    public Cat() {
        // initialize the list of names
        this.names = new ArrayList<String>();
        // add an empty string to the list of names, as that is the default value as per the instructions
        // I would have set it to null, but then the output of the main method would be not be identical to the output in the instructions
        // It would have printed the text "Name is currently null" instead of "Name is currently " when printing "Name is currently " + cat.getName();
        this.names.add("");
        Random rand = new Random();
        // set the age to a random number between 5 and 10
        this.age = rand.nextInt(5) + 5;
        // set the speak counter to 0
        this.speakCounter = 0;
        // set the favorite food to an empty string, following the same logic as used with the name 
        this.favoriteFood = "";
    }

    public Cat(String name){
        // initialize the list of names
        this.names = new ArrayList<String>();
        // add the name to the list of names
        this.names.add(name);
        Random rand = new Random();
        // set the age to a random number between 5 and 10
        this.age = rand.nextInt(5) + 5;
        // set the speak counter to 0
        this.speakCounter = 0;
        // set the favorite food to an empty string, following the same logic as used with the name
        this.favoriteFood = "";
    }

    public void speak() {
        // print "meow" to the console
        System.out.println("meow");
        // increment the speak counter
        this.speakCounter++;
        // if the speak counter is 5, increment the age by 1
        if (this.speakCounter == 5) {
            this.setAge(age + 1);
        }
    }

    public String getName() {
        // return the last name in the list of names, which reflects the current name
        return this.names.get(names.size() - 1);
    }
   
    public int getAverageNameLength() {
        // Sum all the lengths of the names in the list of names
        int total = 0;
        for (String name : names) {
            total += name.length();
        }
        // Divide the sum by the number of names in the list of names
        return total / names.size();
    }

    // the rest of the methods are getters and setters, as per the instructions
    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setName(String name) {
        this.names.add(name);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void speak(String message) {
        System.out.println(message);
    }

    public List<String> getNames() {
        return names;
    }

}