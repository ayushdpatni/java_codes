package com.learner;
class StudentDetails{
    String name;
    long rollNo;
    StudentDetails(String name,long rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        StudentDetails sd=new StudentDetails("AYUSH",124);
        System.out.println(sd.name+sd.rollNo);
    }
}
