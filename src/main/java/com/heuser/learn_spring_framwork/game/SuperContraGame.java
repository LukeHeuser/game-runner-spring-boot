package com.heuser.learn_spring_framwork.game;

public class SuperContraGame implements GameConsole{

    public void up() {
        System.out.println("Jump and Flip");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Shoot Left");
    }

    public void right() {
        System.out.println("Shoot Right");
    }

}
