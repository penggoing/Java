package com.pqwt.基础.接口;

//代理模式

public class NetWorkTest {
    public static void main(String[] args) {
        Server server=new Server();
        ProxySever proxySever=new ProxySever(server);//多态
        proxySever.browse();

    }
}


interface NetWork{
    public void browse();

}


//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
       System.out.println("真实的服务器访问网络");
    }

}

//代理类
class ProxySever implements NetWork{

    private NetWork work;

    public ProxySever(NetWork work  ){
        this.work= work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
       work.browse(); 
    }
    
}