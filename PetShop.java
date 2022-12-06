

import Interfaces.Nameable;
import java.util.ArrayList;
import java.util.List;

import Classes.Cat;
import Classes.Data;
import Classes.Dog;

public class PetShop {
    

    List<String> log;

    public PetShop() {
        this.log = new ArrayList<String>();
    }
    
    public void saveTest() {

        // for every function call, I track the time it took to execute, and add it to the log
        // I create a time variable, and then set it to the current time in nano seconds
        long time1 = System.nanoTime();
        Data data = new Data("database");

        // I add to the log the time it took to execute the function, by subtracting the current time in nano seconds
        // from the time variable I created earlier
        log.add("Call to Create Database. Took :" + (System.nanoTime() - time1) + " nano seconds");

        // I do this for all the successive function calls
        long time2 = System.nanoTime();
        Cat cat = new Cat("Felix");
        log.add("Call to Create Cat. Took :" + (System.nanoTime() - time2) + " nano seconds");
        long time3 = System.nanoTime();
        Dog dog = new Dog("Rover");
        log.add("Call to Create Dog. Took :" + (System.nanoTime() - time3) + " nano seconds");
        long time4 = System.nanoTime();
        data.insert("Cat", cat);
        log.add("Call to Insert Cat into table. Took :" + (System.nanoTime() - time4) + " nano seconds");
        long time5 = System.nanoTime();
        data.insert("Dog", dog);
        log.add("Call to Insert Dog into table. Took :" + (System.nanoTime() - time5) + " nano seconds");
    }

    public void savePetShop() {
        long time1 = System.nanoTime();
        List<Nameable> animals = new ArrayList<Nameable>();
        log.add("Call to Create List. Took :" + (System.nanoTime() - time1) + " nano seconds");
        long time2 = System.nanoTime();
        animals.add(new Cat());
        log.add("Call to Create Cat and add it to list. Took :" + (System.nanoTime() - time2) + " nano seconds");
        long time3 = System.nanoTime();
        animals.add(new Cat());
        log.add("Call to Create Cat and add it to list. Took :" + (System.nanoTime() - time3) + " nano seconds");
        long time4 = System.nanoTime();
        animals.add(new Cat());
        log.add("Call to Create Cat and add it to list. Took :" + (System.nanoTime() - time4) + " nano seconds");
        long time5 = System.nanoTime();
        animals.add(new Dog());
        log.add("Call to Create Dog and add it to list. Took :" + (System.nanoTime() - time5) + " nano seconds");
        animals.add(new Dog());
        long time6 = System.nanoTime();
        animals.add(new Dog());
        log.add("Call to Create Dog and add it to list. Took :" + (System.nanoTime() - time6) + " nano seconds");
        long time7 = System.nanoTime();
        Data data = new Data("database");
        log.add("Call to Create Database. Took :" + (System.nanoTime() - time7) + " nano seconds");

        // for each animal, insert it inot the database in the appropriate table
        for (Nameable animal : animals) {
            long time8 = System.nanoTime();
            if (animal instanceof Cat) {
                data.insert("Cat", animal);
            } else if (animal instanceof Dog) {
                data.insert("Dog", animal);
            }
            log.add("Call to Insert Animal into table. Took :" + (System.nanoTime() - time8) + " nano seconds");
        }
    }

    public void logStats() {
        System.out.println("Printing Log");
        // for each entry in the log, print it
        for (String logEntry : log) {
            System.out.println(logEntry);
        }
    }

    public static void main(String[] args) {
        PetShop petShop = new PetShop();
        petShop.saveTest();
        petShop.savePetShop();
        petShop.logStats();
    }
}
