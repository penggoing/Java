package com.pqwt.OPP.Inheritance;

public class Student extends Person {

    //String name;
    //int age;
    String major;
    public Student(){

    }

    public void eat(){
        System.out.println("Student类中对Person类中eat的重写");
    }
    public Student(String name,int age,String major){
        this.name=name;
        this.age=age;
        this.major=major;
    }
   /* public void eat(){
        System.out.println("eat");
    }*/

    /*public void sleep(){
        System.out.println("sleep"  );
    }*/

    public void Study(){
        System.out.println("study");
    }
}
