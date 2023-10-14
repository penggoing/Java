package com.pqwt.基础.接口;
/*
2023/10/12

Java8新特性：
        >除了定义全局变量和抽象方法之外，还可以第一静态方法、默认方法

        
知识点：接口中定义的静态方法只能通过接口来调用
        如果子类继承的父类和接口中声明了同名同参数的方法，子类在调用时调用的是父类中的方法
        如果实现类实现了多个接口，而这多个类中定义了同名同参数的方法，没重写的话会报错

 * 
 * 
 * 
 * 
 */
public class Java8新特性 {
    public static void main(String[] args) {
        
    }
}

interface ComputerA{//Computer 被SubClassTest中的SubClass 继承
    
    
    //静态方法
    public static void method1(){
        System.out.println("fa 1");
    }

    //默认方法
    public default void method2(){
        System.out.println("fa 2");
    }

    default void method3(){
        System.out.println("fa 3");
    }

}
