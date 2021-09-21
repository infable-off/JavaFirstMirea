package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();

        human.hand.setFingersLeftHand(3);
        human.head.setBrows(2);
        human.leg.setLeftLeg(1);

        System.out.println(human.leg.getLeftLeg());
        System.out.println(human.head.getBrows());
        System.out.println(human.hand.getFingersLeftHand());
    }


}
