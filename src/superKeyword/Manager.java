package superKeyword;

class Manager extends Employee {

    // method overriding
    void sayHello(String name) {
        /**
         * untuk mengakses method yang terdapat dalam kelas parent
         * yang sudah terlanjur di override
         * gunakan gunakan kata kunci "super"
         */
        super.sayHello(name);
        
        System.out.println("My name is Manager " + name);
    }
}
