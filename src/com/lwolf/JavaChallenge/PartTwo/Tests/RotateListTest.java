package com.lwolf.JavaChallenge.PartTwo.Tests;

import com.lwolf.JavaChallenge.PartTwo.RotateList;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class RotateListTest {
    @Test
    public void rotateList_ordersProperly() {
        LinkedList<Integer> tester = new LinkedList<>(Arrays.asList(3, 4, 5, 6, 1, 2));
        LinkedList<Integer> rotated = RotateList.rotateList(new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6)), 2);
        assertThat(tester, is(rotated));

        tester = new LinkedList<>(Arrays.asList(1));
        rotated = RotateList.rotateList(new LinkedList<>(Arrays.asList(1)), 3);
        assertThat(tester, is(rotated));

        tester.clear();
        rotated.clear();
        rotated = RotateList.rotateList(new LinkedList<>(), 5);
        assertThat(tester, is(rotated));
    }
}
