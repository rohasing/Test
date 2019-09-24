package com.gspl.jobs.controller.json;


public class TestInheritence extends B implements D, E {

    public TestInheritence(int x, int y) {
        super(x, y);
    }

    static void run() {
        System.out.println("hi from A");
    }

    public static void main(String[] args) {
        TestInheritence hello = new TestInheritence(1, 2);
        run();
        B.run();
        C.run();
        int z = hello.x;
        int q = hello.y;
        System.out.println(z);
        System.out.println(q);
    }

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

    @Override
    public void E() {

    }

    @Override
    public void F() {

    }
}

class B extends C {

    int x;
    int y;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void run() {
        System.out.println("hi from B");
    }

}

class C {
    static void run() {
        System.out.println("hi from D");
    }
}

interface D {

    void A();

    void B();

}

interface E {
    void E();

    void F();
}



