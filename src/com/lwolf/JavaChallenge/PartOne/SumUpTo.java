package com.lwolf.JavaChallenge.PartOne;

import java.util.Scanner;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class SumUpTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number greater than or equal to 1: ");
        int n = Integer.parseInt(input.nextLine());
        if (n < 1) {
            System.out.println("Don't do that");
            return;
        }
        System.out.println(sumUpTo(n));
    }

    public static int sumUpTo(int n) {
        if (n < 1) return 0;

        int total = 0;
        for (int i = 1; i <= n; i++)
            total += i;

        return total;
    }
}
