package com.learner;

import javax.swing.*;
public class AddGUI{
    AddGUI(){
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton(new ImageIcon("C:/Users/ayush/OneDrive/Desktop/Obj1/road0.jpg"));
        b.setBounds(200,200,400, 420);
        f.add(b);
        f.setSize(300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new AddGUI();
    }
}