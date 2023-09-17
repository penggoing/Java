package com.pqwt.OPP.Polymorphism;

import com.pqwt.OPP.Inheritance.Person;
import com.pqwt.OPP.Inheritance.Student;

/*
*1、 理解多态性：一个事物的多种形态
*2、何为多态性:父类的引用指向子类的对象(子类的对象，付给父类的引用）
*
*3、多态的所有：
*       1、当用子父类同名的方法时，执行的时子类重写父类的方法
*       2、不能调用子类特有的方法
*       3、在编译期间，只能调用父类中声明的方法，在运行期间我们执行的是子类重写父类的方法
*
* */
public class Polymorphism {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();

        Student s1=new Student();
        s1.age=12;

        //多态性(下面一行就是）:父类的引用指向子类的对象
        Person p2=new Student();
        p2.eat();
    }
}
