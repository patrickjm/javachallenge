package com.lwolf.JavaChallenge.PartOne.Tests;

import com.lwolf.JavaChallenge.PartOne.HelloWorld;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by pmoriarty on 8/31/2017.
 *
 * Reference: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
 */
public class HelloWorldTest {
    @Test
    public void helloWorldPrintsCorrectly() {
        // Steal the system output
        PrintStream systemOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Create a dummy hello world stream to compare to the final result
        ByteArrayOutputStream refStream = new ByteArrayOutputStream();
        new PrintStream(refStream).println("Hello, World");

        // Run the hello world, but now it's printing to testOut.
        new HelloWorld().printHelloWorld();

        System.setOut(systemOut);
        assertEquals(new String(refStream.toByteArray()), new String(testOut.toByteArray()));
    }
}
