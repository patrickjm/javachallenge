package com.lwolf.JavaChallenge.PartOne.Tests;

import com.lwolf.JavaChallenge.PartOne.RangeOption;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class RangeOptionTest {
    @Test
    public void rangeSum_sumsCorrectly() {
        assertEquals(0, RangeOption.rangeSum(0));
        assertEquals(0, RangeOption.rangeSum(-15));
        assertEquals(1, RangeOption.rangeSum(1));
        assertEquals(45, RangeOption.rangeSum(9));
    }

    @Test
    public void rangeProduct_multipliesCorrectly() {
        assertEquals(0, RangeOption.rangeProduct(0));
        assertEquals(0, RangeOption.rangeProduct(-15));
        assertEquals(1, RangeOption.rangeProduct(1));
        assertEquals(479001600, RangeOption.rangeProduct(12));
    }
}
