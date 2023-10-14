package com.pqwt.基础.接口;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s=new SubClass();
        //s.method1();-->接口中定义的静态方法只能通过接口来调用
        ComputerA.method1();
    }
}


class SubClass implements ComputerA{

}