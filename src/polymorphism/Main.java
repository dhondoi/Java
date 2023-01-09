package polymorphism;

public class Main {

    public static void main(String[] args) {
        /**
         * Polymorphism merupakan teknik banyak bentuk
         */

        // membuat object
        Employee employee = new Employee("Abdul");
        employee.sayEmployee();

        // membuat object dari Manager dengan tipe data Employee
        employee = new Manager("Michael");
        /**
         * kode dibawah error padahal ada method sayManager() pada class Manager
         */
        // employee.sayManager();

        // membuat object dari VicePresident dengan tipe data Employee
        employee = new VicePresident("Michael");
        /**
         * kode dibawah error padahal ada method sayVicePresident() pada class
         * VicePresident
         */
        // employee.sayVicePresident();

        /**
         * solusinya adalah memakai tipe data dari child paling akhir
         */
        VicePresident vp = new VicePresident("Michael");
        vp.sayVicePresident();
        vp.sayManager();
        vp.sayEmployee();

        // namun bakal error jika instansiasi Manager
        // vp = new Manager("Michael");
        // begitu juga dengan Employee
        // vp = new Employee("Michael");
        /**
         * Pada akhirnya gunakan tipe data Employee namun turunannya perlu
         * menggunakan teknik overriding atau Polymorphism pada parameter method
         * contoh :
         */
        sayHello(new Manager("Michael"));
        sayHello(new VicePresident("Michael"));
        /**
         * padahal method diatas tipe parameternya adalah Employee
         * itu;lah Polymorphism
         */
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
