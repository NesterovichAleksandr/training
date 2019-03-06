package oop.inheritance.i4;

public class Main {

    public static void main(String[] args) {

        Parent p = new Child(1);
        p.method();
        p.printNameClass();
        ((Child) p).printFieldAnInt();

        Parent p2 = new Child(2);
        ((Child) p2).printFieldAnInt();

    }
}
