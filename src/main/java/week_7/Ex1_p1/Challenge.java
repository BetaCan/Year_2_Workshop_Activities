package week_7.Ex1_p1;

import java.util.Collections;
import java.util.HashSet;

public class Challenge
{
    public static boolean hasPair(String[] list)
    {
        // implement your code here

        HashSet<String> testList = new HashSet<String>();
        Collections.addAll(testList, list);

        System.out.println(list.length);
        System.out.println(testList.size());
        return list.length!= testList.size();

    }
}