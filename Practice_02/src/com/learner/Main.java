package com.learner;

public class Main {
    public static int harmonicFunct() {
        int n = 100;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(i);
            sum = sum + (1 / i);
        }
        return sum;
    }

    public static void main(String[] args) {

        int a = 10;
        System.out.println(Main.harmonicFunct());
    }
}
