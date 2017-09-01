package com.lwolf.JavaChallenge.PartTwo;

import java.util.LinkedList;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class RotateList {
    public static LinkedList<Integer> rotateList(LinkedList<Integer> list, int count) {
        if (list.size() == 0 || count == 0)
            return list;
        else {
            list.add(list.removeFirst());
            return rotateList(list, count - 1);
        }
    }
}
