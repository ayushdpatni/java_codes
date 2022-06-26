package com.learner;
import java.util.*;
public class Main {

    public static void ArithmeticExcep() {
        try{
            int a=10;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First Number");
            a=sc.nextInt();
            System.out.println("Enter the Second Number");
            int b=0;
            b=sc.nextInt();
            int c=a/b;
        }
        catch(ArithmeticException e){System.out.println("You shouldn’t divide a number by zero.");};
    }
    public static void NullExcep() {
        try{String a1=null;
            System.out.println(a1.length());}
        catch(NullPointerException e){System.out.println("Null Pointer Exception arises!!");};
    }
    public static void ArrayExcept() {
        try{int[] arr ={12,33,44};
            System.out.println(arr[10]);}
        catch(ArrayIndexOutOfBoundsException e){System.out.println("OOPs!!!"+e.getMessage());};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Arithmetic, 2 for NullPointer and 3 for ArrayOutofBound");
        int option = sc.nextInt();
        switch(option){
            case 1:
                ArithmeticExcep();
                break;
            case 2:
                NullExcep();
                break;
            case 3:
                ArrayExcept();
                break;
        }
    }
}
