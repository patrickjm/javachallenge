package com.lwolf.JavaChallenge.PartTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class MergeLists {
    public static List<Integer> mergeSortedLists(ArrayList<Integer> one, ArrayList<Integer> two) {
        ArrayList<Integer> result = new ArrayList<>();

        while(!(one.isEmpty() && two.isEmpty())) {
            int value1 = (one.isEmpty()) ? Integer.MAX_VALUE : one.get(0);
            int value2 = (two.isEmpty()) ? Integer.MAX_VALUE : two.get(0);

            if (value1 <= value2)
                result.add(one.remove(0));
            if (value2 <= value1)
                result.add(two.remove(0));
        }

        return result;
    }
}
