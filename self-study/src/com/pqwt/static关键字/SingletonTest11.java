//设计模式像棋谱一样是一种“套路”
//单例设计模式是指某个类只能存在一个对象实例

package com.pqwt.static关键字;

public class SingletonTest11{

    public static void main(String[] args){
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();
        System.out.println(bank1==bank2);

    }

}



//饿汉式
class Bank{

    //1、私有化类的构造器
    private Bank(){
    }
    //2、内部创建类的对象
    //4、静态方法只能调用静态的变量，所以要设计成静态的
    private static Bank instance = new Bank();

    //3、提供公共静态的的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}