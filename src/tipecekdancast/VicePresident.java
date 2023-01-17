package tipecekdancast;

class VicePresident extends Manager {

    VicePresident(String name) {
        super(name);
    }
    
    void sayVicePresident() {
        System.out.println("Hello Vice President " + name);
    }
}
