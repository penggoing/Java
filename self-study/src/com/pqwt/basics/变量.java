package com.pqwt.basics;

class VariableTest{
    public static void main(String[] args)
    {
        int myage=12;
        System.out.println(myage);
        //byte范围：-128~127,大小为一个字节
        byte b1=-2;
        System.out.println(b1);

        //声明long型变量必须以“l”或“L”结尾,不加时编译器会认为是int型
        long l1=23223L;
        System.out.println(l1);

        //浮点型float(4字节,-3.403E38~3.403E38),double(8个字节-1.798E308~1.798E3-8),声明float型变量后面须要加f或F，不加编译失败，浮点型默认为是double
        float f1=3.14f;
        System.out.println(f1);

        //char (1字节),声明时用一对'',内部只能写一个字符（一个字母/数字/汉字/转义字符/只能是一个字符）

        //boolean 只能取true和false两个值

        boolean b00l1=true;
        System.out.println(b1);

    }
}