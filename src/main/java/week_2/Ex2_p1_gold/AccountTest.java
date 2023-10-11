package week_2.Ex2_p1_gold;



public class AccountTest {

    public static void main(String [] args){

        Account a1 = new Account();
        OverdraftAccount o1 = new OverdraftAccount(-200);


        //System.out.println(a1.getBalance());
        //a1.deposit(8);
        //System.out.println(a1.getBalance());
       // a1.withdraw(8);
        //System.out.println(a1.getBalance());

        System.out.println("initial bal "+o1.getBalance());
        o1.deposit(8);
        System.out.println("after deposit bal "+o1.getBalance());
        o1.withdraw(250);
        System.out.println("after withdraw bal "+o1.getBalance());

    }
}
