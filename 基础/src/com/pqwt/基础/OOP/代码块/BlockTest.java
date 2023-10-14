package com.pqwt.基础.OOP.代码块;

//类的成员之四：代码块(初始化块）
public class BlockTest {
    public static void main(String[] args) {
        String desc=Person.desc;
        Person p1=new Person();

    }
}


class Person{
    String name;
    int age;

    static String desc="我是一个人";

    public Person(){

    }

    public Person(String name,int age){
        this.age=age;
        this.name=name;


    }

    //代码块,一对大块号里的就是

    //1、静态代码块
    //静态的方法属性会随着类的加载而加载
    static {
        System.out.println("静态代码块");
        desc="我哎学习";
    }

    //2、非静态代码块
    {
        System.out.println("非静态代码块");
    }

    public void eat(){
        System.out.println("eat");
    }
    @Override
    public String toString(){
        return "Person [name="+name+",age="+age+"]";
    }

    public static void info(){
        System.out.println("我是一个快乐的的人");
    }
}
