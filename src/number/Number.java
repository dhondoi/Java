package number;

public class Number {

    public static void main(String[] args) {
        // tipe data number
        byte b = 100;
        short s = 1000;
        int i = 10000;
        long l = 100000L;
        // tipe data floating number
        float f = 10.12F;
        double d = 12.2424;
        // literals
        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b01010101;
        // underscore
        int underInt = 1_000;
        // konversi (widening casting)
        d = f;
        f = l;
        l = i;
        i = s;
        s = b;
        // konversi (narrowing casting)
        b = (byte) s;
        s = (short) i;
        i = (int) l;
        l = (long) f;
        f = (float) d;
    }

}
