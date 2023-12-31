package com.pqwt.OPP.Inheritance;
/*
override/overwrite重写：在子类中对来自父类的方法进行改造，也成为重置、覆盖

一、要求
1、子类重写的方法必须和父类被重写的方法有相同的方法名称，参数列表
2、子类重写的方法的返回值的类型必须不能大于（小于等于）父类对应的返回值
    1：父类返回值类型是void，子类重写只能是void
    2：父类返回值类型是A类，子类重写的只能是A类或者A类的子类
3、子类重写的方法的权限不能小于（大于等于）父类被重写的方法的访问权限
4、子类重写的方法抛出的异常不大于父类被重写的类型（小于等于）
5、重写后，通过子类对象调用父类中同名同参数的方法时，执行的子类重写后的方法

ps:
1、子类和父类同名同参数的方法要么同时声明为非static或者同为static（加上static就不是重写了）

二：super
1、super可以用来调用：属性、方法、构造器和this有点像
2、子类中和父类同名的属性是不会被覆盖掉的
3、在子类中用super.a 是调用父类中的a，this.a是调用子类的a
4、在子类构造器super调用父类中的构造器:super（父类中对应的参数列表），但改句子必须写道子类构造器的首行,所以我们在类的构造器中this（形参列表）和super（形参列表）只能二选一
在子类构造器的首行，如果没有显示的声明this（形参列表）或super（形参列表）则默认使用super（）-->没有参数
5、在子类的构造器中，至少有一个类的构造器中使用了“super（形参列表）”调用父类中的构造器

三、子类对象实例化的过程
1、从结果上来看：（继承型）
    子类继承父类后，就会获取父类中声明的属性和方法
    创建的子类对象，在堆的空间中，就会加载所有父类中的声明的属性

2、从过程上来看：
        当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类构造器，进而调用父类的父类
        的构造器，知道调用到Java.lang.Object

        声明：虽然调用的父类的构造器，但只是自始至终只创建了new的那一个对象

* */
public class Overwrite {


}
