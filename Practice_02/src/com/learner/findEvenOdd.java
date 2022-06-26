package com.learner;

import java.util.*;

public class findEvenOdd {
    public static void main(String[] args) {
        //practicing method calling in java
        //finding even and odd
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int option = findOddEven(a);
        if (option == 1) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }

    public static int findOddEven(int num) {
        if (num % 2 == 0) {
            return 0;
        } else if (num % 2 != 0) {
            return 1;
        }
        return 0;
    }
}
