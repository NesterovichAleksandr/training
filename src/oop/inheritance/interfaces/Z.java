package oop.inheritance.interfaces;

interface A {
    int x = 4;
}

interface B {
    int x = 43;
}

class Z implements A, B {

    public static void main(String[] argv) {

        System.out.println(A.x);

        System.out.println(B.x);

    }
}


