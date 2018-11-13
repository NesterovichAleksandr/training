package oop.inheritance.i3;

class B extends A {

    static {
        System.out.println("Статический блок класса B");
    }

    {
        System.out.println("Блок класса В");
    }

    private String b = "Поле класса B";

    B() {
        System.out.println("Конструктор класса В");
    }

    @Override
    void method() {
        System.out.println("Переопределённый метод класса В");
    }

    void getField() {
        System.out.println(b);
    }
}
