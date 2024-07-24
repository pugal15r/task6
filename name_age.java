package task6;

public class name_age {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public name_age(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Method to get full name
    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to calculate annual salary
    public int getAnnualSalary() {
        return salary * 12; // Assuming salary is monthly, calculate annual salary
    }

    // Method to raise salary by a percentage
    public void raiseSalary(int percent) {
        double raiseFactor = (100 + percent) / 100.0; // Calculate raise factor
        salary = (int) (salary * raiseFactor); // Apply raise to current salary
    }

    // toString method to represent Employee object as a string
    public String toString() {
        return "Employee [id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Example usage in main method
    public static void main(String[] args) {
        // Example of creating an Employee object
        name_age emp = new name_age(1, "Pugal", "vijay", 50000);
        
        System.out.println(emp); 
        
        emp.raiseSalary(10); 
        
        System.out.println(emp);
    }
}
