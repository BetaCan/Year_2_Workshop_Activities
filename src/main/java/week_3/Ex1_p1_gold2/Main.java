package week_3.Ex1_p1_gold2;

import java.util.ArrayList;

public class Main
{
    // NOOBLAB READONLY

    public static void main(String[] args)
    {
        // start a production run
        Phone.startNewRun();

        // create new phones
        Phone paulsphone = new Phone("Apple","iPhone","X","767S62A21",600);
        Phone fredsphone = new Phone("Apple","iPhone","X","AS5674A12",600);
        Phone mikesphone = new Phone("Xiaomi","Mi Mix","2","W1N6W4H00",300);
        Phone janesphone = new Phone("Motorola","Cheapo","2000","4631AD8576",140);

        // get total of all in the current run
        System.out.println(Phone.getCostOfRun());
        // should be 1640

        // go through entire run
        ArrayList<Phone> phones = Phone.getCurrentRun();
        for (Phone phone : phones)
        {
            System.out.println(phone);
        }



        // Should print out
        // Apple iPhone X (767S62A21) @ 600
        // Apple iPhone X (AS5674A12) @ 600
        // Xiaomi Mi Mix 2 (W1N6W4H00) @ 300
        // Motorola Cheapo 2000 (4631AD8576) @ 140
    }
}
