package com.pqwt.基础.接口;

// 如何定义接口：
//     JKDK 7及其以前：只能定义全局变量和抽象方法
//         >全局常量:public static final 的，但是书写时可以不写，但仍然存在
//         >抽象方法：public abstract

//     JDK 8：除了7的特性还可以定义静态方法、默认方法
//接口中不能定义构造器！意味着接口不能实例化

//Java开发中接口通过让类去实现的方法来使用
    //如果实现类覆盖了接口中的所有抽象方法，则实现类就可以实例化，没都覆盖则实现类让然是一个抽象类
     

//Java类可以实现多个接口，弥补了Java单继承的局限性
//接口可以继承多个接口
public class InterfanceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);    
          
     }
}

interface Flyable{
    public static final int MAX_SPEED=7900;
    int MIN_SPEED=1;//public static final 的，但是书写时可以不写，但仍然存在
    public abstract void fly();
    void stop();//public static final 的，但是书写时可以不写，但仍然存在


   
}

interface AA{
    void method1();
}

interface BB{
    void method2();
}

interface CC extends AA,BB{
    
}

interface Attack{
    public abstract void attack();
}



class Plane implements Flyable{
    public void fly(){
        System.out.println("fly");
    }

    public void stop(){
        System.out.println("stop");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {
        
    }

    

}

//一个类继承多个接口(要是需要继承父类的话，一个先继承父类，再继承接口)
class Bullet  extends Object implements Flyable,Attack{
 
    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stop'");
    }
    
}
