# General Overview and File Structure
I made a separate folder to store all the classes I was instructed to implement that do not contain a main method, and left all the executable files in the root folder. This seemed like the simplest structure to use, albeit using the name 'Classes' for the folder may not have been the most appropriate, being that all the files in this project contain classes. There are 3 Classes in the 'Classes' folder: Cat, Dog, and Data. I also included an Interfaces folder in the root directory, that contains a single interface. Both the Cat and Dog classes implement this interface. This was necessary to allow for the Data Class' Insert method to accept either a Dog or a Cat as a parameter. I could have simply written two methods, one accepting a Cat as a paramater and another accepting a Dog, but this seemed like a more elegant solution. There is also an SQL folder that with the SQL file that contains all the SQL commands I was instructed to implement. As mentioned earlier, all three executable files are present directly in the root directory. 

# How to Run The Executable files
First, you need to have the JDK installed and configured on your machine. Assuming that is done, navigate to the root directory, named "GranifySubmission". Then run this command in your terminal:
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
# Special Considerations
* Setting the name of the Dogs/Cats to null within the default constructor would have resulted in output of the main method different than what is shown in the instructions. That is why I initialized the name to "", the empty String, instead. 

* In the Data class, the insert method takes as a parameter an Object, and calls getName() on that object. Given that Java is strongly typed, I needed to assure Java that the object being passed contains a getName() method. To do this, I created a 'Nameable' interface, and made it so that both the Dog and Cat class implement the interface. The insert() function now takes a "Nameable" as a parameter.

* 



