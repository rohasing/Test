package com.gspl.jobs.controller.json;


public class TestAbstract {

    int x;
    int y;
    int z;

    public TestAbstract(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public TestAbstract(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract static class A {
        abstract void area(int area, int calculate, int salary);
        abstract void square();
    }

    public static void main(String[] args) {

        A cube = new A() {
            @Override
            void area(int area, int calculate, int salary) {
                int calcul = area+ calculate +salary;
                int x = hello();
                TestAbstract object = new TestAbstract(calcul,x,calcul);
                System.out.println(object.x+" "+object.y+" "+object.z);

            }
            @Override
            void square() {
//                TestAbstract object = new TestAbstract(1,2);
//                int s = object.x*object.y;
//                System.out.println(s);
            }
            public int hello(){
                return 5;
            }
        };

        cube.area(5,6,7);

        A rectangle = new A() {
            @Override
            void area(int area, int calculate, int salary){}
            @Override
            void square() {
                TestAbstract object = new TestAbstract(4,5);
                int s = object.x*object.y;
                System.out.println(s);
            }
        };
        rectangle.square();

    }
}




