# INTERFACE
```java
package interfacing;

/**
 *
 * interface mirip seperti abstract class namun semua method otomatis abstract.
 * interface tidak boleh memiliki field, hanya boleh memiliki constant.
 */
interface Car {

    void drive();

    int getTire();

    /**
     * Default method merupakan konkrit method bayangkan inteface kita sudah
     * banyak yang pakai kita ingin tambah method baru. bisa saja tambah, namun
     * yang menggunakan inteface kita harus ikut menambah method baru hadirlah
     * default method
     */
    default boolean isMaintenance() {
        return false;
    }

}

/**
 *
 * Mewariskan interface menggunakan kata kunci "implements"
 */
class Avanza implements Car {

    @Override
    public void drive() {
        System.out.println("Avanza Drive");
    }

    @Override
    public int getTire() {
        return 4;
    }

}

public class Main {

    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTire());
        System.out.println(car.isMaintenance());
    }
}

```