package Interfaces;

//This class was necessary so that the insert method in the Data class could be used for both Cat and Dog objects.
public interface Nameable {
    public String getName();
    public void setName(String name);
}
