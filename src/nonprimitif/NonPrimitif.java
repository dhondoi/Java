package nonprimitif;

public class NonPrimitif {

    public static void main(String[] args) {
        // tipe data non primitif default datanya null
        Integer iniInteger = 100;
        Long iniLong = 100L;
        Byte iniByte = null;
        // konversi dari non-primitif
        long iniLong1 = iniLong.longValue();
        // konversi dari primitif
        iniLong = iniLong1;
    }
}
