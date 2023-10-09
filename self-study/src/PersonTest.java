

//


public class PersonTest{
    public static void main(String[] args)
    {
        //创建person类的对象/实例化一个对象
        Person p1=new Person();
        //调用对象的结构
        p1.name="li hua";
        p1.isMale=true;
        

    }

}

class Person{
    //属性=成员变量=field=域、字段
    String name;
    int age;
    boolean isMale;

    //方法(c++中的函数）
    public void eat(){
        System.out.println("eat");
    }

    public void sleep()
    {
        System.out.println("sleep");
    }
}