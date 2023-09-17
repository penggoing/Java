package com.pqwt.OPP.Inheritance;
/*
* 继承的格式：class a extends b
* a:子类、派生类、subclass
* b:父类、超类、基类、superclass
* ps：
* 1、子类也会继承父类中的private，但由于封装性的影响，不能直接调用，但可以使用set、get函数来使用
* 2、一个类可以被多个子类继承但是一个类只能有一个父类（子类的唯一的一个父类也有唯一一个父类也是可以的）
* 3、如股我们没有显示的声明一个父类的话，则此类继承于java.lang.Object类
* 4、所有的Java类（除了java.lang.Object类）都直接或间接继承于java.lang.Object类
*
* */


public class ExtendsTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=1;
        p1.eat();

        Student s1=new Student();
        s1.eat();
        s1.sleep();
    }
}
