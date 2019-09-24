package com.gspl.jobs.controller.json;

import java.util.Scanner;

public class Test {

    int x;
    int y;
    int z;
    final String abc;

    public Test(String abc) {
        this.abc = abc;
    }

//    public Test(int x) {
//        this.x = x;
//    }
//
//    public Test(int y) {
//        this.y = y;
//    }
//
//    public Test() {
//    }

    void cool() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("end");
    }

    public static void main(String[] args) {
//        B.C arnav = new B.C();
        hello();
//        B.C.foo();
    }

    public static void hello() {
//            System.out.println("hello");
        System.out.print("please enter input: ");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        Test object = new Test(username);
        //new Test(11);
//            Test objectTwo = new Test();
//            object.cool();
//            objectTwo.cool();
        System.out.println(object);
        in.close();
//            System.out.println(objectTwo);
    }

    static class B {


        static class C {

            static void foo() {
                System.out.println("hi");
            }
        }
    }


    @Override
    public String toString() {
        return "Test{" +
                "abc='" + abc + '\'' +
                '}';
    }
}




