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
