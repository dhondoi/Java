package tipecekdancast;

public class Main {

    public static void main(String[] args) {
        sayHello(new VicePresident("Joko"));
        sayHello(new Manager("Abdul"));
        sayHello(new Employee("Saud"));
    }

    static void sayHello(Employee employee) {
        /**
         * untuk mengecek variable employee dari class berasal
         * gunakan "instanceof"
         */
        if (employee instanceof VicePresident) {
            System.out.println("Hello Vice President");
        } else if (employee instanceof Manager) {
            System.out.println("Hello Manager ");
        } else {
            System.out.println("Hello Employee ");
        }
    }
}
