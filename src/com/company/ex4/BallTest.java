package com.company.ex4;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball(2, 10);
        System.out.println(ball);
        ball.move(-3, -2);
        System.out.println(ball);
    }
}