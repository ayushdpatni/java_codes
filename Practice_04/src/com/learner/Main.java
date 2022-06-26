package com.learner;
class Student{
    String name ="Ayush";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
     Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.getName());
        s1.setName("Arpit");
        System.out.println(s1.name);
        System.out.println(s1.getName());
    }
}
