package com.heuser.learn_spring_framwork.game;

import org.springframework.stereotype.Component;

@Component
public class RideFive implements GameConsole{

    public void up() {
        System.out.println("Shift up a gear");
    }

    public void down() {
        System.out.println("Shift down a gear");
    }

    public void left() {
        System.out.println("Lean Left");
    }

    public void right() {
        System.out.println("Lean Right");
    }
}
