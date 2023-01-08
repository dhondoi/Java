package switchStmt;

public class SwitchStatement {

    public static void main(String[] args) {
        var nilai = "A";
        // mirip dengan if, namun hanya untuk membandingkan ==
        switch (nilai) {
            case "A":
                System.out.println("Lulus Dengan Sangat Baik");
                break;
            case "B":
                System.out.println("Lulus Dengan Baik");
                break;
            case "C":
            case "D":
                System.out.println("Lulus");
                break;
            default:
                System.out.println("Tidak Lulus");
        }

        // Switch Lambda (Java V.14)
//        switch (nilai) {
//            case "A" ->
//                System.out.println("Lulus dengan sangat baik");
//            case "B","C" ->
//                System.out.println("Lulus");
//            case "D" ->
//                System.out.println("Tidak Lulus");
//            default ->
//                System.out.println("Salah Jurusan");
//        }
        System.out.println("");
// menggunakan kata kunci yield (Java V.14)
        //        String ucapan = switch (nilai) {
        //            case "A":
        //                yield "Lulus dengan sangat baik";
        //            case "B","C":
        //                yield "Lulus";
        //            case "D":
        //                yield "Tidak Lulus";
        //            default:
        //                yield "Salah Jurusan";
        //        };
    }
}
