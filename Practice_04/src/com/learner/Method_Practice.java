package com.learner;

class Information{
    public void method(){
        System.out.println("Inside Method");
    }
    public void method(int a,int b){
        System.out.println("Inside Method2");
    }

}
public class Method_Practice {
    public static void main(String[] args) {
        Information I1 =new Information();
//        Information I2 =new Information(12,122);
        I1.method();
        I1.method(12,222);
    }
}
