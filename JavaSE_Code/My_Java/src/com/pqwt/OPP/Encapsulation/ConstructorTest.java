package com.pqwt.OPP.Encapsulation;
/*
* 构造器（或构造方法、constructor）和c++中构造函数相似
* 一、构造器的作用
* 创建对象
* 初始化对象的属性
*
*二、说明
* 如果没有显示的定义一个构造器的话，系统会默认提供一个空的构造器
*定义构造器的格式：权限修饰符  类名（形参类表）{}
* 一个类中可以定义多个构造器，彼此构成重载
* 一旦定义了一个构造器，之后系统不再提供空参的构造器了
*
*
*
*
* */
public class ConstructorTest {
    public static void main(String[] args) {
        Person p=new Person();//-->Person()是构造器

        p.eat();
    }
}

class Person{
    //attributes
    int age;
    String name;

    //constructor
    public Person(){
        System.out.println("Person()....");
    }

    public Person(String name){
        this.name=name;
    }


    //Methods
    public void eat(){
        System.out.println("eat");

    }
    public void sleep(){
        System.out.println("sleep");
    }

}