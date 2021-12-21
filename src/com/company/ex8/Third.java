package com.company.ex8;
import javax.swing.*;
public class Third {
    public static void main(String[] args){
        ImageIcon image = new ImageIcon("C:\\Users\\user\\Desktop\\8-marta-pozdravlenie-gifka.gif");
        JLabel jLabel = new JLabel();
        jLabel.setIcon(image);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.CENTER);
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(1920,1080);
        jFrame.setVisible(true);
        jFrame.add(jLabel);
    }
}
