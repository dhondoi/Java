package oprMath;

public class MathOperate {

    public static void main(String[] args) {
        // operasi matematika
        int a = 100, b = 10;
        System.out.println("Basic");
        System.out.println(a + b); // penjumlahan
        System.out.println(a - b); // pengurangan
        System.out.println(a * b); // perkalian
        System.out.println(a / b); // pembagian
        System.out.println(a % b); // sisa bagi
        // augmented assignmments
        System.out.println("Augmented Assignments");
        System.out.println(a += b); // a = a + b
        // System.out.println(a+=b); <- menmpilkan hasil terakhir
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        // unary operator
        System.out.println("Unary Operator");
        System.out.println(a++); // sebelum operasi
        System.out.println(a);
        System.out.println(++a); // setelah operasi
        System.out.println(!true); // ! adalah kebalikan
        
    }
}
