package com.learner;
import java.util.*;

public class Sample {
    public static void ArithmeticExcep() {
        try{
            int a=10/0;
        }catch(ArithmeticException ae){
            System.out.println();
        }
    }
    public static void NullExcep() {
        try {
            String a1 = null;
            System.out.println(a1.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception arises!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                ArithmeticExcep();
                break;
            case 2:
                NullExcep();
                break;
        }

    }
}
