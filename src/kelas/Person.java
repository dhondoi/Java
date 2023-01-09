package kelas;

// membuat kelas
class Person {

    // membuat fields/properties/attributes
    String name;
    String address;
    String religion;
    final String country = "indonesia";

    // membuat method
    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + " My Name Is " + name);
    }

    // membuat constructor
    Person() {
    }

    // constructor overloading
    Person(String paramName) {
        name = paramName;
    }

    // constructor overloading
    Person(String paramName, String paramAddress) {
        this(paramName);
        address = paramAddress;
    }

    // constructor overloading
    Person(String paramName, String paramAddress, String religion) {
        this(paramName, paramAddress);
        // variable shadowing
        religion = religion; // asignment itself
        // solve with "this" keyword
        this.religion = religion;
    }
}
