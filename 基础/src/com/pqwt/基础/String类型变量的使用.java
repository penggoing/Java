package com.pqwt.基础;

class StringTest{
    //String属于引用数据类型
    //String可以和八种数据类型做运算，且只能做连接运算,运算的结果是String类型
    public static void main(String[] args){
        String s2="2200160210";
        String s3="学号：";
        String s4=s3+s2;//"+"连接运算
        System.out.println(s4);
    }
}