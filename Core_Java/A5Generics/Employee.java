// Generic: Q1

package A5Generics;
public class Employee {
    int id;
    String name;
    double salary;
    String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    void displayDetails() {
        System.out.println("ID: " + id + "      Name: " + name + "     Salary: " + salary + "       Department: " + department);
    }

}
