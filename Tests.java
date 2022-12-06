import Classes.Cat;
import Classes.Dog;


public class Tests {
    // Here I define my own assertEquals method to compare two objects, I could have just written the logic for the assertion
    // within the tests, but I wanted the tests to resemble Unit Testing using some framework like JUnit as much as possible. 
    public Boolean assertEquals (Object expected, Object actual) {
        if (expected.equals(actual)) {
            return true;
        } else {
            return false;
        }
    }
    // Here I define my own assertBetween function for the same reasons mentioned above.
    public Boolean assertBetween(int min, int max, int actual) {
        if (actual >= min && actual <= max) {
            return true;
        } else {
            return false;
        }
    }
    // This method tests the initial age of a cat, it should be between 5 and 10.
    public Boolean catInitialAgeTest() {
       Cat cat = new Cat();
        return assertBetween(5, 10, cat.getAge());
    }
    // This method tests the speak method of the cat class, it should increment the age by 1 after 5 calls to speak.
    public Boolean catSpeakTest() {
        Cat cat = new Cat();
        cat.speak();
        int prevAge = cat.getAge();

        for (int i = 0; i < 5; i++) {
            cat.speak();
        }
        return assertEquals(prevAge + 1, cat.getAge());
    }
    // This method tests the setName method of the cat class
    public Boolean catNameTest() {
        Cat cat = new Cat();
        cat.setName("Garfield");
        return assertEquals("Garfield", cat.getName());
    }
    // This method tests the setFavoriteFood method of the cat class
    public Boolean catFavoriteFoodTest() {
        Cat cat = new Cat();
        cat.setFavoriteFood("Lasagna");
        return assertEquals("Lasagna", cat.getFavoriteFood());
    }
    // This method tests the initial age of a dog, it should be between 5 and 10.
    public Boolean dogInitialAgeTest() {
        Dog dog = new Dog();
        return assertBetween(5, 10, dog.getAge());
    }
    // This method tests the speak method of the dog class, it should increment the age by 1 after 5 calls to speak.
    public Boolean dogSpeakTest() {
        Dog dog = new Dog();
        dog.speak();
        int prevAge = dog.getAge();

        for (int i = 0; i < 5; i++) {
            dog.speak();
        }
        return assertEquals(prevAge + 1, dog.getAge());
    }
    // This method tests the setName method of the dog class
    public Boolean dogNameTest() {
        Dog dog = new Dog();
        dog.setName("Snoopy");
        return assertEquals("Snoopy", dog.getName());
    }
    // This method tests the setFavoriteFood method of the dog class
    public Boolean dogFavoriteFoodTest() {
        Dog dog = new Dog();
        dog.setFavoriteFood("Bacon");
        return assertEquals("Bacon", dog.getFavoriteFood());
    }

    public static void main(String[] args) {
        // Here I instantiate a new Tests object and run all the tests, I also keep track of how many tests passed.
        Tests test = new Tests();
        // I use a variable to keep track of how many tests passed.
        int testsPassed = 0;
        // I run each test and print the result to the console.
        Boolean test1 = test.catInitialAgeTest();
        System.out.println("Cat Initial Age Test: " + test1);
        // If the test passed, I increment the testsPassed variable.
        if (test1) {
            testsPassed++;
        }
        // I repeat the same process for each test.
        Boolean test2 = test.catSpeakTest();
        System.out.println("Cat Speak Test: " + test2);
        if (test2) {
            testsPassed++;
        }
        Boolean test3 = test.catNameTest();
        System.out.println("Cat Name Test: " + test3);
        if (test3) {
            testsPassed++;
        }
        Boolean test4 = test.catFavoriteFoodTest();
        System.out.println("Cat Favorite Food Test: " + test4);
        if (test4) {
            testsPassed++;
        }
        Boolean test5 = test.dogInitialAgeTest();
        System.out.println("Dog Initial Age Test: " + test5);
        if (test5) {
            testsPassed++;
        }
        Boolean test6 = test.dogSpeakTest();
        System.out.println("Dog Speak Test: " + test6);
        if (test6) {
            testsPassed++;
        }
        Boolean test7 = test.dogNameTest();
        System.out.println("Dog Name Test: " + test7);
        if (test7) {
            testsPassed++;
        }
        Boolean test8 = test.dogFavoriteFoodTest();
        System.out.println("Dog Favorite Food Test: " + test8);
        if (test8) {
            testsPassed++;
        }
        // I print the results to the console.
        System.out.println("----------------Results----------------");
        System.out.println("Tests Passed: " + testsPassed + "/8");

        

    }

}
