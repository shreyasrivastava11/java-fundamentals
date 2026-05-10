/* Encapsulation is the process of binding data members (variables) and methods together into a single unit (class) while restricting direct access to data using private access modifiers. 
The data can only be accessed or modified through controlled public methods like getters and setters. */


cclass Employee {

    // ================= PRIVATE =================
    // Accessible only inside same class
    private int salary;

    // Private method
    private void setSalary(int salary) {

        if (salary > 0) {
            this.salary = salary;
        }
    }

    // ================= PROTECTED =================
    // Accessible inside same package + child classes
    protected void updateSalary(int salary) {

        // calling private method inside same class
        setSalary(salary);

        System.out.println("Salary Updated");
    }

    // ================= PUBLIC =================
    // Accessible from everywhere
    public int getSalary() {
        return salary;
    }
}


// Child class
class Manager extends Employee {

    void manageEmployee() {

        // accessing protected method
        updateSalary(70000);
    }
}


public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();

        // accessing protected method through child class method
        manager.manageEmployee();

        // accessing public method
        System.out.println("Salary: " + manager.getSalary());

        // ================= NOT ALLOWED =================

        // manager.salary = 50000;
        // salary is private

        // manager.setSalary(50000);
        // private method

        // manager.updateSalary(50000);
        // protected method not directly accessible here
    }
}