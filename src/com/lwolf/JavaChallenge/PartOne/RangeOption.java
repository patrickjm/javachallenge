package com.lwolf.JavaChallenge.PartOne;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pmoriarty on 8/31/2017.
 */
public class RangeOption {
    public static void main(String[] args) {
        System.out.println("Enter an integer greater than or equal to 0: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        System.out.println("Enter Y to multiply or N to sum: ");
        if (input.nextLine().equalsIgnoreCase("N"))
            System.out.println(rangeSum(n));
        else
            System.out.println(rangeProduct(n));
    }

    public static int rangeProduct(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n * rangeProduct(n - 1);
    }

    public static int rangeSum(int n) {
        if (n <= 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return n + rangeSum(n - 1);
    }
}
