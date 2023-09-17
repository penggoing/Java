package com.pqwt.OPP.Inheritance;

public class Person {
    String name;
    public int age;

    public Person(){

    }

    public Person(String name,int age){
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
