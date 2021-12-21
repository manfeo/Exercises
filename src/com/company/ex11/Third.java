package com.company.ex11;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Third {
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JMenuBar jMenuBar = new JMenuBar();
        jFrame.setSize(400,200);
        JMenu first = new JMenu("Цвет");
        JTextArea jTextArea = new JTextArea(5,40);
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem orange = new JMenuItem("Оранжевый");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.BLUE);
            }
        });
        orange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.ORANGE);
            }
        });
        first.add(red);
        first.add(blue);
        first.add(orange);
        JMenu second = new JMenu("Шрифт");
        JMenuItem monospaced = new JMenuItem("monospaced");
        JMenuItem sans_serif = new JMenuItem("sans_serif");
        JMenuItem castellar = new JMenuItem("castellar");
        monospaced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
            }
        });
        sans_serif.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
            }
        });
        castellar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
            }
        });
        second.add(monospaced);
        second.add(sans_serif);
        second.add(castellar);
        JPanel jPanel = new JPanel(new MigLayout("fill", "[][]","[][]"));
        jMenuBar.add(first);
        jMenuBar.add(second);
        jPanel.add(jMenuBar,"wrap");
        jPanel.add(jTextArea, "span");
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
