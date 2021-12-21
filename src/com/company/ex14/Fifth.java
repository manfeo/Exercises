package com.company.ex14;


import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Fifth {
    public static Deque<Integer> firstPlayer= new ArrayDeque<>();
    public static Deque<Integer> secondPlayer = new ArrayDeque<>();

    public static String whoWin(Deque<Integer> firstPlayer, Deque<Integer> secondPlayer){
        for (int i = 0; i < 106; i++){
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                return (firstPlayer.isEmpty() ? "second " : "first ") + i;
            }

            int first = firstPlayer.removeFirst();
            int second = secondPlayer.removeFirst();

            if (first == 9 && second == 0){
                secondPlayer.addLast(first);
                secondPlayer.addLast(second);
                continue;
            }
            if (second == 9 && first == 0){
                firstPlayer.addLast(first);
                firstPlayer.addLast(second);
                continue;
            }

            if (first < second){
                secondPlayer.addLast(first);
                secondPlayer.addLast(second);
                continue;
            }
            if (second < first){
                firstPlayer.addLast(second);
                firstPlayer.addLast(first);
                continue;
            }
        }
        return "botva";
    }

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JTextField jTextField = new JTextField(5);
        JPanel jPanel = new JPanel(new MigLayout("fill","[center]","[center]10[center]"));
        JButton jButton = new JButton("Задать");
        jPanel.add(jTextField,"wrap");
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jButton.addActionListener(e -> {
            String[] values = jTextField.getText().split(" ");
            if (firstPlayer.isEmpty()) {
                for (int i = 0; i < 5; i++) {
                    firstPlayer.addLast(Integer.valueOf(values[i]));
                }
                jTextField.setText("");
            }
            else if (secondPlayer.isEmpty()){
                for (int i = 0; i < 5; i++) {
                    secondPlayer.addLast(Integer.valueOf(values[i]));
                }
                jTextField.setVisible(false);
                jButton.setText("Показать победителя");
            }
            else {
                jButton.setVisible(false);
                JLabel win = new JLabel(whoWin(firstPlayer,secondPlayer));
                jPanel.add(win);
                jFrame.repaint();
            }
        });
    }
}
