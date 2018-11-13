package oop.inheritance.i3;

class C extends B {

    static {
        System.out.println("Статический блок класса C");
    }

    {
        System.out.println("Блок класса C");
    }

    private String c = "Поле класса C";

    C() {
        System.out.println("Конструктор класса С");
    }

//    void method() {
//        System.out.println("Метод класса С");
//    }

    void getField() {
        System.out.println(c);
    }
}
