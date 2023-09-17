package exer.exerciseofbank;

public class Bank {

    private Customer[] customers=new Customer[100];//存放多个客户的数组
    private int number_of_Customers;//记录客户的数组

    public Bank(){

    }

    //添加客户
    public void addCustomer(String f,String l){
        Customer cust=new Customer(f,l);
        customers[number_of_Customers++]=cust;

    }

    //获取客户个数
    public int getNumber_of_Customers(){
        return number_of_Customers;
    }


    //获取指定位置上的客户
    public Customer getCustomer(int index){
        //return customers[index];-->这样写不太好,index可能会不合理
        if (index<0||index>number_of_Customers||customers==null){
            System.out.println("错误" );
            return null;
        }else{
            return customers[index];
        }
    }


}
