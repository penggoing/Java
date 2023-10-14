package com.pqwt.基础.接口;

public class USBTest {
    public static void main(String[] args) {
        Computer com=new Computer();  
        Flash flash=new Flash();
        com.transferData(flash);//接口的多态性 USB usb=new Flash();

    }
    
}

class Computer{
    public void transferData(USB usb){
        usb.start();

        System.out.println("传输数据的细节");
        usb.stop();
    }
}


interface USB{
    void start();
    
    void stop();
              
}

class Flash implements USB{

    @Override
    public void start() {
       System.out.println("usb start");
    }

    @Override
    public void stop() {
       System.out.println("usb stop");
    }

}

class Priter implements USB{

    @Override
    public void start() {
        System.out.println("Priter start");
    }

    @Override
    public void stop() {
       System.out.println("Priter stop");
    }
    
}