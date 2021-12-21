package com.company.ex2;

public class BallTest {
    public static void main(String[] args){
        Ball ball = new Ball(10, 10);
        System.out.println(ball);
        ball.move(-5, 23);
        System.out.println(ball);
    }
}
