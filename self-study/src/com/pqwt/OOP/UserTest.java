package com.pqwt.OOP;

class UserTest {
    public static void main(String[] args){
        User u1=new User();
        u1.name="li hua";
    }

}

class User{
    //属性
    String name;
    int age;
    boolean isMale;

    public void talk(String language){
        System.out.println("use"+language);


    }


    public void eat(){
        String food="milk";
        System.out.println("eat"+food);
    }
}