package tipecekdancast;

class Manager extends Employee {

    Manager(String name) {
        super(name);
    }
    
    void sayManager() {
        System.out.println("Hello Manager " + name);
    }
}
