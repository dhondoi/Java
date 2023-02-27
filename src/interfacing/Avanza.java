package interfacing;

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
