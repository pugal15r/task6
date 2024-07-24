package task6;

// Person.java
public class employee {
    // Attributes of the Person class
    private String name;
    private int age;
    
    // Constructor to initialize the attributes
    public employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter method for name attribute
    public String getName() {
        return name;
    }
    
    // Getter method for age attribute
    public int getAge() {
        return age;
    }
    
    // Main method to test the Person class
    public static void main(String[] args) {
        // Creating an instance of Person class
        employee person1 = new employee("Pugal", 26);
        
        // Using getter methods to access attributes
        System.out.println("Person's name: " + person1.getName());
        System.out.println("Person's age: " + person1.getAge());
    }
}
