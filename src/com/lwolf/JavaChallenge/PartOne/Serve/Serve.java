package com.lwolf.JavaChallenge.PartOne.Serve;

import com.lwolf.JavaChallenge.PartOne.HelloName;
import com.lwolf.JavaChallenge.PartOne.HelloWorld;
import fi.iki.elonen.NanoHTTPD;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class Serve extends NanoHTTPD {
    public Serve() throws IOException {
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("Running on 8080");
    }

    private String getHelloWorld() {
        PrintStream systemOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
        // Run the hello world, but now it's printing to testOut.
        new HelloWorld().printHelloWorld();

        System.setOut(systemOut);
        return new String(testOut.toByteArray());
    }

    private String getHelloName(String input) {
        // Steal the system output
        PrintStream systemOut = System.out;
        ByteArrayOutputStream testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        // Steal the system input
        InputStream systemIn = System.in;
        InputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);

        // Run the hello world, but now it's printing to testOut and reading from testIn.
        HelloName.helloName();

        System.setOut(systemOut);
        System.setIn(systemIn);
        return new String(testOut.toByteArray());
    }

    @Override
    public Response serve(IHTTPSession sesh) {
        System.out.println(sesh.getMethod().toString());
        Map<String, List<String>> parms = sesh.getParameters();

        String insert;
        if (parms.containsKey("name"))
            insert = getHelloName(parms.get("name").get(0));
        else
            insert = getHelloWorld();

        String msg = "<html><body>" + insert + "</body></html>";
        return newFixedLengthResponse(msg);
    }

    public static void main(String[] args) {
        try {
            new Serve();
        } catch (IOException e) {
            System.err.println("stop that");
            System.exit(1);
        }
    }
}
