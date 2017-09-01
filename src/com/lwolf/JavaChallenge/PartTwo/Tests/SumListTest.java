package com.lwolf.JavaChallenge.PartTwo.Tests;

import com.lwolf.JavaChallenge.PartTwo.SumList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class SumListTest {
    @Test
    public void sumWithForLoop_sumsCorrectly() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34));
        int result = 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34;
        Assert.assertEquals(result, SumList.sumWithForLoop(input));

        input = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, SumList.sumWithForLoop(input));

        input.clear();
        assertEquals(0, SumList.sumWithForLoop(input));
    }

    @Test
    public void sumWithWhileLoop_sumsCorrectly() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34));
        int result = 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34;
        assertEquals(result, SumList.sumWithWhileLoop(input));

        input = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, SumList.sumWithWhileLoop(input));

        input.clear();
        assertEquals(0, SumList.sumWithWhileLoop(input));
    }

    @Test
    public void sumWithRecursion_sumsCorrectly() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34));
        int result = 1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34;
        assertEquals(result, SumList.sumWithRecursion(input));

        input = new ArrayList<>(Arrays.asList(1));
        assertEquals(1, SumList.sumWithRecursion(input));

        input.clear();
        assertEquals(0, SumList.sumWithRecursion(input));
    }
}
