package week_7.Ex2_p2;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Challenge
{
    public static Set<Integer> listToSet(List<Integer> list)
    {
        HashSet<Integer> Hi = new HashSet<Integer>();
        Hi.addAll(list);
        return Hi;
    }
}