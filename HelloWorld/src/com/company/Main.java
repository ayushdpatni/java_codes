package com.company;
public class Main {
    public static void main(String[] args) {

//        int a=12;
//        int b=24;
//        System.out.println("The addition is "+(a+b));
////        System.out.println(a+b);
//        System.out.println("The multiplication is "+a*b);
////        System.out.println(a*b);
//        System.out.println("Table of 5:");
//        for(int i=1;i<=10;i++){
//            System.out.println("5 "+"x "+i+" = "+(i*5));
//        }
        //Positive or Negative
        int num=0;
        if(num%2==0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
        if(num>0){
            System.out.println("Given number is Positive");
        }
        else if(num<0){
            System.out.println("Given number is Negative");
        }
        else {
            System.out.println("Given number is Zero");
        }
        int num2=-12;

        //Swap of two numbers
        System.out.println("Early Number 1: "+num);
        System.out.println("Early Number 2: "+num2);
        num = num + num2;
        num2 = num - num2;
        num = num - num2;
        System.out.println("After Swap Number 1: "+num);
        System.out.println("After Swap Number 2: "+num2);
        //Greatest Among the three numbers
        int num3=10;
        if( num >= num2 && num >= num3)
            System.out.println(num + " is the largest number.");

        else if (num2 >= num && num2 >= num3)
            System.out.println(num2 + " is the largest number.");

        else
            System.out.println(num3 + " is the largest number.");
    }
}
