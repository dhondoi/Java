package metode;

public class Metode {

    public static void main(String[] args) {
        // coba panggil method
        sayHello();
        say("Say with param");
        say("Say with different param");
        say();
        System.out.println(getString());
        sayCongrat("Aida", new int[]{90, 70, 75});
        sayCongrat("Banu", 50, 50, 50);
        System.out.println("Hasil Dari Recursive Method = " + factorial(5));
//        loop(10000); // error stack overflow
        sayHello("");
    }

    // Method adalah block kode program yang akan berjalan saat dipanggil
    // basic method
    static void sayHello() {
        System.out.println("Hello!");
    }

    // basic method parameter
    static void say(String text) {
        System.out.println(text);
    }

    // basic method overloading dari method say
    static void say() {
        System.out.println("Dari Method Overloading");
    }

    // basic method return value
    static String getString() {
        return "Mengembalikan nilai string";
    }

    // basic method variable argument
    static void sayCongrat(String name, int... values) {
        var total = 0;
        for (int value : values) {
            total += value;
        }
        total /= values.length;
        if (total >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus Dengan Nilai " + total);
        } else {
            System.out.println("Ma'af " + name + " Anda Tidak Lulus Dengan Nilai " + total);
        }
    }

    // recursive method
    static int factorial(int value) {
        return value == 1 ? 1 : value * factorial(--value);
    }

    // hati-hati dalam menggunakan recursive method
    // karena bisa terjadi stack overflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value--);
            loop(value);
        }
    }

    // scope
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
//            System.out.println(hello); // ok
        }
        System.out.println(hello); // ok
//        System.out.println(hi); // error
    }

}
