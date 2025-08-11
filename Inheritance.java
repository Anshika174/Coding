public class Inheritance {
    public static void main(String args[]){
    Employee emp1=new Employee("Joey Doe",30,"E12345","Software Engineer");
    emp1.displayEmployeeInfo();
    }
}
class Person{
    String name;
    int age;
    Person(String n,int ag){
        this.name=n;
        this.age=ag;
    }
    public void displayInfo(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
class Employee extends Person{
    String emp_id;
    String designation;
    
    Employee(String name,int age,String emp_id,
    String designation){
        super(name,age);
        this.emp_id=emp_id;
        this.designation=designation;
        

    }
    public void displayEmployeeInfo(){
        displayInfo();
        System.out.println("Employee ID: "+emp_id+
        "\nDesignation: "+designation);
    }
}
