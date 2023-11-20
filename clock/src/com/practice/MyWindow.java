package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font=new Font("",Font.BOLD,35);
    MyWindow(){
        super.setTitle("My Clock");
        super.setSize(500,400);
        super.setLocation(300,50);
        this.createGUI();
        this.startClock();
        super.getContentPane().setBackground(Color.LIGHT_GRAY);
        super.setVisible(true);
    }

    public void createGUI(){

        heading=new JLabel("My Clock");
        clockLabel=new JLabel("clock");
        heading.setFont(font);
        heading.setFont(font);
        heading.setForeground(Color.BLACK);
        heading.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setFont(font);
        clockLabel.setForeground(Color.RED);
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock(){
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dateTime=new Date().toLocaleString();
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}
