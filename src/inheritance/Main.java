package inheritance;

public class Main {
    
    public static void main(String[] args) {
        // creating object Employee
        Employee employee = new Employee();
        // assign value
        employee.name = "Harris";
        // try call method sayHello
        employee.sayHello("Michael");
        /**
         * code above works fine
         * let's add class Manager
         */
        
        // creating object Manager
        Manager manager = new Manager();
        // assign value
        manager.name = "Harris";
        // try call method sayHello
        manager.sayHello("Michael");
        /**
         * Manager class
         * have not syntax code inside block code
         * but have "field" and method?
         * cause Manager is child from Employee.
         * then can we call it "INHERITANCE"
         */
    }
}
