package abstarctClass;

public class Main {

    public static void main(String[] args) {
        /**
         * Abstract class merupakan konsep class
         * yang tidak bisa dibuat objek secara langsung class tersebut
         * hanya bisa diturunkan
         * biasanya digunakan sebagai kontrak untuk kelas child
         */
        // Product p = new Product(); // error : cannot instantiated
        Product p = new Product1(); // OK
    }
}
