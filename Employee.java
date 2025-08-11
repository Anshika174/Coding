
import java.io.Serializable;

public class Employee implements Serializable {
    private String emailId;
    private String name;
    private double salary;
    private String designation;
    private String department;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String emailId, String name, double salary, String designation, String department) {
        this.emailId = emailId;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
    }

    // Getters and Setters
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString method for printing employee details
    @Override
    public String toString() {
        return "Employee [emailId=" + emailId + ", name=" + name + ", salary=" + salary +
                ", designation=" + designation + ", department=" + department + "]";
    }


    public static void main(String[] args) {
            // Create Employee object using default constructor
            Employee emp1 = new Employee();
            emp1.setEmailId("rohan@123.com");
            emp1.setName("Rohan Singh");
            emp1.setSalary(50000);
            emp1.setDesignation("Software Engineer");
            emp1.setDepartment("IT");
    
            // Create Employee object using parameterized constructor
            Employee emp2 = new Employee("Rani456@example.com", "Rani singh", 60000, "Project Manager", "Operations");
    
            // Print employee details
            System.out.println("Employee 1: " + emp1);
            System.out.println("Employee 2: " + emp2);
    }
}
   

