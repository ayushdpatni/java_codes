package com.learner;

class classNew{
    public static void method1(){
        System.out.println("Inside Method of classNew");
    }
}
public class studentData {
    public static void funct(){
        System.out.println("Inside funct");

    }
    public static void main(String[] args) {
        //method calling practice
        studentData.funct();
        classNew.method1();
    }
}