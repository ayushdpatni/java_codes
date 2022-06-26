package com.learner;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import java.util.*;
class Addition{
    public int addition(int a, int b){
        return a+b;
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here to add");
        b.setBounds(100,100,95,30);
        f.add(b);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);


//        JFrame f1=new JFrame("Button Example");
        JButton b1=new JButton("Click Here");
        b1.setBounds(200,100,95,30);
        f.add(b1);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);


//        JFrame f2=new JFrame("Button Example");
        JButton b2=new JButton("Click Here");
        b2.setBounds(300,100,95,30);
        f.add(b2);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}