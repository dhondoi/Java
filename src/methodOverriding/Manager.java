package methodOverriding;

class Manager extends Employee {

    // method overriding
    void sayHello(String name) {
        System.out.println("My name is Manager " + name);
    }
}
