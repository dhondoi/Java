# SUPER CONSTRUCTOR
```java
package superConstructor;

class Employee {

    String name;
    
    // membuat constructor
    Employee(String name) {
        this.name = name;
    }

}

/**
 * Class Manager error
 * karena Employee memilki contructor.
 * jadi, harus dibuat constructor di Class Manager.
 * ini merupakan konsep Super Contructor
 */
class Manager extends Employee {    

    public Manager(String name) {
        super(name);
    }
}

public class Main {

    public static void main(String[] args) {
        new Manager("Michael");
    }
}

```