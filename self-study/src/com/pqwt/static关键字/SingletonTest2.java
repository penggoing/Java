package com.pqwt.static关键字;

public class SingletonTest2  {

}

class Order{
    private Order(){

    }

    private static Order instance=null;

    public static Order getInstance(){
        if(instance==null){
            instance=new Order();
        }
        return instance;
    }
}