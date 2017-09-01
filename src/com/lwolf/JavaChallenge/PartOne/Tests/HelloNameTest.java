package com.lwolf.JavaChallenge.PartOne.Tests;

import com.lwolf.JavaChallenge.PartOne.HelloName;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by pmoriarty on 8/31/2017.
 *
 * This is a Windows dependent test.
 */
public class HelloNameTest {
    @Test
    public void helloNamePrintsCorrectly() {
        // Steal the system output
        PrintStream systemOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Steal the system input
        InputStream systemIn = System.in;
        InputStream testIn = new ByteArrayInputStream("Bucko".getBytes());
        System.setIn(testIn);

        // Create a dummy hello world stream to compare to the final result
        String ref = "Gimme yo name: Hi, Bucko. How are you?\r\n";

        // Run the hello world, but now it's printing to testOut and reading from testIn.
        HelloName.helloName();

        System.setOut(systemOut);
        System.setIn(systemIn);
        assertEquals(ref, new String(testOut.toByteArray()));
    }
}
