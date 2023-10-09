package com.pqwt.basics;
/*
    从键盘获取不同类型的变量，需要使用Scanner类

    具体步骤：
    1.导包：import java.util.Scanner;
    2.Scanner的实例化：Scanner scan=new Scanner(System.in);
    3.调用Scanner类的相关方法，来获取指定类型的变量：int num= scan.nextInt();

 */

import  java.util.Scanner;

class ScannerTest{
    public static void main(String[] args)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int num=scan.nextInt();
            /* 输入整型 */
            System.out.println("num="+num);
            /* 输入字符串 */
            String st=scan.next();
            System.out.println("st="+st);
            //对于char的获取，Scanner没有提供相关方法，只能以获取字符串的方法来获.下面是个特殊方取字符法
            String gender=scan.next();
            char genderChar=gender.charAt(0);
            System.out.println("gender"+genderChar);
        }

    }
}