package week_2.Ex2_p1_silver;

public class AccountTest {

    public static void main(String [] args){

        Account a1 = new Account();

        System.out.println(a1.getBalance());
        a1.deposit(8);
        System.out.println(a1.getBalance());
        a1.withdraw(8);
        System.out.println(a1.getBalance());

    }
}
