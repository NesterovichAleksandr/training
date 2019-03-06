package oop.inheritance.i4;

public abstract class Parent {

    private final int anInt;

    public Parent(int anInt) {
        this.anInt = anInt;
    }


    public int getAnInt() {
        return anInt;
    }

    abstract void method();

    void printNameClass(){
        System.out.println(getClass().getName());
    }
}

