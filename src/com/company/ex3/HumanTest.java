package com.company.ex3;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("Alex", 10, 176, "Oval", 20, 28);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getHeight());
        human.getHead().lookStraight();
        human.getHead().lookToTheRight();
        human.getHands().grabTheItem();
        human.getHands().hitSomething();
        human.getLegs().go();
        human.getLegs().kick();
        System.out.println(human);
    }
}
