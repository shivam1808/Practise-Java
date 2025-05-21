package com.example.practice;

interface ParentInterface {

    String name = "Parent Interface";

    void method();
}

abstract class ParentClass {

    protected String name = "Parent Class";

    public ParentClass(String name) {
        this.name = name;
        System.out.println("Parent Class Constructor");
    }

    abstract void method();

    void method2() {
        System.out.println("Parent Class Method 2");
    }
}

public class MultipleInheritance extends ParentClass implements ParentInterface {

    public MultipleInheritance(String name) {
        super(name);
        System.out.println("Multiple Inheritance Constructor");
    }

    @Override
    public void method() {
        System.out.println("Multiple Inheritance");
    }

    @Override
    void method2() {
        super.method2();
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance("Name");
        mi.method();
        mi.method2();

        ParentClass pc = new MultipleInheritance("Name");
        System.out.println("pc.name = " + pc.name);

        ParentInterface pi = new MultipleInheritance("Name");
        System.out.println("pi.name = " + pi.name);

        /*
            Fields inside Interface are by default static so can be accessed
            directly using the Interface name.
        */
        System.out.println("pi.name = " + ParentInterface.name);
    }

}
