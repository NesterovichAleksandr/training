package oop.inheritance.i4;

public class Child extends Parent{


    public Child(int anInt) {
        super(anInt);
    }

    @Override
    void method() {
        System.out.println("this Override method");
    }

    void printNameClass(){
        System.out.println(getClass().getName());
    }

    public void printFieldAnInt(){
        System.out.println("FieldAnInt = " + getAnInt());
    }
}
