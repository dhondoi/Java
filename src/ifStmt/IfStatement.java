package ifStmt;

public class IfStatement {

    public static void main(String[] args) {
        var nilai = 78;
        var absen = 90;
        // If Statement
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        }
        // if else
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }
        // If else if Statement
        if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai : A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai : B");
        } else {
            System.out.println("Nilai : C");
        }
    }
}
