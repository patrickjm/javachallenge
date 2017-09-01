package com.lwolf.JavaChallenge.PartOne;

import java.util.Scanner;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class HelloName {
    public static void main(String[] args) {
        helloName();
    }

    public static void helloName() {
        System.out.print("Gimme yo name: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, " + input.nextLine() + ". How are you?");
    }
}
