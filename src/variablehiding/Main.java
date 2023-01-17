package variablehiding;

public class Main {

    public static void main(String[] args) {
        /**
         * variable hiding merupakan masalah yang terjadi
         * ketika kita membuat nama field sama di class child
         * dengan nama field di class parent
         */
        Child child = new Child();
        // simpan ke data member class Child
        child.name = "Adi";
        // panggil method dari class Child
        child.doIt(); // Do It from child
        // coba tampilkan data member
        System.out.println(child.name); // Adi
        
        // membuat objek Parent dari child
        Parent parent = child;
        /**
         * mengambil method dari class Child
         * karena terkena konsep method overriding
         */
        parent.doIt(); // Do It from child
        // tampilkan data member
        System.out.println(parent.name); // null
        /**
         * kenapa data member bisa null?
         * ini karena data member yang diambil
         * merupakan dari class Parent
         * walaupun objek yang dibuat dari class Child
         * istilah inilah yang disebut variable hiding
         */
    }
}
