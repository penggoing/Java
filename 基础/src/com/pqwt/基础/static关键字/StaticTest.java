package com.pqwt.基础.static关键字;

/*
 * static修饰的变量在内存中只有一份
 */
public class StaticTest {
    public static void main(String[] args){
        Chinses c1=new Chinses();
        c1.name="li hua";
        c1.age=20;

        Chinses c2=new Chinses();
        c2.age=22;
        c2.name="xiao ming";

        //类Chinses中nation是静态变量，在内存中只有一份
        c1.nation="CHN";

        System.out.println(c2.nation);
    }
}

//中国人
class Chinses{
    String name;
    int age;
    static String nation;

}