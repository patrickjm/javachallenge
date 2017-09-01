package com.lwolf.JavaChallenge.PartOne.Tests;

import com.lwolf.JavaChallenge.PartOne.SumUpTo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class SumUpToTest {
    @Test
    public void SumUpToAddsCorrectly() {
        assertEquals(0, SumUpTo.sumUpTo(0));
        assertEquals(0, SumUpTo.sumUpTo(-15));
        assertEquals(1, SumUpTo.sumUpTo(1));
        assertEquals(45, SumUpTo.sumUpTo(9));
    }
}
