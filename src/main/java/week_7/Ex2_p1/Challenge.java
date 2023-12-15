package week_7.Ex2_p1;

import java.util.List;
public class Challenge
{
    public static Integer[] listToArray(List<Integer> list)
    {
        // implement your code here

        Integer[] num = new Integer[list.size()];
        num = list.toArray(num);
        return num;
    }
}