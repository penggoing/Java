package com.pqwt.OPP.Polymorphism;

public class Person {
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;

    }

    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep"  );
    }
}
