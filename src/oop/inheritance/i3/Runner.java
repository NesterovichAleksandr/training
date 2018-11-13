package oop.inheritance.i3;

public class Runner {

    public static void main(String[] args) {
        A obj = new C();
        obj.getField();
        obj.method();
        B objB = new B();
        objB.getField();
        objB.method();

        /*
        * Результат вывода в консоль:
        *
        * Статический блок класса A
        * Статический блок класса B
        * Статический блок класса C
        * Блок класса А
        * Конструктор класса А
        * Блок класса В
        * Конструктор класса В
        * Блок класса C
        * Конструктор класса С
        * Поле класса C
        * Переопределённый метод класса В
        * Блок класса А
        * Конструктор класса А
        * Блок класса В
        * Конструктор класса В
        * Поле класса B
        * Переопределённый метод класса В
         */

    }
}
