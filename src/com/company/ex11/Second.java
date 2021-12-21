package com.company.ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Second {
    public static String currentPlace = "";
    public static void main(String[] args){
        JLabel north = new JLabel("NORTH", SwingConstants.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel east = new JLabel("EAST", SwingConstants.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel west = new JLabel("WEST", SwingConstants.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel south = new JLabel("SOUTH", SwingConstants.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JLabel center = new JLabel("CENTER", SwingConstants.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(new BorderLayout());
        jFrame.add(north,BorderLayout.NORTH);
        jFrame.add(east,BorderLayout.EAST);
        jFrame.add(west,BorderLayout.WEST);
        jFrame.add(south,BorderLayout.SOUTH);
        jFrame.add(center,BorderLayout.CENTER);
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel source= (JLabel) e.getSource();
                if (north.equals(source) && currentPlace != "north") {
                    currentPlace = "north";
                    JOptionPane.showMessageDialog(null, "Вы вошли на север");
                } else if (south.equals(source) && currentPlace != "south") {
                    currentPlace = "south";
                    JOptionPane.showMessageDialog(null, "Вы вошли на юг");
                } else if (west.equals(source) && currentPlace != "west") {
                    currentPlace = "west";
                    JOptionPane.showMessageDialog(null, "Вы вошли на запад");
                } else if (east.equals(source) && currentPlace != "east") {
                    currentPlace = "east";
                    JOptionPane.showMessageDialog(null, "Вы вошли на восток");
                } else if (center.equals(source) && currentPlace != "center") {
                    currentPlace = "center";
                    JOptionPane.showMessageDialog(null, "Вы вошли в центр");
                }
            }
        };
        west.addMouseListener(mouseAdapter);
        south.addMouseListener(mouseAdapter);
        east.addMouseListener(mouseAdapter);
        north.addMouseListener(mouseAdapter);
        center.addMouseListener(mouseAdapter);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
