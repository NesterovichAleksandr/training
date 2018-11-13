package oop.inheritance.i3;

abstract class A {

    static {
        System.out.println("Статический блок класса A");
    }

    {
        System.out.println("Блок класса А");
    }

    private String a = "Поле класса А";

    A() {
        System.out.println("Конструктор класса А");
    }

    abstract void method();

    void getField() {
        System.out.println(a);
    }
}
