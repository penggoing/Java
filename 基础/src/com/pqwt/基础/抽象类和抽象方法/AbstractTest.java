package com.pqwt.基础.抽象类和抽象方法;
/*
abstract 关键字的使用
1、可以修饰类、方法

2、修饰类：
    >抽象类，被修饰后不能实例化
    >抽象类中仍然有构造器，便于子类对象实例化的时候使用
    >开放中都会提共抽象类的子类，让子类实例化


3、abstract修饰方法：抽象方法
    >抽象方法只有方法的声明，没有方法体
    >包含抽象方法的类一定是抽像类
    >类时抽象类里面可以没有抽象方法
    >子类只有重写了父类中的抽象方法之后才可以实例化
 */


public class AbstractTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();
    }
}


class Person{
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void eat(){
        System.out.println("eat"  );
    }

    public void walk(){
        System.out.println("walk");
    }

}



 class  Student extends Person{

 }
