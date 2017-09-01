package com.lwolf.JavaChallenge.PartTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class SumList {
    public static void main(String[] args) {
        System.out.println("Demo:\n-----");
        ArrayList<Integer> inp = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34));
        System.out.println("With for loop:\t\t" + sumWithForLoop(inp));
        System.out.println("With while loop:\t" + sumWithWhileLoop(inp));
        System.out.println("With recursion:\t\t" + sumWithRecursion(inp));
    }

    public static int sumWithForLoop(ArrayList<Integer> list) {
        if (list.size() == 0)
            return 0;

        int total = 0;
        for(int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    public static int sumWithWhileLoop(ArrayList<Integer> list) {
        if (list.size() == 0)
            return 0;

        int total = 0, i = 0;
        while(i < list.size()) {
            total += list.get(i++);
        }

        return total;
    }

    public static int sumWithRecursion(ArrayList<Integer> list) {
        if (list.isEmpty())
            return 0;
        else
            return list.remove(0) + sumWithRecursion(list);
    }
}
