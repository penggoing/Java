package com.pqwt.OPP.Encapsulation;


/*
 * 所谓的javaBean是满足以下特点的类：
 * 1.类是公共的
 * 2.有一个无参的公共构造器
 * 3.有属性，且有对应的get和set方法
 *
 * */


public class Customer {
    private int id;
    private String name;
    public Customer(){

    }

    public void setId(int i){
        id=i;
    }

    public  int getId(){
        return id;
    }


}
