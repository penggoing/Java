package com.pqwt.基础;

class VariableTest1{
    public static  void main(String[] args){


        //自动类型提升
        //当容量小的数据类型与容量大的数据类型的变量做运算时，结果自动提升为容量大的（容量大的是指表示数的范围的大小

        //   byte/char/short-->int-->long-->float-->double 特别的：当byte/char/short三者相互做运算时，转化为int型


        //强制类型转换   字节大的加到字节小的要强制类型转换，有时会造成精度损失


        byte b1=2;
        int i1=12;
        byte b2= (byte) (b1+i1);
        System.out.println(b2);
        int i2=b1+i1;
        System.out.println(i2);

        float f=b1+i1;
        System.out.println(f);



    }
}