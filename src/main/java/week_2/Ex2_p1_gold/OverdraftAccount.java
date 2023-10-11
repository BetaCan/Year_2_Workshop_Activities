package week_2.Ex2_p1_gold;

public class OverdraftAccount extends Account {

    private double overdraft;

    public OverdraftAccount(double overdraft) {
        this.overdraft = -overdraft;


    }

    @Override
    public void withdraw(double howMuch) {

        double bal = getBalance()-howMuch;
        System.out.println("get bal - how  "+ bal);
        if(bal > overdraft){

            setBalance(bal);

        }
        else {

            System.out.println("Error - insufficient funds");
        }


        //super.withdraw(howMuch);
    }


}


