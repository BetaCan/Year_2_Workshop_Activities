package week_2.Ex2_p1_gold;

public class Account {
    private double balance;

    public Account()
    {
        this.balance=10+balance;
    }


    public double getBalance() {

        return balance;
    }

    public void withdraw(double howMuch){
        if(balance-howMuch<0){
            //balance= balance-howMuch;

            System.out.println("Error - insufficient funds");


    }
        else {
            balance= balance-howMuch;
            // balance=howMuch-balance;
        }

    }

    public void deposit(double howMuch){

         balance=howMuch+ balance;

    }

    public void setBalance (double bal){
        balance = bal;

    }

}
