package com.learner;

import java.awt.*;
public class AWT_option
{
    AWT_option(){
        Frame f= new Frame();
        Choice c=new Choice();
        Button b=new Button("Button");
        c.setBounds(100,100, 75,75);
        b.setBounds(50,100, 40,30);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        c.add("Item 4");
        c.add("Item 5");
        f.add(c);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new AWT_option();
    }
}

