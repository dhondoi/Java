package superConstructor;

/**
 * Class Manager error
 * karena Employee memilki contructor terdapat parameter.
 * jadi, harus dibuat constructor di Class Manager.
 * ini merupakan konsep Super Contructor
 */
class Manager extends Employee {    

    public Manager(String name) {
        super(name);
    }
}
