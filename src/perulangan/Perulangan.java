package perulangan;

public class Perulangan {

    public static void main(String[] args) {
        // FOR merupakan salah satu kunci untuk melakukan perulangan
        System.out.println("Perulnagan FOR");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        // WHILE versi perulangan lebih sederhana dibanding for
        System.out.println("Perulnagan WHILE");
        var counter = 1;
        while (counter <= 5) {
            System.out.println("Perulangan ke-" + counter++);
        }
        // DO WHILE mirip dengan while namun dijalankan perulangan sekali
        System.out.println("Perulnagan DO WHILE");
        counter = 1;
        do {
            System.out.println("Perulangan ke-" + counter++);
        } while (counter <= 5);
        // BREAK dan CONTINUE
        // BREAK untuk menghentikan perulangan
        System.out.println("BREAK");
        counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter++);
            if (counter > 10) {
                break;
            }
        }
        // CONTINUE untuk melanjutkan perulangan selanjutnya
        System.out.println("CONTINUE");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil = " + i);
        }
        // FOR EACH
        // biasanya mengakses data array menggunakan perulangan
        // for each untuk melakukan perulangan pada array
        System.out.println("FOR EACH");
        String[] namas = {"Nama A","Nama B","Nama C","Nama D","Nama E"};
        for(var nama : namas){
            System.out.println(nama);
        }
    }
}
