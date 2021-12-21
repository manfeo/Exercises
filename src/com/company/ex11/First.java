package com.company.ex11;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.util.Objects;

public class First {
    public static int valueToGuess = (int)(Math.random() * 20 + 1);;
    public static int tries = 3;
    public static boolean win = false;
    public static String messageToPrint(int suggestion){
        if (suggestion == valueToGuess){
            win = true;
            return "Вы угадали число. Поздравляем!";
        }
        if (tries == 1){
            win = true;
            return "Вы проиграли. Я загадал число " + valueToGuess;
        }
        if (suggestion < valueToGuess){
            tries--;
            return "Нужно число побольше. Осталось " + String.valueOf(tries) + (tries == 1 ? " попытка" : " попытки");
        }
        else if (suggestion > valueToGuess){
            tries--;
            return "Нужно число поменьше. Осталось " + String.valueOf(tries) + (tries == 1 ? " попытка" : " попытки");
        }
        else
            return "Ошибка";
    }
    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        JLabel message = new JLabel("Я загадал число от 1 до 20. Вам нужно его " +
                "угадать.\nОсталось 3 попытки");
        JTextField suggestion = new JTextField(4);
        JButton suggestionButton = new JButton("Угадать");
        suggestionButton.addActionListener(e -> {
            if (!win) {
                String checker = suggestion.getText();
                if (!Objects.equals(checker, "")) {
                    int suggest = Integer.valueOf(suggestion.getText().trim());
                    message.setText(messageToPrint(suggest));
                    suggestion.setText("");
                }
            }
        });
        jFrame.setSize(600,200);
        MigLayout migLayout = new MigLayout("fill",
                "[center]","[center]10[bottom]5[top]");
        JPanel panel = new JPanel(migLayout);
        panel.add(message, "wrap");
        panel.add(suggestion, "wrap, span");
        panel.add(suggestionButton);
        jFrame.add(panel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
