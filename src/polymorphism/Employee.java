package polymorphism;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayEmployee() {
        System.out.println("Hello Employee " + name);
    }

}
