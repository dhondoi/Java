package kelas;

public class Main {

    public static void main(String[] args) {

        // membuat objek
        var person = new Person();
        Person person1 = new Person();
        Person person2;
        person2 = new Person();

        // manipulasi field
        person.name = "Andi";
        person.address = "Bandung";
        // person.country = "Amerika"; // error cause "final" keyword

        // akses method
        person.sayHello("Budi");
    }
}
