package com.lwolf.JavaChallenge.PartTwo.Tests;

import com.lwolf.JavaChallenge.PartTwo.MergeLists;
import org.junit.Test;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class MergeListsTest {
    @Test
    public void mergeLists_ordersAndMerges() {
        List<Integer> ref = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = MergeLists.mergeSortedLists(
                new ArrayList<>(Arrays.asList(1, 3, 4, 9)),
                new ArrayList<>(Arrays.asList(1, 2, 5, 6, 7, 8))

        );
        assertThat(ref, is(result));

        ref = Arrays.asList(1, 1);
        result = MergeLists.mergeSortedLists(
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(1))
        );
        assertThat(ref, is(result));
    }
}
