# General Overview and File Structure
I made a separate folder to store all the classes I was instructed to implement that do not contain a main method, and left all the executable files in the root folder. This seemed like the simplest structure to use, albeit using the name 'Classes' for the folder may not have been the most appropriate, being that all the files in this project contain classes. There are 3 Classes in the 'Classes' folder: Cat, Dog, and Data. I also included an Interfaces folder in the root directory, that contains a single interface. Both the Cat and Dog classes implement this interface. This was necessary to allow for the Data Class' Insert method to accept either a Dog or a Cat as a parameter. I could have simply written two methods, one accepting a Cat as a parameter and another accepting a Dog, but this seemed like a more elegant solution. There is also an SQL folder that with the SQL file that contains all the SQL commands I was instructed to implement. As mentioned earlier, all three executable files are present directly in the root directory. 

# How to Run The Executable files
First, you need to have the JDK installed and configured on your machine. Assuming that is done, navigate to the root directory of the project, named "GranifySubmission". Then run this command in your terminal:
```
javac *.java

```
This should have compiled all the necessary .java files to run any of the three executable files. Now to run any of the three executable files, simply run 

```
java <Name-of-Class-Defined-in-File>
```

So for example, to run the Tests file, run 
```
java Tests
```
In this case, you should receive the output
```
Cat Initial Age Test: true
meow
meow
meow
meow
meow
meow
Cat Speak Test: true
Cat Name Test: true
Cat Favorite Food Test: true
Dog Initial Age Test: true
bark
bark
bark
bark
bark
bark
Dog Speak Test: true
Dog Name Test: true
Dog Favorite Food Test: true
----------------Results----------------
Tests Passed: 8/8
```
To see the output of the Petshop class run:
```
java PetShop
```
and the console output should be:
```
Connecting to database
Inserting Felix into Cat
Inserting Rover into Dog
Connecting to database
Inserting  into Cat
Inserting  into Cat
Inserting  into Cat
Inserting  into Dog
Inserting  into Dog
Inserting  into Dog
------------Printing Log------------
Call to Create Database. Took :354625 nano seconds
Call to Create Cat. Took :502459 nano seconds
Call to Create Dog. Took :161833 nano seconds
Call to Insert Cat into table. Took :6573875 nano seconds
Call to Insert Dog into table. Took :36667 nano seconds
Call to Create List. Took :583 nano seconds
Call to Create Cat and add it to list. Took :7250 nano seconds
Call to Create Cat and add it to list. Took :2833 nano seconds
Call to Create Cat and add it to list. Took :2917 nano seconds
Call to Create Dog and add it to list. Took :3875 nano seconds
Call to Create Dog and add it to list. Took :1542 nano seconds
Call to Create Database. Took :24208 nano seconds
Call to Insert Animal into table. Took :25708 nano seconds
Call to Insert Animal into table. Took :25041 nano seconds
Call to Insert Animal into table. Took :24625 nano seconds
Call to Insert Animal into table. Took :19584 nano seconds
Call to Insert Animal into table. Took :20334 nano seconds
Call to Insert Animal into table. Took :16750 nano seconds
```
To see the output of the Main class run:
```
java Main
```
and the output should be:
```
Name is currently 
Name has been changed to Garfield
Connecting to database
Inserting Garfield into Cat
```

Remember, for this to work you need to have a JDK installed and configured, and have run javac *.java in the 'GranifySubmission' directory
# Special Considerations
* Setting the name of the Dogs/Cats to null within the default constructor would have resulted in an output of the main method different to what is shown in the instructions. That is why I initialized the name to "", the empty String, instead. 

* In the Data class, the insert method takes as a parameter an Object, and calls getName() on that object. Given that Java is strongly typed, I needed to assure Java that the object being passed contains a getName() method. To do this, I created a 'Nameable' interface, and made it so that both the Dog and Cat class implement the interface. The insert() function now takes a "Nameable" as a parameter.

* In part 3.2.d, ensuring that "all six pets (or zero pets) are persisted" is listed as a requirement. Given that my interpretation of this assignment does not include the implementation of any working data store, with the data class effectively acting as a dummy class, I really am not sure what that requirement means. I could have tried to 'get' the pets from the fake database, but the specifications do not even include a dummy version of a get method, so I can't even fake that. 

* In part 3.3.a I was told to print 'interesting information' about the run. I arbitrarily decided to print out all method calls that occured, and how many nano seconds each one took.

* The assignment mentioned that any OOP language will do, and I chose Java. 


