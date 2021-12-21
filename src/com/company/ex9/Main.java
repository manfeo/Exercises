package com.company.ex9;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Main{
    public static int madridScore = 0;
    public static int milanScore = 0;
    public static boolean permission = true;
    public static void main(String[] args){
        JLabel matchTimer = new JLabel();
        Timer timer = new Timer(1000, new ActionListener() {
            private int countSecond = 20;
            private int countFirst = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (countFirst >= 0 && countSecond >= 0){
                    matchTimer.setText((countFirst >= 10 ? Integer.toString(countFirst) : "0" + Integer.toString(countFirst)) + ":" +
                            ((countSecond >= 10 ? Integer.toString(countSecond) : "0" + Integer.toString(countSecond))));
                    countSecond--;
                    if (countSecond == 0) {
                        countFirst--;
                        countSecond = 59;
                    }
                }
                else {
                    matchTimer.setText("00:00");
                    permission = false;
                    ((Timer) e.getSource()).stop();
                    matchTimer.setText((milanScore == madridScore ? "Throw" : (milanScore > madridScore ?
                            "WINNER: Milan" : "WINNER: Madrid")));
                }
            }
        });
        timer.start();
        JButton first = new JButton("Milan");
        JButton second = new JButton("Madrid");
        JLabel score = new JLabel("Result: 0 X 0");
        JLabel lastScored = new JLabel("Last scored: N/A");
        first.addActionListener(e -> {
            if (permission) {
                milanScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScored.setText("Last scored: Milan");
            }
        });
        second.addActionListener(e -> {
            if (permission) {
                madridScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                lastScored.setText("Last scored: Madrid");
            }
        });
        JFrame jFrame = new JFrame();
        jFrame.setSize(700,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gridBagLayout=new GridBagLayout();
        Container container = jFrame.getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        jFrame.setLayout(gridBagLayout);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 45;
        constraints.weightx = 0.5;
        constraints.gridy = 0;
        constraints.gridx = 0;
        container.add(first, constraints);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 45;
        constraints.weightx = 0.5;
        constraints.gridy =  0;
        constraints.gridx = 2;
        container.add(second, constraints);

        constraints.fill = GridBagConstraints.CENTER;
        constraints.ipady = 0;
        constraints.weightx = 1;
        constraints.gridx = 1;
        constraints.gridy = 0;
        container.add(matchTimer, constraints);

        constraints.gridy = 1;
        container.add(score, constraints);

        constraints.gridy = 2;
        container.add(lastScored, constraints);
   }
}
