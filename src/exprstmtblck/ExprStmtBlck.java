package exprstmtblck;

public class ExprStmtBlck {

    public static void main(String[] args) {
        // Expression, Statement, dan Block
        
        // Expression adalah 
        /* konstruksi dari variabel, operator, dan
         pemanggilan method
         yang mengevaluasi menjadi sebuah
         single value.*/
        /*core component dari statement*/
        int value; //expression
        
        // Statement adalah
        /*kalimat lengkap dalam bahasa*/
        // jenis statement :
        // - assignment statement
        int value1 = 1;
        // - penggunaan ++ dan --
        value1++;
        // - method invocation
        System.out.println(value1);
        // - object creation expression
        value1 = new Integer(value1);
        
        // Block adalah kumpulan statement
        // yang didalam {}
    }
}
