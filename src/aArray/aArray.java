package aArray;

public class aArray {

    public static void main(String[] args) {
        // array adalah kumpulan data dari tipe data yang sama
        String[] strings = new String[3];
        strings[0] = "data 1"; // mengubah data di array
        strings[1] = "data 2";
        strings[2] = "data 3";
        //strings[3] = "data 4"; <- error
        System.out.println(strings[1]); // mengambil data di array
        // cara array initializer
        String[] strings1 = new String[]{"data 1", "data 2", "data 3"};
        //String[] strings2 = new String[3]{"data 1","data 2","data 3"}; -> illegal
        System.out.println(strings1.length); // panjang array
        // array multi dimensi
        String[][] stringses = {
            {"data 1-1","data 1-2","data 1-3"},
            {"data 2-1","data 2-2","data 2-3"},
            {"data 3-1","data 3-2","data 3-3"}
        };
        System.out.println(stringses[1][1]);
        // System.out.println(stringses[3][3]); -> error
    }
}
