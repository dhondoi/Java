package methodOverriding;

public class Main {

    public static void main(String[] args) {
        
        /**
         * method overriding merupakan teknik
         * yang memaksa metode dari kelas parent
         * dibuat kembali di kelas child
         */
        new Employee().sayHello("Michael");
        new Manager().sayHello("Michael");
    }
}
