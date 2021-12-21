package com.company.ex8;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class FIrst {
    private JFrame frame;
    private JPanel pane;
    private Timer timer;
    private int xCoord = 0;
    private int yCoord = 0;
    private static final int GAP = 10;
    private static final int WIDTH_HEIGHT = 10;
    private static final int ROWS = 5;
    private static final int COLS = 5;

    private List<Shape> shapes;

    @SuppressWarnings("serial")
    private void createAndShowGUI() {
        //We create the JFrame
        frame = new JFrame(this.getClass().getSimpleName());
        //We create a list of Rectangles from the Shape API
        shapes = new ArrayList<>();
        createNewShape();
        //Creates our JPanel that's going to draw every rectangle
        pane = new JPanel() {
            //Specifies the size of our JPanel
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1920, 1080);
            }

            //This is where the "magic" happens, it iterates over our list and repaints every single Rectangle in it
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2D = (Graphics2D) g;
                for (Shape shape : shapes) {
                    g2D.setPaint(shape.color);
                    switch (shape.getShape()) {
                        case "Rectangle" -> g2D.fillRect(shape.x, shape.y, shape.returnCharacteristics()[0], shape.returnCharacteristics()[1]);
                        case "Circle" -> g2D.fillOval(shape.x, shape.y, shape.returnCharacteristics()[0], shape.returnCharacteristics()[1]);
                        case "Triangle" -> {
                            int[] xs = {shape.x, shape.x + shape.returnCharacteristics()[0], shape.x + shape.returnCharacteristics()[0]};
                            int[] ys = {shape.y + shape.returnCharacteristics()[1], shape.y, shape.y + shape.returnCharacteristics()[1]};
                            g2D.fillPolygon(xs, ys, 3);
                        }
                    }
                }
            }
        };
        //This starts our Timer
        timer = new Timer(0, listener);
        timer.setInitialDelay(0);
        timer.start();
        //We add everything to the frame
        frame.add(pane);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Creates a new Rectangle and adds it to the List
    private void createNewShape() {
        int r = new Random().nextInt(3);
        Shape shape;
        int randomFactor = 100;
        switch (r) {
            case 0 -> shape = new com.company.ex8.Rectangle(new Random().nextInt(1910) + 10, new Random().nextInt(1070) + 10, randomColor(), "Rectangle", new Random().nextInt(randomFactor) + 1, new Random().nextInt(randomFactor) + 1);
            case 1 -> shape = new Circle(new Random().nextInt(1910) + 10, new Random().nextInt(1070) + 10, randomColor(), "Circle", new Random().nextInt(randomFactor) + 1, new Random().nextInt(randomFactor) + 1);
            case 2 -> shape = new Triangle(new Random().nextInt(1910) + 10, new Random().nextInt(1070) + 10, randomColor(), "Triangle", new Random().nextInt(randomFactor) + 1, new Random().nextInt(randomFactor) + 1);
            default -> throw new IllegalStateException("Unexpected value: " + r);
        };
        shapes.add(shape);
    }
    //This will be executed everytime the Timer is fired
    private ActionListener listener = e -> {
        createNewShape();
        pane.repaint();
    };
    private Color randomColor(){
        int r = new Random().nextInt(256);
        int g = new Random().nextInt(256);
        int b = new Random().nextInt(256);
        return new Color(r, g, b);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new FIrst()::createAndShowGUI);
    }
}
