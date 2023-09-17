package exer.exerciseofbank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new Bank();

        bank.addCustomer("jan","smith");

        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance=bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户"+bank.getCustomer(0).getFirstName()+"的余额为："+balance);

    }
}
