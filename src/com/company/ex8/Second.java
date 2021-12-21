package com.company.ex8;
import javax.swing.*;

public class Second {
    public static void main(String[] args){
        ImageIcon image = new ImageIcon(args[0]);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(image);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        JFrame jFrame = new JFrame();
        jFrame.setSize(1920,1080);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.add(jLabel);
    }
}
