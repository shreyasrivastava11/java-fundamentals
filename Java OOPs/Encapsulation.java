/* Encapsulation is the process of binding data members (variables) and methods together into a single unit (class) while restricting direct access to data using private access modifiers. 
The data can only be accessed or modified through controlled public methods like getters and setters. */


class Employee {

    // private variables (data hiding)
    private String name;
    private int salary;

    // public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {

        // validation
        if(salary > 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Invalid Salary");
        }
    }

    // public getter methods
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}


public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        // accessing data through methods
        emp.setName("Shreya");
        emp.setSalary(50000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}