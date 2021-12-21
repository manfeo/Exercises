package com.company.ex3;

public class Human {

    private Head head;
    private Hand hands;
    private Leg legs;
    private String name;
    private int age;
    private int height;

    Human(String name, int age, int height, String typeOfHead, double handsLength, double legsLength){
        this.name = name;
        this.age = age;
        this.height = height;
        this.head = new Head(typeOfHead);
        this.hands = new Hand(handsLength);
        this.legs = new Leg(legsLength);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setHands(Hand hands) {
        this.hands = hands;
    }
    public void setHead(Head head) {
        this.head = head;
    }
    public void setLegs(Leg legs) {
        this.legs = legs;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight(){
        return height;
    }
    public Hand getHands() {
        return hands;
    }
    public Head getHead() {
        return head;
    }
    public Leg getLegs() {
        return legs;
    }
    @Override
    public String toString() {
        return "Class Human, type of the head:" + head.typeOfHead +
                ", hands length:" + hands.length +
                ", legs length:" + legs.length +
                ", name: " + name + '\'' +
                ", age: " + age +
                ", height: " + height;
    }

    public static class Leg{

        private double length;

        Leg(double length){
            this.length = length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getLength() {
            return length;
        }
        public void go(){
            System.out.println("Human is walking");
        }
        public void stand(){
            System.out.println("Human is standing");
        }
        public void kick(){
            System.out.println("Human kicked the nearest item");
        }
    }

    public static class Head{

        private String typeOfHead;

        Head(String typeOfHead){
            this.typeOfHead = typeOfHead;
        }
        public void setCircumference(String typeOfHead) {
            this.typeOfHead = typeOfHead;
        }
        public String getTypeOfHead() {
            return typeOfHead;
        }
        public void lookStraight(){
            System.out.println("Human is looking straight");
        }
        public void lookToTheLeft(){
            System.out.println("Human is looking to the left");
        }
        public void lookToTheRight(){
            System.out.println("Human is looking to the right");
        }
    }

    public static class Hand{

        private double length;

        Hand(double length){
            this.length = length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getLength() {
            return length;
        }
        public void grabTheItem(){
            System.out.println("Human grabbed the nearest item");
        }
        public void hitSomething(){
            System.out.println("Human hit the nearest item");
        }
    }
}
