package com.pqwt.基础.包装类;

public class Intege_r {
    public static void main(String[] args) {
    //    int num=10;
    //    Integer num1 = Integer.valueOf(num);//新版本的jdk不再支持Integer obj=new Integer(null)
    //    Float f1=Float.valueOf(12.3f);
    //    System.out.println(f1);
    //    Boolean b1=Boolean.valueOf(true);


    //    //包装类转化成基本数据类型
    //    Integer n1=Integer.valueOf(12);
    //    int in1=n1.intValue();
    //    System.out.println(in1);
    test01();

    

    }
    public static void test01(){
        int num1=10;
        
        //自动装箱：基本数据类型-->包装类的对象。把基本数据类型直接赋值给包装类
        method(num1);

        //自动拆箱：包装类-->基本数据类型。把包装类的对象直接赋值给基本数据类型
          
         
    }
    public static void test02(){
        //基本数据类型、包装类-->String类型
        int num1=10;
        //自动装包
        //方法一：自动类型转换 
        String str1=num1+"";

        //方法二：调用String重载的valueOf（Xxx xxx）
        float f1=12.3f;
        String str2=String.valueOf(f1);
        System.out.println(str2);

        //自动拆包:String类型-->基本数据类型、包装类：调用包装类的parseXxx
        //非子父类的不能进行强制类型转换。如Integer in1=(Integer)str2;其中str2是string类型，和Integer并没有子父类的关系
        int num2=Integer.parseInt(str2);
        
        

    }
    public static void method(Object obj){
        System.out.println(obj);
    }
}
