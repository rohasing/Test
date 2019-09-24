package com.gspl.jobs.controller.json;


public class TestEncapsulation {

    private int salary;
    private int bonus;
    private int variable;

    public TestEncapsulation(int salary, int bonus, int variable) {
        this.salary = salary;
        this.bonus = bonus;
        this.variable = variable;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "TestEncapsulation{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", variable=" + variable +
                '}';
    }
}


class B {
    public static void main(String[] args) {
        TestEncapsulation object = new TestEncapsulation(1000, 10, 15);
//        object.salary;
//        object.bonus;
//        object.variable;
        object.getSalary();
        object.getBonus();
        object.getVariable();

//        object.setBonus(15);
        System.out.println(object);
    }
}